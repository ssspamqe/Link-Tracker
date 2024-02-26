package edu.java.bot.webClients.scrapper;

import edu.java.bot.webClients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webClients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webClients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webClients.scrapper.dto.responses.ListLinksResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange(url = "/links")
public interface ScrapperLinksClient {

    @GetExchange
    ResponseEntity<ListLinksResponse> findTrackedLinks(@RequestHeader("Tg-Chat-Id") int chatId);

    @PostExchange
    ResponseEntity<LinkResponse> trackLink(
        @RequestHeader("Tg-Chat-Id") int chatId,
        @RequestBody AddLinkRequest addLinkRequest
    );

    @DeleteExchange
    ResponseEntity<LinkResponse> untrackLink(
        @RequestHeader("Tg-Chat-Id") int chatId,
        @RequestBody RemoveLinkRequest removeLinkRequest
    );
}

