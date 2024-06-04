package edu.java.bot.webclients.scrapper.withretries.scrapperendpoints.telegramchat;

import edu.java.bot.webclients.scrapper.basic.ScrapperTelegramChatClient;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.ExecutorWithRetry;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.WebClientWithRetryExecutor;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ScrapperTelegramChatClientWithRetryExecutor
    implements ScrapperTelegramChatClient, WebClientWithRetryExecutor {

    private final ScrapperTelegramChatClient baseClient;
    private final Duration requestTimeout;

    private ExecutorWithRetry executorWithRetry;

    public ScrapperTelegramChatClientWithRetryExecutor(
        ScrapperTelegramChatClient baseClient,
        Duration requestTimeout,
        ExecutorWithRetry executorWithRetry

    ) {
        this.baseClient = baseClient;
        this.requestTimeout = requestTimeout;
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
