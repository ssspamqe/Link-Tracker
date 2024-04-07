package edu.java.webClients.webClientsWithRetry.gitHub;

import edu.java.configuration.global.RetryConfig;
import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import edu.java.webClients.webClientsWithRetry.WebClientWithRetries;
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
