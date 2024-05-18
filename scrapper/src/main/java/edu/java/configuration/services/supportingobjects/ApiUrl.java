package edu.java.configuration.services.supportingobjects;

import jakarta.validation.constraints.NotBlank;
import java.net.URI;

public record ApiUrl(
    @NotBlank URI defaultUrl,
    URI configUrl
) {

    public URI getBaseUrl() {
        if (configUrl == null) {
            return defaultUrl;
        }
        return configUrl;
    }

}
