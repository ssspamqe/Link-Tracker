package edu.java.linkupdatescheduler.linkupdatessender;

import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.kafka.LinkUpdatesQueueProducer;
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
