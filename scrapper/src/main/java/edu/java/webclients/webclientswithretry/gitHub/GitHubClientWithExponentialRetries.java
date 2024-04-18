package edu.java.webclients.webclientswithretry.gitHub;

import edu.java.configuration.global.RetryConfig;
import edu.java.webclients.gitHub.GitHubClient;
import edu.java.webclients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webclients.gitHub.dto.GitHubRepositoryBody;
import java.util.List;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class GitHubClientWithExponentialRetries extends GitHubClientWithRetries {

    public GitHubClientWithExponentialRetries(GitHubClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<GitHubRepositoryBody> fetchRepositoryByNameAndOwner(String repoName, String owner) {
        return Mono.fromCallable(() -> baseClient.fetchRepositoryByNameAndOwner(repoName, owner))
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }

    @Override
    public Mono<List<GitHubRepositoryActivityBody>> fetchRepositoryActivitiesByRepositoryNameAndOwner(
        String repoName,
        String owner
    ) {
        return Mono.fromCallable(() -> baseClient.fetchRepositoryActivitiesByRepositoryNameAndOwner(repoName, owner))
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }
}
