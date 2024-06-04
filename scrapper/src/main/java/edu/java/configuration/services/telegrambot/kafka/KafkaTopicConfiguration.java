package edu.java.configuration.services.telegrambot.kafka;

import jakarta.validation.constraints.NotNull;

public record KafkaTopicConfiguration(
    @NotNull String name,
    Integer partitions,
    Integer replicas
) {
}
