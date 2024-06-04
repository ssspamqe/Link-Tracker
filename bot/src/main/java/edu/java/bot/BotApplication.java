package edu.java.bot;

import edu.java.bot.configuration.globalconfiguration.ApplicationConfig;
import edu.java.bot.configuration.kafkaconfiguration.KafkaConfig;
import edu.java.bot.configuration.scrapperconfiguration.ScrapperConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    ApplicationConfig.class,
    KafkaConfig.class,
    ScrapperConfiguration.class
})
public class BotApplication {
    public static void main(String[] args) {
        SpringApplication.run(BotApplication.class, args);
    }
}
