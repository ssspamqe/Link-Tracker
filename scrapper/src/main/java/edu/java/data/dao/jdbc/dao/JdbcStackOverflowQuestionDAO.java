package edu.java.data.dao.jdbc.dao;

import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dao.jdbc.repositories.JdbcStackOverflowQuestionRepository;
import edu.java.data.dto.StackOverflowQuestion;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class JdbcStackOverflowQuestionDAO implements StackOverflowQuestionDataAccessObject {

    private final JdbcStackOverflowQuestionRepository stackOverflowQuestionRepository;

    @Override
    public Optional<StackOverflowQuestion> findById(long id) {
        return stackOverflowQuestionRepository.findById(id);
    }

    @Override
    public Optional<StackOverflowQuestion> findByLinkId(long linkId) {
        return stackOverflowQuestionRepository.findByLinkId(linkId);
    }

    @Override
    public void update(StackOverflowQuestion question) {
        stackOverflowQuestionRepository.update(question);
    }

    @Override
    public void save(StackOverflowQuestion question) {
        stackOverflowQuestionRepository.save(question);
    }

}