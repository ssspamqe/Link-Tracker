package edu.java.bot.telegrambot.slashcommandservices;

import edu.java.bot.configuration.scrapperconfiguration.ScrapperConfiguration;
import edu.java.bot.telegrambot.slashcommandservices.slashcommands.ListSlashCommand;
import edu.java.bot.telegrambot.slashcommandservices.slashcommands.StartSlashCommand;
import edu.java.bot.telegrambot.slashcommandservices.slashcommands.TrackSlashCommand;
import edu.java.bot.telegrambot.slashcommandservices.slashcommands.UntrackSlashCommand;
import edu.java.bot.webclients.scrapper.basic.ScrapperLinksClient;
import edu.java.bot.webclients.scrapper.basic.ScrapperTelegramChatClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfigurations {

    private final ScrapperConfiguration scrapperConfiguration;

    @Bean
    public ListSlashCommand listSlashCommand(ScrapperLinksClient scrapperLinksClient) {
        return new ListSlashCommand(scrapperLinksClient, scrapperConfiguration.requestTimeout());
    }

    @Bean
    public StartSlashCommand startSlashCommand(ScrapperTelegramChatClient scrapperTelegramChatClient) {
        return new StartSlashCommand(scrapperTelegramChatClient, scrapperConfiguration.requestTimeout());
    }

    @Bean
    public TrackSlashCommand trackSlashCommand(ScrapperLinksClient scrapperLinksClient) {
        return new TrackSlashCommand(scrapperLinksClient, scrapperConfiguration.requestTimeout());
    }

    @Bean
    public UntrackSlashCommand untrackSlashCommand(ScrapperLinksClient scrapperLinksClient) {
        return new UntrackSlashCommand(scrapperLinksClient, scrapperConfiguration.requestTimeout());
    }
}
