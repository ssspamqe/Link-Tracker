package edu.java.bot.scrapperconnection.restapi.controllers;

import edu.java.bot.scrapperconnection.dto.linkupdate.LinkUpdate;
import edu.java.bot.scrapperconnection.services.LinkUpdateService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bot/api/v1")
@RequiredArgsConstructor
public class BotController {

    private static final Logger LOGGER = LogManager.getLogger();

    private final LinkUpdateService linkUpdateService;

    @Operation(summary = "Send updates to bot",
               description = "Sends updated to bot for further processing and delivering to telegram clients")
    @PostMapping("/updates")
    public ResponseEntity<?> addUpdate(@Valid @RequestBody List<LinkUpdate> linkUpdates) {
        linkUpdateService.sendUpdatesToBot(linkUpdates);
        return ResponseEntity.ok().build();
    }
}
