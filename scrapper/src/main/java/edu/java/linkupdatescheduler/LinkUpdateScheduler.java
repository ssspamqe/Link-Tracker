package edu.java.linkupdatescheduler;

import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dto.Link;
import edu.java.linkupdatescheduler.linkupdatescheckers.UniversalLinkUpdatesChecker;
import edu.java.linkupdatescheduler.linkupdatessender.LinkUpdatesSender;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import io.micrometer.core.instrument.Counter;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LinkUpdateScheduler {

    private static final Logger LOGGER = LogManager.getLogger();

    private final LinkDataAccessObject linkDao;
    private final UniversalLinkUpdatesChecker universalLinkUpdatesChecker;
    private final LinkUpdatesSender linkUpdatesSender;

    private final Counter processedLinkUpdatesMetric;

    private boolean contextIsLoaded = false;

    @Value("${app.scheduler-config.force-check-delay}")
    private Duration forceCheckDelay;

    @Scheduled(fixedDelayString = "${app.scheduler-config.interval}")
    @ConditionalOnProperty(value = "${app.scheduler-config.enable}", havingValue = "true")
    public void update() {
        if (!contextIsLoaded) {
            LOGGER.warn("Context is not loaded, skipping link updated checking...");
            return;
        }

        LOGGER.debug("LinkUpdateScheduler is looking for updates...");
        Collection<Link> linksToCheck = linkDao.findByLastCheckedAtBefore(buildBorderCheckTime());

        List<LinkUpdate> allLinkUpdates = new ArrayList<>();
        linksToCheck.forEach(link -> {
            List<LinkUpdate> linkUpdates =
                universalLinkUpdatesChecker.getUpdates(link);
            allLinkUpdates.addAll(linkUpdates);
        });

        sendUpdates(allLinkUpdates);
    }

    private OffsetDateTime buildBorderCheckTime() {
        return OffsetDateTime.now().minusSeconds(forceCheckDelay.getSeconds());
    }

    private void sendUpdates(List<LinkUpdate> allLinkUpdates) {
        processedLinkUpdatesMetric.increment(allLinkUpdates.size());

        if (!allLinkUpdates.isEmpty()) {
            LOGGER.debug(STR."Sending \{allLinkUpdates.size()} updates to bot...");
            try {
                linkUpdatesSender.sendUpdates(new HashSet<>(allLinkUpdates));
                LOGGER.debug(STR."Sent \{allLinkUpdates.size()} updates to bot");
            } catch (Exception ex) {
                LOGGER.warn("Can't send updates to bot, because of {}", ex.getMessage());
            }

        } else {
            LOGGER.debug("No updates found...");
        }
    }

    @EventListener
    public void onContextRefreshed(ContextRefreshedEvent event) {
        contextIsLoaded = true;
    }

}
