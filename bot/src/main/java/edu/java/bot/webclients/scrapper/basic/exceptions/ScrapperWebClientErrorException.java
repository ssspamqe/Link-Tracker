package edu.java.bot.webclients.scrapper.basic.exceptions;

import edu.java.bot.webclients.scrapper.basic.dto.responses.ScrapperApiErrorResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class ScrapperWebClientErrorException extends RuntimeException {
    ScrapperApiErrorResponse errorResponseBody;
}
