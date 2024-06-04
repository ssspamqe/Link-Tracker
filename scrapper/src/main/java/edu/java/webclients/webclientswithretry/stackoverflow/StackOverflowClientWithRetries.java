package edu.java.webclients.webclientswithretry.stackoverflow;

import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import edu.java.webclients.stackoverflow.StackOverflowClient;
import edu.java.webclients.stackoverflow.dto.StackOverflowAnswerBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowQuestionBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowResponseBody;
import edu.java.webclients.webclientswithretry.WebClientWithRetries;
import reactor.core.publisher.Mono;

public abstract class StackOverflowClientWithRetries extends WebClientWithRetries<StackOverflowClient> {

    public StackOverflowClientWithRetries(StackOverflowClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<StackOverflowResponseBody<StackOverflowQuestionBody>> fetchQuestionByQuestionId(long id);

    public abstract Mono<StackOverflowResponseBody<StackOverflowAnswerBody>> fetchAnswersByQuestionId(long id);

}
