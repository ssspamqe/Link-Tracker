package edu.java.bot.externalApi.dto.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.net.URI;
import java.util.List;

public record LinkUpdate(

    long id,

    URI url,

    @NotNull
    LinkUpdateType type,

    @NotEmpty
    List<Long> tgChatIds
) implements Serializable {
}
