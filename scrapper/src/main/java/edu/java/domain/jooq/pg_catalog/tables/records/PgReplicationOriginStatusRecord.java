/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgReplicationOriginStatus;

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
public class PgReplicationOriginStatusRecord extends TableRecordImpl<PgReplicationOriginStatusRecord> {

    private static final long serialVersionUID = 1L;

    public void setLocalId(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getLocalId() {
        return (Long) get(0);
    }

    public void setExternalId(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getExternalId() {
        return (String) get(1);
    }

    @Deprecated
    public void setRemoteLsn(@Nullable Object value) {
        set(2, value);
    }

    @Deprecated
    @Nullable
    public Object getRemoteLsn() {
        return get(2);
    }

    @Deprecated
    public void setLocalLsn(@Nullable Object value) {
        set(3, value);
    }

    @Deprecated
    @Nullable
    public Object getLocalLsn() {
        return get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgReplicationOriginStatusRecord() {
        super(PgReplicationOriginStatus.PG_REPLICATION_ORIGIN_STATUS);
    }

    @ConstructorProperties({ "localId", "externalId", "remoteLsn", "localLsn" })
    public PgReplicationOriginStatusRecord(@Nullable Long localId, @Nullable String externalId, @Nullable Object remoteLsn, @Nullable Object localLsn) {
        super(PgReplicationOriginStatus.PG_REPLICATION_ORIGIN_STATUS);

        setLocalId(localId);
        setExternalId(externalId);
        setRemoteLsn(remoteLsn);
        setLocalLsn(localLsn);
        resetChangedOnNotNull();
    }

    public PgReplicationOriginStatusRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgReplicationOriginStatus value) {
        super(PgReplicationOriginStatus.PG_REPLICATION_ORIGIN_STATUS);

        if (value != null) {
            setLocalId(value.getLocalId());
            setExternalId(value.getExternalId());
            setRemoteLsn(value.getRemoteLsn());
            setLocalLsn(value.getLocalLsn());
            resetChangedOnNotNull();
        }
    }
}