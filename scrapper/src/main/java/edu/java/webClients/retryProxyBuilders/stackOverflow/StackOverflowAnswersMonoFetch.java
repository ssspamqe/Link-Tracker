package edu.java.webClients.retryProxyBuilders.stackOverflow;

import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowAnswerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
import reactor.core.publisher.Mono;

public interface StackOverflowAnswersMonoFetch {
    Mono<StackOverflowResponseBody<StackOverflowAnswerBody>> fetch(StackOverflowClient client, long questionId);
}
