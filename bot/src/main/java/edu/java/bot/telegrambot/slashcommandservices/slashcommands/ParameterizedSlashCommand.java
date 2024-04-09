package edu.java.bot.telegrambot.slashcommandservices.slashcommands;

import com.pengrad.telegrambot.model.Message;

public interface ParameterizedSlashCommand extends SlashCommand {
    String executeWithUserParametersAndGetResponse(Message message);
}
