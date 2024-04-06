package edu.java.linkUpdateScheduler.linkUpdatesSender;

import edu.java.externalApi.kafka.LinkUpdatesQueueProducer;
import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
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
