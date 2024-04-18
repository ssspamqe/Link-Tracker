package edu.java.bot.webclients.scrapperwithretries;

import edu.java.bot.configuration.globalconfiguration.RetryConfig;
import edu.java.bot.configuration.globalconfiguration.RetryPolicyHttpStatusCodeGroups;
import jakarta.annotation.PostConstruct;
import java.time.Duration;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@RequiredArgsConstructor
public abstract class WebClientWithRetries<T> {
    protected final T baseClient;
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

    protected boolean mustBeRetried(Throwable throwable) {
        return mustBeRetried(throwable, retryOnHttpStatuses);
    }

    protected boolean mustBeRetried(Throwable throwable, Set<RetryPolicyHttpStatusCodeGroups> statusCodesToRetryOn) {
        if (!(throwable instanceof WebClientResponseException)) {
            return false;
        }

        var statusCode = ((WebClientResponseException) throwable).getStatusCode();
        var retryPolicyHttpStatusCode = RetryPolicyHttpStatusCodeGroups.getGroupByStatusCode(statusCode);

        return statusCodesToRetryOn.contains(retryPolicyHttpStatusCode);
    }
}
