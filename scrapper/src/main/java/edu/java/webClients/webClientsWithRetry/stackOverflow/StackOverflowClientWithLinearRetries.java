package edu.java.webClients.webClientsWithRetry.stackOverflow;

import edu.java.configuration.ApplicationConfig;
import edu.java.configuration.RetryConfig;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowAnswerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;

public class StackOverflowClientWithLinearRetries extends StackOverflowClientWithRetries {

    public StackOverflowClientWithLinearRetries(StackOverflowClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<StackOverflowResponseBody<StackOverflowQuestionBody>> fetchQuestionByQuestionId(long id) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.fetchQuestionById(id)
            )
        );

    }

    @Override
    public Mono<StackOverflowResponseBody<StackOverflowAnswerBody>> fetchAnswersByQuestionId(long id) {

        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.fetchAnswersByQuestionId(id)
            )
        );

    }

    private <T> T getWithLinearRetry(Supplier<T> action) {

        var currentDelay = delay;

        for (int i = 0; i < maxRetries; i++) {
            try {
                return action.get();
            } catch (Exception e) {
                if (!mustBeRetried(e)) {
                    throw e;
                }
            }

            try {
                Thread.sleep(currentDelay.toMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            currentDelay = currentDelay.plus(delay);
        }

        return action.get();

    }
}
