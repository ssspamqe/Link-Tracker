package edu.java.linkUpdateScheduler.linkUpdatesSender;

import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import edu.java.telegramBotConnection.kafka.LinkUpdatesQueueProducer;
import java.util.Set;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KafkaLinkUpdatesSender implements LinkUpdatesSender {

    private final LinkUpdatesQueueProducer producer;

    @Override
    public void sendUpdate(LinkUpdate linkUpdate) {
        producer.send(linkUpdate);
    }

    @Override
    public void sendUpdates(Set<LinkUpdate> updates) {
        updates.forEach(this::sendUpdate);
    }
}
