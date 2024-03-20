package edu.java.data.dao.jooq.dao;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.jooq.repositories.JooqChatLinksRepository;
import edu.java.data.dao.jooq.repositories.JooqChatRepository;
import edu.java.data.dto.Chat;
import edu.java.data.dto.ChatLink;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.DoubleChatRegistrationException;
import edu.java.data.exceptions.NoSuchChatException;
import edu.java.data.exceptions.NoSuchLinkException;
import java.net.URI;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class JooqChatDAO implements ChatDataAccessObject {

    private final JooqChatRepository chatRepository;
    private final JooqChatLinksRepository chatLinksRepository;
    private final JooqLinkDAO linkDao;

    public Optional<Chat> findById(long id) {
        return chatRepository.findById(id);
    }

    public Set<Link> getTrackedLinksByChatId(long id) {
        Chat chat = chatRepository.findById(id)
            .orElseThrow(() -> new NoSuchChatException(id));
        long chatId = chat.getId();

        return buildSetOfLinks(chatId);
    }

    private Set<Link> buildSetOfLinks(long chatId) {
        return chatLinksRepository.findByChatId(chatId)
            .stream()
            .map(chatLinkCouple -> {
                long linkId = chatLinkCouple.getLinkId();
                return linkDao.findById(linkId).orElseThrow(() -> new NoSuchLinkException(linkId));
            }).collect(Collectors.toSet());
    }

    public Link associateUrlByChatId(String url, long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }

        Link link = linkDao.saveOrFindByUrl(url);

        assignLinkToChat(link.getId(), chatId);
        return link;
    }

    private void assignLinkToChat(long linkId, long chatId) {
        ChatLink chatLinkCouple = new ChatLink(chatId, linkId);
        chatLinksRepository.save(chatLinkCouple);
    }

    public Link dissociateUrlByChatId(String url, long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }

        Link link = linkDao.findByUrl(url)
            .orElseThrow(() -> new NoSuchLinkException(URI.create(url)));

        chatLinksRepository.removeByChatIdAndLinkId(chatId, link.getId());
        return link;
    }

    public Chat registerChatWithId(long apiId) {
        Optional<Chat> oldChat = chatRepository.findById(apiId);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(apiId);
        }
        Chat newChat = new Chat(apiId);
        chatRepository.save(newChat);
        return newChat;
    }

    public void deleteChatWithId(long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }
        chatRepository.removeById(chatId);
    }

}