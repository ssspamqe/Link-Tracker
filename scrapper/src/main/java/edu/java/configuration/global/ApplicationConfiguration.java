package edu.java.configuration.global;

import edu.java.configuration.exceptions.NullRestConfigurationException;
import edu.java.configuration.services.supportingobjects.retryPolicy.RetryConfig;
import jakarta.annotation.PostConstruct;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.validation.annotation.Validated;

@ComponentScan(basePackages = "edu.java",
               excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "edu.java.domain.jooq.*"))
@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
@EnableScheduling
public record ApplicationConfiguration(

    @NotNull
    SchedulerConfig schedulerConfig,

    @NotNull
    DatabaseAccessType databaseAccessType,

    @NotNull
    String processedUpdatesMetricName
) {

    public record SchedulerConfig(boolean enable, @NotNull Duration interval, @NotNull Duration forceCheckDelay) {
    }

    public enum DatabaseAccessType {
        JDBC, JPA, JOOQ
    }
}
