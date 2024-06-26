/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatGetSlruRecord;

import java.time.OffsetDateTime;

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
public class PgStatGetSlru extends TableImpl<PgStatGetSlruRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatGetSlru PG_STAT_GET_SLRU = new PgStatGetSlru();

    @Override
    @NotNull
    public Class<PgStatGetSlruRecord> getRecordType() {
        return PgStatGetSlruRecord.class;
    }

    public final TableField<PgStatGetSlruRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    public final TableField<PgStatGetSlruRecord, Long> BLKS_ZEROED = createField(DSL.name("blks_zeroed"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatGetSlruRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatGetSlruRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatGetSlruRecord, Long> BLKS_WRITTEN = createField(DSL.name("blks_written"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatGetSlruRecord, Long> BLKS_EXISTS = createField(DSL.name("blks_exists"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatGetSlruRecord, Long> FLUSHES = createField(DSL.name("flushes"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatGetSlruRecord, Long> TRUNCATES = createField(DSL.name("truncates"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatGetSlruRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatGetSlru(Name alias, Table<PgStatGetSlruRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgStatGetSlru(Name alias, Table<PgStatGetSlruRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgStatGetSlru(String alias) {
        this(DSL.name(alias), PG_STAT_GET_SLRU);
    }

    public PgStatGetSlru(Name alias) {
        this(alias, PG_STAT_GET_SLRU);
    }

    public PgStatGetSlru() {
        this(DSL.name("pg_stat_get_slru"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatGetSlru as(String alias) {
        return new PgStatGetSlru(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSlru as(Name alias) {
        return new PgStatGetSlru(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSlru as(Table<?> alias) {
        return new PgStatGetSlru(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSlru rename(String name) {
        return new PgStatGetSlru(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSlru rename(Name name) {
        return new PgStatGetSlru(name, null, parameters);
    }

    @Override
    @NotNull
    public PgStatGetSlru rename(Table<?> name) {
        return new PgStatGetSlru(name.getQualifiedName(), null, parameters);
    }

    public PgStatGetSlru call() {
        PgStatGetSlru result = new PgStatGetSlru(DSL.name("pg_stat_get_slru"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
