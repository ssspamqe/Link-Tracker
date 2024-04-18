/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgTimezoneNames;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.YearToSecond;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgTimezoneNamesRecord extends TableRecordImpl<PgTimezoneNamesRecord> {

    private static final long serialVersionUID = 1L;

    public void setName(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getName() {
        return (String) get(0);
    }

    public void setAbbrev(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getAbbrev() {
        return (String) get(1);
    }

    public void setUtcOffset(@Nullable YearToSecond value) {
        set(2, value);
    }

    @Nullable
    public YearToSecond getUtcOffset() {
        return (YearToSecond) get(2);
    }

    public void setIsDst(@Nullable Boolean value) {
        set(3, value);
    }

    @Nullable
    public Boolean getIsDst() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgTimezoneNamesRecord() {
        super(PgTimezoneNames.PG_TIMEZONE_NAMES);
    }

    @ConstructorProperties({ "name", "abbrev", "utcOffset", "isDst" })
    public PgTimezoneNamesRecord(@Nullable String name, @Nullable String abbrev, @Nullable YearToSecond utcOffset, @Nullable Boolean isDst) {
        super(PgTimezoneNames.PG_TIMEZONE_NAMES);

        setName(name);
        setAbbrev(abbrev);
        setUtcOffset(utcOffset);
        setIsDst(isDst);
        resetChangedOnNotNull();
    }

    public PgTimezoneNamesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgTimezoneNames value) {
        super(PgTimezoneNames.PG_TIMEZONE_NAMES);

        if (value != null) {
            setName(value.getName());
            setAbbrev(value.getAbbrev());
            setUtcOffset(value.getUtcOffset());
            setIsDst(value.getIsDst());
            resetChangedOnNotNull();
        }
    }
}
