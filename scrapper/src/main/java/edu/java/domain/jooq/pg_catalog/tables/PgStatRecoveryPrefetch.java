/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatRecoveryPrefetchRecord;

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
public class PgStatRecoveryPrefetch extends TableImpl<PgStatRecoveryPrefetchRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatRecoveryPrefetch PG_STAT_RECOVERY_PREFETCH = new PgStatRecoveryPrefetch();

    @Override
    @NotNull
    public Class<PgStatRecoveryPrefetchRecord> getRecordType() {
        return PgStatRecoveryPrefetchRecord.class;
    }

    public final TableField<PgStatRecoveryPrefetchRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatRecoveryPrefetchRecord, Long> PREFETCH = createField(DSL.name("prefetch"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatRecoveryPrefetchRecord, Long> HIT = createField(DSL.name("hit"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatRecoveryPrefetchRecord, Long> SKIP_INIT = createField(DSL.name("skip_init"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatRecoveryPrefetchRecord, Long> SKIP_NEW = createField(DSL.name("skip_new"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatRecoveryPrefetchRecord, Long> SKIP_FPW = createField(DSL.name("skip_fpw"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatRecoveryPrefetchRecord, Long> SKIP_REP = createField(DSL.name("skip_rep"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatRecoveryPrefetchRecord, Integer> WAL_DISTANCE = createField(DSL.name("wal_distance"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatRecoveryPrefetchRecord, Integer> BLOCK_DISTANCE = createField(DSL.name("block_distance"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatRecoveryPrefetchRecord, Integer> IO_DEPTH = createField(DSL.name("io_depth"), SQLDataType.INTEGER, this, "");

    private PgStatRecoveryPrefetch(Name alias, Table<PgStatRecoveryPrefetchRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatRecoveryPrefetch(Name alias, Table<PgStatRecoveryPrefetchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatRecoveryPrefetch(String alias) {
        this(DSL.name(alias), PG_STAT_RECOVERY_PREFETCH);
    }

    public PgStatRecoveryPrefetch(Name alias) {
        this(alias, PG_STAT_RECOVERY_PREFETCH);
    }

    public PgStatRecoveryPrefetch() {
        this(DSL.name("pg_stat_recovery_prefetch"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatRecoveryPrefetch as(String alias) {
        return new PgStatRecoveryPrefetch(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatRecoveryPrefetch as(Name alias) {
        return new PgStatRecoveryPrefetch(alias, this);
    }

    @Override
    @NotNull
    public PgStatRecoveryPrefetch as(Table<?> alias) {
        return new PgStatRecoveryPrefetch(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatRecoveryPrefetch rename(String name) {
        return new PgStatRecoveryPrefetch(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatRecoveryPrefetch rename(Name name) {
        return new PgStatRecoveryPrefetch(name, null);
    }

    @Override
    @NotNull
    public PgStatRecoveryPrefetch rename(Table<?> name) {
        return new PgStatRecoveryPrefetch(name.getQualifiedName(), null);
    }
}
