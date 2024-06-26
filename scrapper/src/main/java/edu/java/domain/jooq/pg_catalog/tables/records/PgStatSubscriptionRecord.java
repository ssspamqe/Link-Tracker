/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatSubscription;

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
public class PgStatSubscriptionRecord extends TableRecordImpl<PgStatSubscriptionRecord> {

    private static final long serialVersionUID = 1L;

    public void setSubid(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getSubid() {
        return (Long) get(0);
    }

    public void setSubname(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getSubname() {
        return (String) get(1);
    }

    public void setPid(@Nullable Integer value) {
        set(2, value);
    }

    @Nullable
    public Integer getPid() {
        return (Integer) get(2);
    }

    public void setLeaderPid(@Nullable Integer value) {
        set(3, value);
    }

    @Nullable
    public Integer getLeaderPid() {
        return (Integer) get(3);
    }

    public void setRelid(@Nullable Long value) {
        set(4, value);
    }

    @Nullable
    public Long getRelid() {
        return (Long) get(4);
    }

    @Deprecated
    public void setReceivedLsn(@Nullable Object value) {
        set(5, value);
    }

    @Deprecated
    @Nullable
    public Object getReceivedLsn() {
        return get(5);
    }

    public void setLastMsgSendTime(@Nullable OffsetDateTime value) {
        set(6, value);
    }

    @Nullable
    public OffsetDateTime getLastMsgSendTime() {
        return (OffsetDateTime) get(6);
    }

    public void setLastMsgReceiptTime(@Nullable OffsetDateTime value) {
        set(7, value);
    }

    @Nullable
    public OffsetDateTime getLastMsgReceiptTime() {
        return (OffsetDateTime) get(7);
    }

    @Deprecated
    public void setLatestEndLsn(@Nullable Object value) {
        set(8, value);
    }

    @Deprecated
    @Nullable
    public Object getLatestEndLsn() {
        return get(8);
    }

    public void setLatestEndTime(@Nullable OffsetDateTime value) {
        set(9, value);
    }

    @Nullable
    public OffsetDateTime getLatestEndTime() {
        return (OffsetDateTime) get(9);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatSubscriptionRecord() {
        super(PgStatSubscription.PG_STAT_SUBSCRIPTION);
    }

    @ConstructorProperties({ "subid", "subname", "pid", "leaderPid", "relid", "receivedLsn", "lastMsgSendTime", "lastMsgReceiptTime", "latestEndLsn", "latestEndTime" })
    public PgStatSubscriptionRecord(@Nullable Long subid, @Nullable String subname, @Nullable Integer pid, @Nullable Integer leaderPid, @Nullable Long relid, @Nullable Object receivedLsn, @Nullable OffsetDateTime lastMsgSendTime, @Nullable OffsetDateTime lastMsgReceiptTime, @Nullable Object latestEndLsn, @Nullable OffsetDateTime latestEndTime) {
        super(PgStatSubscription.PG_STAT_SUBSCRIPTION);

        setSubid(subid);
        setSubname(subname);
        setPid(pid);
        setLeaderPid(leaderPid);
        setRelid(relid);
        setReceivedLsn(receivedLsn);
        setLastMsgSendTime(lastMsgSendTime);
        setLastMsgReceiptTime(lastMsgReceiptTime);
        setLatestEndLsn(latestEndLsn);
        setLatestEndTime(latestEndTime);
        resetChangedOnNotNull();
    }

    public PgStatSubscriptionRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatSubscription value) {
        super(PgStatSubscription.PG_STAT_SUBSCRIPTION);

        if (value != null) {
            setSubid(value.getSubid());
            setSubname(value.getSubname());
            setPid(value.getPid());
            setLeaderPid(value.getLeaderPid());
            setRelid(value.getRelid());
            setReceivedLsn(value.getReceivedLsn());
            setLastMsgSendTime(value.getLastMsgSendTime());
            setLastMsgReceiptTime(value.getLastMsgReceiptTime());
            setLatestEndLsn(value.getLatestEndLsn());
            setLatestEndTime(value.getLatestEndTime());
            resetChangedOnNotNull();
        }
    }
}
