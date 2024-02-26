package edu.java.bot.webClients;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.bot.configuration.ApplicationConfig;
import edu.java.bot.restApi.dto.responses.ApiErrorResponse;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webClients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webClients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webClients.scrapper.dto.responses.ListLinksResponse;
import edu.java.bot.webClients.scrapper.exceptions.ClientErrorException;
import java.net.URI;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import static com.github.tomakehurst.wiremock.client.WireMock.containing;
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@WireMockTest(httpPort = 8080)
@ExtendWith(MockitoExtension.class)
public class ScrapperLinksClientTest {

    private final String WIRE_MOCK_URL = "http://localhost:8080/";

    @Mock
    ApplicationConfig applicationConfig;

    @InjectMocks
    WebClientsBeanConfiguration webClientsBeanConfiguration;

    ScrapperLinksClient scrapperLinksClient;

    @BeforeEach
    void init() {
        Mockito.when(applicationConfig.scrapperUrl())
            .thenReturn(new ApplicationConfig.ApiUrl(WIRE_MOCK_URL, WIRE_MOCK_URL));
        scrapperLinksClient = webClientsBeanConfiguration.scrapperLinksClient();
    }

    @Test
    public void should_returnListsLinksResponse_when_getHttpStatus2xx() {
        stubFor(get("/links")
            .withHeader("Tg-Chat-Id", containing("1"))
            .willReturn(
                okJson("""
                    {
                        "links": [
                            {
                                "id": 1,
                                "url":"http://first/link"
                            },
                            {
                                "id": 2,
                                "url":"http://second/link"
                            }
                       ],
                       "size": 2
                    }"""
                )
                    .withStatus(200)
            )
        );

        ResponseEntity<ListLinksResponse> actualResponse = scrapperLinksClient.findTrackedLinks(1);
        ListLinksResponse expectedResponseBody = new ListLinksResponse(
            List.of(
                new LinkResponse(1, URI.create("http://first/link")),
                new LinkResponse(2, URI.create("http://second/link"))
            ),
            2
        );
        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actualResponse.getBody()).isEqualTo(expectedResponseBody);
    }

    @Test
    public void should_returnListResponse_when_postHttpStatus2xx() {
        stubFor(post("/links")
            .withHeader("Tg-Chat-Id", containing("1"))
            .willReturn(okJson("""
                    {
                        "id": 1,
                        "url": "http://my/link"
                    }"""
                )
                    .withStatus(200)
            )
        );

        ResponseEntity<LinkResponse> actualResponse =
            scrapperLinksClient.trackLink(1, new AddLinkRequest("http://my/link"));

        LinkResponse expectedResponseBody = new LinkResponse(1, URI.create("http://my/link"));
        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actualResponse.getBody()).isEqualTo(expectedResponseBody);
    }

    @Test
    public void should_returnLinkResponse_when_deleteHttpStatus2xx() {
        stubFor(delete("/links")
            .withHeader("Tg-Chat-Id", containing("1"))
            .willReturn(okJson("""
                    {
                        "id": 1,
                        "url": "http://my/link"
                    }"""
                )
                    .withStatus(200)
            )
        );

        ResponseEntity<LinkResponse> actualResponse =
            scrapperLinksClient.untrackLink(1, new RemoveLinkRequest("http://my/link"));

        LinkResponse expectedResponseBody = new LinkResponse(1, URI.create("http://my/link"));
        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actualResponse.getBody()).isEqualTo(expectedResponseBody);
    }

    @Test
    public void should_throwClientErrorException_when_httpStatus4xx() {
        //Arrange
        stubFor(get("/links")
            .withHeader("Tg-Chat-Id", containing("1"))
            .willReturn(
                okJson("""
                    {
                        "description": "some description",
                        "code": "400",
                        "exceptionName":"some exception",
                        "exceptionMessage": "some message",
                        "stacktrace":[
                            "frame1",
                            "frame2"
                        ]
                    }"""
                )
                    .withStatus(400)
            )
        );

        //Act, Assert
        ApiErrorResponse expectedApiErrorResponse = new ApiErrorResponse(
            "some description",
            "400",
            "some exception",
            "some message",
            List.of("frame1", "frame2")
        );
        ClientErrorException expectedException = new ClientErrorException(expectedApiErrorResponse);

        assertThatThrownBy(
            () -> scrapperLinksClient.findTrackedLinks(1)
        ).isInstanceOf(ClientErrorException.class)
            .isEqualTo(expectedException);
    }
}
