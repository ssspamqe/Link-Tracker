package edu.java.bot.webclients.scrapper.withretries.executorsWithRetry;

import edu.java.bot.configuration.scrapperconfiguration.RetryPolicyHttpStatusCodeGroups;
import java.time.Duration;
import java.util.Set;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class ExecutorWithConstantRetry extends ExecutorWithRetry {

    public ExecutorWithConstantRetry(
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
                Retry.fixedDelay(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }

    @Override
    public Mono<Void> performWithRetry(Runnable runnable) {
        return Mono.fromRunnable(runnable)
            .retryWhen(
                Retry.fixedDelay(maxRetries, delay)
                    .filter(this::mustBeRetried)
            ).then();
    }
}
