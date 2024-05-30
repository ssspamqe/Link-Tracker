package edu.java.bot.webclients.scrapper.basic;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import reactor.core.publisher.Mono;

@HttpExchange("/tg-chat")
public interface ScrapperTelegramChatClient {

    @PostExchange(url = "/{id}")
    Mono<Void> registerNewChat(@PathVariable long id);

    @DeleteExchange(url = "/{id}")
    Mono<Void> deleteChat(@PathVariable long id);
}
