package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers;

import edu.java.telegramBotConnection.dto.linkUpdateDto.LinkUpdateType;

public interface SingleUpdateChecker<A, B> {
    LinkUpdateType getType();

    boolean hasUpdate(A oldState, B newState);
}
