package edu.java.restapi.help.dto.responses.mappers;

import edu.java.configuration.services.trackableservices.TrackableServiceUserInformation;
import edu.java.restapi.help.dto.responses.TrackableServiceUserInformationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TrackableServiceUserInformationMapper {
    TrackableServiceUserInformationResponse toApiResponse(TrackableServiceUserInformation userInformation);
}
