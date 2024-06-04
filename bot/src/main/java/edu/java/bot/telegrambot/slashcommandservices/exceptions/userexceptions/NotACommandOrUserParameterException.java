package edu.java.bot.telegrambot.slashcommandservices.exceptions.userexceptions;

import edu.java.bot.telegrambot.slashcommandservices.exceptions.internalexceptions.CommandServiceException;

public class NotACommandOrUserParameterException extends CommandServiceException {
    public NotACommandOrUserParameterException(String message) {
        super(message);
    }
}
