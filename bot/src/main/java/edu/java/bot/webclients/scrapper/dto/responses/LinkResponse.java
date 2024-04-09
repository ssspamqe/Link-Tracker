package edu.java.bot.webclients.scrapper.dto.responses;

import java.net.URI;

public record LinkResponse(
    int id,
    URI url
) {
}
