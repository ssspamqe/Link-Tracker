package edu.java.scrapper.integration.kafka;

import edu.java.scrapper.integration.IntegrationEnvironment;
import edu.java.scrapper.integration.kafka.configuration.TestConsumer;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdateType;
import edu.java.telegrambotconnection.kafka.LinkUpdatesQueueProducer;
import java.net.URI;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.awaitility.Awaitility.await;

public class LinkUpdatesQueueProducerTest extends IntegrationEnvironment {

    @Autowired LinkUpdatesQueueProducer linkUpdatesQueueProducer;
    @Autowired TestConsumer testConsumer;

    @Test
    public void should_sendMessageToQueue() {
        var linkUpdate =
            new LinkUpdate(1, URI.create("https://some/url"), LinkUpdateType.STACK_OVERFLOW_ANSWERS, Set.of());

        linkUpdatesQueueProducer.send(linkUpdate);

        await()
            .pollInterval(Duration.ofSeconds(2))
            .atMost(10, TimeUnit.SECONDS)
            .untilAsserted(() -> {
                assertThat(testConsumer.getLastMessage()).isEqualTo(linkUpdate);
            });
    }

}
