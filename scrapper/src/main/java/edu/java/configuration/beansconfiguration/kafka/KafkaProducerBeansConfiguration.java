package edu.java.configuration.beansconfiguration.kafka;

import edu.java.configuration.services.telegrambot.TelegramBotConnectionConfiguration;
import edu.java.configuration.services.telegrambot.kafka.KafkaProducerConfiguration;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration
@ConditionalOnProperty(prefix = "telegram-bot", name = "connection-type", havingValue = "kafka")
public class KafkaProducerBeansConfiguration {

    private final KafkaProducerConfiguration producerConfiguration;

    public KafkaProducerBeansConfiguration(TelegramBotConnectionConfiguration telegramBotConnectionConfiguration) {
        producerConfiguration = telegramBotConnectionConfiguration.kafkaConfiguration().getProducerConfiguration();
    }

    @Bean
    public ProducerFactory<String, LinkUpdate> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();

        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, producerConfiguration.bootstrapServers());
        setClientId(props);
        setAcks(props);
        setDeliveryTimeout(props);
        setLingerMs(props);
        setBatchSize(props);
        setEnableIdempotence(props);

        return props;
    }

    private void setClientId(Map<String, Object> props) {
        if (producerConfiguration.clientId() != null) {
            props.put(ProducerConfig.CLIENT_ID_CONFIG, producerConfiguration.clientId());
        }
    }

    private void setAcks(Map<String, Object> props) {
        if (producerConfiguration.acksConfig() != null) {
            props.put(ProducerConfig.ACKS_CONFIG, producerConfiguration.acksConfig());
        }

    }

    private void setDeliveryTimeout(Map<String, Object> props) {
        if (producerConfiguration.deliveryTimeout() != null) {
            props.put(ProducerConfig.DELIVERY_TIMEOUT_MS_CONFIG, producerConfiguration.deliveryTimeout());
        }
    }

    private void setBatchSize(Map<String, Object> props) {
        if (producerConfiguration.batchSize() != null) {
            props.put(ProducerConfig.BATCH_SIZE_CONFIG, producerConfiguration.batchSize());
        }
    }

    private void setLingerMs(Map<String, Object> props) {
        if (producerConfiguration.lingerMs() != null) {
            props.put(ProducerConfig.LINGER_MS_CONFIG, producerConfiguration.lingerMs());
        }
    }

    private void setEnableIdempotence(Map<String, Object> props) {
        if (producerConfiguration.enableIdempotence() != null) {
            props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, producerConfiguration.enableIdempotence());
        }
    }

    @Bean
    public KafkaTemplate<String, LinkUpdate> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}
