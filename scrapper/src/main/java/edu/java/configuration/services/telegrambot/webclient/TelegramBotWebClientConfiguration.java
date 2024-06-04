package edu.java.configuration.services.telegrambot.webclient;

import edu.java.configuration.services.supportingobjects.ApiUrl;
import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Validated
@Data
public class TelegramBotWebClientConfiguration {

    @NotNull
    private ApiUrl url;

    @NotNull
    private RetryConfig retryConfig;

    public URI getBaseUrl() {
        return url.getBaseUrl();
    }
}
