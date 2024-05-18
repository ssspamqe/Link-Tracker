package edu.java.configuration.beansconfiguration.kafka;

import edu.java.configuration.services.telegrambot.kafka.TelegramBotKafkaConfiguration;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
@ConditionalOnProperty(prefix = "app", name = "use-queue", havingValue = "true")
public class KafkaTopicsConfiguration {

    private static final int PARTITIONS_DEFAULT = 1;
    private static final int REPLICAS_DEFAULT = 1;

    private Set<TelegramBotKafkaConfiguration.KafkaTopicConfiguration> topicConfigurations;

    public KafkaTopicsConfiguration(TelegramBotKafkaConfiguration config) {
        topicConfigurations = config.topicConfigurations();
    }

    @Bean
    public KafkaAdmin.NewTopics kafkaTopics() {
        return new KafkaAdmin.NewTopics(
            buildNewTopics()
        );
    }

    private NewTopic[] buildNewTopics() {
        Set<NewTopic> result = new HashSet<>();

        for (var config : topicConfigurations) {
            var newTopic = buildNewTopic(config);
            result.add(newTopic);
        }

        return result.toArray(new NewTopic[0]);
    }

    private NewTopic buildNewTopic(TelegramBotKafkaConfiguration.KafkaTopicConfiguration configuration) {
        return TopicBuilder.name(configuration.name())
            .partitions(getDefaultPartitionsIfNull(configuration.partitions()))
            .replicas(getDefaultReplicasIfNull(configuration.replicas()))
            .build();
    }

    private int getDefaultPartitionsIfNull(Integer partitions) {
        return Objects.requireNonNullElse(partitions, PARTITIONS_DEFAULT);
    }

    private int getDefaultReplicasIfNull(Integer replicas) {
        return Objects.requireNonNullElse(replicas, REPLICAS_DEFAULT);
    }
}
