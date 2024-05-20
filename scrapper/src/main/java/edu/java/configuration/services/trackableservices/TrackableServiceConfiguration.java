package edu.java.configuration.services.trackableservices;

import edu.java.configuration.services.supportingobjects.ApiUrl;
import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Value;
import org.springframework.validation.annotation.Validated;
import java.net.URI;

@Validated
@Data
public class TrackableServiceConfiguration{

    @NotNull
    private ApiUrl url;

    @NotBlank
    private String hostName;

    @NotNull
    private RetryConfig retryConfig;

    private TrackableServiceUserInformation userInformation;

    public URI getBaseUrl() {
        return url.getBaseUrl();
    }

    public boolean isCorrectHostName(String hostNameToCheck) {
        return hostName.equals(hostNameToCheck);
    }

}
