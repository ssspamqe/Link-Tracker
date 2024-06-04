package edu.java.webclients.webclientswithretry.telegramBot;

import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.telegrambot.TelegramBotClient;
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
