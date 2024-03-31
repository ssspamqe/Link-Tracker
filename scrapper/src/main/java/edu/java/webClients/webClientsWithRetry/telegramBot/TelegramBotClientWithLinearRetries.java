package edu.java.webClients.webClientsWithRetry.telegramBot;

import edu.java.configuration.RetryConfig;
import edu.java.webClients.telegramBot.TelegramBotClient;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import java.util.List;
import reactor.core.publisher.Mono;

public class TelegramBotClientWithLinearRetries extends TelegramBotClientWithRetries {

    public TelegramBotClientWithLinearRetries(TelegramBotClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates) {
        return Mono.fromRunnable(
            () -> runWithLinearRetry(
                () -> baseClient.sendLinkUpdates(linkUpdates)
            )
        ).then();
    }

    private void runWithLinearRetry(Runnable action) {

        var currentDelay = delay;

        for (int i = 0; i < maxRetries; i++) {

            try {
                action.run();
                return;
            } catch (Exception e) {
                if (!mustBeRetried(e)) {
                    throw e;
                }
            }

            try {
                Thread.sleep(currentDelay.toMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            currentDelay = currentDelay.plus(delay);
        }

        action.run();

    }
}
