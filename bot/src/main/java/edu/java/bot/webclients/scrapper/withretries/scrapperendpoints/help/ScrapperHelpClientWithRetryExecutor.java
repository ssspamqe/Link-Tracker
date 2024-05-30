package edu.java.bot.webclients.scrapper.withretries.scrapperendpoints.help;

import edu.java.bot.webclients.scrapper.basic.ScrapperHelpClient;
import edu.java.bot.webclients.scrapper.basic.dto.responses.TrackableServiceInformationBatch;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.ExecutorWithRetry;
import edu.java.bot.webclients.scrapper.withretries.executorsWithRetry.WebClientWithRetryExecutor;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ScrapperHelpClientWithRetryExecutor implements ScrapperHelpClient, WebClientWithRetryExecutor {

    private final ScrapperHelpClient baseClient;
    private final Duration requestTimeout;

    private ExecutorWithRetry executor;

    public ScrapperHelpClientWithRetryExecutor(
        ScrapperHelpClient baseClient,
        Duration requestTimeout,
        ExecutorWithRetry executor
    ) {
        this.baseClient = baseClient;
        this.requestTimeout = requestTimeout;
        this.executor = executor;
    }

    @Override
    public Mono<TrackableServiceInformationBatch> fetchTrackableServicesInformation() {
        return executor.retrieveWithRetry(() ->
            baseClient
                .fetchTrackableServicesInformation()
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
