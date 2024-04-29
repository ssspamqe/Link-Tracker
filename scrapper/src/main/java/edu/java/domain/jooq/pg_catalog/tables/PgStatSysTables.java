/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatSysTablesRecord;

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
public class PgStatSysTables extends TableImpl<PgStatSysTablesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatSysTables PG_STAT_SYS_TABLES = new PgStatSysTables();

    @Override
    @NotNull
    public Class<PgStatSysTablesRecord> getRecordType() {
        return PgStatSysTablesRecord.class;
    }

    public final TableField<PgStatSysTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatSysTablesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatSysTablesRecord, Long> SEQ_SCAN = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_SEQ_SCAN = createField(DSL.name("last_seq_scan"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatSysTablesRecord, Long> SEQ_TUP_READ = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_IDX_SCAN = createField(DSL.name("last_idx_scan"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatSysTablesRecord, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> N_TUP_INS = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> N_TUP_UPD = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> N_TUP_DEL = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> N_TUP_HOT_UPD = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> N_TUP_NEWPAGE_UPD = createField(DSL.name("n_tup_newpage_upd"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> N_LIVE_TUP = createField(DSL.name("n_live_tup"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> N_DEAD_TUP = createField(DSL.name("n_dead_tup"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> N_MOD_SINCE_ANALYZE = createField(DSL.name("n_mod_since_analyze"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> N_INS_SINCE_VACUUM = createField(DSL.name("n_ins_since_vacuum"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_VACUUM = createField(DSL.name("last_vacuum"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_AUTOVACUUM = createField(DSL.name("last_autovacuum"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_ANALYZE = createField(DSL.name("last_analyze"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_AUTOANALYZE = createField(DSL.name("last_autoanalyze"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatSysTablesRecord, Long> VACUUM_COUNT = createField(DSL.name("vacuum_count"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> AUTOVACUUM_COUNT = createField(DSL.name("autovacuum_count"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> ANALYZE_COUNT = createField(DSL.name("analyze_count"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatSysTablesRecord, Long> AUTOANALYZE_COUNT = createField(DSL.name("autoanalyze_count"), SQLDataType.BIGINT, this, "");

    private PgStatSysTables(Name alias, Table<PgStatSysTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSysTables(Name alias, Table<PgStatSysTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatSysTables(String alias) {
        this(DSL.name(alias), PG_STAT_SYS_TABLES);
    }

    public PgStatSysTables(Name alias) {
        this(alias, PG_STAT_SYS_TABLES);
    }

    public PgStatSysTables() {
        this(DSL.name("pg_stat_sys_tables"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatSysTables as(String alias) {
        return new PgStatSysTables(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatSysTables as(Name alias) {
        return new PgStatSysTables(alias, this);
    }

    @Override
    @NotNull
    public PgStatSysTables as(Table<?> alias) {
        return new PgStatSysTables(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatSysTables rename(String name) {
        return new PgStatSysTables(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatSysTables rename(Name name) {
        return new PgStatSysTables(name, null);
    }

    @Override
    @NotNull
    public PgStatSysTables rename(Table<?> name) {
        return new PgStatSysTables(name.getQualifiedName(), null);
    }
}