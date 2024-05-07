package edu.java.restapi.controllers;

import edu.java.restapi.dto.responses.ApiErrorResponse;
import edu.java.restapi.services.TelegramChatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrapper/api/v1/tg-chat")
public class TelegramChatController {

    private final TelegramChatService chatService;

    @Autowired
    public TelegramChatController(TelegramChatService chatService) {
        this.chatService = chatService;
    }

    @Operation(summary = "Register chat",
               description = "Registers and saves chat with given id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully registered chat by id"),
        @ApiResponse(responseCode = "400", description = "Retrieved data is not correct", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
        })
    })
    @PostMapping("/{id}")
    public ResponseEntity<?> registerChat(@PathVariable @Min(1) long id) {
        chatService.registerChat(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete chat",
               description = "Deletes chat and all it's relations with links")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully registered chat by id"),
        @ApiResponse(responseCode = "400", description = "Retrieved data is not correct", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
        }),
        @ApiResponse(responseCode = "404", description = "No record about chat with such id", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
        }),
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteChat(@PathVariable @Min(1) long id) {
        chatService.deleteChat(id);
        return ResponseEntity.ok().build();
    }
}
