package edu.java.bot.webclients.scrapper.basic.dto.responses;

import java.util.List;

public record ListLinksResponse(
    List<LinkResponse> links,
    int size
) {
}
