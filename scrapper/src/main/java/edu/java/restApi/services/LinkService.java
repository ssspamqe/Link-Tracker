package edu.java.restApi.services;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.initialStateScreeners.UniversalInitialStateScreener;
import edu.java.data.dto.Link;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkService {

    private final ChatDataAccessObject chatDao;
    private final UniversalInitialStateScreener firstStateScreener;

    public Set<Link> getTrackedLinks(long chatApiId) {
        return chatDao.getTrackedLinksByChatId(chatApiId);
    }

    public Link addLinkToTrack(long chatApiId, String linkUrl) {
        return chatDao.associateUrlByChatId(linkUrl, chatApiId);
    }

    public Link untrackLink(long chatApiId, String linkUrl) {
        return chatDao.dissociateUrlByChatId(linkUrl, chatApiId);
    }
}
