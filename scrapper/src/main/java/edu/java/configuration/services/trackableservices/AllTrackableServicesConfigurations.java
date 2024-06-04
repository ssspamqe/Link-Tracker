package edu.java.configuration.services.trackableservices;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "trackable-services", ignoreUnknownFields = false)
public record AllTrackableServicesConfigurations(

    @Bean
    @NotNull
    TrackableServiceConfiguration gitHubConfig,

    @Bean
    @NotNull
    TrackableServiceConfiguration stackOverflowConfig
) {
}
