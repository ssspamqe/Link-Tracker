package edu.java.linkUpdateScheduler.linkUpdatesCheckers.allUpdatesCheckers;

import edu.java.data.dto.Link;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import java.util.List;

public interface LinkAllUpdatesChecker {
    List<LinkUpdate> getUpdates(Link link) throws IncorrectHostException;
}
