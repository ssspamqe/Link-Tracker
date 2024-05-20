package edu.java.webclients;

import edu.java.configuration.services.trackableservices.TrackableServiceConfiguration;
import edu.java.webclients.gitHub.GitHubClient;
import edu.java.webclients.stackoverflow.StackOverflowClient;
import edu.java.webclients.webclientswithretry.gitHub.GitHubClientWithConstantRetries;
import edu.java.webclients.webclientswithretry.gitHub.GitHubClientWithExponentialRetries;
import edu.java.webclients.webclientswithretry.gitHub.GitHubClientWithLinearRetries;
import edu.java.webclients.webclientswithretry.gitHub.GitHubClientWithRetries;
import edu.java.webclients.webclientswithretry.stackoverflow.StackOverflowClientWithConstantRetries;
import edu.java.webclients.webclientswithretry.stackoverflow.StackOverflowClientWithExponentialRetries;
import edu.java.webclients.webclientswithretry.stackoverflow.StackOverflowClientWithLinearRetries;
import edu.java.webclients.webclientswithretry.stackoverflow.StackOverflowClientWithRetries;
import java.net.URI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientsBeanConfiguration {

    private final TrackableServiceConfiguration gitHubConfiguration;
    private final TrackableServiceConfiguration stackOverflowConfiguration;

    public WebClientsBeanConfiguration(
        @Qualifier("gitHubConfig")
        TrackableServiceConfiguration gitHubConfiguration,
        @Qualifier("stackOverflowConfig")
        TrackableServiceConfiguration stackOverflowConfiguration
    ) {
        this.gitHubConfiguration = gitHubConfiguration;
        this.stackOverflowConfiguration = stackOverflowConfiguration;
    }

    @Bean
    public StackOverflowClient stackOverflowClient() {
        URI baseUrl = stackOverflowConfiguration.getBaseUrl();
        return createDefaultWebClient(baseUrl, StackOverflowClient.class);
    }

    @Bean
    public StackOverflowClientWithRetries stackOverflowClientWithRetries() {
        var retryConfig = stackOverflowConfiguration.retryConfig();
        var type = retryConfig.type();

        return switch (type) {
            case CONSTANT -> new StackOverflowClientWithConstantRetries(stackOverflowClient(), retryConfig);
            case LINEAR -> new StackOverflowClientWithLinearRetries(stackOverflowClient(), retryConfig);
            case EXPONENTIAL -> new StackOverflowClientWithExponentialRetries(stackOverflowClient(), retryConfig);
        };
    }

    @Bean
    public GitHubClient gitHubClient() {
        URI baseUrl = gitHubConfiguration.getBaseUrl();
        return createDefaultWebClient(baseUrl, GitHubClient.class);
    }

    @Bean
    public GitHubClientWithRetries gitHubClientWithRetries() {
        var retryConfig = stackOverflowConfiguration.retryConfig();
        var type = retryConfig.type();

        return switch (type) {
            case CONSTANT -> new GitHubClientWithConstantRetries(gitHubClient(), retryConfig);
            case LINEAR -> new GitHubClientWithLinearRetries(gitHubClient(), retryConfig);
            case EXPONENTIAL -> new GitHubClientWithExponentialRetries(gitHubClient(), retryConfig);
        };
    }

    private <T> T createDefaultWebClient(URI url, Class<T> webClientInterface) {
        WebClient webClient = WebClient.builder()
            .baseUrl(url.toString())
            .build();

        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(webClientInterface);
    }
}
