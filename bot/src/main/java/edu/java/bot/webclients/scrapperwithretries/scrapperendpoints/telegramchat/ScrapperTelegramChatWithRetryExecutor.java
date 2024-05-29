package edu.java.bot.webclients.scrapperwithretries.scrapperendpoints.telegramchat;

import edu.java.bot.configuration.scrapperconfiguration.ScrapperConfiguration;
import edu.java.bot.webclients.scrapper.ScrapperTelegramChatClient;
import edu.java.bot.webclients.scrapperwithretries.executorsWithRetry.WebClientWithRetryExecutor;
import edu.java.bot.webclients.scrapperwithretries.executorsWithRetry.ExecutorWithRetry;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ScrapperTelegramChatWithRetryExecutor implements ScrapperTelegramChatClient, WebClientWithRetryExecutor {

    private final ScrapperTelegramChatClient baseClient;
    private final Duration requestTimeout;

    private ExecutorWithRetry executorWithRetry;

    public ScrapperTelegramChatWithRetryExecutor(
        ScrapperTelegramChatClient baseClient,
        ScrapperConfiguration scrapperConfiguration,
        ExecutorWithRetry executorWithRetry

    ) {
        this.baseClient = baseClient;
        this.requestTimeout = scrapperConfiguration.requestTimeout();
        this.executorWithRetry = executorWithRetry;
    }

    @Override
    public Mono<Void> registerNewChat(long id) {
        return executorWithRetry.performWithRetry(() ->
            baseClient
                .registerNewChat(id)
                .block(requestTimeout));
    }

    @Override
    public Mono<Void> deleteChat(long id) {
        return executorWithRetry.performWithRetry(() ->
            baseClient
                .deleteChat(id)
                .block(requestTimeout)
        );
    }

    @Override
    public ExecutorWithRetry getExecutorWithRetry() {
        return executorWithRetry;
    }

    @Override
    public void setExecutorWithRetry(ExecutorWithRetry executorWithRetry) {
        this.executorWithRetry = executorWithRetry;
    }
}
