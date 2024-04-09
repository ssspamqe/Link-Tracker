package edu.java.linkupdatescheduler.linkupdatescheckers.singleupdatecheckers.gitHub;

import edu.java.data.dto.GitHubRepository;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdateType;
import edu.java.webclients.gitHub.GitHubClient;
import edu.java.webclients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webclients.gitHub.dto.GitHubRepositoryBody;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GItHubRepositoryActivitiesUpdateChecker implements GitHubRepositorySingleUpdateChecker {

    private final GitHubClient gitHubClient;

    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.GIT_HUB_REPOSITORY_ACTIVITIES;
    }

    @Override
    public boolean hasUpdate(GitHubRepository oldState, GitHubRepositoryBody newState) {
        Set<Long> oldActivities = oldState.getActivitiesIds();
        Set<Long> newActivities = fetchActivitiesIds(newState.name(), newState.owner().login());

        return !oldActivities.equals(newActivities);
    }

    private Set<Long> fetchActivitiesIds(String name, String owner) {
        return gitHubClient
            .fetchRepositoryActivitiesByRepositoryNameAndOwner(name, owner)
            .stream()
            .map(GitHubRepositoryActivityBody::id)
            .collect(Collectors.toSet());
    }

}
