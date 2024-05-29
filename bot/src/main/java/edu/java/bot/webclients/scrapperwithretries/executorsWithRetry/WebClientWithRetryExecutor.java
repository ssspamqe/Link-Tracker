package edu.java.bot.webclients.scrapperwithretries.executorsWithRetry;

public interface WebClientWithRetryExecutor {

    ExecutorWithRetry getExecutorWithRetry();

    void setExecutorWithRetry(ExecutorWithRetry executorWithRetry);
}
