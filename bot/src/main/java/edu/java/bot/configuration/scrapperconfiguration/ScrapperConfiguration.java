
package edu.java.bot.configuration.scrapperconfiguration;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import java.time.Duration;

@Validated
@ConfigurationProperties(prefix = "scrapper", ignoreUnknownFields = false)
public record ScrapperConfiguration(
    @NotNull
    ApiUrl url,

    RetryConfig retryConfig,

    @NotNull
    Duration requestTimeout
) {
}
