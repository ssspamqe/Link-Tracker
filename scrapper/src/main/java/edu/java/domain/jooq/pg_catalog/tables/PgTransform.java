/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgTransformRecord;

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
public class PgTransform extends TableImpl<PgTransformRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgTransform PG_TRANSFORM = new PgTransform();

    @Override
    @NotNull
    public Class<PgTransformRecord> getRecordType() {
        return PgTransformRecord.class;
    }

    public final TableField<PgTransformRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTransformRecord, Long> TRFTYPE = createField(DSL.name("trftype"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTransformRecord, Long> TRFLANG = createField(DSL.name("trflang"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgTransformRecord, String> TRFFROMSQL = createField(DSL.name("trffromsql"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgTransformRecord, String> TRFTOSQL = createField(DSL.name("trftosql"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgTransform(Name alias, Table<PgTransformRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTransform(Name alias, Table<PgTransformRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgTransform(String alias) {
        this(DSL.name(alias), PG_TRANSFORM);
    }

    public PgTransform(Name alias) {
        this(alias, PG_TRANSFORM);
    }

    public PgTransform() {
        this(DSL.name("pg_transform"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgTransform as(String alias) {
        return new PgTransform(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgTransform as(Name alias) {
        return new PgTransform(alias, this);
    }

    @Override
    @NotNull
    public PgTransform as(Table<?> alias) {
        return new PgTransform(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgTransform rename(String name) {
        return new PgTransform(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgTransform rename(Name name) {
        return new PgTransform(name, null);
    }

    @Override
    @NotNull
    public PgTransform rename(Table<?> name) {
        return new PgTransform(name.getQualifiedName(), null);
    }
}