package edu.java.data.dao.jpa.entities.utils.mappers;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public interface TimeMapper {
    default LocalDateTime toLocalDateTime(Instant instant) {
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    default Instant toInstant(LocalDateTime localDateTime) {
        return localDateTime.atOffset(ZoneOffset.UTC).toInstant();
    }
}
