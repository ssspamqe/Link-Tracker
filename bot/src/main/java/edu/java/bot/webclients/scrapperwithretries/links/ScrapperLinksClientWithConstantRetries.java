package edu.java.bot.webclients.scrapperwithretries.links;

import edu.java.bot.configuration.globalconfiguration.RetryConfig;
import edu.java.bot.webclients.scrapper.ScrapperLinksClient;
import edu.java.bot.webclients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webclients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webclients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webclients.scrapper.dto.responses.ListLinksResponse;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class ScrapperLinksClientWithConstantRetries extends ScrapperLinksClientWithRetries {
    public ScrapperLinksClientWithConstantRetries(ScrapperLinksClient baseClient, RetryConfig retryConfig) {
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
                Retry.fixedDelay(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }
}
