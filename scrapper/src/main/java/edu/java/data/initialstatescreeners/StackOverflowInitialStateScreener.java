package edu.java.data.initialstatescreeners;

import edu.java.configuration.global.ApplicationConfiguration;
import edu.java.configuration.services.trackableservices.AllTrackableServicesConfigurations;
import edu.java.configuration.services.trackableservices.TrackableServiceConfiguration;
import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dto.Link;
import edu.java.data.dto.StackOverflowQuestion;
import edu.java.linkupdatescheduler.exceptions.IncorrectHostException;
import edu.java.linkupdatescheduler.exceptions.UnsuccessfulStackOverflowQuestionUrlParseException;
import edu.java.webclients.stackoverflow.StackOverflowClient;
import edu.java.webclients.stackoverflow.dto.StackOverflowAnswerBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowQuestionBody;
import java.net.URI;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StackOverflowInitialStateScreener implements InitialStateScreener {

    private static final Pattern QUESTION_ID_EXCTRACTOR_PATTERN = Pattern.compile("questions/(\\d+)/");

    private final TrackableServiceConfiguration stackOverflowConfiguration;
    private final StackOverflowClient stackOverflowClient;
    private final StackOverflowQuestionDataAccessObject stackOverflowQuestionDao;

    public StackOverflowInitialStateScreener(
        @Qualifier("stackOverflowConfig")
        TrackableServiceConfiguration stackOverflowConfiguration,
        StackOverflowClient stackOverflowClient,
        StackOverflowQuestionDataAccessObject stackOverflowQuestionDao
    ){
        this.stackOverflowConfiguration = stackOverflowConfiguration;
        this.stackOverflowClient = stackOverflowClient;
        this.stackOverflowQuestionDao = stackOverflowQuestionDao;
    }

    @Override
    public void saveInitialState(Link link) throws IncorrectHostException {
        String hostName = link.getUrl().getHost();
        if (isIncorrectHostName(hostName)) {
            throw new IncorrectHostException(hostName);
        }

        long questionId = extractQuestionId(link.getUrl());
        var questionBody = stackOverflowClient.fetchQuestionById(questionId).items().getFirst();

        var question = buildQuestionEntity(questionBody, link.getId());

        stackOverflowQuestionDao.save(question);
    }

    private StackOverflowQuestion buildQuestionEntity(StackOverflowQuestionBody questionBody, long linkId) {
        long id = questionBody.id();
        String descriptionMd5Hash = questionBody.getMd5hash();
        Set<Long> answers = stackOverflowClient
            .fetchAnswersByQuestionId(id).items()
            .stream()
            .map(StackOverflowAnswerBody::id)
            .collect(Collectors.toSet());

        return new StackOverflowQuestion(
            id,
            linkId,
            descriptionMd5Hash,
            answers
        );
    }

    private boolean isIncorrectHostName(String hostName) {
        return !stackOverflowConfiguration.isCorrectHostName(hostName);
    }

    private long extractQuestionId(URI url) {
        Matcher matcher = QUESTION_ID_EXCTRACTOR_PATTERN.matcher(url.toString());
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        } else {
            throw new UnsuccessfulStackOverflowQuestionUrlParseException(url);
        }
    }
}
