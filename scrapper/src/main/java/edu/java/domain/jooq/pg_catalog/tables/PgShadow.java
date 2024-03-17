/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgShadowRecord;

import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
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
public class PgShadow extends TableImpl<PgShadowRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgShadow PG_SHADOW = new PgShadow();

    @Override
    @NotNull
    public Class<PgShadowRecord> getRecordType() {
        return PgShadowRecord.class;
    }

    public final TableField<PgShadowRecord, String> USENAME = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgShadowRecord, Long> USESYSID = createField(DSL.name("usesysid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgShadowRecord, Boolean> USECREATEDB = createField(DSL.name("usecreatedb"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgShadowRecord, Boolean> USESUPER = createField(DSL.name("usesuper"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgShadowRecord, Boolean> USEREPL = createField(DSL.name("userepl"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgShadowRecord, Boolean> USEBYPASSRLS = createField(DSL.name("usebypassrls"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgShadowRecord, String> PASSWD = createField(DSL.name("passwd"), SQLDataType.CLOB, this, "");

    public final TableField<PgShadowRecord, OffsetDateTime> VALUNTIL = createField(DSL.name("valuntil"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgShadowRecord, String[]> USECONFIG = createField(DSL.name("useconfig"), SQLDataType.CLOB.array(), this, "");

    private PgShadow(Name alias, Table<PgShadowRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgShadow(Name alias, Table<PgShadowRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgShadow(String alias) {
        this(DSL.name(alias), PG_SHADOW);
    }

    public PgShadow(Name alias) {
        this(alias, PG_SHADOW);
    }

    public PgShadow() {
        this(DSL.name("pg_shadow"), null);
    }

    public <O extends Record> PgShadow(Table<O> child, ForeignKey<O, PgShadowRecord> key) {
        super(child, key, PG_SHADOW);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgShadow as(String alias) {
        return new PgShadow(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgShadow as(Name alias) {
        return new PgShadow(alias, this);
    }

    @Override
    @NotNull
    public PgShadow as(Table<?> alias) {
        return new PgShadow(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgShadow rename(String name) {
        return new PgShadow(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgShadow rename(Name name) {
        return new PgShadow(name, null);
    }

    @Override
    @NotNull
    public PgShadow rename(Table<?> name) {
        return new PgShadow(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<String, Long, Boolean, Boolean, Boolean, Boolean, String, OffsetDateTime, String[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function9<? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super OffsetDateTime, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super OffsetDateTime, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
