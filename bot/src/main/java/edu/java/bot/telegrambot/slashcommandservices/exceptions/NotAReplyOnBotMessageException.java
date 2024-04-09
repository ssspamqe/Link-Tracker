package edu.java.bot.telegrambot.slashcommandservices.exceptions;

public class NotAReplyOnBotMessageException extends CommandServiceException {
    public NotAReplyOnBotMessageException(String message) {
        super(message);
    }
}
