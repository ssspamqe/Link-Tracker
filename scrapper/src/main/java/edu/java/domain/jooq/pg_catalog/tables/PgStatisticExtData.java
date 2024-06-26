/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatisticExtDataRecord;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatisticRecord;

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
public class PgStatisticExtData extends TableImpl<PgStatisticExtDataRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatisticExtData PG_STATISTIC_EXT_DATA = new PgStatisticExtData();

    @Override
    @NotNull
    public Class<PgStatisticExtDataRecord> getRecordType() {
        return PgStatisticExtDataRecord.class;
    }

    public final TableField<PgStatisticExtDataRecord, Long> STXOID = createField(DSL.name("stxoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgStatisticExtDataRecord, Boolean> STXDINHERIT = createField(DSL.name("stxdinherit"), SQLDataType.BOOLEAN.nullable(false), this, "");

    @Deprecated
    public final TableField<PgStatisticExtDataRecord, Object> STXDNDISTINCT = createField(DSL.name("stxdndistinct"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_ndistinct\""), this, "");

    @Deprecated
    public final TableField<PgStatisticExtDataRecord, Object> STXDDEPENDENCIES = createField(DSL.name("stxddependencies"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_dependencies\""), this, "");

    @Deprecated
    public final TableField<PgStatisticExtDataRecord, Object> STXDMCV = createField(DSL.name("stxdmcv"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_mcv_list\""), this, "");

    public final TableField<PgStatisticExtDataRecord, PgStatisticRecord[]> STXDEXPR = createField(DSL.name("stxdexpr"), edu.java.domain.jooq.pg_catalog.tables.PgStatistic.PG_STATISTIC.getDataType().array(), this, "");

    private PgStatisticExtData(Name alias, Table<PgStatisticExtDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatisticExtData(Name alias, Table<PgStatisticExtDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgStatisticExtData(String alias) {
        this(DSL.name(alias), PG_STATISTIC_EXT_DATA);
    }

    public PgStatisticExtData(Name alias) {
        this(alias, PG_STATISTIC_EXT_DATA);
    }

    public PgStatisticExtData() {
        this(DSL.name("pg_statistic_ext_data"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatisticExtData as(String alias) {
        return new PgStatisticExtData(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatisticExtData as(Name alias) {
        return new PgStatisticExtData(alias, this);
    }

    @Override
    @NotNull
    public PgStatisticExtData as(Table<?> alias) {
        return new PgStatisticExtData(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatisticExtData rename(String name) {
        return new PgStatisticExtData(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatisticExtData rename(Name name) {
        return new PgStatisticExtData(name, null);
    }

    @Override
    @NotNull
    public PgStatisticExtData rename(Table<?> name) {
        return new PgStatisticExtData(name.getQualifiedName(), null);
    }
}
