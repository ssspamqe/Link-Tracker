/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgConfig;

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
public class PgConfigRecord extends TableRecordImpl<PgConfigRecord> {

    private static final long serialVersionUID = 1L;

    public void setName(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getName() {
        return (String) get(0);
    }

    public void setSetting(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getSetting() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgConfigRecord() {
        super(PgConfig.PG_CONFIG);
    }

    @ConstructorProperties({ "name", "setting" })
    public PgConfigRecord(@Nullable String name, @Nullable String setting) {
        super(PgConfig.PG_CONFIG);

        setName(name);
        setSetting(setting);
        resetChangedOnNotNull();
    }

    public PgConfigRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgConfig value) {
        super(PgConfig.PG_CONFIG);

        if (value != null) {
            setName(value.getName());
            setSetting(value.getSetting());
            resetChangedOnNotNull();
        }
    }
}
