package edu.java.bot.webclients.scrapper.dto.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record TrackableServiceInformation(
    String tip,
    List<String> examples,
    @JsonProperty("service_name")
    String serviceName,
    @JsonProperty("host_name")
    String hostName
) {
}
