package edu.java.bot.webClients.scrapperWithRetries.telegramChat;

import edu.java.bot.configuration.globalconfiguration.RetryConfig;
import edu.java.bot.webClients.scrapper.ScrapperTelegramChatClient;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class ScrapperTelegramChatClientWithExponentialRetries extends ScrapperTelegramChatClientWithRetries {

    public ScrapperTelegramChatClientWithExponentialRetries(
        ScrapperTelegramChatClient baseClient,
        RetryConfig retryConfig
    ) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<Void> registerNewChat(long id) {
        return performActionWithConstantRetry(() -> baseClient.registerNewChat(id));
    }

    @Override
    public Mono<Void> deleteChat(long id) {
        return performActionWithConstantRetry(() -> baseClient.deleteChat(id));
    }

    private Mono<Void> performActionWithConstantRetry(Runnable action) {
        return Mono.fromRunnable(action::run)
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            ).then();
    }
}
