/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgGetWalResourceManagersRecord;

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
public class PgGetWalResourceManagers extends TableImpl<PgGetWalResourceManagersRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgGetWalResourceManagers PG_GET_WAL_RESOURCE_MANAGERS = new PgGetWalResourceManagers();

    @Override
    @NotNull
    public Class<PgGetWalResourceManagersRecord> getRecordType() {
        return PgGetWalResourceManagersRecord.class;
    }

    public final TableField<PgGetWalResourceManagersRecord, Integer> RM_ID = createField(DSL.name("rm_id"), SQLDataType.INTEGER, this, "");

    public final TableField<PgGetWalResourceManagersRecord, String> RM_NAME = createField(DSL.name("rm_name"), SQLDataType.CLOB, this, "");

    public final TableField<PgGetWalResourceManagersRecord, Boolean> RM_BUILTIN = createField(DSL.name("rm_builtin"), SQLDataType.BOOLEAN, this, "");

    private PgGetWalResourceManagers(Name alias, Table<PgGetWalResourceManagersRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgGetWalResourceManagers(Name alias, Table<PgGetWalResourceManagersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgGetWalResourceManagers(String alias) {
        this(DSL.name(alias), PG_GET_WAL_RESOURCE_MANAGERS);
    }

    public PgGetWalResourceManagers(Name alias) {
        this(alias, PG_GET_WAL_RESOURCE_MANAGERS);
    }

    public PgGetWalResourceManagers() {
        this(DSL.name("pg_get_wal_resource_managers"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgGetWalResourceManagers as(String alias) {
        return new PgGetWalResourceManagers(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgGetWalResourceManagers as(Name alias) {
        return new PgGetWalResourceManagers(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgGetWalResourceManagers as(Table<?> alias) {
        return new PgGetWalResourceManagers(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgGetWalResourceManagers rename(String name) {
        return new PgGetWalResourceManagers(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgGetWalResourceManagers rename(Name name) {
        return new PgGetWalResourceManagers(name, null, parameters);
    }

    @Override
    @NotNull
    public PgGetWalResourceManagers rename(Table<?> name) {
        return new PgGetWalResourceManagers(name.getQualifiedName(), null, parameters);
    }

    public PgGetWalResourceManagers call() {
        PgGetWalResourceManagers result = new PgGetWalResourceManagers(DSL.name("pg_get_wal_resource_managers"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
