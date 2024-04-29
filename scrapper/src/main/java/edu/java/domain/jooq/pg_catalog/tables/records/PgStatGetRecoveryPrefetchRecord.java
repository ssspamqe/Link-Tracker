/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatGetRecoveryPrefetch;

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
public class PgStatGetRecoveryPrefetchRecord extends TableRecordImpl<PgStatGetRecoveryPrefetchRecord> {

    private static final long serialVersionUID = 1L;

    public void setStatsReset(@Nullable OffsetDateTime value) {
        set(0, value);
    }

    @Nullable
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(0);
    }

    public void setPrefetch(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getPrefetch() {
        return (Long) get(1);
    }

    public void setHit(@Nullable Long value) {
        set(2, value);
    }

    @Nullable
    public Long getHit() {
        return (Long) get(2);
    }

    public void setSkipInit(@Nullable Long value) {
        set(3, value);
    }

    @Nullable
    public Long getSkipInit() {
        return (Long) get(3);
    }

    public void setSkipNew(@Nullable Long value) {
        set(4, value);
    }

    @Nullable
    public Long getSkipNew() {
        return (Long) get(4);
    }

    public void setSkipFpw(@Nullable Long value) {
        set(5, value);
    }

    @Nullable
    public Long getSkipFpw() {
        return (Long) get(5);
    }

    public void setSkipRep(@Nullable Long value) {
        set(6, value);
    }

    @Nullable
    public Long getSkipRep() {
        return (Long) get(6);
    }

    public void setWalDistance(@Nullable Integer value) {
        set(7, value);
    }

    @Nullable
    public Integer getWalDistance() {
        return (Integer) get(7);
    }

    public void setBlockDistance(@Nullable Integer value) {
        set(8, value);
    }

    @Nullable
    public Integer getBlockDistance() {
        return (Integer) get(8);
    }

    public void setIoDepth(@Nullable Integer value) {
        set(9, value);
    }

    @Nullable
    public Integer getIoDepth() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatGetRecoveryPrefetchRecord() {
        super(PgStatGetRecoveryPrefetch.PG_STAT_GET_RECOVERY_PREFETCH);
    }

    @ConstructorProperties({ "statsReset", "prefetch", "hit", "skipInit", "skipNew", "skipFpw", "skipRep", "walDistance", "blockDistance", "ioDepth" })
    public PgStatGetRecoveryPrefetchRecord(@Nullable OffsetDateTime statsReset, @Nullable Long prefetch, @Nullable Long hit, @Nullable Long skipInit, @Nullable Long skipNew, @Nullable Long skipFpw, @Nullable Long skipRep, @Nullable Integer walDistance, @Nullable Integer blockDistance, @Nullable Integer ioDepth) {
        super(PgStatGetRecoveryPrefetch.PG_STAT_GET_RECOVERY_PREFETCH);

        setStatsReset(statsReset);
        setPrefetch(prefetch);
        setHit(hit);
        setSkipInit(skipInit);
        setSkipNew(skipNew);
        setSkipFpw(skipFpw);
        setSkipRep(skipRep);
        setWalDistance(walDistance);
        setBlockDistance(blockDistance);
        setIoDepth(ioDepth);
        resetChangedOnNotNull();
    }

    public PgStatGetRecoveryPrefetchRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatGetRecoveryPrefetch value) {
        super(PgStatGetRecoveryPrefetch.PG_STAT_GET_RECOVERY_PREFETCH);

        if (value != null) {
            setStatsReset(value.getStatsReset());
            setPrefetch(value.getPrefetch());
            setHit(value.getHit());
            setSkipInit(value.getSkipInit());
            setSkipNew(value.getSkipNew());
            setSkipFpw(value.getSkipFpw());
            setSkipRep(value.getSkipRep());
            setWalDistance(value.getWalDistance());
            setBlockDistance(value.getBlockDistance());
            setIoDepth(value.getIoDepth());
            resetChangedOnNotNull();
        }
    }
}