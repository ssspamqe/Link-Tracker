package edu.java.bot.telegrambot.slashcommandservices.exceptions.userexceptions;

import edu.java.bot.telegrambot.slashcommandservices.exceptions.internalexceptions.CommandServiceException;

public class StrangeSlashCommandException extends CommandServiceException {
    public StrangeSlashCommandException(String message) {
        super(message);
    }
}
