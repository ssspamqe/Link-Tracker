package edu.java.configuration.services.telegrambot.rest;

import edu.java.configuration.services.supportingobjects.ApiUrl;
import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import java.net.URI;

@Validated
public record TelegramBotRestConfiguration(
    @NotNull
    ApiUrl url,

    @NotNull
    RetryConfig retryConfig
) {
    public URI getBaseUrl() {
        return url.getBaseUrl();
    }
}
