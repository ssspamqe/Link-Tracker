/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgLsDir;

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
public class PgLsDirRecord extends TableRecordImpl<PgLsDirRecord> {

    private static final long serialVersionUID = 1L;

    public void setPgLsDir(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getPgLsDir() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgLsDirRecord() {
        super(PgLsDir.PG_LS_DIR);
    }

    @ConstructorProperties({ "pgLsDir" })
    public PgLsDirRecord(@Nullable String pgLsDir) {
        super(PgLsDir.PG_LS_DIR);

        setPgLsDir(pgLsDir);
        resetChangedOnNotNull();
    }

    public PgLsDirRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgLsDir value) {
        super(PgLsDir.PG_LS_DIR);

        if (value != null) {
            setPgLsDir(value.getPgLsDir());
            resetChangedOnNotNull();
        }
    }
}
