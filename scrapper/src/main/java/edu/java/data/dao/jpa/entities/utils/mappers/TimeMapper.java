package edu.java.data.dao.jpa.entities.utils.mappers;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public interface TimeMapper {

    default OffsetDateTime toOffsetDateTime(Instant instant) {
        return OffsetDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    default Instant toInstant(OffsetDateTime offsetDateTime) {
        return offsetDateTime.toInstant();
    }
}
