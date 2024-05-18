package edu.java.configuration.services.telegrambot.kafka;

import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
public record TelegramBotKafkaConfiguration(
    Set<KafkaTopicConfiguration> topicConfigurations,

    KafkaProducerConfiguration producerConfiguration

) {
}
