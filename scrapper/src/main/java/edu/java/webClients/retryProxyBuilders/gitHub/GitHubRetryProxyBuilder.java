package edu.java.webClients.retryProxyBuilders.gitHub;

import edu.java.configuration.RetryPolicyHttpStatusCodeGroups;
import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.retryProxyBuilders.ProxyWithRetryBuilder;
import java.lang.reflect.InvocationHandler;
import java.time.Duration;
import java.util.Set;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class GitHubRetryProxyBuilder extends ProxyWithRetryBuilder<GitHubClient> {
    @Override
    public GitHubClient buildProxyWithConstantRetry(
        GitHubClient webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        var repositoryCall = buildConstantRepositoryCall(delay, maxRetries, httpsStatusesToRetryOn);
        var activitiesCall = buildConstantRepositoryActivitiesCall(delay, maxRetries, httpsStatusesToRetryOn);

        InvocationHandler handler = buildInvocationHandler(repositoryCall, activitiesCall);

        return buildProxyWithInvocationHandler(webClientObject, handler);
    }

    private GitHubRepositoryMonoFetch buildConstantRepositoryCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, repoName, owner) ->
            Mono.fromCallable(() -> client.fetchRepositoryByNameAndOwner(repoName, owner))
                .retryWhen(
                    Retry.fixedDelay(maxRetries, delay)
                        .filter(response -> mustBeRetried(response, httpsStatusesToRetryOn))
                );
    }

    private GitHubRepositoryActivitiesMonoFetch buildConstantRepositoryActivitiesCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, repoName, owner) ->
            Mono.fromCallable(() -> client.fetchRepositoryActivitiesByRepositoryNameAndOwner(repoName, owner))
                .retryWhen(
                    Retry.fixedDelay(maxRetries, delay)
                        .filter(response -> mustBeRetried(response, httpsStatusesToRetryOn))
                );
    }

    @Override
    public GitHubClient buildProxyWithLinearRetry(
        GitHubClient webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        var repositoryCall = buildLinearRepositoryCall(delay, maxRetries, httpsStatusesToRetryOn);
        var repositoryActivitiesCall = buildLinearRepositoryActivitiesCall(delay, maxRetries, httpsStatusesToRetryOn);

        var handler = buildInvocationHandler(repositoryCall, repositoryActivitiesCall);

        return buildProxyWithInvocationHandler(webClientObject, handler);
    }

    private GitHubRepositoryMonoFetch buildLinearRepositoryCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, repoName, owner) -> Mono.fromCallable(() -> {
            var currentDelay = delay;

            for (int i = 0; i < maxRetries - 1; i++) {
                currentDelay = currentDelay.plus(delay);
                try {
                    return client.fetchRepositoryByNameAndOwner(repoName, owner);
                } catch (Exception e) {
                    if (!mustBeRetried(e, httpsStatusesToRetryOn)) {
                        throw e;
                    }
                }
            }
            return client.fetchRepositoryByNameAndOwner(repoName, owner);
        });
    }

    private GitHubRepositoryActivitiesMonoFetch buildLinearRepositoryActivitiesCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, repoName, owner) -> Mono.fromCallable(() -> {
            var currentDelay = delay;

            for (int i = 0; i < maxRetries - 1; i++) {
                currentDelay = currentDelay.plus(delay);
                try {
                    return client.fetchRepositoryActivitiesByRepositoryNameAndOwner(repoName, owner);
                } catch (Exception e) {
                    if (!mustBeRetried(e, httpsStatusesToRetryOn)) {
                        throw e;
                    }
                }
            }
            return client.fetchRepositoryActivitiesByRepositoryNameAndOwner(repoName, owner);
        });
    }

    @Override
    public GitHubClient buildProxyWithExponentialRetry(
        GitHubClient webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        var repositoryCall = buildExponentialRepositoryCall(delay, maxRetries, httpsStatusesToRetryOn);
        var activitiesCall = buildExponentialRepositoryActivitiesCall(delay, maxRetries, httpsStatusesToRetryOn);

        var handler = buildInvocationHandler(repositoryCall, activitiesCall);

        return buildProxyWithInvocationHandler(webClientObject, handler);
    }

    private GitHubRepositoryMonoFetch buildExponentialRepositoryCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, repoName, owner) ->
            Mono.fromCallable(() -> client.fetchRepositoryByNameAndOwner(repoName, owner))
                .retryWhen(
                    Retry.backoff(maxRetries, delay)
                        .filter(response -> mustBeRetried(response, httpsStatusesToRetryOn))
                );
    }

    private GitHubRepositoryActivitiesMonoFetch buildExponentialRepositoryActivitiesCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, repoName, owner) ->
            Mono.fromCallable(() -> client.fetchRepositoryActivitiesByRepositoryNameAndOwner(repoName, owner))
                .retryWhen(
                    Retry.backoff(maxRetries, delay)
                        .filter(response -> mustBeRetried(response, httpsStatusesToRetryOn))
                );
    }

    private InvocationHandler buildInvocationHandler(
        GitHubRepositoryMonoFetch repositoryCall,
        GitHubRepositoryActivitiesMonoFetch activitiesCall
    ) {
        return (proxy, method, args) -> {
            if ("fetchQuestionByIdWithRetries".equals(method.getName())) {
                String repoName = (String) args[0];
                String owner = (String) args[1];
                return repositoryCall.fetch((GitHubClient) proxy, repoName, owner);
            } else if ("fetchAnswersByQuestionIdWithRetries".equals(method.getName())) {
                String repoName = (String) args[0];
                String owner = (String) args[1];
                return activitiesCall.fetch((GitHubClient) proxy, repoName, owner);
            } else {
                return method.invoke(proxy, args);
            }
        };
    }
}
