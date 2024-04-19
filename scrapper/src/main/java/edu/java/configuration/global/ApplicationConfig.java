package edu.java.configuration.global;

import edu.java.configuration.exceptions.EmptyTelegramBotClientPropertiesException;
import jakarta.annotation.PostConstruct;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.validation.annotation.Validated;

@ComponentScan(basePackages = "edu.java",
               excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "edu.java.domain.jooq.*"))
@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
@EnableScheduling
public record ApplicationConfig(

    @NotNull
    SchedulerConfig schedulerConfig,

    @NotNull
    ThirdPartyServiceConfig stackOverflowConfig,

    @NotNull
    ThirdPartyServiceConfig gitHubConfig,

    @NotNull
    DatabaseAccessType databaseAccessType,

    @NotNull
    Boolean useQueue,

    TelegramBotConfig telegramBotConfig,

    @NotNull
    String processedUpdatesMetricName
) {

    @PostConstruct
    private void init() {
        if (!useQueue && telegramBotConfig == null) {
            throw new EmptyTelegramBotClientPropertiesException(
                "Telegram bot web client must be set up, when queue turned off");
        }
    }

    public record SchedulerConfig(boolean enable, @NotNull Duration interval, @NotNull Duration forceCheckDelay) {
    }

    public record ThirdPartyServiceConfig(@NotNull ApiUrl url, @NotNull Set<String> hostNames,
                                          @NotNull RetryConfig retryConfig) {
        public String getBaseUrl() {
            return url.getBaseUrl();
        }

        public boolean isCorrectHostName(String hostName) {
            return hostNames.contains(hostName);
        }
    }

    public record TelegramBotConfig(@NotNull ApiUrl url, @NotNull RetryConfig retryConfig) {
        public String getBaseUrl() {
            return url.getBaseUrl();
        }
    }

    public record ApiUrl(@NotBlank String defaultUrl, String configUrl) {
        public String getBaseUrl() {
            if (configUrl == null) {
                return defaultUrl;
            }
            return configUrl;
        }
    }

    public enum DatabaseAccessType {
        JDBC, JPA, JOOQ
    }
}
