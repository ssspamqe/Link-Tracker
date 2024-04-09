package edu.java.bot.webclients.scrapperwithretries.telegramchat;

import edu.java.bot.configuration.globalconfiguration.RetryConfig;
import edu.java.bot.webclients.scrapper.ScrapperTelegramChatClient;
import edu.java.bot.webclients.scrapperwithretries.WebClientWithRetries;
import reactor.core.publisher.Mono;

public abstract class ScrapperTelegramChatClientWithRetries extends WebClientWithRetries<ScrapperTelegramChatClient> {
    public ScrapperTelegramChatClientWithRetries(ScrapperTelegramChatClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<Void> registerNewChat(long id);

    public abstract Mono<Void> deleteChat(long id);
}
