/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgConversion;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgConversionRecord extends TableRecordImpl<PgConversionRecord> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setConname(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getConname() {
        return (String) get(1);
    }

    public void setConnamespace(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getConnamespace() {
        return (Long) get(2);
    }

    public void setConowner(@NotNull Long value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getConowner() {
        return (Long) get(3);
    }

    public void setConforencoding(@NotNull Integer value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getConforencoding() {
        return (Integer) get(4);
    }

    public void setContoencoding(@NotNull Integer value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getContoencoding() {
        return (Integer) get(5);
    }

    public void setConproc(@NotNull String value) {
        set(6, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getConproc() {
        return (String) get(6);
    }

    public void setCondefault(@NotNull Boolean value) {
        set(7, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getCondefault() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgConversionRecord() {
        super(PgConversion.PG_CONVERSION);
    }

    @ConstructorProperties({ "oid", "conname", "connamespace", "conowner", "conforencoding", "contoencoding", "conproc", "condefault" })
    public PgConversionRecord(@NotNull Long oid, @NotNull String conname, @NotNull Long connamespace, @NotNull Long conowner, @NotNull Integer conforencoding, @NotNull Integer contoencoding, @NotNull String conproc, @NotNull Boolean condefault) {
        super(PgConversion.PG_CONVERSION);

        setOid(oid);
        setConname(conname);
        setConnamespace(connamespace);
        setConowner(conowner);
        setConforencoding(conforencoding);
        setContoencoding(contoencoding);
        setConproc(conproc);
        setCondefault(condefault);
        resetChangedOnNotNull();
    }

    public PgConversionRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgConversion value) {
        super(PgConversion.PG_CONVERSION);

        if (value != null) {
            setOid(value.getOid());
            setConname(value.getConname());
            setConnamespace(value.getConnamespace());
            setConowner(value.getConowner());
            setConforencoding(value.getConforencoding());
            setContoencoding(value.getContoencoding());
            setConproc(value.getConproc());
            setCondefault(value.getCondefault());
            resetChangedOnNotNull();
        }
    }
}
