/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgTsTemplateRecord;

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
public class PgTsTemplate extends TableImpl<PgTsTemplateRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgTsTemplate PG_TS_TEMPLATE = new PgTsTemplate();

    @Override
    @NotNull
    public Class<PgTsTemplateRecord> getRecordType() {
        return PgTsTemplateRecord.class;
    }

    public final TableField<PgTsTemplateRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTsTemplateRecord, String> TMPLNAME = createField(DSL.name("tmplname"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTsTemplateRecord, Long> TMPLNAMESPACE = createField(DSL.name("tmplnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTsTemplateRecord, String> TMPLINIT = createField(DSL.name("tmplinit"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTsTemplateRecord, String> TMPLLEXIZE = createField(DSL.name("tmpllexize"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgTsTemplate(Name alias, Table<PgTsTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTsTemplate(Name alias, Table<PgTsTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgTsTemplate(String alias) {
        this(DSL.name(alias), PG_TS_TEMPLATE);
    }

    public PgTsTemplate(Name alias) {
        this(alias, PG_TS_TEMPLATE);
    }

    public PgTsTemplate() {
        this(DSL.name("pg_ts_template"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgTsTemplate as(String alias) {
        return new PgTsTemplate(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgTsTemplate as(Name alias) {
        return new PgTsTemplate(alias, this);
    }

    @Override
    @NotNull
    public PgTsTemplate as(Table<?> alias) {
        return new PgTsTemplate(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgTsTemplate rename(String name) {
        return new PgTsTemplate(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgTsTemplate rename(Name name) {
        return new PgTsTemplate(name, null);
    }

    @Override
    @NotNull
    public PgTsTemplate rename(Table<?> name) {
        return new PgTsTemplate(name.getQualifiedName(), null);
    }
}
