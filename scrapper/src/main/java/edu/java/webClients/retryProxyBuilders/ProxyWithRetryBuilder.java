package edu.java.webClients.retryProxyBuilders;

import edu.java.configuration.RetryConfig;
import edu.java.configuration.RetryPolicyHttpStatusCodeGroups;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.time.Duration;
import java.util.Set;
import org.springframework.web.reactive.function.client.WebClientResponseException;

public abstract class ProxyWithRetryBuilder<T> {

    public T buildProxyFromRetryConfig(T webClient, RetryConfig retryConfig) {
        return switch (retryConfig.type()) {
            case CONSTANT -> buildProxyWithConstantRetry(
                webClient,
                retryConfig.delay(),
                retryConfig.maxRetries(),
                retryConfig.retryOnStatuses()
            );
            case LINEAR -> buildProxyWithLinearRetry(
                webClient,
                retryConfig.delay(),
                retryConfig.maxRetries(),
                retryConfig.retryOnStatuses()
            );
            case EXPONENTIAL -> buildProxyWithExponentialRetry(
                webClient,
                retryConfig.delay(),
                retryConfig.maxRetries(),
                retryConfig.retryOnStatuses()
            );
        };
    }

    abstract public T buildProxyWithConstantRetry(
        T webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> retryOnHttpStatuses
    );

    abstract public T buildProxyWithLinearRetry(
        T webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> retryOnHttpStatuses
    );

    abstract public T buildProxyWithExponentialRetry(
        T webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> retryOnHttpStatuses
    );



    abstract public T buildProxyWithInvocationHandler(T object, InvocationHandler handler);

}
