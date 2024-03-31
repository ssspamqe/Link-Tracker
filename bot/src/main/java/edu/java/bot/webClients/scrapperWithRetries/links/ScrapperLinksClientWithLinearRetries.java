package edu.java.bot.webClients.scrapperWithRetries.links;

import edu.java.bot.configuration.RetryConfig;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webClients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webClients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webClients.scrapper.dto.responses.ListLinksResponse;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;

public class ScrapperLinksClientWithLinearRetries extends ScrapperLinksClientWithRetries {

    public ScrapperLinksClientWithLinearRetries(ScrapperLinksClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<ListLinksResponse> fetchTrackedLinksByChatId(long chatId) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.fetchTrackedLinksByChatId(chatId)
            )
        );
    }

    @Override
    public Mono<LinkResponse> trackLinkByChatId(AddLinkRequest addLinkRequest, long chatId) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.trackLinkByChatId(addLinkRequest, chatId)
            )
        );
    }

    @Override
    public Mono<LinkResponse> untrackLinkByChatId(RemoveLinkRequest removeLinkRequest, long chatId) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.untrackLinkByChatId(removeLinkRequest, chatId)
            )
        );
    }

    private <T> T getWithLinearRetry(Supplier<T> action) {

        var currentDelay = delay;

        for (int i = 0; i < maxRetries; i++) {
            try {
                return action.get();
            } catch (Exception e) {
                if (!mustBeRetried(e)) {
                    throw e;
                }
            }

            try {
                Thread.sleep(currentDelay.toMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            currentDelay = currentDelay.plus(delay);
        }

        return action.get();

    }
}
