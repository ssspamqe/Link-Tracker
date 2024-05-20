package edu.java.linkupdatescheduler.linkupdatescheckers.allupdatescheckers;

import edu.java.configuration.services.trackableservices.TrackableServiceConfiguration;
import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dto.GitHubRepository;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchGitHubRepositoryException;
import edu.java.linkupdatescheduler.exceptions.IncorrectHostException;
import edu.java.linkupdatescheduler.exceptions.UnsuccessfulGitHubUrlParseException;
import edu.java.linkupdatescheduler.linkupdatescheckers.singleupdatecheckers.gitHub.GitHubRepositorySingleUpdateChecker;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdateType;
import edu.java.webclients.gitHub.GitHubClient;
import edu.java.webclients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webclients.gitHub.dto.GitHubRepositoryBody;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GitHubAllUpdatesChecker implements LinkAllUpdatesChecker {

    private static final Pattern REPOSITORY_NAME_OWNER_PATTERN = Pattern.compile("github.com/([^/]+)/([^/]+)$");
    private static final Pattern REPOSITORY_OWNER_PATTERN = Pattern.compile("github\\.com\\/(.*)\\/");
    private static final Pattern REPOSITORY_NAME_PATTERN = Pattern.compile("github\\.com\\/.*\\/(.+)(?:\\/.*)");


    private final GitHubRepositoryDataAccessObject repositoryDao;
    private final LinkDataAccessObject linkDao;
    private final GitHubClient gitHubClient;
    private final List<GitHubRepositorySingleUpdateChecker> updateCheckers;
    private final TrackableServiceConfiguration gitHubConfiguration;

    public GitHubAllUpdatesChecker(
        GitHubRepositoryDataAccessObject repositoryDao,
        LinkDataAccessObject linkDao,
        GitHubClient gitHubClient,
        List<GitHubRepositorySingleUpdateChecker> updateCheckers,

        @Qualifier("gitHubConfig")
        TrackableServiceConfiguration gitHubConfiguration
    ) {
        this.repositoryDao = repositoryDao;
        this.linkDao = linkDao;
        this.gitHubClient = gitHubClient;
        this.updateCheckers = updateCheckers;
        this.gitHubConfiguration = gitHubConfiguration;
    }

    @Override
    public List<LinkUpdate> getUpdates(Link link) throws IncorrectHostException {
        String hostName = link.getUrl().getHost();
        if (isIncorrectHostName(hostName)) {
            throw new IncorrectHostException(hostName);
        }

        String repositoryName = extractRepositoryName(link.getUrl());
        String owner = extractRepositoryOwner(link.getUrl());

        GitHubRepository oldRepositoryRecord = repositoryDao.findByNameAndOwner(repositoryName, owner)
            .orElseThrow(() -> new NoSuchGitHubRepositoryException(repositoryName, owner));
        GitHubRepositoryBody currentRepositoryBody =
            gitHubClient.fetchRepositoryByNameAndOwner(repositoryName, owner);

        List<LinkUpdateType> detectedUpdateTypes =
            iterateAllSingleUpdateCheckers(oldRepositoryRecord, currentRepositoryBody);
        if (!detectedUpdateTypes.isEmpty()) {
            updateLocalRecord(currentRepositoryBody, link.getId());
        }

        return buildLinkUpdateList(link, detectedUpdateTypes);
    }

    private List<LinkUpdate> buildLinkUpdateList(Link link, List<LinkUpdateType> updateTypes) {
        Set<Long> chatIds = linkDao.findAssociatedChatsIdsByLinkId(link.getId());
        return updateTypes.stream()
            .map(type ->
                new LinkUpdate(
                    link.getId(),
                    link.getUrl(),
                    type,
                    chatIds
                )
            )
            .toList();
    }

    private boolean isIncorrectHostName(String hostname) {
        return !gitHubConfiguration.isCorrectHostName(hostname);
    }

    private String extractRepositoryName(URI url){
        Matcher matcher = REPOSITORY_NAME_PATTERN.matcher(url.toString());
        if(!matcher.find()){
            throw new UnsuccessfulGitHubUrlParseException(url);
        }

        return matcher.group(1);
    }

    private String extractRepositoryOwner(URI url) {
        Matcher matcher = REPOSITORY_OWNER_PATTERN.matcher(url.toString());
        if (!matcher.find()) {
            throw new UnsuccessfulGitHubUrlParseException(url);
        }

        return matcher.group(1);
    }

    private List<LinkUpdateType> iterateAllSingleUpdateCheckers(
        GitHubRepository oldRepositoryRecord,
        GitHubRepositoryBody currentRepositoryBody
    ) {
        List<LinkUpdateType> linkUpdateTypes = new ArrayList<>();
        for (var updateChecker : updateCheckers) {
            if (updateChecker.hasUpdate(oldRepositoryRecord, currentRepositoryBody)) {
                linkUpdateTypes.add(updateChecker.getType());
            }
        }
        return linkUpdateTypes;
    }

    private void updateLocalRecord(GitHubRepositoryBody newRepositoryBody, long linkId) {

        long id = newRepositoryBody.id();
        String name = newRepositoryBody.name();
        String owner = newRepositoryBody.owner().login();
        String descriptionMd5Hash = newRepositoryBody.getMd5Hash();
        Set<Long> activities = gitHubClient
            .fetchRepositoryActivitiesByRepositoryNameAndOwner(name, owner)
            .stream()
            .map(GitHubRepositoryActivityBody::id)
            .collect(Collectors.toSet());

        GitHubRepository updatedRepository =
            new GitHubRepository(
                id,
                linkId,
                name,
                owner,
                descriptionMd5Hash,
                activities
            );
        repositoryDao.update(updatedRepository);
    }

}

