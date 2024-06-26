/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgRules;

import java.beans.ConstructorProperties;

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
public class PgRulesRecord extends TableRecordImpl<PgRulesRecord> {

    private static final long serialVersionUID = 1L;

    public void setSchemaname(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getSchemaname() {
        return (String) get(0);
    }

    public void setTablename(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getTablename() {
        return (String) get(1);
    }

    public void setRulename(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getRulename() {
        return (String) get(2);
    }

    public void setDefinition(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getDefinition() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgRulesRecord() {
        super(PgRules.PG_RULES);
    }

    @ConstructorProperties({ "schemaname", "tablename", "rulename", "definition" })
    public PgRulesRecord(@Nullable String schemaname, @Nullable String tablename, @Nullable String rulename, @Nullable String definition) {
        super(PgRules.PG_RULES);

        setSchemaname(schemaname);
        setTablename(tablename);
        setRulename(rulename);
        setDefinition(definition);
        resetChangedOnNotNull();
    }

    public PgRulesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgRules value) {
        super(PgRules.PG_RULES);

        if (value != null) {
            setSchemaname(value.getSchemaname());
            setTablename(value.getTablename());
            setRulename(value.getRulename());
            setDefinition(value.getDefinition());
            resetChangedOnNotNull();
        }
    }
}
