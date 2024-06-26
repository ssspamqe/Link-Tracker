/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatXactAllTablesRecord;

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
public class PgStatXactAllTables extends TableImpl<PgStatXactAllTablesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatXactAllTables PG_STAT_XACT_ALL_TABLES = new PgStatXactAllTables();

    @Override
    @NotNull
    public Class<PgStatXactAllTablesRecord> getRecordType() {
        return PgStatXactAllTablesRecord.class;
    }

    public final TableField<PgStatXactAllTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatXactAllTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatXactAllTablesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatXactAllTablesRecord, Long> SEQ_SCAN = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatXactAllTablesRecord, Long> SEQ_TUP_READ = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatXactAllTablesRecord, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatXactAllTablesRecord, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_INS = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_UPD = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_DEL = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_HOT_UPD = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_NEWPAGE_UPD = createField(DSL.name("n_tup_newpage_upd"), SQLDataType.BIGINT, this, "");

    private PgStatXactAllTables(Name alias, Table<PgStatXactAllTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactAllTables(Name alias, Table<PgStatXactAllTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatXactAllTables(String alias) {
        this(DSL.name(alias), PG_STAT_XACT_ALL_TABLES);
    }

    public PgStatXactAllTables(Name alias) {
        this(alias, PG_STAT_XACT_ALL_TABLES);
    }

    public PgStatXactAllTables() {
        this(DSL.name("pg_stat_xact_all_tables"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatXactAllTables as(String alias) {
        return new PgStatXactAllTables(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatXactAllTables as(Name alias) {
        return new PgStatXactAllTables(alias, this);
    }

    @Override
    @NotNull
    public PgStatXactAllTables as(Table<?> alias) {
        return new PgStatXactAllTables(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatXactAllTables rename(String name) {
        return new PgStatXactAllTables(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatXactAllTables rename(Name name) {
        return new PgStatXactAllTables(name, null);
    }

    @Override
    @NotNull
    public PgStatXactAllTables rename(Table<?> name) {
        return new PgStatXactAllTables(name.getQualifiedName(), null);
    }
}
