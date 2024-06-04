package edu.java.configuration.services.telegrambot.kafka;

import jakarta.validation.constraints.NotNull;

public record KafkaProducerConfiguration(
    @NotNull String bootstrapServers,
    @NotNull String linkUpdatesTopic,
    String clientId,
    String acksConfig,
    Integer deliveryTimeout,
    Integer lingerMs,
    Integer batchSize,
    Boolean enableIdempotence
) {

}
