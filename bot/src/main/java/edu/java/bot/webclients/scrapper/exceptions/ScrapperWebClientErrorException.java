package edu.java.bot.webclients.scrapper.exceptions;

import edu.java.bot.webclients.scrapper.dto.responses.ScrapperApiErrorResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class ScrapperWebClientErrorException extends RuntimeException {
    ScrapperApiErrorResponse errorResponseBody;
}
