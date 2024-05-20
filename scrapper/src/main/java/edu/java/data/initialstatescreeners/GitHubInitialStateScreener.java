package edu.java.data.initialstatescreeners;

import edu.java.configuration.services.trackableservices.AllTrackableServicesConfigurations;
import edu.java.configuration.services.trackableservices.TrackableServiceConfiguration;
import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dto.GitHubRepository;
import edu.java.data.dto.Link;
import edu.java.linkupdatescheduler.exceptions.IncorrectHostException;
import edu.java.linkupdatescheduler.exceptions.UnsuccessfulGitHubUrlParseException;
import edu.java.webclients.gitHub.GitHubClient;
import edu.java.webclients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webclients.gitHub.dto.GitHubRepositoryBody;
import java.net.URI;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GitHubInitialStateScreener implements InitialStateScreener {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final Pattern REPOSITORY_NAME_OWNER_PATTERN = Pattern.compile("github.com/([^/]+)/([^/]+)$");

    private final TrackableServiceConfiguration gitHubConfig;
    private final GitHubClient gitHubClient;
    private final GitHubRepositoryDataAccessObject gitHubRepositoryDao;

    public GitHubInitialStateScreener(
        @Qualifier("gitHubConfig")
        TrackableServiceConfiguration gitHubConfig,
        GitHubClient gitHubClient,
        GitHubRepositoryDataAccessObject gitHubRepositoryDao
    ){
        this.gitHubConfig = gitHubConfig;
        this.gitHubClient = gitHubClient;
        this.gitHubRepositoryDao = gitHubRepositoryDao;
    }

    @Override
    public void saveInitialState(Link link) {
        URI url = link.getUrl();
        String hostName = url.getHost();
        if (isIncorrectHostName(hostName)) {
            throw new IncorrectHostException(hostName);
        }

        RepositoryAndOwner repositoryAndOwner = extractRepositoryAndOwner(link.getUrl());
        String repositoryName = repositoryAndOwner.repositoryName;
        String owner = repositoryAndOwner.ownerName;

        var repositoryBody = gitHubClient.fetchRepositoryByNameAndOwner(repositoryName, owner);
        var repository = buildRepositoryEntity(repositoryBody, link.getId());

        gitHubRepositoryDao.save(repository);
    }

    private RepositoryAndOwner extractRepositoryAndOwner(URI url) {
        Matcher matcher = REPOSITORY_NAME_OWNER_PATTERN.matcher(url.toString());
        if (matcher.find()) {
            String owner = matcher.group(1);
            String repository = matcher.group(2);
            return new RepositoryAndOwner(repository, owner);
        } else {
            throw new UnsuccessfulGitHubUrlParseException(url);
        }
    }

    private boolean isIncorrectHostName(String hostName) {
        return !gitHubConfig.isCorrectHostName(hostName);
    }

    private GitHubRepository buildRepositoryEntity(GitHubRepositoryBody repositoryBody, long linkId) {
        long id = repositoryBody.id();
        String name = repositoryBody.name();
        String owner = repositoryBody.owner().login();
        String descriptionMd5Hash = repositoryBody.getMd5Hash();
        Set<Long> activities = fetchActivitiesIds(name, owner);

        return new GitHubRepository(
            id,
            linkId,
            name,
            owner,
            descriptionMd5Hash,
            activities
        );
    }

    private Set<Long> fetchActivitiesIds(String repositoryName, String owner) {
        return gitHubClient
            .fetchRepositoryActivitiesByRepositoryNameAndOwner(repositoryName, owner)
            .stream()
            .map(GitHubRepositoryActivityBody::id)
            .collect(Collectors.toSet());
    }

    private record RepositoryAndOwner(
        String repositoryName,
        String ownerName
    ) {
    }
}
