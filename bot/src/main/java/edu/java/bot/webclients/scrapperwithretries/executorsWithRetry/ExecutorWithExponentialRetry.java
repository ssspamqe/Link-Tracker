package edu.java.bot.webclients.scrapperwithretries.executorsWithRetry;

import edu.java.bot.configuration.scrapperconfiguration.RetryPolicyHttpStatusCodeGroups;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;
import java.time.Duration;
import java.util.Set;
import java.util.function.Supplier;

public class ExecutorWithExponentialRetry extends ExecutorWithRetry{

    public ExecutorWithExponentialRetry(
        int maxRetries,
        Duration delay,
        Set<RetryPolicyHttpStatusCodeGroups> statusCodesToRetry
    ) {
        super(maxRetries, delay, statusCodesToRetry);
    }

    @Override
    public <A> Mono<A> retrieveWithRetry(Supplier<A> supplier) {
        return Mono.fromCallable(supplier::get)
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }

    @Override
    public Mono<Void> performWithRetry(Runnable runnable) {
        return Mono.fromRunnable(runnable)
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            ).then();
    }
}
