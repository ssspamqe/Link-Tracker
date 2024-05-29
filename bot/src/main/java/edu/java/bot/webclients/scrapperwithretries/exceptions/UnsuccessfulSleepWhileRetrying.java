package edu.java.bot.webclients.scrapperwithretries.exceptions;

public class UnsuccessfulSleepWhileRetrying extends RuntimeException{
    public UnsuccessfulSleepWhileRetrying(InterruptedException exception){
        super(exception);
    }
}
