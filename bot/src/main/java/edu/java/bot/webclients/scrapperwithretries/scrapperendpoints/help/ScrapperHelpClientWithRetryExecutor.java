package edu.java.bot.webclients.scrapperwithretries.scrapperendpoints.help;

import edu.java.bot.configuration.scrapperconfiguration.ScrapperConfiguration;
import edu.java.bot.webclients.scrapper.ScrapperHelpClient;
import edu.java.bot.webclients.scrapper.dto.responses.TrackableServiceInformationBatch;
import edu.java.bot.webclients.scrapperwithretries.executorsWithRetry.ExecutorWithRetry;
import edu.java.bot.webclients.scrapperwithretries.executorsWithRetry.WebClientWithRetryExecutor;
import java.time.Duration;
import reactor.core.publisher.Mono;

public class ScrapperHelpClientWithRetryExecutor implements ScrapperHelpClient, WebClientWithRetryExecutor {

    private final ScrapperHelpClient baseClient;
    private final Duration requestTimeout;

    private ExecutorWithRetry executor;

    public ScrapperHelpClientWithRetryExecutor(
        ScrapperHelpClient baseClient,
        ScrapperConfiguration scrapperConfiguration,
        ExecutorWithRetry executor
    ) {
        this.baseClient = baseClient;
        this.requestTimeout = scrapperConfiguration.requestTimeout();
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
