package edu.java.bot.webclients.scrapper;

import edu.java.bot.webclients.scrapper.dto.responses.TrackableServiceInformationBatch;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "/help")
public interface ScrapperHelpClient {

    @GetExchange(url = "/trackable-services")
    TrackableServiceInformationBatch fetchTrackableServicesInformation();

}
