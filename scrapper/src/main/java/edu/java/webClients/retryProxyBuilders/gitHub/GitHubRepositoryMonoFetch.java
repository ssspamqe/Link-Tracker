package edu.java.webClients.retryProxyBuilders.gitHub;

import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import reactor.core.publisher.Mono;

public interface GitHubRepositoryMonoFetch {
    Mono<GitHubRepositoryBody> fetch(GitHubClient client, String repoName, String owner);
}
