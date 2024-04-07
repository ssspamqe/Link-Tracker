package edu.java.bot.webClients.scrapperWithRetries.links;

import edu.java.bot.configuration.globalConfiguration.RetryConfig;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webClients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webClients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webClients.scrapper.dto.responses.ListLinksResponse;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class ScrapperLinksClientWithExponentialRetries extends ScrapperLinksClientWithRetries {
    public ScrapperLinksClientWithExponentialRetries(ScrapperLinksClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<ListLinksResponse> fetchTrackedLinksByChatId(long chatId) {
        return performActionWithConstantRetry(() -> baseClient.fetchTrackedLinksByChatId(chatId));
    }

    @Override
    public Mono<LinkResponse> trackLinkByChatId(AddLinkRequest addLinkRequest, long chatId) {
        return performActionWithConstantRetry(() -> baseClient.trackLinkByChatId(addLinkRequest, chatId));
    }

    @Override
    public Mono<LinkResponse> untrackLinkByChatId(RemoveLinkRequest removeLinkRequest, long chatId) {
        return performActionWithConstantRetry(() -> baseClient.untrackLinkByChatId(removeLinkRequest, chatId));
    }

    private <T> Mono<T> performActionWithConstantRetry(Supplier<T> action) {
        return Mono.fromCallable(action::get)
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }
}
