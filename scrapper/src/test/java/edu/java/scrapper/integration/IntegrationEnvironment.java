package edu.java.scrapper.integration;

import edu.java.data.dao.jdbc.dao.ChatJdbcDAO;
import edu.java.data.dao.jdbc.dao.GitHubRepositoryJdbcDAO;
import edu.java.data.dao.jdbc.dao.LinkJdbcDAO;
import edu.java.data.dao.jdbc.dao.StackOverflowQuestionJdbcDAO;
import edu.java.data.dao.jooq.dao.ChatJooqDAO;
import edu.java.data.dao.jooq.dao.GitHubRepositoryJooqDAO;
import edu.java.data.dao.jooq.dao.LinkJooqDAO;
import edu.java.data.dao.jooq.dao.StackOverflowQuestionJooqDAO;
import edu.java.data.dao.jpa.dao.ChatJpaDAO;
import edu.java.data.dao.jpa.dao.GitHubRepositoryJpaDAO;
import edu.java.data.dao.jpa.dao.LinkJpaDAO;
import edu.java.data.dao.jpa.dao.StackOverflowQuestionJpaDAO;
import edu.java.scrapper.integration.kafka.configuration.TestConsumer;
import edu.java.telegrambotconnection.kafka.LinkUpdatesQueueProducer;
import java.io.File;
import java.nio.file.Path;
import java.sql.Connection;
import liquibase.Contexts;
import liquibase.LabelExpression;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.DirectoryResourceAccessor;
import liquibase.resource.ResourceAccessor;
import org.junit.ClassRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
@ActiveProfiles("test")
@AutoConfigureTestEntityManager
@Transactional
public abstract class IntegrationEnvironment {

    protected static final String INSERT_LINK_STATEMENT =
        "INSERT INTO links(url, created_at) VALUES (?, '1970-01-01 00:00:00') RETURNING id";
    protected static final String INSERT_CHAT_STATEMENT =
        "INSERT INTO chats VALUES (?, '1970-01-01 00:00:00')";
    protected static final String INSERT_CHAT_LINKS_STATEMENT =
        "INSERT INTO chat_links(chat_id, link_id) VALUES (?,?)";

    @ServiceConnection
    protected static PostgreSQLContainer<?> POSTGRES;
    @ServiceConnection @ClassRule
    public static KafkaContainer KAFKA;

    @Autowired protected TestEntityManager entityManager;

    @Autowired protected JdbcTemplate jdbcTemplate;

    @Autowired protected ChatJdbcDAO chatJdbcDao;
    @Autowired protected LinkJdbcDAO linkJdbcDao;
    @Autowired protected GitHubRepositoryJdbcDAO gitHubRepositoryJdbcDao;
    @Autowired protected StackOverflowQuestionJdbcDAO stackOverflowQuestionJdbcDao;

    @Autowired protected ChatJooqDAO chatJooqDao;
    @Autowired protected LinkJooqDAO linkJooqDao;
    @Autowired protected GitHubRepositoryJooqDAO gitHubRepositoryJooqDao;
    @Autowired protected StackOverflowQuestionJooqDAO stackOverflowQuestionJooqDao;

    @Autowired protected ChatJpaDAO chatJpaDao;
    @Autowired protected LinkJpaDAO linkJpaDao;
    @Autowired protected GitHubRepositoryJpaDAO gitHubRepositoryJpaDao;
    @Autowired protected StackOverflowQuestionJpaDAO stackOverflowQuestionJpaDao;

    @Autowired protected LinkUpdatesQueueProducer linkUpdatesQueueProducer;
    @Autowired protected TestConsumer testConsumer;

    static {
        setUpPostgresContainer();
        setUpKafkaContainer();
    }

    private static void setUpPostgresContainer() {
        POSTGRES = new PostgreSQLContainer<>("postgres:16")
            .withDatabaseName("scrapper")
            .withUsername("postgres")
            .withPassword("postgres");
        POSTGRES.start();

        try {
            runMigrations(POSTGRES);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void setUpKafkaContainer() {
        KAFKA = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.3.2"));
        KAFKA.start();
    }

    private static void runMigrations(JdbcDatabaseContainer<?> c) throws Exception {
        Connection connection = POSTGRES.createConnection("");

        Database database = DatabaseFactory.getInstance()
            .findCorrectDatabaseImplementation(new JdbcConnection(connection));

        Path changeLogPath = new File(".").toPath().toAbsolutePath().getParent().getParent().resolve("migrations");
        ResourceAccessor resourceAccessor = new DirectoryResourceAccessor(changeLogPath);
        Liquibase liquibase = new Liquibase("master.yaml", resourceAccessor, database);
        liquibase.update(new Contexts(), new LabelExpression());
    }

    protected long saveLinkWithUrl(String url) {
        return jdbcTemplate.queryForObject(INSERT_LINK_STATEMENT, Long.class, url);
    }

    protected void saveChatWithId(long id) {
        jdbcTemplate.update(INSERT_CHAT_STATEMENT, id);
    }

    protected void saveChatIdLinkId(long chatId, long linkId) {
        jdbcTemplate.update(INSERT_CHAT_LINKS_STATEMENT, chatId, linkId);
    }

    @DynamicPropertySource
    static void kafkaBootstrap(DynamicPropertyRegistry registry) {
        registry.add("kafka.producer-configuration.bootstrap-servers", KAFKA::getBootstrapServers);
    }
}
