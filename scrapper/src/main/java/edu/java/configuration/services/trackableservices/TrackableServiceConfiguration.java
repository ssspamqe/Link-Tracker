package edu.java.configuration.services.trackableservices;

import edu.java.configuration.services.supportingobjects.ApiUrl;
import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.net.URI;

public record TrackableServiceConfiguration(
    @NotNull
    ApiUrl url,

    @NotBlank
    String hostName,

    @NotNull RetryConfig retryConfig
) {
    public URI getBaseUrl() {
        return url.getBaseUrl();
    }

    public boolean isCorrectHostName(String hostNameToCheck) {
        return hostName.equals(hostNameToCheck);
    }
}
