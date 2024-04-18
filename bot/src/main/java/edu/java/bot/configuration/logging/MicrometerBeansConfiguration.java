package edu.java.bot.configuration.logging;

import edu.java.bot.configuration.globalconfiguration.ApplicationConfig;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MicrometerBeansConfiguration {

    private final MeterRegistry meterRegistry;
    private final ApplicationConfig applicationConfig;

    @Bean
    public Counter processedLinkUpdatesMetric() {
        return meterRegistry.counter(applicationConfig.processedLinkUpdatesMetricName());
    }

}
