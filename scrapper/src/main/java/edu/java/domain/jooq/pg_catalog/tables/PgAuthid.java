/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgAuthidRecord;

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
public class PgAuthid extends TableImpl<PgAuthidRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgAuthid PG_AUTHID = new PgAuthid();

    @Override
    @NotNull
    public Class<PgAuthidRecord> getRecordType() {
        return PgAuthidRecord.class;
    }

    public final TableField<PgAuthidRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgAuthidRecord, String> ROLNAME = createField(DSL.name("rolname"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgAuthidRecord, Boolean> ROLSUPER = createField(DSL.name("rolsuper"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgAuthidRecord, Boolean> ROLINHERIT = createField(DSL.name("rolinherit"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgAuthidRecord, Boolean> ROLCREATEROLE = createField(DSL.name("rolcreaterole"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgAuthidRecord, Boolean> ROLCREATEDB = createField(DSL.name("rolcreatedb"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgAuthidRecord, Boolean> ROLCANLOGIN = createField(DSL.name("rolcanlogin"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgAuthidRecord, Boolean> ROLREPLICATION = createField(DSL.name("rolreplication"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgAuthidRecord, Boolean> ROLBYPASSRLS = createField(DSL.name("rolbypassrls"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgAuthidRecord, Integer> ROLCONNLIMIT = createField(DSL.name("rolconnlimit"), SQLDataType.INTEGER.nullable(false), this, "");

    public final TableField<PgAuthidRecord, String> ROLPASSWORD = createField(DSL.name("rolpassword"), SQLDataType.CLOB, this, "");

    public final TableField<PgAuthidRecord, OffsetDateTime> ROLVALIDUNTIL = createField(DSL.name("rolvaliduntil"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgAuthid(Name alias, Table<PgAuthidRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAuthid(Name alias, Table<PgAuthidRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgAuthid(String alias) {
        this(DSL.name(alias), PG_AUTHID);
    }

    public PgAuthid(Name alias) {
        this(alias, PG_AUTHID);
    }

    public PgAuthid() {
        this(DSL.name("pg_authid"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgAuthid as(String alias) {
        return new PgAuthid(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgAuthid as(Name alias) {
        return new PgAuthid(alias, this);
    }

    @Override
    @NotNull
    public PgAuthid as(Table<?> alias) {
        return new PgAuthid(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgAuthid rename(String name) {
        return new PgAuthid(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgAuthid rename(Name name) {
        return new PgAuthid(name, null);
    }

    @Override
    @NotNull
    public PgAuthid rename(Table<?> name) {
        return new PgAuthid(name.getQualifiedName(), null);
    }
}