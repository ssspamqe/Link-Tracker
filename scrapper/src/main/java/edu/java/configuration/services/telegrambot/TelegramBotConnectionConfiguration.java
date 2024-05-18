package edu.java.configuration.services.telegrambot;

import edu.java.configuration.exceptions.NullKafkaConfigurationException;
import edu.java.configuration.exceptions.NullRestConfigurationException;
import edu.java.configuration.services.telegrambot.kafka.TelegramBotKafkaConfiguration;
import edu.java.configuration.services.telegrambot.rest.TelegramBotRestConfiguration;
import jakarta.annotation.PostConstruct;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "telegram-bot", ignoreUnknownFields = false)
public record TelegramBotConnectionConfiguration(
    @NotNull
    TelegramBotConnectionType connectionType,

    TelegramBotKafkaConfiguration kafkaConfiguration,

    TelegramBotRestConfiguration restConfiguration
) {
    @PostConstruct
    void validateConfiguration(){
        if(connectionType == TelegramBotConnectionType.KAFKA && kafkaConfiguration == null){
            throw new NullKafkaConfigurationException("Kafka configuration is null, while it is an actual telegram bot connection");
        }
        if(connectionType == TelegramBotConnectionType.REST_API && restConfiguration == null){
            throw new NullRestConfigurationException("Rest configuration is null, while it is an actual telegram bot connection");
        }
    }
}
