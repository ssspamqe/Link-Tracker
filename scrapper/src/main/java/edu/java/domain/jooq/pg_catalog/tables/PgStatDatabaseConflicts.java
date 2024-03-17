/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatDatabaseConflictsRecord;

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
public class PgStatDatabaseConflicts extends TableImpl<PgStatDatabaseConflictsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatDatabaseConflicts PG_STAT_DATABASE_CONFLICTS = new PgStatDatabaseConflicts();

    @Override
    @NotNull
    public Class<PgStatDatabaseConflictsRecord> getRecordType() {
        return PgStatDatabaseConflictsRecord.class;
    }

    public final TableField<PgStatDatabaseConflictsRecord, Long> DATID = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseConflictsRecord, String> DATNAME = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_TABLESPACE = createField(DSL.name("confl_tablespace"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_LOCK = createField(DSL.name("confl_lock"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_SNAPSHOT = createField(DSL.name("confl_snapshot"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_BUFFERPIN = createField(DSL.name("confl_bufferpin"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_DEADLOCK = createField(DSL.name("confl_deadlock"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_ACTIVE_LOGICALSLOT = createField(DSL.name("confl_active_logicalslot"), SQLDataType.BIGINT, this, "");

    private PgStatDatabaseConflicts(Name alias, Table<PgStatDatabaseConflictsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatDatabaseConflicts(Name alias, Table<PgStatDatabaseConflictsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatDatabaseConflicts(String alias) {
        this(DSL.name(alias), PG_STAT_DATABASE_CONFLICTS);
    }

    public PgStatDatabaseConflicts(Name alias) {
        this(alias, PG_STAT_DATABASE_CONFLICTS);
    }

    public PgStatDatabaseConflicts() {
        this(DSL.name("pg_stat_database_conflicts"), null);
    }

    public <O extends Record> PgStatDatabaseConflicts(Table<O> child, ForeignKey<O, PgStatDatabaseConflictsRecord> key) {
        super(child, key, PG_STAT_DATABASE_CONFLICTS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatDatabaseConflicts as(String alias) {
        return new PgStatDatabaseConflicts(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatDatabaseConflicts as(Name alias) {
        return new PgStatDatabaseConflicts(alias, this);
    }

    @Override
    @NotNull
    public PgStatDatabaseConflicts as(Table<?> alias) {
        return new PgStatDatabaseConflicts(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatDatabaseConflicts rename(String name) {
        return new PgStatDatabaseConflicts(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatDatabaseConflicts rename(Name name) {
        return new PgStatDatabaseConflicts(name, null);
    }

    @Override
    @NotNull
    public PgStatDatabaseConflicts rename(Table<?> name) {
        return new PgStatDatabaseConflicts(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row8<Long, String, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function8<? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
