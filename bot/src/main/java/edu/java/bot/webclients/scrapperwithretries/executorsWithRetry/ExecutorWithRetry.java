package edu.java.bot.webclients.scrapperwithretries.executorsWithRetry;

import java.time.Duration;
import java.util.Set;
import java.util.function.Supplier;
import edu.java.bot.configuration.scrapperconfiguration.RetryPolicyHttpStatusCodeGroups;
import lombok.RequiredArgsConstructor;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public abstract class ExecutorWithRetry {

    protected final int maxRetries;
    protected final Duration delay;
    protected final Set<RetryPolicyHttpStatusCodeGroups> statusCodesToRetry;

    public abstract <A> Mono<A> retrieveWithRetry(Supplier<A> supplier);

    public abstract Mono<Void> performWithRetry(Runnable runnable);

    protected boolean mustBeRetried(Throwable throwable) {
        if (!(throwable instanceof WebClientResponseException)) {
            return false;
        }

        var statusCode = ((WebClientResponseException) throwable).getStatusCode();
        var retryPolicyHttpStatusCode = RetryPolicyHttpStatusCodeGroups.getGroupByStatusCode(statusCode);

        return statusCodesToRetry.contains(retryPolicyHttpStatusCode);
    }

}
