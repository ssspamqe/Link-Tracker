/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgDescriptionRecord;

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
public class PgDescription extends TableImpl<PgDescriptionRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgDescription PG_DESCRIPTION = new PgDescription();

    @Override
    @NotNull
    public Class<PgDescriptionRecord> getRecordType() {
        return PgDescriptionRecord.class;
    }

    public final TableField<PgDescriptionRecord, Long> OBJOID = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgDescriptionRecord, Long> CLASSOID = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgDescriptionRecord, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "");

    public final TableField<PgDescriptionRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "");

    private PgDescription(Name alias, Table<PgDescriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDescription(Name alias, Table<PgDescriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgDescription(String alias) {
        this(DSL.name(alias), PG_DESCRIPTION);
    }

    public PgDescription(Name alias) {
        this(alias, PG_DESCRIPTION);
    }

    public PgDescription() {
        this(DSL.name("pg_description"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgDescription as(String alias) {
        return new PgDescription(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgDescription as(Name alias) {
        return new PgDescription(alias, this);
    }

    @Override
    @NotNull
    public PgDescription as(Table<?> alias) {
        return new PgDescription(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgDescription rename(String name) {
        return new PgDescription(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgDescription rename(Name name) {
        return new PgDescription(name, null);
    }

    @Override
    @NotNull
    public PgDescription rename(Table<?> name) {
        return new PgDescription(name.getQualifiedName(), null);
    }
}
