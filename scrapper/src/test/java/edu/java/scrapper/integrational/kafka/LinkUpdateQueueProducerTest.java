package edu.java.scrapper.integrational.kafka;

import edu.java.scrapper.integrational.kafka.beanConfiguration.TestConsumer;
import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdateType;
import edu.java.telegramBotConnection.kafka.LinkUpdatesQueueProducer;
import java.net.URI;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LinkUpdateQueueProducerTest extends KafkaIntegrationEnvironment {

    @Autowired LinkUpdatesQueueProducer linkUpdatesQueueProducer;
    @Autowired TestConsumer testConsumer;

    @BeforeEach
    void resetConsumerLatch() {
        testConsumer.resetLatch();
    }

    @Test
    public void should_sendLinkUpdateToQueue() throws Exception {
        LinkUpdate linkUpdate =
            new LinkUpdate(1, URI.create("https://test/link"), LinkUpdateType.STACK_OVERFLOW_ANSWERS, Set.of(1L));

        linkUpdatesQueueProducer.send(linkUpdate);

        boolean messageConsumed = testConsumer.getLatch().await(10, TimeUnit.SECONDS);
        var consumerPayLoad = testConsumer.getPayload();
        assertThat(messageConsumed).isTrue();
        assertThat(consumerPayLoad).isEqualTo(linkUpdate);
    }

}
