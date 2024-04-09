package edu.java.webclients.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class ClientErrorException extends RuntimeException {
    private final ClientErrorResponseBody errorResponseBody;
}
