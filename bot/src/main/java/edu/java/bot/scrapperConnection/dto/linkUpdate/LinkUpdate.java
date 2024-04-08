package edu.java.bot.scrapperConnection.dto.linkUpdate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.net.URI;
import java.util.List;

public record LinkUpdate(

    @Min(1)
    long id,

    URI url,

    @NotNull
    LinkUpdateType type,

    @NotEmpty
    List<Long> tgChatIds
) implements Serializable {
}
