/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgForeignServer;

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
public class PgForeignServerRecord extends TableRecordImpl<PgForeignServerRecord> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setSrvname(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSrvname() {
        return (String) get(1);
    }

    public void setSrvowner(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSrvowner() {
        return (Long) get(2);
    }

    public void setSrvfdw(@NotNull Long value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSrvfdw() {
        return (Long) get(3);
    }

    public void setSrvtype(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getSrvtype() {
        return (String) get(4);
    }

    public void setSrvversion(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getSrvversion() {
        return (String) get(5);
    }

    public void setSrvacl(@Nullable String[] value) {
        set(6, value);
    }

    @Nullable
    public String[] getSrvacl() {
        return (String[]) get(6);
    }

    public void setSrvoptions(@Nullable String[] value) {
        set(7, value);
    }

    @Nullable
    public String[] getSrvoptions() {
        return (String[]) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgForeignServerRecord() {
        super(PgForeignServer.PG_FOREIGN_SERVER);
    }

    @ConstructorProperties({ "oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions" })
    public PgForeignServerRecord(@NotNull Long oid, @NotNull String srvname, @NotNull Long srvowner, @NotNull Long srvfdw, @Nullable String srvtype, @Nullable String srvversion, @Nullable String[] srvacl, @Nullable String[] srvoptions) {
        super(PgForeignServer.PG_FOREIGN_SERVER);

        setOid(oid);
        setSrvname(srvname);
        setSrvowner(srvowner);
        setSrvfdw(srvfdw);
        setSrvtype(srvtype);
        setSrvversion(srvversion);
        setSrvacl(srvacl);
        setSrvoptions(srvoptions);
        resetChangedOnNotNull();
    }

    public PgForeignServerRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgForeignServer value) {
        super(PgForeignServer.PG_FOREIGN_SERVER);

        if (value != null) {
            setOid(value.getOid());
            setSrvname(value.getSrvname());
            setSrvowner(value.getSrvowner());
            setSrvfdw(value.getSrvfdw());
            setSrvtype(value.getSrvtype());
            setSrvversion(value.getSrvversion());
            setSrvacl(value.getSrvacl());
            setSrvoptions(value.getSrvoptions());
            resetChangedOnNotNull();
        }
    }
}
