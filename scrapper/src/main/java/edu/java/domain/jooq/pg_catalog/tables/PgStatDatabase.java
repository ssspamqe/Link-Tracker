/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatDatabaseRecord;

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
public class PgStatDatabase extends TableImpl<PgStatDatabaseRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatDatabase PG_STAT_DATABASE = new PgStatDatabase();

    @Override
    @NotNull
    public Class<PgStatDatabaseRecord> getRecordType() {
        return PgStatDatabaseRecord.class;
    }

    public final TableField<PgStatDatabaseRecord, Long> DATID = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, String> DATNAME = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatDatabaseRecord, Integer> NUMBACKENDS = createField(DSL.name("numbackends"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatDatabaseRecord, Long> XACT_COMMIT = createField(DSL.name("xact_commit"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> XACT_ROLLBACK = createField(DSL.name("xact_rollback"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> TUP_RETURNED = createField(DSL.name("tup_returned"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> TUP_FETCHED = createField(DSL.name("tup_fetched"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> TUP_INSERTED = createField(DSL.name("tup_inserted"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> TUP_UPDATED = createField(DSL.name("tup_updated"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> TUP_DELETED = createField(DSL.name("tup_deleted"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> CONFLICTS = createField(DSL.name("conflicts"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> TEMP_FILES = createField(DSL.name("temp_files"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> TEMP_BYTES = createField(DSL.name("temp_bytes"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> DEADLOCKS = createField(DSL.name("deadlocks"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> CHECKSUM_FAILURES = createField(DSL.name("checksum_failures"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, OffsetDateTime> CHECKSUM_LAST_FAILURE = createField(DSL.name("checksum_last_failure"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatDatabaseRecord, Double> BLK_READ_TIME = createField(DSL.name("blk_read_time"), SQLDataType.DOUBLE, this, "");

    public final TableField<PgStatDatabaseRecord, Double> BLK_WRITE_TIME = createField(DSL.name("blk_write_time"), SQLDataType.DOUBLE, this, "");

    public final TableField<PgStatDatabaseRecord, Double> SESSION_TIME = createField(DSL.name("session_time"), SQLDataType.DOUBLE, this, "");

    public final TableField<PgStatDatabaseRecord, Double> ACTIVE_TIME = createField(DSL.name("active_time"), SQLDataType.DOUBLE, this, "");

    public final TableField<PgStatDatabaseRecord, Double> IDLE_IN_TRANSACTION_TIME = createField(DSL.name("idle_in_transaction_time"), SQLDataType.DOUBLE, this, "");

    public final TableField<PgStatDatabaseRecord, Long> SESSIONS = createField(DSL.name("sessions"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> SESSIONS_ABANDONED = createField(DSL.name("sessions_abandoned"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> SESSIONS_FATAL = createField(DSL.name("sessions_fatal"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, Long> SESSIONS_KILLED = createField(DSL.name("sessions_killed"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatDatabaseRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatDatabase(Name alias, Table<PgStatDatabaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatDatabase(Name alias, Table<PgStatDatabaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatDatabase(String alias) {
        this(DSL.name(alias), PG_STAT_DATABASE);
    }

    public PgStatDatabase(Name alias) {
        this(alias, PG_STAT_DATABASE);
    }

    public PgStatDatabase() {
        this(DSL.name("pg_stat_database"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatDatabase as(String alias) {
        return new PgStatDatabase(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatDatabase as(Name alias) {
        return new PgStatDatabase(alias, this);
    }

    @Override
    @NotNull
    public PgStatDatabase as(Table<?> alias) {
        return new PgStatDatabase(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatDatabase rename(String name) {
        return new PgStatDatabase(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatDatabase rename(Name name) {
        return new PgStatDatabase(name, null);
    }

    @Override
    @NotNull
    public PgStatDatabase rename(Table<?> name) {
        return new PgStatDatabase(name.getQualifiedName(), null);
    }
}
