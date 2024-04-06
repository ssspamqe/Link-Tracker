package edu.java.externalApi.dto.responses;

import java.util.List;

public record ListLinksResponse(
    List<LinkResponse> links,
    int size
) {

}
