package edu.java.telegrambotconnection.kafka;

import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;

@RequiredArgsConstructor
public class LinkUpdatesQueueProducer {

    private static final Logger LOGGER = LogManager.getLogger();

    private final KafkaTemplate<String, LinkUpdate> kafkaTemplate;
    private final String topicName;

    public void send(LinkUpdate update) {
        LOGGER.trace("Sending message to kafka...");
        try {
            LOGGER.trace("topic name: {}", topicName);
            kafkaTemplate.send(topicName, update).whenComplete(
                (sendResult, throwable) -> {
                    if (throwable != null) {
                        LOGGER.warn("Kafka error: {}", throwable);
                    } else {
                        LOGGER.trace("Successfully sent message to kafka");
                    }
                }
            );
        } catch (Exception ex) {
            LOGGER.warn("Cant send message to kafka: {}", ex);
        }
    }
}
