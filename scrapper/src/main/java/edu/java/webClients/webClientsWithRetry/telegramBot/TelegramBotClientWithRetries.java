package edu.java.webClients.webClientsWithRetry.telegramBot;

import edu.java.configuration.RetryConfig;
import edu.java.webClients.telegramBot.TelegramBotClient;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import edu.java.webClients.webClientsWithRetry.WebClientWithRetries;
import java.util.List;
import reactor.core.publisher.Mono;

public abstract class TelegramBotClientWithRetries extends WebClientWithRetries<TelegramBotClient> {

    protected TelegramBotClientWithRetries(TelegramBotClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates);

}
