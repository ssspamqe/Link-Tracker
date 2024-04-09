package edu.java.webclients.webclientswithretry.telegramBot;

import edu.java.configuration.global.RetryConfig;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.telegrambot.TelegramBotClient;
import java.util.List;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class TelegramBotClientWithExponentialRetries extends TelegramBotClientWithRetries {

    public TelegramBotClientWithExponentialRetries(TelegramBotClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates) {
        return Mono.fromRunnable(() -> baseClient.sendLinkUpdates(linkUpdates))
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            ).then();
    }
}
