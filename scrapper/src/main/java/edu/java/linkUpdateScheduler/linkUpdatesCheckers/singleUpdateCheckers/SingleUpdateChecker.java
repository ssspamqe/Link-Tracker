package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers;

import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdateType;

public interface SingleUpdateChecker<A, B> {
    LinkUpdateType getType();

    boolean hasUpdate(A oldState, B newState);
}
