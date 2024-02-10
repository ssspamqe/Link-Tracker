package edu.java.bot.data.repositories;

import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.exceptions.DatabaseIsFullException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HashMapSubscriptionRepository extends HashMapRepository<Subscription, Long>
    implements SubscriptionRepository {
    @Override
    public List<Subscription> findAllByUserId(long userId) {
        return database.values()
            .stream().
            filter(subscription -> subscription.getUserId() == userId)
            .toList();
    }

    @Override
    public void save(Subscription subscription) {
        Long id = subscription.getId();
        if (id == 0) {
            id = getFreeId();
        }
        subscription.setId(id);
        database.put(id, subscription);
    }

    private long getFreeId() {
        for (long i = 1L; i < Math.pow(10, 18); i++) {
            if (database.get(i) == null) {
                return i;
            }
        }
        throw new DatabaseIsFullException();
    }
}