package edu.java.bot.scrapperConnection.restApi.services;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.scrapperConnection.dto.linkUpdate.LinkUpdate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkUpdateService {

    private final TelegramBot telegramBot;



    public void sendUpdatesToBot(List<LinkUpdate> linkUpdates) {
        linkUpdates.forEach(this::sendUpdateToBot);
    }

    public void sendUpdateToBot(LinkUpdate linkUpdate) {
        String messageText = buildMessageText(linkUpdate);
        List<Long> chats = linkUpdate.tgChatIds();
        chats.forEach(chatId -> sendMessageToChatId(messageText, chatId));
    }

    private void sendMessageToChatId(String message, long chatId) {
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
