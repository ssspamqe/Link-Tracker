package edu.java.bot.scrapperConnection.restApi.exceptionHandlers;

import edu.java.bot.scrapperConnection.restApi.dto.responses.ApiErrorResponse;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LogManager.getLogger();

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodArgumentNotValidException(
        MethodArgumentNotValidException exception
    ) {
        HttpStatusCode statusCode = exception.getStatusCode();
        String description = Arrays.toString(exception.getDetailMessageArguments());
        ApiErrorResponse errorResponse =
            buildDefaultErrorResponse(statusCode, description, exception);

        return ResponseEntity.status(statusCode).body(errorResponse);
    }

    @ExceptionHandler(HandlerMethodValidationException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodArgumentNotValidException(
        HandlerMethodValidationException exception
    ) {

        HttpStatusCode statusCode = exception.getStatusCode();
        String description = Arrays.toString(exception.getDetailMessageArguments());
        ApiErrorResponse errorResponse =
            buildDefaultErrorResponse(statusCode, description, exception);

        return ResponseEntity.status(statusCode).body(errorResponse);
    }

    private ApiErrorResponse buildDefaultErrorResponse(
        HttpStatusCode statusCode,
        String description,
        Exception exception
    ) {
        String exceptionName = exception.getClass().getSimpleName();
        String exceptionMessage = exception.getMessage();
        List<String> stacktrace = Arrays.stream(exception.getStackTrace()).map(StackTraceElement::toString).toList();

        return new ApiErrorResponse(
            description,
            statusCode.toString(),
            exceptionName,
            exceptionMessage,
            stacktrace
        );
    }

}

