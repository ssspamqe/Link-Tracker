package edu.java.linkupdatescheduler.linkupdatessender;

import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.telegrambot.TelegramBotClient;
import java.util.List;
import java.util.Set;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WebClientLinkUpdatesSender implements LinkUpdatesSender {

    private final TelegramBotClient client;

    @Override
    public void sendUpdate(LinkUpdate update) {
        client.sendLinkUpdates(List.of(update));
    }

    @Override
    public void sendUpdates(Set<LinkUpdate> updates) {
        client.sendLinkUpdates(updates.stream().toList());
    }
}
