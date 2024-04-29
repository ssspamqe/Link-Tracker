/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgTables;

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
public class PgTablesRecord extends TableRecordImpl<PgTablesRecord> {

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

    public void setTableowner(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getTableowner() {
        return (String) get(2);
    }

    public void setTablespace(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getTablespace() {
        return (String) get(3);
    }

    public void setHasindexes(@Nullable Boolean value) {
        set(4, value);
    }

    @Nullable
    public Boolean getHasindexes() {
        return (Boolean) get(4);
    }

    public void setHasrules(@Nullable Boolean value) {
        set(5, value);
    }

    @Nullable
    public Boolean getHasrules() {
        return (Boolean) get(5);
    }

    public void setHastriggers(@Nullable Boolean value) {
        set(6, value);
    }

    @Nullable
    public Boolean getHastriggers() {
        return (Boolean) get(6);
    }

    public void setRowsecurity(@Nullable Boolean value) {
        set(7, value);
    }

    @Nullable
    public Boolean getRowsecurity() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgTablesRecord() {
        super(PgTables.PG_TABLES);
    }

    @ConstructorProperties({ "schemaname", "tablename", "tableowner", "tablespace", "hasindexes", "hasrules", "hastriggers", "rowsecurity" })
    public PgTablesRecord(@Nullable String schemaname, @Nullable String tablename, @Nullable String tableowner, @Nullable String tablespace, @Nullable Boolean hasindexes, @Nullable Boolean hasrules, @Nullable Boolean hastriggers, @Nullable Boolean rowsecurity) {
        super(PgTables.PG_TABLES);

        setSchemaname(schemaname);
        setTablename(tablename);
        setTableowner(tableowner);
        setTablespace(tablespace);
        setHasindexes(hasindexes);
        setHasrules(hasrules);
        setHastriggers(hastriggers);
        setRowsecurity(rowsecurity);
        resetChangedOnNotNull();
    }

    public PgTablesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgTables value) {
        super(PgTables.PG_TABLES);

        if (value != null) {
            setSchemaname(value.getSchemaname());
            setTablename(value.getTablename());
            setTableowner(value.getTableowner());
            setTablespace(value.getTablespace());
            setHasindexes(value.getHasindexes());
            setHasrules(value.getHasrules());
            setHastriggers(value.getHastriggers());
            setRowsecurity(value.getRowsecurity());
            resetChangedOnNotNull();
        }
    }
}