package edu.java.bot.configuration.scrapperconfiguration;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.net.URI;

public record ApiUrl(
    @NotNull
    URI defaultUrl,
    URI configUrl
) {
    public URI getBaseUrl() {
        if (configUrl != null) {
            return configUrl;
        }
        return defaultUrl;
    }
}
