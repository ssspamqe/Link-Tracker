package edu.java.webclients.webclientswithretry.telegramBot;

import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.telegrambot.TelegramBotClient;
import edu.java.webclients.webclientswithretry.WebClientWithRetries;
import java.util.List;
import reactor.core.publisher.Mono;

public abstract class TelegramBotClientWithRetries extends WebClientWithRetries<TelegramBotClient> {

    protected TelegramBotClientWithRetries(TelegramBotClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates);

}
