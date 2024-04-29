/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgShdependRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
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
public class PgShdepend extends TableImpl<PgShdependRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgShdepend PG_SHDEPEND = new PgShdepend();

    @Override
    @NotNull
    public Class<PgShdependRecord> getRecordType() {
        return PgShdependRecord.class;
    }

    public final TableField<PgShdependRecord, Long> DBID = createField(DSL.name("dbid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgShdependRecord, Long> CLASSID = createField(DSL.name("classid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgShdependRecord, Long> OBJID = createField(DSL.name("objid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgShdependRecord, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "");

    public final TableField<PgShdependRecord, Long> REFCLASSID = createField(DSL.name("refclassid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgShdependRecord, Long> REFOBJID = createField(DSL.name("refobjid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgShdependRecord, String> DEPTYPE = createField(DSL.name("deptype"), SQLDataType.CHAR.nullable(false), this, "");

    private PgShdepend(Name alias, Table<PgShdependRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgShdepend(Name alias, Table<PgShdependRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgShdepend(String alias) {
        this(DSL.name(alias), PG_SHDEPEND);
    }

    public PgShdepend(Name alias) {
        this(alias, PG_SHDEPEND);
    }

    public PgShdepend() {
        this(DSL.name("pg_shdepend"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgShdepend as(String alias) {
        return new PgShdepend(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgShdepend as(Name alias) {
        return new PgShdepend(alias, this);
    }

    @Override
    @NotNull
    public PgShdepend as(Table<?> alias) {
        return new PgShdepend(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgShdepend rename(String name) {
        return new PgShdepend(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgShdepend rename(Name name) {
        return new PgShdepend(name, null);
    }

    @Override
    @NotNull
    public PgShdepend rename(Table<?> name) {
        return new PgShdepend(name.getQualifiedName(), null);
    }
}