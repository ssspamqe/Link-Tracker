package edu.java.bot.webclients.scrapper.withretries.scrapperendpoints.links;

import edu.java.bot.webclients.scrapper.basic.ScrapperLinksClient;
import edu.java.bot.webclients.scrapper.basic.dto.requests.AddLinkRequest;
import edu.java.bot.webclients.scrapper.basic.dto.requests.RemoveLinkRequest;
import edu.java.bot.webclients.scrapper.basic.dto.responses.LinkResponse;
import edu.java.bot.webclients.scrapper.basic.dto.responses.ListLinksResponse;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.ExecutorWithRetry;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.WebClientWithRetryExecutor;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ScrapperLinksClientWithRetryExecutor implements ScrapperLinksClient, WebClientWithRetryExecutor {

    private final ScrapperLinksClient baseClient;
    private final Duration requestTimeout;

    private ExecutorWithRetry executor;

    public ScrapperLinksClientWithRetryExecutor(
        ScrapperLinksClient baseClient,
        Duration requestTimeout,
        ExecutorWithRetry executor
    ) {
        this.baseClient = baseClient;
        this.requestTimeout = requestTimeout;
        this.executor = executor;
    }

    @Override
    public Mono<ListLinksResponse> fetchTrackedLinksByChatId(long chatId) {
        return executor.retrieveWithRetry(
            () -> baseClient
                .fetchTrackedLinksByChatId(chatId)
                .block(requestTimeout)
        );
    }

    @Override
    public Mono<LinkResponse> trackLinkByChatId(AddLinkRequest addLinkRequest, long chatId) {
        return executor.retrieveWithRetry(
            () -> baseClient
                .trackLinkByChatId(addLinkRequest, chatId)
                .block(requestTimeout)
        );
    }

    @Override
    public Mono<LinkResponse> untrackLinkByChatId(RemoveLinkRequest removeLinkRequest, long chatId) {
        return executor.retrieveWithRetry(
            () -> baseClient
                .untrackLinkByChatId(removeLinkRequest, chatId)
                .block(requestTimeout)
        );
    }

    @Override
    public ExecutorWithRetry getExecutorWithRetry() {
        return executor;
    }

    @Override
    public void setExecutorWithRetry(ExecutorWithRetry executorWithRetry) {
        this.executor = executorWithRetry;
    }
}
