package edu.java.bot.telegrambot.slashcommandservices.exceptions.internalexceptions.scrapper;

public class CantFetchDataFromScrapper extends ScrapperException {
    public CantFetchDataFromScrapper(String message){
        super(message);
    }

    public CantFetchDataFromScrapper(){
        super("Can't fetch any data from Scrapper service (is the connection still available?)");
    }
}
