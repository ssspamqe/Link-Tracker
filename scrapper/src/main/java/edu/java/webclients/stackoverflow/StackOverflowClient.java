package edu.java.webclients.stackoverflow;

import edu.java.webclients.stackoverflow.dto.StackOverflowAnswerBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowQuestionBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface StackOverflowClient {
    @GetExchange(url = "/questions/{id}?site=stackoverflow&filter=withbody")
    StackOverflowResponseBody<StackOverflowQuestionBody> fetchQuestionById(@PathVariable long id);

    @GetExchange(url = "/questions/{id}/answers?site=stackoverflow&filter=withbody")
    StackOverflowResponseBody<StackOverflowAnswerBody> fetchAnswersByQuestionId(@PathVariable long id);

}
