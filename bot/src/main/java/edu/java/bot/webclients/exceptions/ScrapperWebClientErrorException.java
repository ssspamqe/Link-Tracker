package edu.java.bot.webclients.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class ScrapperWebClientErrorException extends RuntimeException {
    ClientErrorResponseBody errorResponseBody;
}
