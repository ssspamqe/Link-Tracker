package edu.java.webClients.retryProxyBuilders.stackOverflow;

import edu.java.configuration.RetryPolicyHttpStatusCodeGroups;
import edu.java.webClients.retryProxyBuilders.ProxyWithRetryBuilder;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.time.Duration;
import java.util.Set;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

@Component
public class StackOverflowRetryProxyBuilder extends ProxyWithRetryBuilder<StackOverflowClient> {

    @Override
    public StackOverflowClient buildProxyWithConstantRetry(
        StackOverflowClient webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> retryOnHttpStatuses
    ) {

        StackOverflowQuestionMonoFetch questionCall =
            buildConstantQuestionCall(delay, maxRetries, retryOnHttpStatuses);
        StackOverflowAnswersMonoFetch answersCall = buildConstantAnswersCall(delay, maxRetries, retryOnHttpStatuses);

        InvocationHandler handler = buildInvocationHandler(questionCall, answersCall);

        return buildProxyWithInvocationHandler(webClientObject, handler);
    }

    private StackOverflowQuestionMonoFetch buildConstantQuestionCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, questionId) -> Mono.fromCallable(() -> client.fetchQuestionById(questionId))
            .retryWhen(
                Retry.fixedDelay(maxRetries, delay)
                    .filter(response -> mustBeRetried(response, httpsStatusesToRetryOn))
            );
    }

    private StackOverflowAnswersMonoFetch buildConstantAnswersCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, questionId) -> Mono.fromCallable(() -> client.fetchAnswersByQuestionId(questionId))
            .retryWhen(
                Retry.fixedDelay(maxRetries, delay)
                    .filter(response -> mustBeRetried(response, httpsStatusesToRetryOn))
            );
    }

    @Override
    public StackOverflowClient buildProxyWithLinearRetry(
        StackOverflowClient webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> retryOnHttpStatuses
    ) {
        StackOverflowQuestionMonoFetch questionCall =
            buildLinearQuestionCall(delay, maxRetries, retryOnHttpStatuses);
        StackOverflowAnswersMonoFetch answersCall = buildLinearAnswersCall(delay, maxRetries, retryOnHttpStatuses);

        InvocationHandler handler = buildInvocationHandler(questionCall, answersCall);

        return buildProxyWithInvocationHandler(webClientObject, handler);
    }

    private StackOverflowQuestionMonoFetch buildLinearQuestionCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, questionId) -> Mono.fromCallable(() -> {
            var currentDelay = delay;

            for (int i = 0; i < maxRetries - 1; i++) {
                currentDelay = currentDelay.plus(delay);
                try {
                    return client.fetchQuestionById(questionId);
                } catch (Exception e) {
                    if (!mustBeRetried(e, httpsStatusesToRetryOn)) {
                        throw e;
                    }
                }
            }
            return client.fetchQuestionById(questionId);
        });
    }

    private StackOverflowAnswersMonoFetch buildLinearAnswersCall(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, questionId) -> Mono.fromCallable(() -> {
            var currentDelay = delay;

            for (int i = 0; i < maxRetries - 1; i++) {
                currentDelay = currentDelay.plus(delay);
                try {
                    return client.fetchAnswersByQuestionId(questionId);
                } catch (Exception e) {
                    if (!mustBeRetried(e, httpsStatusesToRetryOn)) {
                        throw e;
                    }
                }
            }
            return client.fetchAnswersByQuestionId(questionId);
        });
    }

    @Override
    public StackOverflowClient buildProxyWithExponentialRetry(
        StackOverflowClient webClientObject,
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> retryOnHttpStatuses
    ) {
        StackOverflowQuestionMonoFetch questionCall =
            buildExponentialQuestionMonoFetch(delay, maxRetries, retryOnHttpStatuses);
        StackOverflowAnswersMonoFetch answersCall =
            buildExponentialAnswersMonoFetch(delay, maxRetries, retryOnHttpStatuses);

        InvocationHandler handler = buildInvocationHandler(questionCall, answersCall);

        return buildProxyWithInvocationHandler(webClientObject, handler);
    }

    private StackOverflowQuestionMonoFetch buildExponentialQuestionMonoFetch(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, questionId) -> Mono.fromCallable(() -> client.fetchQuestionById(questionId))
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(response -> mustBeRetried(response, httpsStatusesToRetryOn))
            );
    }

    private StackOverflowAnswersMonoFetch buildExponentialAnswersMonoFetch(
        Duration delay,
        int maxRetries,
        Set<RetryPolicyHttpStatusCodeGroups> httpsStatusesToRetryOn
    ) {
        return (client, questionId) -> Mono.fromCallable(() -> client.fetchAnswersByQuestionId(questionId))
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(response -> mustBeRetried(response, httpsStatusesToRetryOn))
            );
    }

    private InvocationHandler buildInvocationHandler(
        StackOverflowQuestionMonoFetch questionCall,
        StackOverflowAnswersMonoFetch answersCall
    ) {
        return (proxy, method, args) -> {
            if ("fetchQuestionByIdWithRetries".equals(method.getName())) {
                Long questionId = (Long) args[0];
                return questionCall.fetch((StackOverflowClient) proxy, questionId);
            } else if ("fetchAnswersByQuestionIdWithRetries".equals(method.getName())) {
                Long questionId = (Long) args[0];
                return answersCall.fetch((StackOverflowClient) proxy, questionId);
            } else {
                return method.invoke(proxy, args);
            }
        };
    }

    @Override
    public StackOverflowClient buildProxyWithInvocationHandler(StackOverflowClient object, InvocationHandler handler) {
        return (StackOverflowClient) Proxy.newProxyInstance(
            object.getClass().getClassLoader(),
            new Class[] {StackOverflowClient.class},
            handler
        );
    }
}
