/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgTablesRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgTables extends TableImpl<PgTablesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgTables PG_TABLES = new PgTables();

    @Override
    @NotNull
    public Class<PgTablesRecord> getRecordType() {
        return PgTablesRecord.class;
    }

    public final TableField<PgTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgTablesRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgTablesRecord, String> TABLEOWNER = createField(DSL.name("tableowner"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgTablesRecord, String> TABLESPACE = createField(DSL.name("tablespace"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgTablesRecord, Boolean> HASINDEXES = createField(DSL.name("hasindexes"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgTablesRecord, Boolean> HASRULES = createField(DSL.name("hasrules"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgTablesRecord, Boolean> HASTRIGGERS = createField(DSL.name("hastriggers"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgTablesRecord, Boolean> ROWSECURITY = createField(DSL.name("rowsecurity"), SQLDataType.BOOLEAN, this, "");

    private PgTables(Name alias, Table<PgTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTables(Name alias, Table<PgTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgTables(String alias) {
        this(DSL.name(alias), PG_TABLES);
    }

    public PgTables(Name alias) {
        this(alias, PG_TABLES);
    }

    public PgTables() {
        this(DSL.name("pg_tables"), null);
    }

    public <O extends Record> PgTables(Table<O> child, ForeignKey<O, PgTablesRecord> key) {
        super(child, key, PG_TABLES);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgTables as(String alias) {
        return new PgTables(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgTables as(Name alias) {
        return new PgTables(alias, this);
    }

    @Override
    @NotNull
    public PgTables as(Table<?> alias) {
        return new PgTables(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgTables rename(String name) {
        return new PgTables(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgTables rename(Name name) {
        return new PgTables(name, null);
    }

    @Override
    @NotNull
    public PgTables rename(Table<?> name) {
        return new PgTables(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row8<String, String, String, String, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
