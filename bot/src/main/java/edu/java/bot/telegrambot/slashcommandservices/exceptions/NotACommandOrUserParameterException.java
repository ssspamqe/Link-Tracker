package edu.java.bot.telegrambot.slashcommandservices.exceptions;

public class NotACommandOrUserParameterException extends CommandServiceException {
    public NotACommandOrUserParameterException(String message) {
        super(message);
    }
}
