/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgLsArchiveStatusdir;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLsArchiveStatusdirRecord extends TableRecordImpl<PgLsArchiveStatusdirRecord> {

    private static final long serialVersionUID = 1L;

    public void setName(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getName() {
        return (String) get(0);
    }

    public void setSize(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getSize() {
        return (Long) get(1);
    }

    public void setModification(@Nullable OffsetDateTime value) {
        set(2, value);
    }

    @Nullable
    public OffsetDateTime getModification() {
        return (OffsetDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgLsArchiveStatusdirRecord() {
        super(PgLsArchiveStatusdir.PG_LS_ARCHIVE_STATUSDIR);
    }

    @ConstructorProperties({ "name", "size", "modification" })
    public PgLsArchiveStatusdirRecord(@Nullable String name, @Nullable Long size, @Nullable OffsetDateTime modification) {
        super(PgLsArchiveStatusdir.PG_LS_ARCHIVE_STATUSDIR);

        setName(name);
        setSize(size);
        setModification(modification);
        resetChangedOnNotNull();
    }

    public PgLsArchiveStatusdirRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgLsArchiveStatusdir value) {
        super(PgLsArchiveStatusdir.PG_LS_ARCHIVE_STATUSDIR);

        if (value != null) {
            setName(value.getName());
            setSize(value.getSize());
            setModification(value.getModification());
            resetChangedOnNotNull();
        }
    }
}