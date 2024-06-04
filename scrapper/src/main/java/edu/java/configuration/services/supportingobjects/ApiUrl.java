package edu.java.configuration.services.supportingobjects;

import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import java.net.URI;

@Validated
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
