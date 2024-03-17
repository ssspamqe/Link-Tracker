/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatAllIndexesRecord;

import java.time.OffsetDateTime;

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
public class PgStatAllIndexes extends TableImpl<PgStatAllIndexesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatAllIndexes PG_STAT_ALL_INDEXES = new PgStatAllIndexes();

    @Override
    @NotNull
    public Class<PgStatAllIndexesRecord> getRecordType() {
        return PgStatAllIndexesRecord.class;
    }

    public final TableField<PgStatAllIndexesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatAllIndexesRecord, Long> INDEXRELID = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatAllIndexesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatAllIndexesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatAllIndexesRecord, String> INDEXRELNAME = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatAllIndexesRecord, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatAllIndexesRecord, OffsetDateTime> LAST_IDX_SCAN = createField(DSL.name("last_idx_scan"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatAllIndexesRecord, Long> IDX_TUP_READ = createField(DSL.name("idx_tup_read"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatAllIndexesRecord, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    private PgStatAllIndexes(Name alias, Table<PgStatAllIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatAllIndexes(Name alias, Table<PgStatAllIndexesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatAllIndexes(String alias) {
        this(DSL.name(alias), PG_STAT_ALL_INDEXES);
    }

    public PgStatAllIndexes(Name alias) {
        this(alias, PG_STAT_ALL_INDEXES);
    }

    public PgStatAllIndexes() {
        this(DSL.name("pg_stat_all_indexes"), null);
    }

    public <O extends Record> PgStatAllIndexes(Table<O> child, ForeignKey<O, PgStatAllIndexesRecord> key) {
        super(child, key, PG_STAT_ALL_INDEXES);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatAllIndexes as(String alias) {
        return new PgStatAllIndexes(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatAllIndexes as(Name alias) {
        return new PgStatAllIndexes(alias, this);
    }

    @Override
    @NotNull
    public PgStatAllIndexes as(Table<?> alias) {
        return new PgStatAllIndexes(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatAllIndexes rename(String name) {
        return new PgStatAllIndexes(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatAllIndexes rename(Name name) {
        return new PgStatAllIndexes(name, null);
    }

    @Override
    @NotNull
    public PgStatAllIndexes rename(Table<?> name) {
        return new PgStatAllIndexes(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<Long, Long, String, String, String, Long, OffsetDateTime, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function9<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
