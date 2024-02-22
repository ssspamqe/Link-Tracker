package edu.java.webClients.gitHub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public record GitHubRepositoryActivity(
    long id,

    GitHubOwner actor,

    @JsonProperty("ref")
    String reference,

    OffsetDateTime timestamp,

    @JsonProperty("activity_type")
    GitHubRepositoryActivityType type
) {
}
