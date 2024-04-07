package edu.java.telegramBotConnection.kafka;

import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;

@RequiredArgsConstructor
public class LinkUpdatesQueueProducer {

    private static final Logger LOGGER = LogManager.getLogger();

    private final KafkaTemplate<String, LinkUpdate> kafkaTemplate;
    private final String topicName;

    public void send(LinkUpdate update) {
        LOGGER.warn("Sending message to kafka...");
        try {
            LOGGER.warn("topic name: {}", topicName);
            kafkaTemplate.send(topicName, update).whenComplete(
                (sendResult, throwable) -> {
                    if (throwable != null) {
                        LOGGER.error("Kafka error: {}", throwable);
                    } else {
                        LOGGER.info("Successfully sent message to kafka");
                    }
                }
            );
        } catch (Exception ex) {
            LOGGER.warn("Cant send message to kafka: {}", ex);
        }
    }
}
