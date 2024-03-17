/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatsExtExprsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function17;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row17;
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
public class PgStatsExtExprs extends TableImpl<PgStatsExtExprsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatsExtExprs PG_STATS_EXT_EXPRS = new PgStatsExtExprs();

    @Override
    @NotNull
    public Class<PgStatsExtExprsRecord> getRecordType() {
        return PgStatsExtExprsRecord.class;
    }

    public final TableField<PgStatsExtExprsRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatsExtExprsRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatsExtExprsRecord, String> STATISTICS_SCHEMANAME = createField(DSL.name("statistics_schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatsExtExprsRecord, String> STATISTICS_NAME = createField(DSL.name("statistics_name"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatsExtExprsRecord, String> STATISTICS_OWNER = createField(DSL.name("statistics_owner"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatsExtExprsRecord, String> EXPR = createField(DSL.name("expr"), SQLDataType.CLOB, this, "");

    public final TableField<PgStatsExtExprsRecord, Boolean> INHERITED = createField(DSL.name("inherited"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgStatsExtExprsRecord, Float> NULL_FRAC = createField(DSL.name("null_frac"), SQLDataType.REAL, this, "");

    public final TableField<PgStatsExtExprsRecord, Integer> AVG_WIDTH = createField(DSL.name("avg_width"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatsExtExprsRecord, Float> N_DISTINCT = createField(DSL.name("n_distinct"), SQLDataType.REAL, this, "");

    public final TableField<PgStatsExtExprsRecord, Object[]> MOST_COMMON_VALS = createField(DSL.name("most_common_vals"), SQLDataType.OTHER.array(), this, "");

    public final TableField<PgStatsExtExprsRecord, Float[]> MOST_COMMON_FREQS = createField(DSL.name("most_common_freqs"), SQLDataType.REAL.array(), this, "");

    public final TableField<PgStatsExtExprsRecord, Object[]> HISTOGRAM_BOUNDS = createField(DSL.name("histogram_bounds"), SQLDataType.OTHER.array(), this, "");

    public final TableField<PgStatsExtExprsRecord, Float> CORRELATION = createField(DSL.name("correlation"), SQLDataType.REAL, this, "");

    public final TableField<PgStatsExtExprsRecord, Object[]> MOST_COMMON_ELEMS = createField(DSL.name("most_common_elems"), SQLDataType.OTHER.array(), this, "");

    public final TableField<PgStatsExtExprsRecord, Float[]> MOST_COMMON_ELEM_FREQS = createField(DSL.name("most_common_elem_freqs"), SQLDataType.REAL.array(), this, "");

    public final TableField<PgStatsExtExprsRecord, Float[]> ELEM_COUNT_HISTOGRAM = createField(DSL.name("elem_count_histogram"), SQLDataType.REAL.array(), this, "");

    private PgStatsExtExprs(Name alias, Table<PgStatsExtExprsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatsExtExprs(Name alias, Table<PgStatsExtExprsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatsExtExprs(String alias) {
        this(DSL.name(alias), PG_STATS_EXT_EXPRS);
    }

    public PgStatsExtExprs(Name alias) {
        this(alias, PG_STATS_EXT_EXPRS);
    }

    public PgStatsExtExprs() {
        this(DSL.name("pg_stats_ext_exprs"), null);
    }

    public <O extends Record> PgStatsExtExprs(Table<O> child, ForeignKey<O, PgStatsExtExprsRecord> key) {
        super(child, key, PG_STATS_EXT_EXPRS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatsExtExprs as(String alias) {
        return new PgStatsExtExprs(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatsExtExprs as(Name alias) {
        return new PgStatsExtExprs(alias, this);
    }

    @Override
    @NotNull
    public PgStatsExtExprs as(Table<?> alias) {
        return new PgStatsExtExprs(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatsExtExprs rename(String name) {
        return new PgStatsExtExprs(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatsExtExprs rename(Name name) {
        return new PgStatsExtExprs(name, null);
    }

    @Override
    @NotNull
    public PgStatsExtExprs rename(Table<?> name) {
        return new PgStatsExtExprs(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row17<String, String, String, String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function17<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Float, ? super Integer, ? super Float, ? super Object[], ? super Float[], ? super Object[], ? super Float, ? super Object[], ? super Float[], ? super Float[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function17<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Float, ? super Integer, ? super Float, ? super Object[], ? super Float[], ? super Object[], ? super Float, ? super Object[], ? super Float[], ? super Float[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
