package edu.java.configuration.services.telegrambot;

import edu.java.configuration.exceptions.NullKafkaConfigurationException;
import edu.java.configuration.exceptions.NullRestConfigurationException;
import edu.java.configuration.services.telegrambot.kafka.TelegramBotKafkaConfiguration;
import edu.java.configuration.services.telegrambot.webclient.TelegramBotWebClientConfiguration;
import jakarta.annotation.PostConstruct;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "telegram-bot", ignoreUnknownFields = false)
public record TelegramBotConnectionConfiguration(
    @NotNull
    TelegramBotConnectionType connectionType,

    @Bean
    TelegramBotKafkaConfiguration kafkaConfiguration,

    @Bean
    TelegramBotWebClientConfiguration webClientConfiguration
) {
    @PostConstruct
    void validateConfiguration(){
        if(connectionType == TelegramBotConnectionType.KAFKA && kafkaConfiguration == null){
            throw new NullKafkaConfigurationException("Kafka configuration is null, while it is an actual telegram bot connection");
        }
        if(connectionType == TelegramBotConnectionType.WEB_CLIENT && webClientConfiguration == null){
            throw new NullRestConfigurationException("Rest configuration is null, while it is an actual telegram bot connection");
        }
    }
}
