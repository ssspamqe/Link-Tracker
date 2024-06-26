/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgRewriteRecord;

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
public class PgRewrite extends TableImpl<PgRewriteRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgRewrite PG_REWRITE = new PgRewrite();

    @Override
    @NotNull
    public Class<PgRewriteRecord> getRecordType() {
        return PgRewriteRecord.class;
    }

    public final TableField<PgRewriteRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgRewriteRecord, String> RULENAME = createField(DSL.name("rulename"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgRewriteRecord, Long> EV_CLASS = createField(DSL.name("ev_class"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgRewriteRecord, String> EV_TYPE = createField(DSL.name("ev_type"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgRewriteRecord, String> EV_ENABLED = createField(DSL.name("ev_enabled"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgRewriteRecord, Boolean> IS_INSTEAD = createField(DSL.name("is_instead"), SQLDataType.BOOLEAN.nullable(false), this, "");

    @Deprecated
    public final TableField<PgRewriteRecord, Object> EV_QUAL = createField(DSL.name("ev_qual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\"").nullable(false), this, "");

    @Deprecated
    public final TableField<PgRewriteRecord, Object> EV_ACTION = createField(DSL.name("ev_action"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\"").nullable(false), this, "");

    private PgRewrite(Name alias, Table<PgRewriteRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgRewrite(Name alias, Table<PgRewriteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgRewrite(String alias) {
        this(DSL.name(alias), PG_REWRITE);
    }

    public PgRewrite(Name alias) {
        this(alias, PG_REWRITE);
    }

    public PgRewrite() {
        this(DSL.name("pg_rewrite"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgRewrite as(String alias) {
        return new PgRewrite(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgRewrite as(Name alias) {
        return new PgRewrite(alias, this);
    }

    @Override
    @NotNull
    public PgRewrite as(Table<?> alias) {
        return new PgRewrite(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgRewrite rename(String name) {
        return new PgRewrite(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgRewrite rename(Name name) {
        return new PgRewrite(name, null);
    }

    @Override
    @NotNull
    public PgRewrite rename(Table<?> name) {
        return new PgRewrite(name.getQualifiedName(), null);
    }
}
