package edu.java.webClients.retryProxyBuilders.gitHub;

import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import reactor.core.publisher.Mono;
import java.util.List;

public interface GitHubRepositoryActivitiesMonoFetch {
    Mono<List<GitHubRepositoryActivityBody>> fetch(GitHubClient client, String repoName, String owner);
}
