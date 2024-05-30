package edu.java.bot.webclients.scrapper.basic;

import edu.java.bot.webclients.scrapper.basic.dto.responses.TrackableServiceInformationBatch;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Mono;

@HttpExchange(url = "/help")
public interface ScrapperHelpClient {

    @GetExchange(url = "/trackable-services")
    Mono<TrackableServiceInformationBatch> fetchTrackableServicesInformation();

}
