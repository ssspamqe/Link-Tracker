/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgTsParser;

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
public class PgTsParserRecord extends TableRecordImpl<PgTsParserRecord> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setPrsname(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPrsname() {
        return (String) get(1);
    }

    public void setPrsnamespace(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPrsnamespace() {
        return (Long) get(2);
    }

    public void setPrsstart(@NotNull String value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPrsstart() {
        return (String) get(3);
    }

    public void setPrstoken(@NotNull String value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPrstoken() {
        return (String) get(4);
    }

    public void setPrsend(@NotNull String value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPrsend() {
        return (String) get(5);
    }

    public void setPrsheadline(@NotNull String value) {
        set(6, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPrsheadline() {
        return (String) get(6);
    }

    public void setPrslextype(@NotNull String value) {
        set(7, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPrslextype() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgTsParserRecord() {
        super(PgTsParser.PG_TS_PARSER);
    }

    @ConstructorProperties({ "oid", "prsname", "prsnamespace", "prsstart", "prstoken", "prsend", "prsheadline", "prslextype" })
    public PgTsParserRecord(@NotNull Long oid, @NotNull String prsname, @NotNull Long prsnamespace, @NotNull String prsstart, @NotNull String prstoken, @NotNull String prsend, @NotNull String prsheadline, @NotNull String prslextype) {
        super(PgTsParser.PG_TS_PARSER);

        setOid(oid);
        setPrsname(prsname);
        setPrsnamespace(prsnamespace);
        setPrsstart(prsstart);
        setPrstoken(prstoken);
        setPrsend(prsend);
        setPrsheadline(prsheadline);
        setPrslextype(prslextype);
        resetChangedOnNotNull();
    }

    public PgTsParserRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgTsParser value) {
        super(PgTsParser.PG_TS_PARSER);

        if (value != null) {
            setOid(value.getOid());
            setPrsname(value.getPrsname());
            setPrsnamespace(value.getPrsnamespace());
            setPrsstart(value.getPrsstart());
            setPrstoken(value.getPrstoken());
            setPrsend(value.getPrsend());
            setPrsheadline(value.getPrsheadline());
            setPrslextype(value.getPrslextype());
            resetChangedOnNotNull();
        }
    }
}