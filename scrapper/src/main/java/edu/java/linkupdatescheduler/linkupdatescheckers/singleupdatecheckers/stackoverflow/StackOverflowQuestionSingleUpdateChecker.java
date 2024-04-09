package edu.java.linkupdatescheduler.linkupdatescheckers.singleupdatecheckers.stackoverflow;

import edu.java.data.dto.StackOverflowQuestion;
import edu.java.linkupdatescheduler.linkupdatescheckers.singleupdatecheckers.SingleUpdateChecker;
import edu.java.webclients.stackoverflow.dto.StackOverflowQuestionBody;

public interface StackOverflowQuestionSingleUpdateChecker
    extends SingleUpdateChecker<StackOverflowQuestion, StackOverflowQuestionBody> {
}
