package edu.java.data.dao.jpa.entities.mappers;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dto.Link;
import java.net.URI;
import java.util.Optional;

public class LinkEntityMapper implements EntityMapper<LinkJpaEntity, Link> {
    @Override
    public Link toDto(LinkJpaEntity jpaEntity) {
        if (jpaEntity == null) {
            return null;
        }

        long id = jpaEntity.getId();
        URI url = jpaEntity.getUrl();
        var createdAt = jpaEntity.getCreatedAt();
        var lastCheckedAt = jpaEntity.getLastCheckedAt();

        return new Link(id, url, createdAt, lastCheckedAt);
    }
}
