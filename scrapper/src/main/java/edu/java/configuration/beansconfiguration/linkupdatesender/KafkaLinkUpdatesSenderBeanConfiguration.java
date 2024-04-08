package edu.java.configuration.beansconfiguration.linkupdatesender;

import edu.java.configuration.kafkaconfiguration.KafkaConfig;
import edu.java.linkUpdateScheduler.linkUpdatesSender.KafkaLinkUpdatesSender;
import edu.java.linkUpdateScheduler.linkUpdatesSender.LinkUpdatesSender;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.kafka.LinkUpdatesQueueProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
@ConditionalOnProperty(prefix = "app", name = "use-queue", havingValue = "true")
@RequiredArgsConstructor
public class KafkaLinkUpdatesSenderBeanConfiguration {

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
