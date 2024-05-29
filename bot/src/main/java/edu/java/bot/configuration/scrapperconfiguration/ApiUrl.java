package edu.java.bot.configuration.scrapperconfiguration;

import jakarta.validation.constraints.NotBlank;

public record ApiUrl(
    @NotBlank String defaultUrl,
    String configUrl
) {
    public String getBaseUrl() {
        if (configUrl != null) {
            return configUrl;
        }
        return defaultUrl;
    }
}
