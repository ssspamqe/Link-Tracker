package edu.java.data.dao.interfaces;

import edu.java.data.dto.Link;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.Set;

public interface LinkDataAccessObject {

    Optional<Link> findByUrl(URI url);

    Optional<Link> findById(long id);

    Link saveOrFindByUrl(URI url);

    Set<Link> findByLastCheckedAtBefore(OffsetDateTime borderDateTime);

    Set<Long> findAssociatedChatsIdsByLinkId(long id);

    void updateLastCheckedAtById(OffsetDateTime lastChecked, long id);
}
