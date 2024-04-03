package edu.java.data.dto;

import edu.java.data.dao.jpa.entities.utils.mappers.support.Default;
import java.net.URI;
import java.time.OffsetDateTime;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Link {

    @Id
    private long id;
    private URI url;
    private OffsetDateTime createdAt;
    private OffsetDateTime lastCheckedAt;

    @Default
    public Link(long id, URI url, OffsetDateTime createdAt, OffsetDateTime lastCheckedAt) {
        this.id = id;
        this.url = url;
        this.createdAt = createdAt;
        this.lastCheckedAt = lastCheckedAt;
    }

    public Link(URI url, OffsetDateTime createdAt) {
        this.url = url;
        this.createdAt = createdAt;
        this.lastCheckedAt = OffsetDateTime.now();
    }

    public Link(URI url) {
        this(url, OffsetDateTime.now());
    }
}
