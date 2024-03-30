package edu.java.webClients.retryProxyBuilders.stackOverflow;

import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
import reactor.core.publisher.Mono;

public interface StackOverflowQuestionMonoFetch {
    Mono<StackOverflowResponseBody<StackOverflowQuestionBody>> fetch(StackOverflowClient client, long questionId);
}
