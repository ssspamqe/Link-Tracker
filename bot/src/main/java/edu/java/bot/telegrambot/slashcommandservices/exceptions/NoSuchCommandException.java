package edu.java.bot.telegrambot.slashcommandservices.exceptions;

public class NoSuchCommandException extends CommandServiceException {
    public NoSuchCommandException(String message) {
        super(message);
    }
}
