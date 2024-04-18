/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLogicalSlotGetChangesRecord;

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
public class PgLogicalSlotGetChanges extends TableImpl<PgLogicalSlotGetChangesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgLogicalSlotGetChanges PG_LOGICAL_SLOT_GET_CHANGES = new PgLogicalSlotGetChanges();

    @Override
    @NotNull
    public Class<PgLogicalSlotGetChangesRecord> getRecordType() {
        return PgLogicalSlotGetChangesRecord.class;
    }

    @Deprecated
    public final TableField<PgLogicalSlotGetChangesRecord, Object> LSN = createField(DSL.name("lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    public final TableField<PgLogicalSlotGetChangesRecord, Long> XID = createField(DSL.name("xid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgLogicalSlotGetChangesRecord, String> DATA = createField(DSL.name("data"), SQLDataType.CLOB, this, "");

    private PgLogicalSlotGetChanges(Name alias, Table<PgLogicalSlotGetChangesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR),
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB)).array())
        });
    }

    private PgLogicalSlotGetChanges(Name alias, Table<PgLogicalSlotGetChangesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgLogicalSlotGetChanges(String alias) {
        this(DSL.name(alias), PG_LOGICAL_SLOT_GET_CHANGES);
    }

    public PgLogicalSlotGetChanges(Name alias) {
        this(alias, PG_LOGICAL_SLOT_GET_CHANGES);
    }

    public PgLogicalSlotGetChanges() {
        this(DSL.name("pg_logical_slot_get_changes"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgLogicalSlotGetChanges as(String alias) {
        return new PgLogicalSlotGetChanges(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotGetChanges as(Name alias) {
        return new PgLogicalSlotGetChanges(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotGetChanges as(Table<?> alias) {
        return new PgLogicalSlotGetChanges(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotGetChanges rename(String name) {
        return new PgLogicalSlotGetChanges(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotGetChanges rename(Name name) {
        return new PgLogicalSlotGetChanges(name, null, parameters);
    }

    @Override
    @NotNull
    public PgLogicalSlotGetChanges rename(Table<?> name) {
        return new PgLogicalSlotGetChanges(name.getQualifiedName(), null, parameters);
    }

    public PgLogicalSlotGetChanges call(
          String slotName
        , Object uptoLsn
        , Integer uptoNchanges
        , String[] options
    ) {
        PgLogicalSlotGetChanges result = new PgLogicalSlotGetChanges(DSL.name("pg_logical_slot_get_changes"), null, new Field[] {
            DSL.val(slotName, SQLDataType.VARCHAR),
            DSL.val(uptoLsn, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(uptoNchanges, SQLDataType.INTEGER),
            DSL.val(options, SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB)).array())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public PgLogicalSlotGetChanges call(
          Field<String> slotName
        , Field<Object> uptoLsn
        , Field<Integer> uptoNchanges
        , Field<String[]> options
    ) {
        PgLogicalSlotGetChanges result = new PgLogicalSlotGetChanges(DSL.name("pg_logical_slot_get_changes"), null, new Field[] {
            slotName,
            uptoLsn,
            uptoNchanges,
            options
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
