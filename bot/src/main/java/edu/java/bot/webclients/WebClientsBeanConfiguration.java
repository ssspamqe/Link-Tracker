package edu.java.bot.webclients;

import edu.java.bot.configuration.scrapperconfiguration.ScrapperConfiguration;
import edu.java.bot.webclients.scrapper.basic.ScrapperHelpClient;
import edu.java.bot.webclients.scrapper.basic.ScrapperLinksClient;
import edu.java.bot.webclients.scrapper.basic.ScrapperTelegramChatClient;
import edu.java.bot.webclients.scrapper.basic.dto.responses.ScrapperApiErrorResponse;
import edu.java.bot.webclients.scrapper.basic.exceptions.ScrapperWebClientException;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.ExecutorWithConstantRetry;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.ExecutorWithExponentialRetry;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.ExecutorWithLinearRetry;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.ExecutorWithRetry;
import edu.java.bot.webclients.scrapper.withretries.scrapperendpoints.help.ScrapperHelpClientWithRetryExecutor;
import edu.java.bot.webclients.scrapper.withretries.scrapperendpoints.links.ScrapperLinksClientWithRetryExecutor;
import edu.java.bot.webclients.scrapper.withretries.scrapperendpoints.telegramchat.ScrapperTelegramChatClientWithRetryExecutor;
import jakarta.annotation.PostConstruct;
import java.net.URI;
import java.time.Duration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import reactor.core.publisher.Mono;

@Configuration
public class WebClientsBeanConfiguration {

    private final ScrapperConfiguration scrapperConfiguration;
    private static HttpServiceProxyFactory scrapperWebClientsFactory;

    @Autowired
    public WebClientsBeanConfiguration(ScrapperConfiguration scrapperConfiguration) {
        this.scrapperConfiguration = scrapperConfiguration;
    }

    @PostConstruct
    private void init() {
        URI baseUrl = scrapperConfiguration.url().getBaseUrl();
        WebClient webClient = WebClient.builder()
            .defaultStatusHandler(HttpStatusCode::is4xxClientError, response ->
                response.bodyToMono(ScrapperApiErrorResponse.class)
                    .flatMap(errorBody -> Mono.error(new ScrapperWebClientException(errorBody)))
            )
            .baseUrl(baseUrl.toString())
            .build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        scrapperWebClientsFactory = HttpServiceProxyFactory.builderFor(adapter).build();
    }

    @Bean
    public ExecutorWithRetry scrapperExecutorWithRetry() {
        var retryConfig = scrapperConfiguration.retryConfig();

        int maxRetries = retryConfig.maxRetries();
        Duration delay = retryConfig.delay();
        var statusCodesToRetry = retryConfig.retryOnStatuses();

        return switch (retryConfig.type()) {
            case CONSTANT -> new ExecutorWithConstantRetry(maxRetries, delay, statusCodesToRetry);
            case EXPONENTIAL -> new ExecutorWithExponentialRetry(maxRetries, delay, statusCodesToRetry);
            case LINEAR -> new ExecutorWithLinearRetry(maxRetries, delay, statusCodesToRetry);
        };
    }

    @Bean
    public ScrapperTelegramChatClient scrapperTelegramChatClient() {
        return scrapperWebClientsFactory.createClient(ScrapperTelegramChatClient.class);
    }

    @Bean
    public ScrapperTelegramChatClientWithRetryExecutor scrapperTelegramChatClientWithRetries(
        @Qualifier("scrapperExecutorWithRetry")
        ExecutorWithRetry executorWithRetry,
        ScrapperTelegramChatClient baseClient
    ) {
        var requestTimeout = scrapperConfiguration.requestTimeout();
        return new ScrapperTelegramChatClientWithRetryExecutor(baseClient, requestTimeout, executorWithRetry);
    }

    @Bean
    public ScrapperLinksClient scrapperLinksClient() {
        return scrapperWebClientsFactory.createClient(ScrapperLinksClient.class);
    }

    @Bean
    public ScrapperLinksClientWithRetryExecutor scrapperLinksClientWithRetryExecutors(
        @Qualifier("scrapperExecutorWithRetry")
        ExecutorWithRetry executorWithRetry,
        ScrapperLinksClient baseClient
    ) {
        var requestTimeout = scrapperConfiguration.requestTimeout();
        return new ScrapperLinksClientWithRetryExecutor(baseClient, requestTimeout, executorWithRetry);
    }

    @Bean
    public ScrapperHelpClient scrapperHelpClient() {
        return scrapperWebClientsFactory.createClient(ScrapperHelpClientWithRetryExecutor.class);
    }

    @Bean
    public ScrapperHelpClientWithRetryExecutor scrapperHelpClientWithRetryExecutor(
        @Qualifier("scrapperExecutorWithRetry")
        ExecutorWithRetry executorWithRetry,
        ScrapperHelpClient baseClient
    ){
        var requestTimeout = scrapperConfiguration.requestTimeout();
        return new ScrapperHelpClientWithRetryExecutor(baseClient, requestTimeout, executorWithRetry);
    }
}
