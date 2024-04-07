package edu.java.webClients.webClientsWithRetry.telegramBot;

import edu.java.configuration.global.RetryConfig;
import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import edu.java.telegramBotConnection.telegramBot.TelegramBotClient;
import edu.java.webClients.webClientsWithRetry.WebClientWithRetries;
import java.util.List;
import reactor.core.publisher.Mono;

public abstract class TelegramBotClientWithRetries extends WebClientWithRetries<TelegramBotClient> {

    protected TelegramBotClientWithRetries(TelegramBotClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates);

}
