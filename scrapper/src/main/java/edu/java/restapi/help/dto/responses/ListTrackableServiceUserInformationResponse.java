package edu.java.restapi.help.dto.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record ListTrackableServiceUserInformationResponse(
    @JsonProperty("trackable_services_information")
    List<TrackableServiceUserInformationResponse> trackableServicesInformation,

    int size
) {
}
