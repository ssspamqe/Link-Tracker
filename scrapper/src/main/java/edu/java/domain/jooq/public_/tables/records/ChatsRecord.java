/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables.records;


import edu.java.domain.jooq.public_.tables.Chats;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ChatsRecord extends TableRecordImpl<ChatsRecord> {

    private static final long serialVersionUID = 1L;

    public void setId(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getId() {
        return (Long) get(0);
    }

    public void setCreatedAt(@NotNull OffsetDateTime value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public ChatsRecord() {
        super(Chats.CHATS);
    }

    @ConstructorProperties({ "id", "createdAt" })
    public ChatsRecord(@NotNull Long id, @NotNull OffsetDateTime createdAt) {
        super(Chats.CHATS);

        setId(id);
        setCreatedAt(createdAt);
        resetChangedOnNotNull();
    }

    public ChatsRecord(edu.java.domain.jooq.public_.tables.pojos.Chats value) {
        super(Chats.CHATS);

        if (value != null) {
            setId(value.getId());
            setCreatedAt(value.getCreatedAt());
            resetChangedOnNotNull();
        }
    }
}
