package edu.java.restapi.links.dto.responses;

import java.util.List;

public record ListLinksResponse(
    List<LinkResponse> links,
    int size
) {

}
