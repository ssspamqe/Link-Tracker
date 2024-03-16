/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgOperatorRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function15;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row15;
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
public class PgOperator extends TableImpl<PgOperatorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_operator</code>
     */
    public static final PgOperator PG_OPERATOR = new PgOperator();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgOperatorRecord> getRecordType() {
        return PgOperatorRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_operator.oid</code>.
     */
    public final TableField<PgOperatorRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprname</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRNAME = createField(DSL.name("oprname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprnamespace</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRNAMESPACE = createField(DSL.name("oprnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprowner</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPROWNER = createField(DSL.name("oprowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprkind</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRKIND = createField(DSL.name("oprkind"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcanmerge</code>.
     */
    public final TableField<PgOperatorRecord, Boolean> OPRCANMERGE = createField(DSL.name("oprcanmerge"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcanhash</code>.
     */
    public final TableField<PgOperatorRecord, Boolean> OPRCANHASH = createField(DSL.name("oprcanhash"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprleft</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRLEFT = createField(DSL.name("oprleft"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprright</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRRIGHT = createField(DSL.name("oprright"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprresult</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRRESULT = createField(DSL.name("oprresult"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcom</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRCOM = createField(DSL.name("oprcom"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprnegate</code>.
     */
    public final TableField<PgOperatorRecord, Long> OPRNEGATE = createField(DSL.name("oprnegate"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcode</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRCODE = createField(DSL.name("oprcode"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprrest</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRREST = createField(DSL.name("oprrest"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprjoin</code>.
     */
    public final TableField<PgOperatorRecord, String> OPRJOIN = createField(DSL.name("oprjoin"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgOperator(Name alias, Table<PgOperatorRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgOperator(Name alias, Table<PgOperatorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    public PgOperator(String alias) {
        this(DSL.name(alias), PG_OPERATOR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    public PgOperator(Name alias) {
        this(alias, PG_OPERATOR);
    }

    /**
     * Create a <code>pg_catalog.pg_operator</code> table reference
     */
    public PgOperator() {
        this(DSL.name("pg_operator"), null);
    }

    public <O extends Record> PgOperator(Table<O> child, ForeignKey<O, PgOperatorRecord> key) {
        super(child, key, PG_OPERATOR);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgOperatorRecord> getPrimaryKey() {
        return Keys.PG_OPERATOR_OID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgOperatorRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_OPERATOR_OPRNAME_L_R_N_INDEX);
    }

    @Override
    @NotNull
    public PgOperator as(String alias) {
        return new PgOperator(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgOperator as(Name alias) {
        return new PgOperator(alias, this);
    }

    @Override
    @NotNull
    public PgOperator as(Table<?> alias) {
        return new PgOperator(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgOperator rename(String name) {
        return new PgOperator(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgOperator rename(Name name) {
        return new PgOperator(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgOperator rename(Table<?> name) {
        return new PgOperator(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row15<Long, String, Long, Long, String, Boolean, Boolean, Long, Long, Long, Long, Long, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super Long, ? super String, ? super Long, ? super Long, ? super String, ? super Boolean, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super Long, ? super String, ? super Long, ? super Long, ? super String, ? super Boolean, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}