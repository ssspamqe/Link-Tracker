package edu.java.webClients.webClientsWithRetry.gitHub;

import edu.java.configuration.ApplicationConfig;
import edu.java.configuration.RetryConfig;
import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;
import java.util.List;

public class GitHubClientWithConstantRetries extends GitHubClientWithRetries{

    public GitHubClientWithConstantRetries(GitHubClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<GitHubRepositoryBody> fetchRepositoryByNameAndOwner(String repoName, String owner) {
        return Mono.fromCallable(() -> baseClient.fetchRepositoryByNameAndOwner(repoName, owner))
            .retryWhen(
                Retry.fixedDelay(maxRetries, delay)
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
                Retry.fixedDelay(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }
}
