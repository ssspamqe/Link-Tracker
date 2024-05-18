package edu.java.webclients.webclientswithretry.stackoverflow;

import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import edu.java.webclients.stackoverflow.StackOverflowClient;
import edu.java.webclients.stackoverflow.dto.StackOverflowAnswerBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowQuestionBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowResponseBody;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class StackOverflowClientWithConstantRetries extends StackOverflowClientWithRetries {

    public StackOverflowClientWithConstantRetries(StackOverflowClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<StackOverflowResponseBody<StackOverflowQuestionBody>> fetchQuestionByQuestionId(long id) {
        return Mono.fromCallable(() -> baseClient.fetchQuestionById(id))
            .retryWhen(
                Retry.fixedDelay(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );

    }

    @Override
    public Mono<StackOverflowResponseBody<StackOverflowAnswerBody>> fetchAnswersByQuestionId(long id) {
        return Mono.fromCallable(() -> baseClient.fetchAnswersByQuestionId(id))
            .retryWhen(
                Retry.fixedDelay(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }
}
