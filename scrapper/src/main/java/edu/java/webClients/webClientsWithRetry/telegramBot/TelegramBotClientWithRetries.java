package edu.java.webClients.webClientsWithRetry.telegramBot;

import edu.java.configuration.RetryConfig;
import edu.java.configuration.RetryPolicyHttpStatusCodeGroups;
import edu.java.webClients.telegramBot.TelegramBotClient;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import edu.java.webClients.webClientsWithRetry.WebClientWithReties;
import jakarta.annotation.PostConstruct;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public abstract class TelegramBotClientWithRetries extends WebClientWithReties {

    protected final TelegramBotClient baseClient;
    protected final RetryConfig retryConfig;

    protected int maxRetries;
    protected Duration delay;
    protected Set<RetryPolicyHttpStatusCodeGroups> retryOnHttpStatuses;

    @PostConstruct
    protected void init() {
        maxRetries = retryConfig.maxRetries();
        delay = retryConfig.delay();
        retryOnHttpStatuses = retryConfig.retryOnStatuses();
    }

    public abstract Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates);

    protected boolean mustBeRetried(Throwable throwable) {
        return mustBeRetried(throwable, retryOnHttpStatuses);
    }
}
