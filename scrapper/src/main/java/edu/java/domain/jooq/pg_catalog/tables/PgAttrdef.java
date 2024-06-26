/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgAttrdefRecord;

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
public class PgAttrdef extends TableImpl<PgAttrdefRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgAttrdef PG_ATTRDEF = new PgAttrdef();

    @Override
    @NotNull
    public Class<PgAttrdefRecord> getRecordType() {
        return PgAttrdefRecord.class;
    }

    public final TableField<PgAttrdefRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgAttrdefRecord, Long> ADRELID = createField(DSL.name("adrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgAttrdefRecord, Short> ADNUM = createField(DSL.name("adnum"), SQLDataType.SMALLINT.nullable(false), this, "");

    @Deprecated
    public final TableField<PgAttrdefRecord, Object> ADBIN = createField(DSL.name("adbin"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\"").nullable(false), this, "");

    private PgAttrdef(Name alias, Table<PgAttrdefRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAttrdef(Name alias, Table<PgAttrdefRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgAttrdef(String alias) {
        this(DSL.name(alias), PG_ATTRDEF);
    }

    public PgAttrdef(Name alias) {
        this(alias, PG_ATTRDEF);
    }

    public PgAttrdef() {
        this(DSL.name("pg_attrdef"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgAttrdef as(String alias) {
        return new PgAttrdef(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgAttrdef as(Name alias) {
        return new PgAttrdef(alias, this);
    }

    @Override
    @NotNull
    public PgAttrdef as(Table<?> alias) {
        return new PgAttrdef(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgAttrdef rename(String name) {
        return new PgAttrdef(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgAttrdef rename(Name name) {
        return new PgAttrdef(name, null);
    }

    @Override
    @NotNull
    public PgAttrdef rename(Table<?> name) {
        return new PgAttrdef(name.getQualifiedName(), null);
    }
}
