package edu.java.bot.webclients.scrapper.dto.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;

public record TrackableServiceInformationBatch(
    @JsonProperty("trackable_services_information")
    Set<TrackableServiceInformation> batch,
    int size
) {
}
