/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgPolicy;

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
public class PgPolicyRecord extends TableRecordImpl<PgPolicyRecord> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setPolname(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPolname() {
        return (String) get(1);
    }

    public void setPolrelid(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPolrelid() {
        return (Long) get(2);
    }

    public void setPolcmd(@NotNull String value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPolcmd() {
        return (String) get(3);
    }

    public void setPolpermissive(@NotNull Boolean value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPolpermissive() {
        return (Boolean) get(4);
    }

    public void setPolroles(@NotNull Long[] value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long[] getPolroles() {
        return (Long[]) get(5);
    }

    @Deprecated
    public void setPolqual(@Nullable Object value) {
        set(6, value);
    }

    @Deprecated
    @Nullable
    public Object getPolqual() {
        return get(6);
    }

    @Deprecated
    public void setPolwithcheck(@Nullable Object value) {
        set(7, value);
    }

    @Deprecated
    @Nullable
    public Object getPolwithcheck() {
        return get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgPolicyRecord() {
        super(PgPolicy.PG_POLICY);
    }

    @ConstructorProperties({ "oid", "polname", "polrelid", "polcmd", "polpermissive", "polroles", "polqual", "polwithcheck" })
    public PgPolicyRecord(@NotNull Long oid, @NotNull String polname, @NotNull Long polrelid, @NotNull String polcmd, @NotNull Boolean polpermissive, @NotNull Long[] polroles, @Nullable Object polqual, @Nullable Object polwithcheck) {
        super(PgPolicy.PG_POLICY);

        setOid(oid);
        setPolname(polname);
        setPolrelid(polrelid);
        setPolcmd(polcmd);
        setPolpermissive(polpermissive);
        setPolroles(polroles);
        setPolqual(polqual);
        setPolwithcheck(polwithcheck);
        resetChangedOnNotNull();
    }

    public PgPolicyRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgPolicy value) {
        super(PgPolicy.PG_POLICY);

        if (value != null) {
            setOid(value.getOid());
            setPolname(value.getPolname());
            setPolrelid(value.getPolrelid());
            setPolcmd(value.getPolcmd());
            setPolpermissive(value.getPolpermissive());
            setPolroles(value.getPolroles());
            setPolqual(value.getPolqual());
            setPolwithcheck(value.getPolwithcheck());
            resetChangedOnNotNull();
        }
    }
}