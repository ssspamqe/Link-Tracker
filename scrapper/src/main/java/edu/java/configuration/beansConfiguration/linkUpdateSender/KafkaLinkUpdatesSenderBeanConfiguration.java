package edu.java.configuration.beansConfiguration.linkUpdateSender;

import edu.java.telegramBotConnection.kafka.LinkUpdatesQueueProducer;
import edu.java.linkUpdateScheduler.linkUpdatesSender.KafkaLinkUpdatesSender;
import edu.java.linkUpdateScheduler.linkUpdatesSender.LinkUpdatesSender;
import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
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

    @Bean
    public LinkUpdatesSender linkUpdatesSender() {
        return new KafkaLinkUpdatesSender(producer());
    }

    @Bean
    public LinkUpdatesQueueProducer producer() {
        return new LinkUpdatesQueueProducer(kafkaTemplate);
    }
}
