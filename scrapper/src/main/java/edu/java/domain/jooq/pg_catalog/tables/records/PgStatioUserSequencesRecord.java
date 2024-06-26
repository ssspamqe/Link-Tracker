/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatioUserSequences;

import java.beans.ConstructorProperties;

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
public class PgStatioUserSequencesRecord extends TableRecordImpl<PgStatioUserSequencesRecord> {

    private static final long serialVersionUID = 1L;

    public void setRelid(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getRelid() {
        return (Long) get(0);
    }

    public void setSchemaname(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getSchemaname() {
        return (String) get(1);
    }

    public void setRelname(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getRelname() {
        return (String) get(2);
    }

    public void setBlksRead(@Nullable Long value) {
        set(3, value);
    }

    @Nullable
    public Long getBlksRead() {
        return (Long) get(3);
    }

    public void setBlksHit(@Nullable Long value) {
        set(4, value);
    }

    @Nullable
    public Long getBlksHit() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatioUserSequencesRecord() {
        super(PgStatioUserSequences.PG_STATIO_USER_SEQUENCES);
    }

    @ConstructorProperties({ "relid", "schemaname", "relname", "blksRead", "blksHit" })
    public PgStatioUserSequencesRecord(@Nullable Long relid, @Nullable String schemaname, @Nullable String relname, @Nullable Long blksRead, @Nullable Long blksHit) {
        super(PgStatioUserSequences.PG_STATIO_USER_SEQUENCES);

        setRelid(relid);
        setSchemaname(schemaname);
        setRelname(relname);
        setBlksRead(blksRead);
        setBlksHit(blksHit);
        resetChangedOnNotNull();
    }

    public PgStatioUserSequencesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatioUserSequences value) {
        super(PgStatioUserSequences.PG_STATIO_USER_SEQUENCES);

        if (value != null) {
            setRelid(value.getRelid());
            setSchemaname(value.getSchemaname());
            setRelname(value.getRelname());
            setBlksRead(value.getBlksRead());
            setBlksHit(value.getBlksHit());
            resetChangedOnNotNull();
        }
    }
}
