package edu.java.webClients.webClientsWithRetry.stackOverflow;

import edu.java.configuration.global.RetryConfig;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowAnswerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
import edu.java.webClients.webClientsWithRetry.WebClientWithRetries;
import reactor.core.publisher.Mono;

public abstract class StackOverflowClientWithRetries extends WebClientWithRetries<StackOverflowClient> {

    public StackOverflowClientWithRetries(StackOverflowClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<StackOverflowResponseBody<StackOverflowQuestionBody>> fetchQuestionByQuestionId(long id);

    public abstract Mono<StackOverflowResponseBody<StackOverflowAnswerBody>> fetchAnswersByQuestionId(long id);

}
