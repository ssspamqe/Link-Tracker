package edu.java.bot.integration.kafka.configurations;

import edu.java.bot.scrapperconnection.dto.linkupdate.LinkUpdate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestKafkaDltConsumer {

    private LinkUpdate lastMessage = null;

    @KafkaListener(topics = "${kafka.consumer-configuration.topic}${kafka.dlt-topic-suffix}")
    public void consumeMessage(LinkUpdate message) {
        lastMessage = message;
    }

    public LinkUpdate readAndDeleteNewMessage() {
        var buffer = lastMessage;
        lastMessage = null;
        return buffer;
    }

}
