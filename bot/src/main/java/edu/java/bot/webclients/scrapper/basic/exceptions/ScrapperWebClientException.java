package edu.java.bot.webclients.scrapper.basic.exceptions;

import edu.java.bot.webclients.scrapper.basic.dto.responses.ScrapperApiErrorResponse;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@RequiredArgsConstructor
@Getter
public class ScrapperWebClientException extends RuntimeException {
    private final ScrapperApiErrorResponse errorResponseBody;
}


