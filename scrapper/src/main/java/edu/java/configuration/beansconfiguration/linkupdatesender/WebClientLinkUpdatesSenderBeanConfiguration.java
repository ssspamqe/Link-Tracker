package edu.java.configuration.beansconfiguration.linkupdatesender;

import edu.java.configuration.global.ApplicationConfig;
import edu.java.linkupdatescheduler.linkupdatessender.LinkUpdatesSender;
import edu.java.linkupdatescheduler.linkupdatessender.WebClientLinkUpdatesSender;
import edu.java.telegrambotconnection.telegrambot.TelegramBotClient;
import edu.java.telegrambotconnection.telegrambot.dto.responses.TelegramBotApiErrorResponse;
import edu.java.webclients.exceptions.ClientErrorException;
import edu.java.webclients.webclientswithretry.telegramBot.TelegramBotClientWithConstantRetries;
import edu.java.webclients.webclientswithretry.telegramBot.TelegramBotClientWithExponentialRetries;
import edu.java.webclients.webclientswithretry.telegramBot.TelegramBotClientWithLinearRetries;
import edu.java.webclients.webclientswithretry.telegramBot.TelegramBotClientWithRetries;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import reactor.core.publisher.Mono;

@Configuration
@ConditionalOnProperty(prefix = "app", name = "useQueue", havingValue = "false")
@RequiredArgsConstructor
public class WebClientLinkUpdatesSenderBeanConfiguration {

    private final ApplicationConfig applicationConfig;

    @Bean
    public LinkUpdatesSender linkUpdatesSender() {
        return new WebClientLinkUpdatesSender(telegramBotClient());
    }

    @Bean
    public TelegramBotClient telegramBotClient() {
        String baseUrl = applicationConfig.telegramBotConfig().getBaseUrl();
        WebClient webClient = WebClient.builder()
            .defaultStatusHandler(HttpStatusCode::is4xxClientError, response ->
                response.bodyToMono(TelegramBotApiErrorResponse.class)
                    .flatMap(errorBody -> Mono.error(new ClientErrorException(errorBody))))
            .baseUrl(baseUrl)
            .build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(TelegramBotClient.class);
    }

    @Bean
    public TelegramBotClientWithRetries telegramBotClientWithRetries() {
        var retryConfig = applicationConfig.stackOverflowConfig().retryConfig();
        var type = retryConfig.type();

        return switch (type) {
            case CONSTANT -> new TelegramBotClientWithConstantRetries(telegramBotClient(), retryConfig);
            case LINEAR -> new TelegramBotClientWithLinearRetries(telegramBotClient(), retryConfig);
            case EXPONENTIAL -> new TelegramBotClientWithExponentialRetries(telegramBotClient(), retryConfig);
        };
    }

}
