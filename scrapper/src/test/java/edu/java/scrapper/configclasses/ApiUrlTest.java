package edu.java.scrapper.configclasses;

import edu.java.configuration.global.ApplicationConfiguration;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiUrlTest {

    @Test
    public void should_returnConfigUrl_when_itIsNotNull() {
        ApplicationConfiguration.ApiUrl apiUrl = new ApplicationConfiguration.ApiUrl("defaultUrl", "configUrl");

        String actualBaseUrl = apiUrl.getBaseUrl();

        assertThat(actualBaseUrl).isEqualTo("configUrl");
    }

    @Test
    public void should_returnDefaultUrl_when_configUrlIsNull() {
        ApplicationConfiguration.ApiUrl apiUrl = new ApplicationConfiguration.ApiUrl("defaultUrl", null);

        String actualBaseUrl = apiUrl.getBaseUrl();

        assertThat(actualBaseUrl).isNotNull().isEqualTo("defaultUrl");
    }

}
