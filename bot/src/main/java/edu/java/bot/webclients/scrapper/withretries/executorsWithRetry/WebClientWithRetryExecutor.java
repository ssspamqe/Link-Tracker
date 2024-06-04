package edu.java.bot.webclients.scrapper.withretries.executorsWithRetry;

public interface WebClientWithRetryExecutor {

    ExecutorWithRetry getExecutorWithRetry();

    void setExecutorWithRetry(ExecutorWithRetry executorWithRetry);
}
