package edu.java.linkUpdateScheduler.linkUpdatesSender;

import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import edu.java.telegramBotConnection.telegramBot.TelegramBotClient;
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
