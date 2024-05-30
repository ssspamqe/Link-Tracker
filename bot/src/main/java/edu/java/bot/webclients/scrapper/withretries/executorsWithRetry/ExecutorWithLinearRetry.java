package edu.java.bot.webclients.scrapper.withretries.executorsWithRetry;

import edu.java.bot.configuration.scrapperconfiguration.RetryPolicyHttpStatusCodeGroups;
import edu.java.bot.webclients.scrapper.withretries.exceptions.UnsuccessfulSleepWhileRetrying;
import java.time.Duration;
import java.util.Set;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;

public class ExecutorWithLinearRetry extends ExecutorWithRetry {

    public ExecutorWithLinearRetry(
        int maxRetries,
        Duration delay,
        Set<RetryPolicyHttpStatusCodeGroups> statusCodesToRetry
    ) {
        super(maxRetries, delay, statusCodesToRetry);
    }

    @Override
    public <A> Mono<A> retrieveWithRetry(Supplier<A> supplier) {
        return Mono.fromCallable(() -> {
            var currentDelay = delay;

            for (int i = 0; i < maxRetries; i++) {
                try {
                    return supplier.get();
                } catch (Exception e) {
                    if (!mustBeRetried(e)) {
                        throw e;
                    }
                }

                try {
                    Thread.sleep(currentDelay.toMillis());
                } catch (InterruptedException exception) {
                    throw new UnsuccessfulSleepWhileRetrying(exception);
                }

                currentDelay = currentDelay.plus(delay);
            }

            return supplier.get();
        });
    }

    @Override
    public Mono<Void> performWithRetry(Runnable runnable) {
        return Mono.fromRunnable(() -> {
            var currentDelay = delay;

            for (int i = 0; i < maxRetries; i++) {
                try {
                    runnable.run();
                } catch (Exception ex) {
                    if (!mustBeRetried(ex)) {
                        throw ex;
                    }
                }

                try {
                    Thread.sleep(currentDelay.toMillis());
                } catch (InterruptedException exception) {
                    throw new UnsuccessfulSleepWhileRetrying(exception);
                }

                currentDelay = currentDelay.plus(delay);
            }

            runnable.run();
        });
    }
}
