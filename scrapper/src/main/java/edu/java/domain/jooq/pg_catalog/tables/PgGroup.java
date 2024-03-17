/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgGroupRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
public class PgGroup extends TableImpl<PgGroupRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgGroup PG_GROUP = new PgGroup();

    @Override
    @NotNull
    public Class<PgGroupRecord> getRecordType() {
        return PgGroupRecord.class;
    }

    public final TableField<PgGroupRecord, String> GRONAME = createField(DSL.name("groname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgGroupRecord, Long> GROSYSID = createField(DSL.name("grosysid"), SQLDataType.BIGINT, this, "");

    public final TableField<PgGroupRecord, Long[]> GROLIST = createField(DSL.name("grolist"), SQLDataType.BIGINT.array(), this, "");

    private PgGroup(Name alias, Table<PgGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgGroup(Name alias, Table<PgGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgGroup(String alias) {
        this(DSL.name(alias), PG_GROUP);
    }

    public PgGroup(Name alias) {
        this(alias, PG_GROUP);
    }

    public PgGroup() {
        this(DSL.name("pg_group"), null);
    }

    public <O extends Record> PgGroup(Table<O> child, ForeignKey<O, PgGroupRecord> key) {
        super(child, key, PG_GROUP);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgGroup as(String alias) {
        return new PgGroup(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgGroup as(Name alias) {
        return new PgGroup(alias, this);
    }

    @Override
    @NotNull
    public PgGroup as(Table<?> alias) {
        return new PgGroup(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgGroup rename(String name) {
        return new PgGroup(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgGroup rename(Name name) {
        return new PgGroup(name, null);
    }

    @Override
    @NotNull
    public PgGroup rename(Table<?> name) {
        return new PgGroup(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<String, Long, Long[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function3<? super String, ? super Long, ? super Long[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super Long, ? super Long[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
