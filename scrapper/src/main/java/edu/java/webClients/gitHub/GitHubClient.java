package edu.java.webClients.gitHub;

import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Mono;

@HttpExchange
public interface GitHubClient {

    @GetExchange(url = "/repos/{owner}/{repoName}")
    GitHubRepositoryBody fetchRepositoryByNameAndOwner(@PathVariable String repoName, @PathVariable String owner);

    Mono<GitHubRepositoryBody> fetchRepositoryByNameAndOwnerWithRetries(String repoName, String owner);

    @GetExchange(url = "/repos/{owner}/{repoName}/activity")
    List<GitHubRepositoryActivityBody> fetchRepositoryActivitiesByRepositoryNameAndOwner(
        @PathVariable String repoName,
        @PathVariable String owner
    );

    Mono<List<GitHubRepositoryActivityBody>> fetchRepositoryActivitiesByRepositoryNameAndOwnerWithRetries(String repoName, String owner);
}
