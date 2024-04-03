package edu.java.data.dao.jdbc.repositories.rowMappers;

import edu.java.data.dto.Chat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.springframework.jdbc.core.RowMapper;

public class ChatRowMapper implements RowMapper<Chat> {

    @Override
    public Chat mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        OffsetDateTime createdAt = rs.getTimestamp("created_at").toInstant().atOffset(ZoneOffset.UTC);

        return new Chat(id, createdAt);
    }
}
