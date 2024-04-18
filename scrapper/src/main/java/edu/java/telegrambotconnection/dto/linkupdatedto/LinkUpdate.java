package edu.java.telegrambotconnection.dto.linkupdatedto;

import java.net.URI;
import java.util.Set;

public record LinkUpdate(
    long id,
    URI url,
    LinkUpdateType type,
    Set<Long> tgChatIds
) {
}
