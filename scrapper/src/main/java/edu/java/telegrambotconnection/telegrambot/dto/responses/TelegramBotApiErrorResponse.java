package edu.java.telegrambotconnection.telegrambot.dto.responses;

import edu.java.webclients.exceptions.ClientErrorResponseBody;
import java.util.List;

public record TelegramBotApiErrorResponse(
    String description,
    String code,
    String exceptionName,
    String exceptionMessage,
    List<String> stacktrace
) implements ClientErrorResponseBody {
}
