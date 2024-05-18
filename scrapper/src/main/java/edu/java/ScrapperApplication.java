package edu.java;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import edu.java.configuration.global.ApplicationConfiguration;
import edu.java.configuration.services.telegrambot.TelegramBotConnectionConfiguration;
import edu.java.configuration.services.telegrambot.kafka.TelegramBotKafkaConfiguration;
import edu.java.configuration.services.telegrambot.rest.TelegramBotRestConfiguration;
import edu.java.configuration.services.trackableservices.AllTrackableServicesConfigurations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableRedisDocumentRepositories(basePackages = "edu.java.*")
@EnableConfigurationProperties({
    ApplicationConfiguration.class,
    TelegramBotKafkaConfiguration.class,
    AllTrackableServicesConfigurations.class,
    TelegramBotConnectionConfiguration.class
})
@EnableTransactionManagement
public class ScrapperApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScrapperApplication.class, args);
    }

}
