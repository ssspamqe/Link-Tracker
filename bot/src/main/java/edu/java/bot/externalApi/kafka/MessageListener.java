package edu.java.bot.externalApi.kafka;

import edu.java.bot.externalApi.dto.requests.LinkUpdate;
import edu.java.bot.externalApi.services.LinkUpdateService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.DltStrategy;
import org.springframework.kafka.retrytopic.TopicSuffixingStrategy;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageListener {

    private static final Logger LOGGER = LogManager.getLogger();

    private final LinkUpdateService linkUpdateService;

    @RetryableTopic(attempts = "${kafka.retryable-topic-attempts}",
                    kafkaTemplate = "retryableTopicKafkaTemplate",
                    dltTopicSuffix = "${kafka.dlt-topic-suffix}",
                    dltStrategy = DltStrategy.FAIL_ON_ERROR)
    @KafkaListener(topics = "linkUpdates", groupId = "mainGroup")
    public void listenToLinkUpdates(@Payload LinkUpdate update) {
        LOGGER.debug("Got new update:" + update);
        linkUpdateService.sendUpdateToBot(update);
    }

    @DltHandler
    public void handleDlt(LinkUpdate update) {
        LOGGER.warn("Can't process link update: {}", update);
    }

}
