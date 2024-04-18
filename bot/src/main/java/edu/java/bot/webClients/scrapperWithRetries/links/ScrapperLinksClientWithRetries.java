package edu.java.bot.webClients.scrapperWithRetries.links;

import edu.java.bot.configuration.globalconfiguration.RetryConfig;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webClients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webClients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webClients.scrapper.dto.responses.ListLinksResponse;
import edu.java.bot.webClients.scrapperWithRetries.WebClientWithRetries;
import reactor.core.publisher.Mono;

public abstract class ScrapperLinksClientWithRetries extends WebClientWithRetries<ScrapperLinksClient> {

    public ScrapperLinksClientWithRetries(ScrapperLinksClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<ListLinksResponse> fetchTrackedLinksByChatId(long chatId);

    public abstract Mono<LinkResponse> trackLinkByChatId(AddLinkRequest addLinkRequest, long chatId);

    public abstract Mono<LinkResponse> untrackLinkByChatId(RemoveLinkRequest removeLinkRequest, long chatId);

}
