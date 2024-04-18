/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgEventTriggerRecord;

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
public class PgEventTrigger extends TableImpl<PgEventTriggerRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgEventTrigger PG_EVENT_TRIGGER = new PgEventTrigger();

    @Override
    @NotNull
    public Class<PgEventTriggerRecord> getRecordType() {
        return PgEventTriggerRecord.class;
    }

    public final TableField<PgEventTriggerRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgEventTriggerRecord, String> EVTNAME = createField(DSL.name("evtname"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgEventTriggerRecord, String> EVTEVENT = createField(DSL.name("evtevent"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgEventTriggerRecord, Long> EVTOWNER = createField(DSL.name("evtowner"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgEventTriggerRecord, Long> EVTFOID = createField(DSL.name("evtfoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgEventTriggerRecord, String> EVTENABLED = createField(DSL.name("evtenabled"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgEventTriggerRecord, String[]> EVTTAGS = createField(DSL.name("evttags"), SQLDataType.CLOB.array(), this, "");

    private PgEventTrigger(Name alias, Table<PgEventTriggerRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgEventTrigger(Name alias, Table<PgEventTriggerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgEventTrigger(String alias) {
        this(DSL.name(alias), PG_EVENT_TRIGGER);
    }

    public PgEventTrigger(Name alias) {
        this(alias, PG_EVENT_TRIGGER);
    }

    public PgEventTrigger() {
        this(DSL.name("pg_event_trigger"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgEventTrigger as(String alias) {
        return new PgEventTrigger(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgEventTrigger as(Name alias) {
        return new PgEventTrigger(alias, this);
    }

    @Override
    @NotNull
    public PgEventTrigger as(Table<?> alias) {
        return new PgEventTrigger(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgEventTrigger rename(String name) {
        return new PgEventTrigger(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgEventTrigger rename(Name name) {
        return new PgEventTrigger(name, null);
    }

    @Override
    @NotNull
    public PgEventTrigger rename(Table<?> name) {
        return new PgEventTrigger(name.getQualifiedName(), null);
    }
}
