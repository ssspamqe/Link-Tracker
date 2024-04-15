package edu.java.bot.integration.kafka.configurations;

import edu.java.bot.scrapperconnection.dto.linkupdate.LinkUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestKafkaProducer {

    @Autowired
    private KafkaTemplate<String, LinkUpdate> kafkaTemplate;

    @Value("${kafka.consumer-configuration.topic}")
    private String topic;

    public void send(LinkUpdate linkUpdate) {
        kafkaTemplate.send(topic, linkUpdate);
    }
}
