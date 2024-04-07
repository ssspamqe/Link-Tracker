package edu.java.telegramBotConnection.dto.linkUpdateDto;

import java.net.URI;
import java.util.Set;

public record LinkUpdate(
    long id,
    URI url,
    LinkUpdateType type,
    Set<Long> tgChatIds
) {
}
