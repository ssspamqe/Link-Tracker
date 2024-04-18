package edu.java.bot.scrapperconnection.kafka;

import edu.java.bot.scrapperconnection.dto.linkupdate.LinkUpdate;
import edu.java.bot.scrapperconnection.services.LinkUpdateService;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.DltStrategy;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MessageListener {

    private static final Logger LOGGER = LogManager.getLogger();

    private final Validator validator;
    private final LinkUpdateService linkUpdateService;

    @RetryableTopic(attempts = "${kafka.retryable-topic-attempts}",
                    kafkaTemplate = "retryableTopicKafkaTemplate",
                    dltTopicSuffix = "${kafka.dlt-topic-suffix}",
                    dltStrategy = DltStrategy.FAIL_ON_ERROR)
    @KafkaListener(topics = "linkUpdates", groupId = "mainGroup")
    public void listenToLinkUpdate(@Payload LinkUpdate update) {
        LOGGER.debug("Got new update {}", update);
        throwExceptionIfInvalid(update);
        linkUpdateService.sendUpdateToBot(update);
    }

    @DltHandler
    public void handleDlt(
        @Payload LinkUpdate update,
        @Header(KafkaHeaders.EXCEPTION_MESSAGE) String errorMessage
    ) {
        LOGGER.warn("Can't process link update: {}, message: {}", update, errorMessage);
    }

    private void throwExceptionIfInvalid(LinkUpdate update) {
        var violations = validator.validate(update);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }

}
