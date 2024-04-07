package edu.java.scrapper.integrational.kafka.beanConfiguration;

import java.util.concurrent.CountDownLatch;
import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import lombok.Getter;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Getter
public class TestConsumer {

    private CountDownLatch latch = new CountDownLatch(1);
    private LinkUpdate payload;

    @KafkaListener(topics = "linkUpdates-test", groupId = "testConsumers")
    public void receive(LinkUpdate update) {
        payload = update;
        latch.countDown();
    }

    public void resetLatch() {
        latch = new CountDownLatch(1);
    }
}
