package edu.java.linkupdatescheduler.linkupdatessender;

import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import java.util.Set;

public interface LinkUpdatesSender {

    void sendUpdate(LinkUpdate update);

    void sendUpdates(Set<LinkUpdate> updates);

}
