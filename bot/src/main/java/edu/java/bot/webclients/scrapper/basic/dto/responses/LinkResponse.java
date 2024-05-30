package edu.java.bot.webclients.scrapper.basic.dto.responses;

import java.net.URI;

public record LinkResponse(
    int id,
    URI url
) {
}
