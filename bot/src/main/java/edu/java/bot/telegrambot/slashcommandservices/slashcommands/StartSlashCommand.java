package edu.java.bot.telegrambot.slashcommandservices.slashcommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.webclients.scrapper.basic.ScrapperTelegramChatClient;
import java.time.Duration;

public class StartSlashCommand implements SlashCommand {

    private static final String TEXT_COMMAND = "/start";
    private static final String DESCRIPTION = "Register in app";
    private static final String DEFAULT_RESPONSE = "Registered";

    private final ScrapperTelegramChatClient scrapperTelegramChatClient;
    private final Duration scrapperRequestTimeout;

    public StartSlashCommand(ScrapperTelegramChatClient scrapperTelegramChatClient, Duration scrapperRequestTimeout) {
        this.scrapperTelegramChatClient = scrapperTelegramChatClient;
        this.scrapperRequestTimeout = scrapperRequestTimeout;
    }

    @Override
    public String executeAndGetResponse(Message message) {
        long chatId = message.chat().id();

        scrapperTelegramChatClient
            .registerNewChat(chatId)
            .block(scrapperRequestTimeout);

        String username = message.from().username();
        return STR."Hello, \{username}!\n" + DEFAULT_RESPONSE;
    }

    @Override
    public String getTextCommand() {
        return TEXT_COMMAND;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }
}


