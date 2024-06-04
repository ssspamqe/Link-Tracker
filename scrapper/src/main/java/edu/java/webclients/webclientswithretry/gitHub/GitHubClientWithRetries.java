package edu.java.webclients.webclientswithretry.gitHub;

import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import edu.java.webclients.gitHub.GitHubClient;
import edu.java.webclients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webclients.gitHub.dto.GitHubRepositoryBody;
import edu.java.webclients.webclientswithretry.WebClientWithRetries;
import java.util.List;
import reactor.core.publisher.Mono;

public abstract class GitHubClientWithRetries extends WebClientWithRetries<GitHubClient> {

    public GitHubClientWithRetries(GitHubClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<GitHubRepositoryBody> fetchRepositoryByNameAndOwner(String repoName, String owner);

    public abstract Mono<List<GitHubRepositoryActivityBody>> fetchRepositoryActivitiesByRepositoryNameAndOwner(
        String repoName,
        String owner
    );
}
