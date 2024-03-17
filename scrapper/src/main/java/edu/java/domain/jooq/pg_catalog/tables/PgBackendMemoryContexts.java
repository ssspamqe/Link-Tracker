/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgBackendMemoryContextsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
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
public class PgBackendMemoryContexts extends TableImpl<PgBackendMemoryContextsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgBackendMemoryContexts PG_BACKEND_MEMORY_CONTEXTS = new PgBackendMemoryContexts();

    @Override
    @NotNull
    public Class<PgBackendMemoryContextsRecord> getRecordType() {
        return PgBackendMemoryContextsRecord.class;
    }

    public final TableField<PgBackendMemoryContextsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    public final TableField<PgBackendMemoryContextsRecord, String> IDENT = createField(DSL.name("ident"), SQLDataType.CLOB, this, "");

    public final TableField<PgBackendMemoryContextsRecord, String> PARENT = createField(DSL.name("parent"), SQLDataType.CLOB, this, "");

    public final TableField<PgBackendMemoryContextsRecord, Integer> LEVEL = createField(DSL.name("level"), SQLDataType.INTEGER, this, "");

    public final TableField<PgBackendMemoryContextsRecord, Long> TOTAL_BYTES = createField(DSL.name("total_bytes"), SQLDataType.BIGINT, this, "");

    public final TableField<PgBackendMemoryContextsRecord, Long> TOTAL_NBLOCKS = createField(DSL.name("total_nblocks"), SQLDataType.BIGINT, this, "");

    public final TableField<PgBackendMemoryContextsRecord, Long> FREE_BYTES = createField(DSL.name("free_bytes"), SQLDataType.BIGINT, this, "");

    public final TableField<PgBackendMemoryContextsRecord, Long> FREE_CHUNKS = createField(DSL.name("free_chunks"), SQLDataType.BIGINT, this, "");

    public final TableField<PgBackendMemoryContextsRecord, Long> USED_BYTES = createField(DSL.name("used_bytes"), SQLDataType.BIGINT, this, "");

    private PgBackendMemoryContexts(Name alias, Table<PgBackendMemoryContextsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgBackendMemoryContexts(Name alias, Table<PgBackendMemoryContextsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgBackendMemoryContexts(String alias) {
        this(DSL.name(alias), PG_BACKEND_MEMORY_CONTEXTS);
    }

    public PgBackendMemoryContexts(Name alias) {
        this(alias, PG_BACKEND_MEMORY_CONTEXTS);
    }

    public PgBackendMemoryContexts() {
        this(DSL.name("pg_backend_memory_contexts"), null);
    }

    public <O extends Record> PgBackendMemoryContexts(Table<O> child, ForeignKey<O, PgBackendMemoryContextsRecord> key) {
        super(child, key, PG_BACKEND_MEMORY_CONTEXTS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgBackendMemoryContexts as(String alias) {
        return new PgBackendMemoryContexts(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgBackendMemoryContexts as(Name alias) {
        return new PgBackendMemoryContexts(alias, this);
    }

    @Override
    @NotNull
    public PgBackendMemoryContexts as(Table<?> alias) {
        return new PgBackendMemoryContexts(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgBackendMemoryContexts rename(String name) {
        return new PgBackendMemoryContexts(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgBackendMemoryContexts rename(Name name) {
        return new PgBackendMemoryContexts(name, null);
    }

    @Override
    @NotNull
    public PgBackendMemoryContexts rename(Table<?> name) {
        return new PgBackendMemoryContexts(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<String, String, String, Integer, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function9<? super String, ? super String, ? super String, ? super Integer, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super String, ? super String, ? super Integer, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
