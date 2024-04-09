package edu.java.linkupdatescheduler.linkupdatescheckers.singleupdatecheckers.gitHub;

import edu.java.data.dto.GitHubRepository;
import edu.java.linkupdatescheduler.linkupdatescheckers.singleupdatecheckers.SingleUpdateChecker;
import edu.java.webclients.gitHub.dto.GitHubRepositoryBody;

public interface GitHubRepositorySingleUpdateChecker
    extends SingleUpdateChecker<GitHubRepository, GitHubRepositoryBody> {
}
