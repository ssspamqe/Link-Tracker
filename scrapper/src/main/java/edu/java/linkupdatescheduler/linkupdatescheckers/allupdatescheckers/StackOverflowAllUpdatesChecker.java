package edu.java.linkupdatescheduler.linkupdatescheckers.allupdatescheckers;

import edu.java.configuration.global.ApplicationConfiguration;
import edu.java.configuration.services.trackableservices.TrackableServiceConfiguration;
import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dto.Link;
import edu.java.data.dto.StackOverflowQuestion;
import edu.java.data.exceptions.NoSuchStackOverflowQuestionException;
import edu.java.linkupdatescheduler.exceptions.IncorrectHostException;
import edu.java.linkupdatescheduler.exceptions.UnsuccessfulStackOverflowQuestionUrlParseException;
import edu.java.linkupdatescheduler.linkupdatescheckers.singleupdatecheckers.stackoverflow.StackOverflowQuestionSingleUpdateChecker;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdate;
import edu.java.telegrambotconnection.dto.linkupdatedto.LinkUpdateType;
import edu.java.webclients.stackoverflow.StackOverflowClient;
import edu.java.webclients.stackoverflow.dto.StackOverflowAnswerBody;
import edu.java.webclients.stackoverflow.dto.StackOverflowQuestionBody;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StackOverflowAllUpdatesChecker implements LinkAllUpdatesChecker {

    private static final Pattern QUESTION_ID_EXCTRACTOR_PATTERN = Pattern.compile("questions/(\\d+)/");

    private final LinkDataAccessObject linkDao;
    private final StackOverflowQuestionDataAccessObject stackOverflowQuestionDao;
    private final StackOverflowClient stackOverflowClient;
    private final List<StackOverflowQuestionSingleUpdateChecker> updateCheckers;
    private final TrackableServiceConfiguration stackOverflowConfiguration;

    public StackOverflowAllUpdatesChecker(
        LinkDataAccessObject linkDao,
        StackOverflowQuestionDataAccessObject stackOverflowQuestionDao,
        StackOverflowClient stackOverflowClient,
        List<StackOverflowQuestionSingleUpdateChecker> updateCheckers,
        @Qualifier("stackOverflowConfig")
        TrackableServiceConfiguration stackOverflowConfiguration
    ) {
        this.linkDao = linkDao;
        this.stackOverflowQuestionDao = stackOverflowQuestionDao;
        this.stackOverflowClient = stackOverflowClient;
        this.updateCheckers = updateCheckers;
        this.stackOverflowConfiguration = stackOverflowConfiguration;
    }

    @Override
    public List<LinkUpdate> getUpdates(Link link) throws IncorrectHostException {
        String hostName = link.getUrl().getHost();
        if (isIncorrectHostName(hostName)) {
            throw new IncorrectHostException(hostName);
        }

        long questionId = extractQuestionId(link.getUrl());
        StackOverflowQuestionBody currentQuestionBody =
            stackOverflowClient.fetchQuestionById(questionId).items().getFirst();
        StackOverflowQuestion oldQuestionRecord = stackOverflowQuestionDao.findById(questionId)
            .orElseThrow(
                () -> new NoSuchStackOverflowQuestionException(STR."There is no question with id \{questionId}")
            );

        List<LinkUpdateType> detectedUpdatesTypes =
            iterateAllSingleUpdateCheckers(oldQuestionRecord, currentQuestionBody);

        if (!detectedUpdatesTypes.isEmpty()) {
            updateLocalRecord(currentQuestionBody, link.getId());
        }

        return buildLinkUpdateList(link, detectedUpdatesTypes);
    }

    private List<LinkUpdate> buildLinkUpdateList(Link link, List<LinkUpdateType> updateTypes) {
        Set<Long> chatIds = linkDao.findAssociatedChatsIdsByLinkId(link.getId());
        return updateTypes.stream()
            .map(type ->
                new LinkUpdate(
                    link.getId(),
                    link.getUrl(),
                    type,
                    chatIds
                )
            )
            .toList();
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

    private List<LinkUpdateType> iterateAllSingleUpdateCheckers(
        StackOverflowQuestion oldQuestionRecord,
        StackOverflowQuestionBody currentQuestionBody
    ) {
        List<LinkUpdateType> linkUpdateTypes = new ArrayList<>();
        for (var updateChecker : updateCheckers) {
            if (updateChecker.hasUpdate(oldQuestionRecord, currentQuestionBody)) {
                linkUpdateTypes.add(updateChecker.getType());
            }
        }
        return linkUpdateTypes;
    }

    private void updateLocalRecord(StackOverflowQuestionBody newQuestionBody, long linkId) {
        long id = newQuestionBody.id();
        String descriptionMd5Hash = newQuestionBody.getMd5hash();
        Set<Long> answersIds =
            stackOverflowClient
                .fetchAnswersByQuestionId(id)
                .items().stream()
                .map(StackOverflowAnswerBody::id)
                .collect(Collectors.toSet());

        StackOverflowQuestion updatedQuestion = new StackOverflowQuestion(
            id,
            linkId,
            descriptionMd5Hash,
            answersIds
        );
        stackOverflowQuestionDao.update(updatedQuestion);
    }
}
