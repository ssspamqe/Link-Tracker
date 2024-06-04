package edu.java.bot.telegrambot.slashcommandservices.exceptions.internalexceptions;

public class CommandServiceException extends RuntimeException {
    public CommandServiceException(String message) {
        super(message);
    }

}
