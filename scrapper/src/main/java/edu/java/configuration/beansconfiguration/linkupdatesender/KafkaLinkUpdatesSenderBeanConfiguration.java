package edu.java.configuration.beansconfiguration.linkupdatesender;

import edu.java.configuration.services.telegrambot.kafka.TelegramBotKafkaConfiguration;
import edu.java.linkupdatescheduler.linkupdatessender.KafkaLinkUpdatesSender;
import edu.java.linkupdatescheduler.linkupdatessender.LinkUpdatesSender;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.kafka.LinkUpdatesQueueProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
@ConditionalOnProperty(prefix = "telegram-bot", name = "connection-type", havingValue = "kafka")
@RequiredArgsConstructor
public class KafkaLinkUpdatesSenderBeanConfiguration {

    private final KafkaTemplate<String, LinkUpdate> kafkaTemplate;
    private final TelegramBotKafkaConfiguration kafkaConfig;

    @Bean
    public LinkUpdatesSender linkUpdatesSender() {
        return new KafkaLinkUpdatesSender(linkUpdatesQueueProducer());
    }

    @Bean
    public LinkUpdatesQueueProducer linkUpdatesQueueProducer() {
        return new LinkUpdatesQueueProducer(kafkaTemplate, kafkaConfig.getProducerConfiguration().linkUpdatesTopic());
    }
}
