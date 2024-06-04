package edu.java.bot.scrapperconnection.services;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.scrapperconnection.dto.linkupdate.LinkUpdate;
import io.micrometer.core.instrument.Counter;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkUpdatePublisher {

    private final TelegramBot telegramBot;
    private final Counter processedLinkUpdatesMetric;

    public void publishUpdates(List<LinkUpdate> linkUpdates) {
        linkUpdates.forEach(this::publishUpdate);
    }

    public void publishUpdate(LinkUpdate linkUpdate) {
        String messageText = buildMessageText(linkUpdate);
        List<Long> chats = linkUpdate.tgChatIds();
        chats.forEach(chatId -> sendMessageToChatWithId(messageText, chatId));

        processedLinkUpdatesMetric.increment();
    }

    private void sendMessageToChatWithId(String message, long chatId) {
        SendMessage sendMessageRequest = new SendMessage(chatId, message);
        telegramBot.execute(sendMessageRequest);
    }

    private String buildMessageText(LinkUpdate linkUpdate) {
        var url = linkUpdate.url();
        String hostName = url.getHost();
        String updateMessage = linkUpdate.type().getMessage();

        return "Hello!\n"
            + STR."There is new update on \{hostName}: \{updateMessage}\n"
            + STR."(full url: \{linkUpdate.url()})";
    }

}
