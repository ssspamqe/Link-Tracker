package edu.java.webclients.gitHub;

import edu.java.webclients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webclients.gitHub.dto.GitHubRepositoryBody;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GitHubClient {

    @GetExchange(url = "/repos/{owner}/{repoName}")
    GitHubRepositoryBody fetchRepositoryByNameAndOwner(@PathVariable String repoName, @PathVariable String owner);

    @GetExchange(url = "/repos/{owner}/{repoName}/activity")
    List<GitHubRepositoryActivityBody> fetchRepositoryActivitiesByRepositoryNameAndOwner(
        @PathVariable String repoName,
        @PathVariable String owner
    );
}
