package edu.java.bot.webclients.scrapper;

import edu.java.bot.webclients.scrapper.dto.requests.AddLinkRequest;
import edu.java.bot.webclients.scrapper.dto.requests.RemoveLinkRequest;
import edu.java.bot.webclients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webclients.scrapper.dto.responses.ListLinksResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import reactor.core.publisher.Mono;

@HttpExchange(url = "/links")
public interface ScrapperLinksClient {

    @GetExchange
    Mono<ListLinksResponse> fetchTrackedLinksByChatId(@RequestHeader("Tg-Chat-Id") long chatId);

    @PostExchange
    Mono<LinkResponse> trackLinkByChatId(
        @RequestBody AddLinkRequest addLinkRequest,
        @RequestHeader("Tg-Chat-Id") long chatId
    );

    @DeleteExchange
    Mono<LinkResponse> untrackLinkByChatId(
        @RequestBody RemoveLinkRequest removeLinkRequest,
        @RequestHeader("Tg-Chat-Id") long chatId
    );
}

