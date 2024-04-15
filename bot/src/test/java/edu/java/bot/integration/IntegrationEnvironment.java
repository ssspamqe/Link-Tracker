package edu.java.bot.integration;

import edu.java.bot.configuration.kafkaconfiguration.KafkaConsumerConfiguration;
import edu.java.bot.integration.kafka.configurations.TestKafkaBeansConfiguration;
import org.junit.ClassRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
@ActiveProfiles("test")
@Import({KafkaConsumerConfiguration.class, TestKafkaBeansConfiguration.class})
public abstract class IntegrationEnvironment {

    @ServiceConnection @ClassRule
    public static KafkaContainer KAFKA;

    static {
        KAFKA = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.3.2"));
        KAFKA.start();
    }

    @DynamicPropertySource
    static void kafkaBootstrap(DynamicPropertyRegistry registry) {
        System.out.println("Setter");
        registry.add("kafka.consumer-configuration.bootstrap-servers", KAFKA::getBootstrapServers);
        registry.add("kafka.producer-configuration.bootstrap-servers", KAFKA::getBootstrapServers);
        registry.add("spring.kafka.producer.bootstrap-servers", KAFKA::getBootstrapServers);
    }
}
