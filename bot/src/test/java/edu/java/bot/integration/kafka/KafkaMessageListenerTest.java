package edu.java.bot.integration.kafka;

import edu.java.bot.integration.IntegrationEnvironment;
import edu.java.bot.integration.kafka.configurations.TestKafkaDltConsumer;
import edu.java.bot.integration.kafka.configurations.TestKafkaProducer;
import edu.java.bot.scrapperconnection.dto.linkupdate.LinkUpdate;
import edu.java.bot.scrapperconnection.dto.linkupdate.LinkUpdateType;
import java.net.URI;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import edu.java.bot.scrapperconnection.kafka.KafkaMessageListener;
import edu.java.bot.scrapperconnection.services.LinkUpdateService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.kafka.core.KafkaTemplate;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static org.mockito.ArgumentMatchers.any;

public class KafkaMessageListenerTest extends IntegrationEnvironment {

    @Test
    public void should_consumeMessagesFromTopic() {
        var sentLinkUpdate =
            new LinkUpdate(1, URI.create("https://test/link"), LinkUpdateType.STACK_OVERFLOW_ANSWERS, List.of(1L));

        producer.send(sentLinkUpdate);

        await()
            .pollInterval(Duration.ofSeconds(2))
            .atMost(10, TimeUnit.SECONDS)
            .untilAsserted(() -> {
                Mockito.verify(spyLinkUpdateService, Mockito.times(1)).sendUpdateToBot(any());
            });
    }

    @Test
    public void should_sendMessageToDlt_when_emptyChatIdsList() {
        var sentLinkUpdate =
            new LinkUpdate(1, URI.create("https://test/link"), LinkUpdateType.STACK_OVERFLOW_ANSWERS, List.of());

        producer.send(sentLinkUpdate);

        await()
            .pollInterval(Duration.ofSeconds(2))
            .atMost(10, TimeUnit.SECONDS)
            .untilAsserted(() -> {
                var lastMessage = dltConsumer.readAndDeleteNewMessage();
                assertThat(lastMessage).isEqualTo(sentLinkUpdate);
            });
    }

    @Test
    public void should_sendMessageToDlt_when_nonPositiveLinkId() {
        var sentLinkUpdate =
            new LinkUpdate(-1, URI.create("https://test/link"), LinkUpdateType.STACK_OVERFLOW_ANSWERS, List.of(1L));

        producer.send(sentLinkUpdate);

        await()
            .pollInterval(Duration.ofSeconds(2))
            .atMost(10, TimeUnit.SECONDS)
            .untilAsserted(() -> {
                var lastMessage = dltConsumer.readAndDeleteNewMessage();
                assertThat(lastMessage).isEqualTo(sentLinkUpdate);
            });
    }
}
