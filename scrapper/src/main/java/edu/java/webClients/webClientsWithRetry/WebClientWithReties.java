package edu.java.webClients.webClientsWithRetry;

import edu.java.configuration.RetryPolicyHttpStatusCodeGroups;
import java.util.Set;
import org.springframework.web.reactive.function.client.WebClientResponseException;

public abstract class WebClientWithReties {
    protected boolean mustBeRetried(Throwable throwable, Set<RetryPolicyHttpStatusCodeGroups> statusCodesToRetryOn) {
        if (!(throwable instanceof WebClientResponseException)) {
            return false;
        }

        var statusCode = ((WebClientResponseException) throwable).getStatusCode();
        var retryPolicyHttpStatusCode = RetryPolicyHttpStatusCodeGroups.getGroupByStatusCode(statusCode);

        return statusCodesToRetryOn.contains(retryPolicyHttpStatusCode);
    }
}
