/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatSubscriptionStats;

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
public class PgStatSubscriptionStatsRecord extends TableRecordImpl<PgStatSubscriptionStatsRecord> {

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

    public void setApplyErrorCount(@Nullable Long value) {
        set(2, value);
    }

    @Nullable
    public Long getApplyErrorCount() {
        return (Long) get(2);
    }

    public void setSyncErrorCount(@Nullable Long value) {
        set(3, value);
    }

    @Nullable
    public Long getSyncErrorCount() {
        return (Long) get(3);
    }

    public void setStatsReset(@Nullable OffsetDateTime value) {
        set(4, value);
    }

    @Nullable
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatSubscriptionStatsRecord() {
        super(PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS);
    }

    @ConstructorProperties({ "subid", "subname", "applyErrorCount", "syncErrorCount", "statsReset" })
    public PgStatSubscriptionStatsRecord(@Nullable Long subid, @Nullable String subname, @Nullable Long applyErrorCount, @Nullable Long syncErrorCount, @Nullable OffsetDateTime statsReset) {
        super(PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS);

        setSubid(subid);
        setSubname(subname);
        setApplyErrorCount(applyErrorCount);
        setSyncErrorCount(syncErrorCount);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }

    public PgStatSubscriptionStatsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatSubscriptionStats value) {
        super(PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS);

        if (value != null) {
            setSubid(value.getSubid());
            setSubname(value.getSubname());
            setApplyErrorCount(value.getApplyErrorCount());
            setSyncErrorCount(value.getSyncErrorCount());
            setStatsReset(value.getStatsReset());
            resetChangedOnNotNull();
        }
    }
}
