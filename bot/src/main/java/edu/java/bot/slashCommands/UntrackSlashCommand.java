package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UntrackSlashCommand implements ParameterizedExecutableSlashCommand, NoParametersExecutableSlashCommand {

    private static final String TEXT_COMMAND = "/unrack";
    private static final String DESCRIPTION = "Stop tracking updates from given link";
    private static final String INIT_REQUEST_MESSAGE = "Reply to this message with link to /untrack it!";
    private static final String NO_SUCH_SUBSCRIPTION_RESPONSE = "You don't have such subscription";
    private static final String SUCCESSFULLY_UNTRACKED_RESPONSE = "/unrack command succeed!";

    private static final boolean NEED_ADDITIONAL_USER_PARAMETERS = true;

    private final SubscriptionRepository subscriptionRepository;
    private final Validator validator;

    @Autowired
    public UntrackSlashCommand(SubscriptionRepository subscriptionRepository, Validator validator) {
        this.subscriptionRepository = subscriptionRepository;
        this.validator = validator;
    }

    @Override
    public String getTextCommand() {
        return TEXT_COMMAND;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public String executeAndGetResponse() {
        return INIT_REQUEST_MESSAGE;
    }

    @Override
    public String executeWithParametersAndGetResponse(Message message) {
        Long userId = message.from().id();
        String link = message.text();
        Subscription subscriptionToDelete = new Subscription(0L, userId, link);

        var triggeredViolations = validator.validate(subscriptionToDelete);
        if (!triggeredViolations.isEmpty()) {
            return getErrorResponse(triggeredViolations);
        }

        var userSubscriptions = subscriptionRepository.findAllByUserId(userId);
        Optional<Subscription> oldSubscription =
            userSubscriptions.stream()
                .filter(
                    subscription -> link.equals(subscription.getLink())
                ).findFirst();
        if (oldSubscription.isEmpty()) {
            return NO_SUCH_SUBSCRIPTION_RESPONSE;
        }

        subscriptionRepository.deleteById(oldSubscription.get().getId());
        return SUCCESSFULLY_UNTRACKED_RESPONSE;
    }

    private String getErrorResponse(Set<ConstraintViolation<Subscription>> violations) {
        var violationList = violations.stream().toList();

        StringBuilder response = new StringBuilder();
        response.append("Can't /untrack link because:\n");
        for (int i = 0; i < violationList.size(); i++) {
            response.append(STR."\{i + 1}) \{violationList.get(i).getMessage()}");
        }

        return response.toString();
    }

    @Override
    public BotCommand getBotCommand() {
        return new BotCommand(TEXT_COMMAND, DESCRIPTION);
    }

    @Override
    public boolean needAdditionalUserParameter() {
        return NEED_ADDITIONAL_USER_PARAMETERS;
    }
}
