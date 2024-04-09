package edu.java.bot.webclients.scrapperwithretries.links;

import edu.java.bot.configuration.globalconfiguration.RetryConfig;
import edu.java.bot.webclients.scrapper.ScrapperLinksClient;
import edu.java.bot.webclients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webclients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webclients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webclients.scrapper.dto.responses.ListLinksResponse;
import edu.java.bot.webclients.scrapperwithretries.WebClientWithRetries;
import reactor.core.publisher.Mono;

public abstract class ScrapperLinksClientWithRetries extends WebClientWithRetries<ScrapperLinksClient> {

    public ScrapperLinksClientWithRetries(ScrapperLinksClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<ListLinksResponse> fetchTrackedLinksByChatId(long chatId);

    public abstract Mono<LinkResponse> trackLinkByChatId(AddLinkRequest addLinkRequest, long chatId);

    public abstract Mono<LinkResponse> untrackLinkByChatId(RemoveLinkRequest removeLinkRequest, long chatId);

}
