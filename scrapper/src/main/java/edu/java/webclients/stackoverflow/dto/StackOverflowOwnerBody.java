package edu.java.webclients.stackoverflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StackOverflowOwnerBody(
    @JsonProperty("display_name")
    String displayName
) {
}
