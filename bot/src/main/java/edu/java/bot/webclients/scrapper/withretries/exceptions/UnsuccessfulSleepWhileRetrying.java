package edu.java.bot.webclients.scrapper.withretries.exceptions;

public class UnsuccessfulSleepWhileRetrying extends RuntimeException{
    public UnsuccessfulSleepWhileRetrying(InterruptedException exception){
        super(exception);
    }
}
