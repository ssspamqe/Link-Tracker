/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetWalResourceManagers;

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
public class PgGetWalResourceManagersRecord extends TableRecordImpl<PgGetWalResourceManagersRecord> {

    private static final long serialVersionUID = 1L;

    public void setRmId(@Nullable Integer value) {
        set(0, value);
    }

    @Nullable
    public Integer getRmId() {
        return (Integer) get(0);
    }

    public void setRmName(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getRmName() {
        return (String) get(1);
    }

    public void setRmBuiltin(@Nullable Boolean value) {
        set(2, value);
    }

    @Nullable
    public Boolean getRmBuiltin() {
        return (Boolean) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgGetWalResourceManagersRecord() {
        super(PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS);
    }

    @ConstructorProperties({ "rmId", "rmName", "rmBuiltin" })
    public PgGetWalResourceManagersRecord(@Nullable Integer rmId, @Nullable String rmName, @Nullable Boolean rmBuiltin) {
        super(PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS);

        setRmId(rmId);
        setRmName(rmName);
        setRmBuiltin(rmBuiltin);
        resetChangedOnNotNull();
    }

    public PgGetWalResourceManagersRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGetWalResourceManagers value) {
        super(PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS);

        if (value != null) {
            setRmId(value.getRmId());
            setRmName(value.getRmName());
            setRmBuiltin(value.getRmBuiltin());
            resetChangedOnNotNull();
        }
    }
}
