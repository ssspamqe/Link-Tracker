package edu.java.webClients.webClientsWithRetry.stackOverflow;

import edu.java.configuration.ApplicationConfig;
import edu.java.configuration.RetryConfig;
import edu.java.configuration.RetryPolicyHttpStatusCodeGroups;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.stackOverflow.dto.StackOverflowAnswerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
import edu.java.webClients.webClientsWithRetry.WebClientWithReties;
import jakarta.annotation.PostConstruct;
import java.time.Duration;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public abstract class StackOverflowClientWithRetries extends WebClientWithReties {

    protected final StackOverflowClient baseClient;
    protected final RetryConfig retryConfig;

    protected int maxRetries;
    protected Duration delay;
    protected Set<RetryPolicyHttpStatusCodeGroups> retryOnHttpStatuses;

    @PostConstruct
    protected void init() {
        maxRetries = retryConfig.maxRetries();
        delay = retryConfig.delay();
        retryOnHttpStatuses = retryConfig.retryOnStatuses();
    }

    abstract public Mono<StackOverflowResponseBody<StackOverflowQuestionBody>> fetchQuestionByQuestionId(long id);

    abstract public Mono<StackOverflowResponseBody<StackOverflowAnswerBody>> fetchAnswersByQuestionId(long id);

    protected boolean mustBeRetried(Throwable throwable) {
        return mustBeRetried(throwable, retryOnHttpStatuses);
    }

}
