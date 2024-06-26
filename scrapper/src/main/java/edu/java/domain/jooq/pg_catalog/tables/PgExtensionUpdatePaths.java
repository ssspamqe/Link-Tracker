/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgExtensionUpdatePathsRecord;

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
public class PgExtensionUpdatePaths extends TableImpl<PgExtensionUpdatePathsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgExtensionUpdatePaths PG_EXTENSION_UPDATE_PATHS = new PgExtensionUpdatePaths();

    @Override
    @NotNull
    public Class<PgExtensionUpdatePathsRecord> getRecordType() {
        return PgExtensionUpdatePathsRecord.class;
    }

    public final TableField<PgExtensionUpdatePathsRecord, String> SOURCE = createField(DSL.name("source"), SQLDataType.CLOB, this, "");

    public final TableField<PgExtensionUpdatePathsRecord, String> TARGET = createField(DSL.name("target"), SQLDataType.CLOB, this, "");

    public final TableField<PgExtensionUpdatePathsRecord, String> PATH = createField(DSL.name("path"), SQLDataType.CLOB, this, "");

    private PgExtensionUpdatePaths(Name alias, Table<PgExtensionUpdatePathsRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR)
        });
    }

    private PgExtensionUpdatePaths(Name alias, Table<PgExtensionUpdatePathsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgExtensionUpdatePaths(String alias) {
        this(DSL.name(alias), PG_EXTENSION_UPDATE_PATHS);
    }

    public PgExtensionUpdatePaths(Name alias) {
        this(alias, PG_EXTENSION_UPDATE_PATHS);
    }

    public PgExtensionUpdatePaths() {
        this(DSL.name("pg_extension_update_paths"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgExtensionUpdatePaths as(String alias) {
        return new PgExtensionUpdatePaths(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgExtensionUpdatePaths as(Name alias) {
        return new PgExtensionUpdatePaths(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgExtensionUpdatePaths as(Table<?> alias) {
        return new PgExtensionUpdatePaths(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgExtensionUpdatePaths rename(String name) {
        return new PgExtensionUpdatePaths(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgExtensionUpdatePaths rename(Name name) {
        return new PgExtensionUpdatePaths(name, null, parameters);
    }

    @Override
    @NotNull
    public PgExtensionUpdatePaths rename(Table<?> name) {
        return new PgExtensionUpdatePaths(name.getQualifiedName(), null, parameters);
    }

    public PgExtensionUpdatePaths call(
          String name
    ) {
        PgExtensionUpdatePaths result = new PgExtensionUpdatePaths(DSL.name("pg_extension_update_paths"), null, new Field[] {
            DSL.val(name, SQLDataType.VARCHAR)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public PgExtensionUpdatePaths call(
          Field<String> name
    ) {
        PgExtensionUpdatePaths result = new PgExtensionUpdatePaths(DSL.name("pg_extension_update_paths"), null, new Field[] {
            name
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
