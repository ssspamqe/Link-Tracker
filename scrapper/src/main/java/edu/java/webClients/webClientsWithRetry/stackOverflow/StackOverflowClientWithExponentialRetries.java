package edu.java.webClients.webClientsWithRetry.stackOverflow;

import edu.java.configuration.global.RetryConfig;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowAnswerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class StackOverflowClientWithExponentialRetries extends StackOverflowClientWithRetries {

    public StackOverflowClientWithExponentialRetries(StackOverflowClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<StackOverflowResponseBody<StackOverflowQuestionBody>> fetchQuestionByQuestionId(long id) {
        return Mono.fromCallable(() -> baseClient.fetchQuestionById(id))
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );

    }

    @Override
    public Mono<StackOverflowResponseBody<StackOverflowAnswerBody>> fetchAnswersByQuestionId(long id) {
        return Mono.fromCallable(() -> baseClient.fetchAnswersByQuestionId(id))
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }
}
