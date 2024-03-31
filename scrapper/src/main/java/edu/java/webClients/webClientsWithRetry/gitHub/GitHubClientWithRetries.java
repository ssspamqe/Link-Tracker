package edu.java.webClients.webClientsWithRetry.gitHub;

import edu.java.configuration.ApplicationConfig;
import edu.java.configuration.RetryConfig;
import edu.java.configuration.RetryPolicyHttpStatusCodeGroups;
import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.gitHub.dto.GitHubRepositoryActivityBody;
import edu.java.webClients.gitHub.dto.GitHubRepositoryBody;
import edu.java.webClients.webClientsWithRetry.WebClientWithReties;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;
import java.time.Duration;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
public abstract class GitHubClientWithRetries extends WebClientWithReties {

        protected final GitHubClient baseClient;
        protected final RetryConfig retryConfig;

        protected int maxRetries;
        protected Duration delay;
        protected Set<RetryPolicyHttpStatusCodeGroups> retryOnHttpStatuses;

        @PostConstruct
        protected void init() {
            maxRetries = retryConfig.maxRetries();
            delay = retryConfig.delay();
            retryOnHttpStatuses = retryConfig.retryOnStatuses();
        }

        abstract public Mono<GitHubRepositoryBody> fetchRepositoryByNameAndOwner(String repoName, String owner);

        abstract public Mono<List<GitHubRepositoryActivityBody>> fetchRepositoryActivitiesByRepositoryNameAndOwner(String repoName, String owner);

        protected boolean mustBeRetried(Throwable throwable) {
            return mustBeRetried(throwable, retryOnHttpStatuses);
        }
}
