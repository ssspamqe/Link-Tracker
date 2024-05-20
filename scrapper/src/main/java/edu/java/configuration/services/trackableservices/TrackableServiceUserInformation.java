package edu.java.configuration.services.trackableservices;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import org.springframework.validation.annotation.Validated;

@Validated
public record TrackableServiceUserInformation(
    @NotNull
    String serviceName,

    @NotNull
    String hostName,

    @NotNull
    String tip,

    @NotNull
    List<String> examples
) {
}
