/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgNamespace;

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
public class PgNamespaceRecord extends TableRecordImpl<PgNamespaceRecord> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setNspname(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getNspname() {
        return (String) get(1);
    }

    public void setNspowner(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getNspowner() {
        return (Long) get(2);
    }

    public void setNspacl(@Nullable String[] value) {
        set(3, value);
    }

    @Nullable
    public String[] getNspacl() {
        return (String[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgNamespaceRecord() {
        super(PgNamespace.PG_NAMESPACE);
    }

    @ConstructorProperties({ "oid", "nspname", "nspowner", "nspacl" })
    public PgNamespaceRecord(@NotNull Long oid, @NotNull String nspname, @NotNull Long nspowner, @Nullable String[] nspacl) {
        super(PgNamespace.PG_NAMESPACE);

        setOid(oid);
        setNspname(nspname);
        setNspowner(nspowner);
        setNspacl(nspacl);
        resetChangedOnNotNull();
    }

    public PgNamespaceRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgNamespace value) {
        super(PgNamespace.PG_NAMESPACE);

        if (value != null) {
            setOid(value.getOid());
            setNspname(value.getNspname());
            setNspowner(value.getNspowner());
            setNspacl(value.getNspacl());
            resetChangedOnNotNull();
        }
    }
}
