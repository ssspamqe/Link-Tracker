/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgRolesRecord;

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
public class PgRoles extends TableImpl<PgRolesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgRoles PG_ROLES = new PgRoles();

    @Override
    @NotNull
    public Class<PgRolesRecord> getRecordType() {
        return PgRolesRecord.class;
    }

    public final TableField<PgRolesRecord, String> ROLNAME = createField(DSL.name("rolname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgRolesRecord, Boolean> ROLSUPER = createField(DSL.name("rolsuper"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgRolesRecord, Boolean> ROLINHERIT = createField(DSL.name("rolinherit"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgRolesRecord, Boolean> ROLCREATEROLE = createField(DSL.name("rolcreaterole"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgRolesRecord, Boolean> ROLCREATEDB = createField(DSL.name("rolcreatedb"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgRolesRecord, Boolean> ROLCANLOGIN = createField(DSL.name("rolcanlogin"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgRolesRecord, Boolean> ROLREPLICATION = createField(DSL.name("rolreplication"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgRolesRecord, Integer> ROLCONNLIMIT = createField(DSL.name("rolconnlimit"), SQLDataType.INTEGER, this, "");

    public final TableField<PgRolesRecord, String> ROLPASSWORD = createField(DSL.name("rolpassword"), SQLDataType.CLOB, this, "");

    public final TableField<PgRolesRecord, OffsetDateTime> ROLVALIDUNTIL = createField(DSL.name("rolvaliduntil"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgRolesRecord, Boolean> ROLBYPASSRLS = createField(DSL.name("rolbypassrls"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgRolesRecord, String[]> ROLCONFIG = createField(DSL.name("rolconfig"), SQLDataType.CLOB.array(), this, "");

    public final TableField<PgRolesRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT, this, "");

    private PgRoles(Name alias, Table<PgRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgRoles(Name alias, Table<PgRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgRoles(String alias) {
        this(DSL.name(alias), PG_ROLES);
    }

    public PgRoles(Name alias) {
        this(alias, PG_ROLES);
    }

    public PgRoles() {
        this(DSL.name("pg_roles"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgRoles as(String alias) {
        return new PgRoles(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgRoles as(Name alias) {
        return new PgRoles(alias, this);
    }

    @Override
    @NotNull
    public PgRoles as(Table<?> alias) {
        return new PgRoles(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgRoles rename(String name) {
        return new PgRoles(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgRoles rename(Name name) {
        return new PgRoles(name, null);
    }

    @Override
    @NotNull
    public PgRoles rename(Table<?> name) {
        return new PgRoles(name.getQualifiedName(), null);
    }
}