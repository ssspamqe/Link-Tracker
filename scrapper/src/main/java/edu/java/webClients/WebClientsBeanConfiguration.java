package edu.java.webClients;

import edu.java.configuration.global.ApplicationConfig;
import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.webClientsWithRetry.gitHub.GitHubClientWithConstantRetries;
import edu.java.webClients.webClientsWithRetry.gitHub.GitHubClientWithExponentialRetries;
import edu.java.webClients.webClientsWithRetry.gitHub.GitHubClientWithLinearRetries;
import edu.java.webClients.webClientsWithRetry.gitHub.GitHubClientWithRetries;
import edu.java.webClients.webClientsWithRetry.stackOverflow.StackOverflowClientWithConstantRetries;
import edu.java.webClients.webClientsWithRetry.stackOverflow.StackOverflowClientWithExponentialRetries;
import edu.java.webClients.webClientsWithRetry.stackOverflow.StackOverflowClientWithLinearRetries;
import edu.java.webClients.webClientsWithRetry.stackOverflow.StackOverflowClientWithRetries;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
@RequiredArgsConstructor
public class WebClientsBeanConfiguration {

    private final ApplicationConfig applicationConfig;

    @Bean
    public StackOverflowClient stackOverflowClient() {
        String baseUrl = applicationConfig.stackOverflowConfig().getBaseUrl();
        return createDefaultWebClient(baseUrl, StackOverflowClient.class);
    }

    @Bean
    public StackOverflowClientWithRetries stackOverflowClientWithRetries() {
        var retryConfig = applicationConfig.stackOverflowConfig().retryConfig();
        var type = retryConfig.type();

        return switch (type) {
            case CONSTANT -> new StackOverflowClientWithConstantRetries(stackOverflowClient(), retryConfig);
            case LINEAR -> new StackOverflowClientWithLinearRetries(stackOverflowClient(), retryConfig);
            case EXPONENTIAL -> new StackOverflowClientWithExponentialRetries(stackOverflowClient(), retryConfig);
        };
    }

    @Bean
    public GitHubClient gitHubClient() {
        String baseUrl = applicationConfig.gitHubConfig().getBaseUrl();
        return createDefaultWebClient(baseUrl, GitHubClient.class);
    }

    @Bean
    public GitHubClientWithRetries gitHubClientWithRetries() {
        var retryConfig = applicationConfig.stackOverflowConfig().retryConfig();
        var type = retryConfig.type();

        return switch (type) {
            case CONSTANT -> new GitHubClientWithConstantRetries(gitHubClient(), retryConfig);
            case LINEAR -> new GitHubClientWithLinearRetries(gitHubClient(), retryConfig);
            case EXPONENTIAL -> new GitHubClientWithExponentialRetries(gitHubClient(), retryConfig);
        };
    }

    private <T> T createDefaultWebClient(String url, Class<T> webClientInterface) {
        WebClient webClient = WebClient.builder()
            .baseUrl(url)
            .build();

        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(webClientInterface);
    }
}
