package edu.java.scrapper.integration.kafka;

import edu.java.scrapper.integration.IntegrationEnvironment;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdateType;
import edu.java.telegrambotconnection.kafka.LinkUpdatesQueueProducer;
import java.net.URI;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.awaitility.Awaitility.await;
import static org.hamcrest.Matchers.equalTo;

public class LinkUpdatesQueueProducerTest extends IntegrationEnvironment {

    @Autowired LinkUpdatesQueueProducer linkUpdatesQueueProducer;
    @Autowired TestConsumer testConsumer;

    @Test
    public void should_sendMessageToQueue() {
        var linkUpdate =
            new LinkUpdate(1, URI.create("https://some/url"), LinkUpdateType.STACK_OVERFLOW_ANSWERS, Set.of());

        linkUpdatesQueueProducer.send(linkUpdate);

        await()
            .until(testConsumer::getLastMessage, equalTo(linkUpdate));
    }

}
