package edu.java.data.dao.jdbc.repositories.rowMappers;

import edu.java.data.dto.ChatLink;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.springframework.jdbc.core.RowMapper;

public class ChatLinkRowMapper implements RowMapper<ChatLink> {
    @Override
    public ChatLink mapRow(ResultSet rs, int rowNum) throws SQLException {
        long chatId = rs.getLong("chat_id");
        long linkId = rs.getLong("link_id");
        OffsetDateTime createdAt = rs.getTimestamp("created_at").toInstant().atOffset(ZoneOffset.UTC);

        return new ChatLink(chatId, linkId, createdAt);
    }
}
