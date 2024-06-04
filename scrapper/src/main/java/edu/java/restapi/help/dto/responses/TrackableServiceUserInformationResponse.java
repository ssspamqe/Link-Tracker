package edu.java.restapi.help.dto.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import lombok.Data;

@Data
public class TrackableServiceUserInformationResponse {

    @JsonProperty("service_name")
    private String serviceName;

    @JsonProperty("host_name")
    private String hostName;

    private String tip;

    Set<String> examples;
}
