package edu.java.webClients.webClientsWithRetry.telegramBot;

import edu.java.configuration.RetryConfig;
import edu.java.webClients.telegramBot.TelegramBotClient;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;
import java.util.List;

public class TelegramBotClientWithConstantRetries  extends TelegramBotClientWithRetries{

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
