package edu.java.webClients.webClientsWithRetry.telegramBot;

import edu.java.configuration.global.RetryConfig;
import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import edu.java.telegramBotConnection.telegramBot.TelegramBotClient;
import java.util.List;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class TelegramBotClientWithConstantRetries extends TelegramBotClientWithRetries {

    public TelegramBotClientWithConstantRetries(TelegramBotClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates) {
        return Mono.fromRunnable(() -> baseClient.sendLinkUpdates(linkUpdates))
            .retryWhen(
                Retry.fixedDelay(maxRetries, delay)
                    .filter(this::mustBeRetried)
            ).then();
    }
}
