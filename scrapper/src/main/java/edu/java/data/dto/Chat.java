package edu.java.data.dto;

import edu.java.data.dao.jpa.entities.utils.mappers.support.Default;
import java.time.OffsetDateTime;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Chat {

    @Id
    private long id;
    private OffsetDateTime createdAt;

    @Default
    public Chat(long id, OffsetDateTime createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    public Chat(long id) {
        this(id, OffsetDateTime.now());
    }
}
