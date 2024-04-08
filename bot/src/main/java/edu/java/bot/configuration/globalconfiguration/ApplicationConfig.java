package edu.java.bot.configuration.globalconfiguration;

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
    ApiUrl scrapperUrl,

    @NotNull
    RetryConfig scrapperRetryConfig

    ) {
    public record ApiUrl(@NotBlank String defaultUrl, String configUrl) {
        public String getBaseUrl() {
            if (configUrl != null) {
                return configUrl;
            }
            return defaultUrl;
        }
    }
}
