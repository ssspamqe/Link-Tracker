package edu.java.bot.telegrambot.slashcommandservices.exceptions;

public class BadLinkException extends CommandServiceException {
    public BadLinkException(String message) {
        super(message);
    }
}
