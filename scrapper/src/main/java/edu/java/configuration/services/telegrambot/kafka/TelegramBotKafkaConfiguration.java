package edu.java.configuration.services.telegrambot.kafka;

import java.util.Set;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Validated
@Data
public class TelegramBotKafkaConfiguration {

    @NotNull
    private Set<KafkaTopicConfiguration> topicConfigurations;

    @NotNull
    private KafkaProducerConfiguration producerConfiguration;
}
