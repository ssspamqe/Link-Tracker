package edu.java.bot.configuration.globalconfiguration;

import edu.java.bot.configuration.scrapperconfiguration.RetryConfig;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
public record ApplicationConfig(
    @NotNull
    String telegramToken,

    @NotNull
    String processedLinkUpdatesMetricName
) {

}
