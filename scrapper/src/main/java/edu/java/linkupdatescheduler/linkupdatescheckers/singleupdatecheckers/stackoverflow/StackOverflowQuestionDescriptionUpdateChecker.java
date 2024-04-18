package edu.java.linkupdatescheduler.linkupdatescheckers.singleupdatecheckers.stackoverflow;

import edu.java.data.dto.StackOverflowQuestion;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdateType;
import edu.java.webclients.stackoverflow.dto.StackOverflowQuestionBody;
import org.springframework.stereotype.Component;

@Component
public class StackOverflowQuestionDescriptionUpdateChecker implements StackOverflowQuestionSingleUpdateChecker {
    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.STACK_OVERFLOW_DESCRIPTION;
    }

    @Override
    public boolean hasUpdate(StackOverflowQuestion oldState, StackOverflowQuestionBody newState) {
        String oldHash = oldState.getDescriptionMd5Hash();
        String newHash = newState.getMd5hash();
        return !oldHash.equalsIgnoreCase(newHash);
    }
}
