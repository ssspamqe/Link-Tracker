/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgSeclabelRecord;

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
public class PgSeclabel extends TableImpl<PgSeclabelRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgSeclabel PG_SECLABEL = new PgSeclabel();

    @Override
    @NotNull
    public Class<PgSeclabelRecord> getRecordType() {
        return PgSeclabelRecord.class;
    }

    public final TableField<PgSeclabelRecord, Long> OBJOID = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSeclabelRecord, Long> CLASSOID = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSeclabelRecord, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "");

    public final TableField<PgSeclabelRecord, String> PROVIDER = createField(DSL.name("provider"), SQLDataType.CLOB.nullable(false), this, "");

    public final TableField<PgSeclabelRecord, String> LABEL = createField(DSL.name("label"), SQLDataType.CLOB.nullable(false), this, "");

    private PgSeclabel(Name alias, Table<PgSeclabelRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSeclabel(Name alias, Table<PgSeclabelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgSeclabel(String alias) {
        this(DSL.name(alias), PG_SECLABEL);
    }

    public PgSeclabel(Name alias) {
        this(alias, PG_SECLABEL);
    }

    public PgSeclabel() {
        this(DSL.name("pg_seclabel"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgSeclabel as(String alias) {
        return new PgSeclabel(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgSeclabel as(Name alias) {
        return new PgSeclabel(alias, this);
    }

    @Override
    @NotNull
    public PgSeclabel as(Table<?> alias) {
        return new PgSeclabel(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgSeclabel rename(String name) {
        return new PgSeclabel(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgSeclabel rename(Name name) {
        return new PgSeclabel(name, null);
    }

    @Override
    @NotNull
    public PgSeclabel rename(Table<?> name) {
        return new PgSeclabel(name.getQualifiedName(), null);
    }
}
