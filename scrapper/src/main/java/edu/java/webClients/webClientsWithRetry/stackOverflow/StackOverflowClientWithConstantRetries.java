package edu.java.webClients.webClientsWithRetry.stackOverflow;

import edu.java.configuration.RetryConfig;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowAnswerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
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
