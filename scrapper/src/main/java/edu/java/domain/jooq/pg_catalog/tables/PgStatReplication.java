/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatReplicationRecord;

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
import org.jooq.types.YearToSecond;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatReplication extends TableImpl<PgStatReplicationRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatReplication PG_STAT_REPLICATION = new PgStatReplication();

    @Override
    @NotNull
    public Class<PgStatReplicationRecord> getRecordType() {
        return PgStatReplicationRecord.class;
    }

    public final TableField<PgStatReplicationRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatReplicationRecord, Long> USESYSID = createField(DSL.name("usesysid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatReplicationRecord, String> USENAME = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgStatReplicationRecord, String> APPLICATION_NAME = createField(DSL.name("application_name"), SQLDataType.CLOB, this, "");

    @Deprecated
    public final TableField<PgStatReplicationRecord, Object> CLIENT_ADDR = createField(DSL.name("client_addr"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"inet\""), this, "");

    public final TableField<PgStatReplicationRecord, String> CLIENT_HOSTNAME = createField(DSL.name("client_hostname"), SQLDataType.CLOB, this, "");

    public final TableField<PgStatReplicationRecord, Integer> CLIENT_PORT = createField(DSL.name("client_port"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatReplicationRecord, OffsetDateTime> BACKEND_START = createField(DSL.name("backend_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgStatReplicationRecord, Long> BACKEND_XMIN = createField(DSL.name("backend_xmin"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatReplicationRecord, String> STATE = createField(DSL.name("state"), SQLDataType.CLOB, this, "");

    @Deprecated
    public final TableField<PgStatReplicationRecord, Object> SENT_LSN = createField(DSL.name("sent_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    @Deprecated
    public final TableField<PgStatReplicationRecord, Object> WRITE_LSN = createField(DSL.name("write_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    @Deprecated
    public final TableField<PgStatReplicationRecord, Object> FLUSH_LSN = createField(DSL.name("flush_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    @Deprecated
    public final TableField<PgStatReplicationRecord, Object> REPLAY_LSN = createField(DSL.name("replay_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    public final TableField<PgStatReplicationRecord, YearToSecond> WRITE_LAG = createField(DSL.name("write_lag"), SQLDataType.INTERVAL, this, "");

    public final TableField<PgStatReplicationRecord, YearToSecond> FLUSH_LAG = createField(DSL.name("flush_lag"), SQLDataType.INTERVAL, this, "");

    public final TableField<PgStatReplicationRecord, YearToSecond> REPLAY_LAG = createField(DSL.name("replay_lag"), SQLDataType.INTERVAL, this, "");

    public final TableField<PgStatReplicationRecord, Integer> SYNC_PRIORITY = createField(DSL.name("sync_priority"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatReplicationRecord, String> SYNC_STATE = createField(DSL.name("sync_state"), SQLDataType.CLOB, this, "");

    public final TableField<PgStatReplicationRecord, OffsetDateTime> REPLY_TIME = createField(DSL.name("reply_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatReplication(Name alias, Table<PgStatReplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatReplication(Name alias, Table<PgStatReplicationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatReplication(String alias) {
        this(DSL.name(alias), PG_STAT_REPLICATION);
    }

    public PgStatReplication(Name alias) {
        this(alias, PG_STAT_REPLICATION);
    }

    public PgStatReplication() {
        this(DSL.name("pg_stat_replication"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatReplication as(String alias) {
        return new PgStatReplication(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatReplication as(Name alias) {
        return new PgStatReplication(alias, this);
    }

    @Override
    @NotNull
    public PgStatReplication as(Table<?> alias) {
        return new PgStatReplication(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatReplication rename(String name) {
        return new PgStatReplication(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatReplication rename(Name name) {
        return new PgStatReplication(name, null);
    }

    @Override
    @NotNull
    public PgStatReplication rename(Table<?> name) {
        return new PgStatReplication(name.getQualifiedName(), null);
    }
}