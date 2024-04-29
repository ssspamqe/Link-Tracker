/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatGetBackendIdsetRecord;

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
public class PgStatGetBackendIdset extends TableImpl<PgStatGetBackendIdsetRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgStatGetBackendIdset PG_STAT_GET_BACKEND_IDSET = new PgStatGetBackendIdset();

    @Override
    @NotNull
    public Class<PgStatGetBackendIdsetRecord> getRecordType() {
        return PgStatGetBackendIdsetRecord.class;
    }

    public final TableField<PgStatGetBackendIdsetRecord, Integer> PG_STAT_GET_BACKEND_IDSET_ = createField(DSL.name("pg_stat_get_backend_idset"), SQLDataType.INTEGER, this, "");

    private PgStatGetBackendIdset(Name alias, Table<PgStatGetBackendIdsetRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgStatGetBackendIdset(Name alias, Table<PgStatGetBackendIdsetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgStatGetBackendIdset(String alias) {
        this(DSL.name(alias), PG_STAT_GET_BACKEND_IDSET);
    }

    public PgStatGetBackendIdset(Name alias) {
        this(alias, PG_STAT_GET_BACKEND_IDSET);
    }

    public PgStatGetBackendIdset() {
        this(DSL.name("pg_stat_get_backend_idset"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatGetBackendIdset as(String alias) {
        return new PgStatGetBackendIdset(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetBackendIdset as(Name alias) {
        return new PgStatGetBackendIdset(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetBackendIdset as(Table<?> alias) {
        return new PgStatGetBackendIdset(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgStatGetBackendIdset rename(String name) {
        return new PgStatGetBackendIdset(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgStatGetBackendIdset rename(Name name) {
        return new PgStatGetBackendIdset(name, null, parameters);
    }

    @Override
    @NotNull
    public PgStatGetBackendIdset rename(Table<?> name) {
        return new PgStatGetBackendIdset(name.getQualifiedName(), null, parameters);
    }

    public PgStatGetBackendIdset call() {
        PgStatGetBackendIdset result = new PgStatGetBackendIdset(DSL.name("pg_stat_get_backend_idset"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}