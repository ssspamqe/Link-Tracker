package edu.java.restapi.links.controllers;

import edu.java.restapi.links.dto.requests.AddLinkRequest;
import edu.java.restapi.links.dto.requests.RemoveLinkRequest;
import edu.java.restapi.exceptionhandlers.ApiErrorResponse;
import edu.java.restapi.links.dto.responses.LinkResponse;
import edu.java.restapi.links.dto.responses.ListLinksResponse;
import edu.java.restapi.links.services.LinkService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import java.net.URI;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrapper/api/v1/links")
public class LinkController {

    private static final Logger LOGGER = LogManager.getLogger();

    private final LinkService linkService;

    @Autowired
    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @Operation(summary = "Get all tracked links by specified chat",
               description = "Returns a list of links, that a tracked by chat with specified id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully returned tracked links"),
        @ApiResponse(responseCode = "400", description = "Retrieved data is not correct", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
        }),
        @ApiResponse(responseCode = "404", description = "There is no saved chat with such id", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
        })
    })
    @GetMapping
    public ResponseEntity<ListLinksResponse> getTrackedLinksByChatId(
        @RequestHeader("Tg-Chat-Id") @Min(1) int chatApiId
    ) {
        List<LinkResponse> trackedLinks =
            linkService.getTrackedLinks(chatApiId).stream().map(LinkResponse::new).toList();
        ListLinksResponse listLinksResponse = new ListLinksResponse(trackedLinks, trackedLinks.size());
        return ResponseEntity.ok(listLinksResponse);
    }

    @Operation(summary = "Track link",
               description =
                   "Creates relation between passed chatId and link, sending LinkUpdates to chatId via scheduler")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully tracked link"),
        @ApiResponse(responseCode = "400", description = "Retrieved data is not correct", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
        }),
        @ApiResponse(responseCode = "404", description = "There is no saved chat with such id", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
        })
    })
    @PostMapping
    public ResponseEntity<LinkResponse> trackLink(
        @RequestHeader("Tg-Chat-Id") @Min(1) int chatId,
        @Valid @RequestBody AddLinkRequest addLinkRequest
    ) {
        URI linkUrl = URI.create(addLinkRequest.url());
        LinkResponse linkResponse = new LinkResponse(linkService.addLinkToTrack(chatId, linkUrl));
        return ResponseEntity.ok(linkResponse);
    }

    @Operation(summary = "Untrack link",
               description =
                   "Removes relation between passed chatId and link, "
                       + "stopping sending LinkUpdates to chatId via scheduler")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully untracked link"),
        @ApiResponse(responseCode = "400", description = "Retrieved data is not correct", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
        }),
        @ApiResponse(responseCode = "404", description = "There is no saved chat with such id", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
        })
    })
    @DeleteMapping
    public ResponseEntity<LinkResponse> untrackLink(
        @RequestHeader("Tg-Chat-Id") @Min(1) int chatId,
        @Valid @RequestBody RemoveLinkRequest removeLinkRequest
    ) {
        URI linkUrl = URI.create(removeLinkRequest.url());
        LinkResponse linkResponse = new LinkResponse(linkService.untrackLink(chatId, linkUrl));
        return ResponseEntity.ok(linkResponse);
    }

}
