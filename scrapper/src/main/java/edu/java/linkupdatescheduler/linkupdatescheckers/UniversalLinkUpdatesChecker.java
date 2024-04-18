package edu.java.linkupdatescheduler.linkupdatescheckers;

import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dto.Link;
import edu.java.linkupdatescheduler.exceptions.IncorrectHostException;
import edu.java.linkupdatescheduler.linkupdatescheckers.allupdatescheckers.LinkAllUpdatesChecker;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import java.time.OffsetDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UniversalLinkUpdatesChecker {

    private static final Logger LOGGER = LogManager.getLogger();

    private final List<LinkAllUpdatesChecker> linkAllUpdatesCheckers;
    private final LinkDataAccessObject linkDao;

    public List<LinkUpdate> getUpdates(Link link) {
        for (var linkUpdateChecker : linkAllUpdatesCheckers) {
            try {
                return linkUpdateChecker.getUpdates(link);
            } catch (IncorrectHostException ex) {

            }
        }
        linkDao.updateLastCheckedAtById(OffsetDateTime.now(), link.getId());
        return List.of();
    }
}
