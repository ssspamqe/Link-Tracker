package edu.java.bot.configuration.scrapperconfiguration;

import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.util.Set;

public record RetryConfig(
    @NotNull WebClientRetryType type,
    @NotNull Duration delay,
    @NotNull int maxRetries,
    Set<RetryPolicyHttpStatusCodeGroups> retryOnStatuses) {
}
