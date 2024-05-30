package edu.java.bot.telegrambot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.SetMyCommands;
import edu.java.bot.telegrambot.slashcommandservices.CommandService;
import edu.java.bot.webclients.scrapper.basic.exceptions.ScrapperWebClientErrorException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TelegramBotInitializer {
    private final static Logger LOGGER = LogManager.getLogger();
    private final static int THREADS_AMOUNT = 5;

    private ExecutorService threadPool;

    private final TelegramBot bot;
    private final CommandService commandService;

    @EventListener
    public void onSpringRefreshedEvent(ContextRefreshedEvent event) {
        threadPool = Executors.newFixedThreadPool(THREADS_AMOUNT);
        bot.execute(new SetMyCommands(commandService.getAllBotCommands()));
        bot.setUpdatesListener(this::handleBotUpdates);
    }

    private int handleBotUpdates(List<Update> updates) {
        updates.forEach(update ->
            threadPool.submit(() -> {
                SendMessage response = getResponse(update.message());
                bot.execute(response);
            })
        );
        return UpdatesListener.CONFIRMED_UPDATES_ALL;
    }

    private SendMessage getResponse(Message message) {
        try {
            return commandService.handleMessage(message);
        } catch (ScrapperWebClientErrorException ex) {
            LOGGER.warn(ex);

            Long chatId = message.chat().id();
            String messageText = ex.getErrorResponseBody().exceptionMessage();
            return new SendMessage(chatId, messageText);
        } catch (Exception ex) {
            LOGGER.warn(ex);

            Long chatId = message.chat().id();
            return new SendMessage(chatId, "Some error occurred");
        }
    }

}
