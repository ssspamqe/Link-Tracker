/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgTypeRecord;

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
public class PgType extends TableImpl<PgTypeRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgType PG_TYPE = new PgType();

    @Override
    @NotNull
    public Class<PgTypeRecord> getRecordType() {
        return PgTypeRecord.class;
    }

    public final TableField<PgTypeRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPNAME = createField(DSL.name("typname"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, Long> TYPNAMESPACE = createField(DSL.name("typnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTypeRecord, Long> TYPOWNER = createField(DSL.name("typowner"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTypeRecord, Short> TYPLEN = createField(DSL.name("typlen"), SQLDataType.SMALLINT.nullable(false), this, "");

    public final TableField<PgTypeRecord, Boolean> TYPBYVAL = createField(DSL.name("typbyval"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPTYPE = createField(DSL.name("typtype"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPCATEGORY = createField(DSL.name("typcategory"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, Boolean> TYPISPREFERRED = createField(DSL.name("typispreferred"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgTypeRecord, Boolean> TYPISDEFINED = createField(DSL.name("typisdefined"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPDELIM = createField(DSL.name("typdelim"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, Long> TYPRELID = createField(DSL.name("typrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPSUBSCRIPT = createField(DSL.name("typsubscript"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, Long> TYPELEM = createField(DSL.name("typelem"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTypeRecord, Long> TYPARRAY = createField(DSL.name("typarray"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPINPUT = createField(DSL.name("typinput"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPOUTPUT = createField(DSL.name("typoutput"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPRECEIVE = createField(DSL.name("typreceive"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPSEND = createField(DSL.name("typsend"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPMODIN = createField(DSL.name("typmodin"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPMODOUT = createField(DSL.name("typmodout"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPANALYZE = createField(DSL.name("typanalyze"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPALIGN = createField(DSL.name("typalign"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, String> TYPSTORAGE = createField(DSL.name("typstorage"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgTypeRecord, Boolean> TYPNOTNULL = createField(DSL.name("typnotnull"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgTypeRecord, Long> TYPBASETYPE = createField(DSL.name("typbasetype"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTypeRecord, Integer> TYPTYPMOD = createField(DSL.name("typtypmod"), SQLDataType.INTEGER.nullable(false), this, "");

    public final TableField<PgTypeRecord, Integer> TYPNDIMS = createField(DSL.name("typndims"), SQLDataType.INTEGER.nullable(false), this, "");

    public final TableField<PgTypeRecord, Long> TYPCOLLATION = createField(DSL.name("typcollation"), SQLDataType.BIGINT.nullable(false), this, "");

    @Deprecated
    public final TableField<PgTypeRecord, Object> TYPDEFAULTBIN = createField(DSL.name("typdefaultbin"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    public final TableField<PgTypeRecord, String> TYPDEFAULT = createField(DSL.name("typdefault"), SQLDataType.CLOB, this, "");

    public final TableField<PgTypeRecord, String[]> TYPACL = createField(DSL.name("typacl"), SQLDataType.VARCHAR.array(), this, "");

    private PgType(Name alias, Table<PgTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgType(Name alias, Table<PgTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgType(String alias) {
        this(DSL.name(alias), PG_TYPE);
    }

    public PgType(Name alias) {
        this(alias, PG_TYPE);
    }

    public PgType() {
        this(DSL.name("pg_type"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgType as(String alias) {
        return new PgType(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgType as(Name alias) {
        return new PgType(alias, this);
    }

    @Override
    @NotNull
    public PgType as(Table<?> alias) {
        return new PgType(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgType rename(String name) {
        return new PgType(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgType rename(Name name) {
        return new PgType(name, null);
    }

    @Override
    @NotNull
    public PgType rename(Table<?> name) {
        return new PgType(name.getQualifiedName(), null);
    }
}
