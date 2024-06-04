package edu.java.bot.telegrambot.slashcommandservices.exceptions.userexceptions;

import edu.java.bot.telegrambot.slashcommandservices.exceptions.internalexceptions.CommandServiceException;

public class NotAReplyOnBotMessageException extends CommandServiceException {
    public NotAReplyOnBotMessageException(String message) {
        super(message);
    }
}
