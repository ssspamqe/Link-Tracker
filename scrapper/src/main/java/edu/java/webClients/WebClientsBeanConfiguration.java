package edu.java.webClients;

import edu.java.configuration.ApplicationConfig;
import edu.java.webClients.exceptions.ClientErrorException;
import edu.java.webClients.gitHub.GitHubClient;
import edu.java.webClients.stackOverflow.StackOverflowClient;
import edu.java.webClients.telegramBot.TelegramBotClient;
import edu.java.webClients.telegramBot.dto.responses.TelegramBotApiErrorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import reactor.core.publisher.Mono;
import java.lang.reflect.Proxy;

@Configuration
@RequiredArgsConstructor
public class WebClientsBeanConfiguration {

    private final ApplicationConfig applicationConfig;

    @Bean
    public StackOverflowClient stackOverflowClient() throws NoSuchMethodException {
        String baseUrl = applicationConfig.stackOverflowConfig().getBaseUrl();
        //StackOverflowClient.class.getMethod("fetchQuestionByIdWithRetries", long.class);
        return createDefaultWebClient(baseUrl, StackOverflowClient.class);
    }

    @Bean
    public GitHubClient gitHubClient() {
        String baseUrl = applicationConfig.gitHubConfig().getBaseUrl();
        return createDefaultWebClient(baseUrl, GitHubClient.class);
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

    private <T> T createDefaultWebClient(String url, Class<T> webClientInterface) {
        WebClient webClient = WebClient.builder().baseUrl(url).build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(webClientInterface);
    }
}
