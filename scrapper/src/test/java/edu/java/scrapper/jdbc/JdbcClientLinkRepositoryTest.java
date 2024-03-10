package edu.java.scrapper.jdbc;

import edu.java.dao.postgres.entities.Link;
import edu.java.dao.postgres.repositories.LinkRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.assertj.core.api.Assertions.assertThat;

class JdbcClientLinkRepositoryTest extends JdbcIntegrationEnvironment {
    @Autowired @Qualifier("jdbcClientLinkRepository")
    LinkRepository linkRepository;

    @Test
    public void should_save() throws SQLException {
        Link link = new Link("https://link", LocalDateTime.now());

        linkRepository.save(link);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM links");
        assertThat(resultSet.next()).isTrue();
    }

    @Test
    public void should_findById() throws SQLException {
        statement.execute("INSERT INTO links (url, created_at) VALUES ('https://link','2022-06-16 16:37:23')");

        Link actualLink = linkRepository.findById(1L).get();

        assertThat(actualLink.getUrl()).isEqualTo("https://link");
    }

    @Test
    public void should_returnEmptyOptional_when_cantFindLink() {
        Optional<Link> actualLink = linkRepository.findById(1L);

        assertThat(actualLink).isEmpty();
    }

    @Test
    public void should_findByUrl() throws SQLException {
        statement.execute("INSERT INTO links (url, created_at) VALUES ('https://link','2022-06-16 16:37:23')");

        Link actualLink = linkRepository.findByUrl("https://link").get();

        assertThat(actualLink.getCreatedAt()).isEqualTo(LocalDateTime.parse("2022-06-16T16:37:23"));
    }

    @Test
    public void should_removeById() throws SQLException {
        statement.execute("INSERT INTO links (url, created_at) VALUES ('https://link','2022-06-16 16:37:23')");

        linkRepository.removeById(1L);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM links");
        assertThat(resultSet.next()).isFalse();
    }

}