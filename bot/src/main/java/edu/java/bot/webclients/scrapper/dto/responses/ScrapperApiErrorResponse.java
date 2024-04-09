package edu.java.bot.webclients.scrapper.dto.responses;

import edu.java.bot.webclients.exceptions.ClientErrorResponseBody;
import java.util.List;

public record ScrapperApiErrorResponse(
    String description,
    String code,
    String exceptionName,
    String exceptionMessage,
    List<String> stacktrace
) implements ClientErrorResponseBody {

}
