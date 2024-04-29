/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgReplicationOriginStatusRecord;

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
public class PgReplicationOriginStatus extends TableImpl<PgReplicationOriginStatusRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgReplicationOriginStatus PG_REPLICATION_ORIGIN_STATUS = new PgReplicationOriginStatus();

    @Override
    @NotNull
    public Class<PgReplicationOriginStatusRecord> getRecordType() {
        return PgReplicationOriginStatusRecord.class;
    }

    public final TableField<PgReplicationOriginStatusRecord, Long> LOCAL_ID = createField(DSL.name("local_id"), SQLDataType.BIGINT, this, "");

    public final TableField<PgReplicationOriginStatusRecord, String> EXTERNAL_ID = createField(DSL.name("external_id"), SQLDataType.CLOB, this, "");

    @Deprecated
    public final TableField<PgReplicationOriginStatusRecord, Object> REMOTE_LSN = createField(DSL.name("remote_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    @Deprecated
    public final TableField<PgReplicationOriginStatusRecord, Object> LOCAL_LSN = createField(DSL.name("local_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    private PgReplicationOriginStatus(Name alias, Table<PgReplicationOriginStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgReplicationOriginStatus(Name alias, Table<PgReplicationOriginStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgReplicationOriginStatus(String alias) {
        this(DSL.name(alias), PG_REPLICATION_ORIGIN_STATUS);
    }

    public PgReplicationOriginStatus(Name alias) {
        this(alias, PG_REPLICATION_ORIGIN_STATUS);
    }

    public PgReplicationOriginStatus() {
        this(DSL.name("pg_replication_origin_status"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgReplicationOriginStatus as(String alias) {
        return new PgReplicationOriginStatus(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgReplicationOriginStatus as(Name alias) {
        return new PgReplicationOriginStatus(alias, this);
    }

    @Override
    @NotNull
    public PgReplicationOriginStatus as(Table<?> alias) {
        return new PgReplicationOriginStatus(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgReplicationOriginStatus rename(String name) {
        return new PgReplicationOriginStatus(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgReplicationOriginStatus rename(Name name) {
        return new PgReplicationOriginStatus(name, null);
    }

    @Override
    @NotNull
    public PgReplicationOriginStatus rename(Table<?> name) {
        return new PgReplicationOriginStatus(name.getQualifiedName(), null);
    }
}