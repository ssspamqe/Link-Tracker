/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgInheritsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
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
public class PgInherits extends TableImpl<PgInheritsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgInherits PG_INHERITS = new PgInherits();

    @Override
    @NotNull
    public Class<PgInheritsRecord> getRecordType() {
        return PgInheritsRecord.class;
    }

    public final TableField<PgInheritsRecord, Long> INHRELID = createField(DSL.name("inhrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgInheritsRecord, Long> INHPARENT = createField(DSL.name("inhparent"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgInheritsRecord, Integer> INHSEQNO = createField(DSL.name("inhseqno"), SQLDataType.INTEGER.nullable(false), this, "");

    public final TableField<PgInheritsRecord, Boolean> INHDETACHPENDING = createField(DSL.name("inhdetachpending"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private PgInherits(Name alias, Table<PgInheritsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgInherits(Name alias, Table<PgInheritsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgInherits(String alias) {
        this(DSL.name(alias), PG_INHERITS);
    }

    public PgInherits(Name alias) {
        this(alias, PG_INHERITS);
    }

    public PgInherits() {
        this(DSL.name("pg_inherits"), null);
    }

    public <O extends Record> PgInherits(Table<O> child, ForeignKey<O, PgInheritsRecord> key) {
        super(child, key, PG_INHERITS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgInheritsRecord> getPrimaryKey() {
        return Keys.PG_INHERITS_RELID_SEQNO_INDEX;
    }

    @Override
    @NotNull
    public PgInherits as(String alias) {
        return new PgInherits(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgInherits as(Name alias) {
        return new PgInherits(alias, this);
    }

    @Override
    @NotNull
    public PgInherits as(Table<?> alias) {
        return new PgInherits(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgInherits rename(String name) {
        return new PgInherits(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgInherits rename(Name name) {
        return new PgInherits(name, null);
    }

    @Override
    @NotNull
    public PgInherits rename(Table<?> name) {
        return new PgInherits(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, Long, Integer, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function4<? super Long, ? super Long, ? super Integer, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super Long, ? super Integer, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
