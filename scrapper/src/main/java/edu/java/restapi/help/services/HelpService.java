package edu.java.restapi.help.services;

import edu.java.configuration.services.trackableservices.TrackableServiceConfiguration;
import edu.java.restapi.help.dto.responses.ListTrackableServiceUserInformationResponse;
import edu.java.restapi.help.dto.responses.TrackableServiceUserInformationResponse;
import edu.java.restapi.help.dto.responses.mappers.TrackableServiceUserInformationMapper;
import jakarta.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelpService {

    private final List<TrackableServiceConfiguration> trackableServiceConfigurations;
    private final TrackableServiceUserInformationMapper userInformationMapper;

    private ListTrackableServiceUserInformationResponse trackableServicesResponse;

    @PostConstruct
    void init() {
        List<TrackableServiceUserInformationResponse> userInformationList = new LinkedList<>();
        trackableServiceConfigurations.forEach(serviceConfiguration -> {
            var userInformation = serviceConfiguration.getUserInformation();
            var userInformationResponse = userInformationMapper.toApiResponse(userInformation);
            userInformationList.add(userInformationResponse);
        });

        trackableServicesResponse =
            new ListTrackableServiceUserInformationResponse(userInformationList, userInformationList.size());
    }

    public ListTrackableServiceUserInformationResponse getListTrackableServiceUserInformation() {
        return trackableServicesResponse;
    }

}
