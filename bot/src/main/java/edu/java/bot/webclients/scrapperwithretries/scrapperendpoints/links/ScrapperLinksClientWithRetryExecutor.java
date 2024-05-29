package edu.java.bot.webclients.scrapperwithretries.scrapperendpoints.links;

import edu.java.bot.configuration.scrapperconfiguration.ScrapperConfiguration;
import edu.java.bot.webclients.scrapper.ScrapperLinksClient;
import edu.java.bot.webclients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webclients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webclients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webclients.scrapper.dto.responses.ListLinksResponse;
import edu.java.bot.webclients.scrapperwithretries.executorsWithRetry.WebClientWithRetryExecutor;
import edu.java.bot.webclients.scrapperwithretries.executorsWithRetry.ExecutorWithRetry;
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
        ExecutorWithRetry executor,
        ScrapperConfiguration scrapperConfiguration
    ) {
        this.baseClient = baseClient;
        this.executor = executor;
        this.requestTimeout = scrapperConfiguration.requestTimeout();
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
