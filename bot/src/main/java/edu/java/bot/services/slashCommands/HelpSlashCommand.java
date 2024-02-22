package edu.java.bot.services.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import org.springframework.stereotype.Component;

@Component
public class HelpSlashCommand implements SimplyExecutableSlashCommand {

    private static final String TEXT_COMMAND = "/help";
    private static final String DESCRIPTION = "Get list of commands";
    private static final String RESPONSE = """
        This bot allows to subscribe on updates from various services!

        Here are commands:
        **Subscription control**
        /track - Start tracking updates from given link
        /untrack - Stop tracking updates from given link
        /list - Get list of subscriptions

        **Other commands**
        /start - Register in app
        /help - Get list of commands""";

    private static final boolean NEED_ADDITIONAL_USER_PARAMETERS = false;

    @Override
    public String getTextCommand() {
        return TEXT_COMMAND;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public String executeAndGetResponse() {
        return RESPONSE;
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }

    @Override
    public boolean needAdditionalUserParameter() {
        return NEED_ADDITIONAL_USER_PARAMETERS;
    }
}
