package edu.java.restApi.dto.requests;

import jakarta.validation.constraints.Pattern;

public record RemoveLinkRequest(
    @Pattern(regexp =
        "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)"
    )
    String url
) {
}