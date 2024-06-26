/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatGetBackendIdset;

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
public class PgStatGetBackendIdsetRecord extends TableRecordImpl<PgStatGetBackendIdsetRecord> {

    private static final long serialVersionUID = 1L;

    public void setPgStatGetBackendIdset(@Nullable Integer value) {
        set(0, value);
    }

    @Nullable
    public Integer getPgStatGetBackendIdset() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatGetBackendIdsetRecord() {
        super(PgStatGetBackendIdset.PG_STAT_GET_BACKEND_IDSET);
    }

    @ConstructorProperties({ "pgStatGetBackendIdset" })
    public PgStatGetBackendIdsetRecord(@Nullable Integer pgStatGetBackendIdset) {
        super(PgStatGetBackendIdset.PG_STAT_GET_BACKEND_IDSET);

        setPgStatGetBackendIdset(pgStatGetBackendIdset);
        resetChangedOnNotNull();
    }

    public PgStatGetBackendIdsetRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatGetBackendIdset value) {
        super(PgStatGetBackendIdset.PG_STAT_GET_BACKEND_IDSET);

        if (value != null) {
            setPgStatGetBackendIdset(value.getPgStatGetBackendIdset());
            resetChangedOnNotNull();
        }
    }
}
