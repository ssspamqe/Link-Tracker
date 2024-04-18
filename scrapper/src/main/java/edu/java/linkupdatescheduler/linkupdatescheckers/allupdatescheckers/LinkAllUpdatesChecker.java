package edu.java.linkupdatescheduler.linkupdatescheckers.allupdatescheckers;

import edu.java.data.dto.Link;
import edu.java.linkupdatescheduler.exceptions.IncorrectHostException;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import java.util.List;

public interface LinkAllUpdatesChecker {
    List<LinkUpdate> getUpdates(Link link) throws IncorrectHostException;
}
