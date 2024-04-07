package edu.java.scrapper.integrational.kafka.beanConfiguration;

import edu.java.configuration.kafkaConfiguration.KafkaConfig;
import edu.java.linkUpdateScheduler.linkUpdatesSender.KafkaLinkUpdatesSender;
import edu.java.linkUpdateScheduler.linkUpdatesSender.LinkUpdatesSender;
import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import edu.java.telegramBotConnection.kafka.LinkUpdatesQueueProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@TestConfiguration
@RequiredArgsConstructor
public class LinkUpdateQueueProducerConfiguration {
    private final KafkaTemplate<String, LinkUpdate> kafkaTemplate;
    private final KafkaConfig kafkaConfig;

    @Bean
    public LinkUpdatesSender linkUpdatesSender() {
        return new KafkaLinkUpdatesSender(linkUpdatesQueueProducer());
    }

    @Bean
    public LinkUpdatesQueueProducer linkUpdatesQueueProducer() {
        return new LinkUpdatesQueueProducer(kafkaTemplate, kafkaConfig.producerConfiguration().linkUpdatesTopic());
    }
}
