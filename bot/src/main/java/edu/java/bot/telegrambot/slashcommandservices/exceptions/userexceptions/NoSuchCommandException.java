package edu.java.bot.telegrambot.slashcommandservices.exceptions.userexceptions;

import edu.java.bot.telegrambot.slashcommandservices.exceptions.internalexceptions.CommandServiceException;

public class NoSuchCommandException extends CommandServiceException {
    public NoSuchCommandException(String message) {
        super(message);
    }
}
