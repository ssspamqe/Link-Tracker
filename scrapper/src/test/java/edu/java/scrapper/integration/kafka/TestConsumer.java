package edu.java.scrapper.integration.kafka;

import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Getter @Component

public class TestConsumer {

    private static final Logger LOGGER = LogManager.getLogger();
    private LinkUpdate lastMessage;

    @KafkaListener(topics = "linkUpdates-test")
    public void receive(LinkUpdate message) {
        lastMessage = message;
    }
}
