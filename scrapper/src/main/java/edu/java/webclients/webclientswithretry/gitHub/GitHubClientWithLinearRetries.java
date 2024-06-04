package edu.java.webclients.webclientswithretry.gitHub;

import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import edu.java.webclients.gitHub.GitHubClient;
import edu.java.webclients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webclients.gitHub.dto.GitHubRepositoryBody;
import java.util.List;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;

public class GitHubClientWithLinearRetries extends GitHubClientWithRetries {

    public GitHubClientWithLinearRetries(GitHubClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<GitHubRepositoryBody> fetchRepositoryByNameAndOwner(String repoName, String owner) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.fetchRepositoryByNameAndOwner(repoName, owner)
            )
        );
    }

    @Override
    public Mono<List<GitHubRepositoryActivityBody>> fetchRepositoryActivitiesByRepositoryNameAndOwner(
        String repoName,
        String owner
    ) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.fetchRepositoryActivitiesByRepositoryNameAndOwner(repoName, owner)
            )
        );
    }

    private <T> T getWithLinearRetry(Supplier<T> action) {

        var currentDelay = delay;

        for (int i = 0; i < maxRetries; i++) {
            try {
                return action.get();
            } catch (Exception e) {
                if (!mustBeRetried(e)) {
                    throw e;
                }
            }

            try {
                Thread.sleep(currentDelay.toMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            currentDelay = currentDelay.plus(delay);
        }

        return action.get();

    }
}
