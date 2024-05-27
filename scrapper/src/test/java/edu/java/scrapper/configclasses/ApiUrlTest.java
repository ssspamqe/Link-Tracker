package edu.java.scrapper.configclasses;

import edu.java.configuration.global.ApplicationConfiguration;
import edu.java.configuration.services.supportingobjects.ApiUrl;
import org.junit.jupiter.api.Test;
import java.net.URI;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiUrlTest {

    @Test
    public void should_returnConfigUrl_when_itIsNotNull() {
        var apiUrl = new ApiUrl(URI.create("https://base-url"), URI.create("https://config-url"));

        URI actualBaseUrl = apiUrl.getBaseUrl();

        assertThat(actualBaseUrl).isEqualTo(URI.create("https://config-url"));
    }

    @Test
    public void should_returnDefaultUrl_when_configUrlIsNull() {
        var apiUrl = new ApiUrl(URI.create("https://base-url"), null);

        URI actualBaseUrl = apiUrl.getBaseUrl();

        assertThat(actualBaseUrl).isNotNull().isEqualTo(URI.create("https://base-url"));
    }

}
