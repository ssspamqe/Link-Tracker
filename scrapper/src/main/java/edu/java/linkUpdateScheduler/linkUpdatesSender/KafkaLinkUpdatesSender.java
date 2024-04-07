package edu.java.linkUpdateScheduler.linkUpdatesSender;

import edu.java.telegramBotConnection.kafka.LinkUpdatesQueueProducer;
import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import lombok.RequiredArgsConstructor;
import java.util.Set;

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
