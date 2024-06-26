/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgSubscription;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
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
public class PgSubscriptionRecord extends TableRecordImpl<PgSubscriptionRecord> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setSubdbid(@NotNull Long value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSubdbid() {
        return (Long) get(1);
    }

    @Deprecated
    public void setSubskiplsn(@NotNull Object value) {
        set(2, value);
    }

    @Deprecated
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object getSubskiplsn() {
        return get(2);
    }

    public void setSubname(@NotNull String value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubname() {
        return (String) get(3);
    }

    public void setSubowner(@NotNull Long value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSubowner() {
        return (Long) get(4);
    }

    public void setSubenabled(@NotNull Boolean value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubenabled() {
        return (Boolean) get(5);
    }

    public void setSubbinary(@NotNull Boolean value) {
        set(6, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubbinary() {
        return (Boolean) get(6);
    }

    public void setSubstream(@NotNull String value) {
        set(7, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubstream() {
        return (String) get(7);
    }

    public void setSubtwophasestate(@NotNull String value) {
        set(8, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubtwophasestate() {
        return (String) get(8);
    }

    public void setSubdisableonerr(@NotNull Boolean value) {
        set(9, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubdisableonerr() {
        return (Boolean) get(9);
    }

    public void setSubpasswordrequired(@NotNull Boolean value) {
        set(10, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubpasswordrequired() {
        return (Boolean) get(10);
    }

    public void setSubrunasowner(@NotNull Boolean value) {
        set(11, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubrunasowner() {
        return (Boolean) get(11);
    }

    public void setSubconninfo(@NotNull String value) {
        set(12, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubconninfo() {
        return (String) get(12);
    }

    public void setSubslotname(@Nullable String value) {
        set(13, value);
    }

    @Nullable
    public String getSubslotname() {
        return (String) get(13);
    }

    public void setSubsynccommit(@NotNull String value) {
        set(14, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubsynccommit() {
        return (String) get(14);
    }

    public void setSubpublications(@NotNull String[] value) {
        set(15, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String[] getSubpublications() {
        return (String[]) get(15);
    }

    public void setSuborigin(@Nullable String value) {
        set(16, value);
    }

    @Nullable
    public String getSuborigin() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgSubscriptionRecord() {
        super(PgSubscription.PG_SUBSCRIPTION);
    }

    @ConstructorProperties({ "oid", "subdbid", "subskiplsn", "subname", "subowner", "subenabled", "subbinary", "substream", "subtwophasestate", "subdisableonerr", "subpasswordrequired", "subrunasowner", "subconninfo", "subslotname", "subsynccommit", "subpublications", "suborigin" })
    public PgSubscriptionRecord(@NotNull Long oid, @NotNull Long subdbid, @NotNull Object subskiplsn, @NotNull String subname, @NotNull Long subowner, @NotNull Boolean subenabled, @NotNull Boolean subbinary, @NotNull String substream, @NotNull String subtwophasestate, @NotNull Boolean subdisableonerr, @NotNull Boolean subpasswordrequired, @NotNull Boolean subrunasowner, @NotNull String subconninfo, @Nullable String subslotname, @NotNull String subsynccommit, @NotNull String[] subpublications, @Nullable String suborigin) {
        super(PgSubscription.PG_SUBSCRIPTION);

        setOid(oid);
        setSubdbid(subdbid);
        setSubskiplsn(subskiplsn);
        setSubname(subname);
        setSubowner(subowner);
        setSubenabled(subenabled);
        setSubbinary(subbinary);
        setSubstream(substream);
        setSubtwophasestate(subtwophasestate);
        setSubdisableonerr(subdisableonerr);
        setSubpasswordrequired(subpasswordrequired);
        setSubrunasowner(subrunasowner);
        setSubconninfo(subconninfo);
        setSubslotname(subslotname);
        setSubsynccommit(subsynccommit);
        setSubpublications(subpublications);
        setSuborigin(suborigin);
        resetChangedOnNotNull();
    }

    public PgSubscriptionRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgSubscription value) {
        super(PgSubscription.PG_SUBSCRIPTION);

        if (value != null) {
            setOid(value.getOid());
            setSubdbid(value.getSubdbid());
            setSubskiplsn(value.getSubskiplsn());
            setSubname(value.getSubname());
            setSubowner(value.getSubowner());
            setSubenabled(value.getSubenabled());
            setSubbinary(value.getSubbinary());
            setSubstream(value.getSubstream());
            setSubtwophasestate(value.getSubtwophasestate());
            setSubdisableonerr(value.getSubdisableonerr());
            setSubpasswordrequired(value.getSubpasswordrequired());
            setSubrunasowner(value.getSubrunasowner());
            setSubconninfo(value.getSubconninfo());
            setSubslotname(value.getSubslotname());
            setSubsynccommit(value.getSubsynccommit());
            setSubpublications(value.getSubpublications());
            setSuborigin(value.getSuborigin());
            resetChangedOnNotNull();
        }
    }
}
