package edu.java.linkUpdateScheduler.linkUpdatesSender;

import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdate;
import java.util.Set;

public interface LinkUpdatesSender {

    void sendUpdate(LinkUpdate update);

    void sendUpdates(Set<LinkUpdate> updates);

}
