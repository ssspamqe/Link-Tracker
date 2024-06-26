/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgPoliciesRecord;

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
public class PgPolicies extends TableImpl<PgPoliciesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgPolicies PG_POLICIES = new PgPolicies();

    @Override
    @NotNull
    public Class<PgPoliciesRecord> getRecordType() {
        return PgPoliciesRecord.class;
    }

    public final TableField<PgPoliciesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgPoliciesRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgPoliciesRecord, String> POLICYNAME = createField(DSL.name("policyname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgPoliciesRecord, String> PERMISSIVE = createField(DSL.name("permissive"), SQLDataType.CLOB, this, "");

    public final TableField<PgPoliciesRecord, String[]> ROLES = createField(DSL.name("roles"), SQLDataType.VARCHAR.array(), this, "");

    public final TableField<PgPoliciesRecord, String> CMD = createField(DSL.name("cmd"), SQLDataType.CLOB, this, "");

    public final TableField<PgPoliciesRecord, String> QUAL = createField(DSL.name("qual"), SQLDataType.CLOB, this, "");

    public final TableField<PgPoliciesRecord, String> WITH_CHECK = createField(DSL.name("with_check"), SQLDataType.CLOB, this, "");

    private PgPolicies(Name alias, Table<PgPoliciesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPolicies(Name alias, Table<PgPoliciesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgPolicies(String alias) {
        this(DSL.name(alias), PG_POLICIES);
    }

    public PgPolicies(Name alias) {
        this(alias, PG_POLICIES);
    }

    public PgPolicies() {
        this(DSL.name("pg_policies"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgPolicies as(String alias) {
        return new PgPolicies(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgPolicies as(Name alias) {
        return new PgPolicies(alias, this);
    }

    @Override
    @NotNull
    public PgPolicies as(Table<?> alias) {
        return new PgPolicies(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgPolicies rename(String name) {
        return new PgPolicies(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgPolicies rename(Name name) {
        return new PgPolicies(name, null);
    }

    @Override
    @NotNull
    public PgPolicies rename(Table<?> name) {
        return new PgPolicies(name.getQualifiedName(), null);
    }
}
