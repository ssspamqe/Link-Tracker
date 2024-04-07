package edu.java.scrapper.integrational.kafka;

import org.junit.ClassRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
@SpringBootTest
//@DirtiesContext
@TestPropertySource(locations = "classpath:application-test.yml")
@ActiveProfiles("test")
@Configuration
public abstract class KafkaIntegrationEnvironment {

    @ClassRule
    public static final KafkaContainer KAFKA = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.3.2"));

    static {
        KAFKA.start();
    }

    @DynamicPropertySource
    static void registerKafka(DynamicPropertyRegistry registry) {
        registry.add("kafka.producer-configuration.bootstrap-servers", KAFKA::getBootstrapServers);
    }
}
