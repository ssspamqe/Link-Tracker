package edu.java.externalApi.kafka;

import edu.java.webClients.telegramBot.dto.requests.LinkUpdate;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;

@RequiredArgsConstructor
public class LinkUpdatesQueueProducer {

    private static final Logger LOGGER = LogManager.getLogger();

    private final KafkaTemplate<String, LinkUpdate> kafkaTemplate;

    public void send(LinkUpdate update) {
        LOGGER.warn("Sending message to kafka...");
        try {
            kafkaTemplate.send("linkUpdates", update).whenComplete(
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
