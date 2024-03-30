package edu.java.webClients.retryProxyBuilders;

import edu.java.configuration.RetryPolicyHttpStatusCodeGroups;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.time.Duration;
import java.util.Set;

public abstract class ProxyWithRetryBuilder<T> {

    abstract public T buildProxyWithConstantRetry(
        T webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    );

    abstract public T buildProxyWithLinearRetry(T webClientObject, Duration delay, int maxRetries, Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn);

    abstract public T buildProxyWithExponentialRetry(T webClientObject, Duration delay, int maxRetries, Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn);

    protected boolean mustBeRetried(Throwable throwable, Set<RetryPolicyHttpStatusCodeGroups> statusCodesToRetryOn) {
        if(!(throwable instanceof WebClientResponseException)) {
            return false;
        }

        var statusCode = ((WebClientResponseException) throwable).getStatusCode();
        var retryPolicyHttpStatusCode  =  RetryPolicyHttpStatusCodeGroups.getGroupByStatusCode(statusCode);

        return statusCodesToRetryOn.contains(retryPolicyHttpStatusCode);
    }

    protected T buildProxyWithInvocationHandler(Object object, InvocationHandler handler) {
        return (T) Proxy.newProxyInstance(
            object.getClass().getClassLoader(),
            new Class[] { object.getClass() },
            handler
        );
    }

}
