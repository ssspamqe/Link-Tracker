package edu.java.data.dao.jdbc.repositories.rowMappers;

import edu.java.data.dto.Link;
import java.net.URI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneOffset;
import org.springframework.jdbc.core.RowMapper;

public class LinkRowMapper implements RowMapper<Link> {
    @Override
    public Link mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        URI url = URI.create(rs.getString("url"));
        var createdAt = rs.getTimestamp("created_at").toInstant().atOffset(ZoneOffset.UTC);
        var lastCheckedAt = rs.getTimestamp("last_checked_at").toInstant().atOffset(ZoneOffset.UTC);

        return new Link(id, url, createdAt, lastCheckedAt);
    }
}
