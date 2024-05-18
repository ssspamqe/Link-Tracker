package edu.java.configuration.beansconfiguration.logging;

import edu.java.configuration.global.ApplicationConfiguration;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MicrometerBeanConfiguration {

    private final MeterRegistry meterRegistry;
    private final ApplicationConfiguration applicationConfig;

    @Bean
    public Counter processedLinkUpdatesMetric() {
        return meterRegistry.counter(applicationConfig.processedUpdatesMetricName());
    }

}
