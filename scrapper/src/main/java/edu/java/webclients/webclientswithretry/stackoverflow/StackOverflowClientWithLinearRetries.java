package edu.java.webclients.webclientswithretry.stackoverflow;

import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import edu.java.webclients.stackoverflow.StackOverflowClient;
import edu.java.webclients.stackoverflow.dto.StackOverflowAnswerBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowQuestionBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowResponseBody;
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
