package edu.java.linkupdatescheduler.linkupdatescheckers.singleupdatecheckers.gitHub;

import edu.java.data.dto.GitHubRepository;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdateType;
import edu.java.webclients.gitHub.dto.GitHubRepositoryBody;
import org.springframework.stereotype.Component;

@Component
public class GitHubRepositoryDescriptionUpdateChecker implements GitHubRepositorySingleUpdateChecker {
    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.GIT_HUB_REPOSITORY_DESCRIPTION;
    }

    @Override
    public boolean hasUpdate(GitHubRepository oldState, GitHubRepositoryBody newState) {
        String oldHash = oldState.getDescriptionMd5Hash();
        String newHash = newState.getMd5Hash();
        return !oldHash.equals(newHash);
    }
}
