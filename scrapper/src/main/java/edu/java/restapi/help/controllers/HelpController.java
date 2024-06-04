package edu.java.restapi.help.controllers;

import edu.java.restapi.exceptionhandlers.ApiErrorResponse;
import edu.java.restapi.help.dto.responses.ListTrackableServiceUserInformationResponse;
import edu.java.restapi.help.services.HelpService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("scrapper/api/v1/help")
@RequiredArgsConstructor
public class HelpController {

    private final HelpService helpService;

    @Operation(summary = "Get info about trackable services",
               description = "Returns a list of all trackable services information, " +
                   "including Service name, Host name, some Tip, and Examples of links")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully returned trackable services information"),
    })
    @GetMapping("/trackable-services")
    public ResponseEntity<ListTrackableServiceUserInformationResponse> getTrackableServices() {
        var list = helpService.getListTrackableServiceUserInformation();
        return ResponseEntity.ok(list);
    }

}
