package edu.java.bot.integration.kafka.configurations;

import edu.java.bot.scrapperconnection.dto.linkupdate.LinkUpdate;
import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.serializer.JsonSerializer;
import static edu.java.bot.integration.IntegrationEnvironment.KAFKA;

@Configuration
public class TestKafkaBeansConfiguration {

    @Bean
    KafkaTemplate<String, LinkUpdate> testKafkaTemplate() {
        return new KafkaTemplate<>(testProducerFactory());
    }

    private DefaultKafkaProducerFactory<String, LinkUpdate> testProducerFactory() {
        return new DefaultKafkaProducerFactory<>(testProducerProperties());
    }

    private Map<String, Object> testProducerProperties() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, KAFKA.getBootstrapServers());
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return props;
    }

}
