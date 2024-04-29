/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatProgressBasebackupRecord;

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
public class PgStatProgressBasebackup extends TableImpl<PgStatProgressBasebackupRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatProgressBasebackup PG_STAT_PROGRESS_BASEBACKUP = new PgStatProgressBasebackup();

    @Override
    @NotNull
    public Class<PgStatProgressBasebackupRecord> getRecordType() {
        return PgStatProgressBasebackupRecord.class;
    }

    public final TableField<PgStatProgressBasebackupRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    public final TableField<PgStatProgressBasebackupRecord, String> PHASE = createField(DSL.name("phase"), SQLDataType.CLOB, this, "");

    public final TableField<PgStatProgressBasebackupRecord, Long> BACKUP_TOTAL = createField(DSL.name("backup_total"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatProgressBasebackupRecord, Long> BACKUP_STREAMED = createField(DSL.name("backup_streamed"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatProgressBasebackupRecord, Long> TABLESPACES_TOTAL = createField(DSL.name("tablespaces_total"), SQLDataType.BIGINT, this, "");

    public final TableField<PgStatProgressBasebackupRecord, Long> TABLESPACES_STREAMED = createField(DSL.name("tablespaces_streamed"), SQLDataType.BIGINT, this, "");

    private PgStatProgressBasebackup(Name alias, Table<PgStatProgressBasebackupRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatProgressBasebackup(Name alias, Table<PgStatProgressBasebackupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgStatProgressBasebackup(String alias) {
        this(DSL.name(alias), PG_STAT_PROGRESS_BASEBACKUP);
    }

    public PgStatProgressBasebackup(Name alias) {
        this(alias, PG_STAT_PROGRESS_BASEBACKUP);
    }

    public PgStatProgressBasebackup() {
        this(DSL.name("pg_stat_progress_basebackup"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatProgressBasebackup as(String alias) {
        return new PgStatProgressBasebackup(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatProgressBasebackup as(Name alias) {
        return new PgStatProgressBasebackup(alias, this);
    }

    @Override
    @NotNull
    public PgStatProgressBasebackup as(Table<?> alias) {
        return new PgStatProgressBasebackup(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgStatProgressBasebackup rename(String name) {
        return new PgStatProgressBasebackup(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgStatProgressBasebackup rename(Name name) {
        return new PgStatProgressBasebackup(name, null);
    }

    @Override
    @NotNull
    public PgStatProgressBasebackup rename(Table<?> name) {
        return new PgStatProgressBasebackup(name.getQualifiedName(), null);
    }
}