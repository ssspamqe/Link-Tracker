package edu.java.webClients.stackOverflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

public record StackOverflowQuestionBody(
    long id,

    List<String> tags,

    StackOverflowOwnerBody owner,

    String title,

    @JsonProperty("is_answered")
    boolean isAnswered,

    @JsonProperty("answer_count")
    int answerCount,

    String body,

    @JsonProperty("creation_date")
    OffsetDateTime creationDate,

    @JsonProperty("closed_date")
    OffsetDateTime closedDate,

    @JsonProperty("closed_reason")
    String closedReason
) {
}
