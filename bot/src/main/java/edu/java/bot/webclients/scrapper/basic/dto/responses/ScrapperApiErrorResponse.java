package edu.java.bot.webclients.scrapper.basic.dto.responses;

import java.util.List;

public record ScrapperApiErrorResponse(
    String description,
    String code,
    String exceptionName,
    String exceptionMessage,
    List<String> stacktrace
) {

}
