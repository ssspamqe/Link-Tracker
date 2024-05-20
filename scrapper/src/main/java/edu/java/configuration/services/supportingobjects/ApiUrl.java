package edu.java.configuration.services.supportingobjects;

import jakarta.validation.constraints.NotNull;
import java.net.URI;

public record ApiUrl(
    @NotNull
    URI defaultUrl,
    URI configUrl
) {

    public URI getBaseUrl() {
        if (configUrl == null) {
            return defaultUrl;
        }
        return configUrl;
    }

}
