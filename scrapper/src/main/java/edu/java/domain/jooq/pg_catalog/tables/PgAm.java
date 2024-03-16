/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgAmRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

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


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgAm extends TableImpl<PgAmRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_am</code>
     */
    public static final PgAm PG_AM = new PgAm();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgAmRecord> getRecordType() {
        return PgAmRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_am.oid</code>.
     */
    public final TableField<PgAmRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_am.amname</code>.
     */
    public final TableField<PgAmRecord, String> AMNAME = createField(DSL.name("amname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_am.amhandler</code>.
     */
    public final TableField<PgAmRecord, String> AMHANDLER = createField(DSL.name("amhandler"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_am.amtype</code>.
     */
    public final TableField<PgAmRecord, String> AMTYPE = createField(DSL.name("amtype"), SQLDataType.CHAR.nullable(false), this, "");

    private PgAm(Name alias, Table<PgAmRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAm(Name alias, Table<PgAmRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_am</code> table reference
     */
    public PgAm(String alias) {
        this(DSL.name(alias), PG_AM);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_am</code> table reference
     */
    public PgAm(Name alias) {
        this(alias, PG_AM);
    }

    /**
     * Create a <code>pg_catalog.pg_am</code> table reference
     */
    public PgAm() {
        this(DSL.name("pg_am"), null);
    }

    public <O extends Record> PgAm(Table<O> child, ForeignKey<O, PgAmRecord> key) {
        super(child, key, PG_AM);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgAmRecord> getPrimaryKey() {
        return Keys.PG_AM_OID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgAmRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_AM_NAME_INDEX);
    }

    @Override
    @NotNull
    public PgAm as(String alias) {
        return new PgAm(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgAm as(Name alias) {
        return new PgAm(alias, this);
    }

    @Override
    @NotNull
    public PgAm as(Table<?> alias) {
        return new PgAm(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgAm rename(String name) {
        return new PgAm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgAm rename(Name name) {
        return new PgAm(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgAm rename(Table<?> name) {
        return new PgAm(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}