/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.TsDebugRecord;

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
public class TsDebug extends TableImpl<TsDebugRecord> {

    private static final long serialVersionUID = 1L;

    public static final TsDebug TS_DEBUG = new TsDebug();

    @Override
    @NotNull
    public Class<TsDebugRecord> getRecordType() {
        return TsDebugRecord.class;
    }

    public final TableField<TsDebugRecord, String> ALIAS = createField(DSL.name("alias"), SQLDataType.CLOB, this, "");

    public final TableField<TsDebugRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    public final TableField<TsDebugRecord, String> TOKEN = createField(DSL.name("token"), SQLDataType.CLOB, this, "");

    public final TableField<TsDebugRecord, Object[]> DICTIONARIES = createField(DSL.name("dictionaries"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regdictionary\"").array(), this, "");

    @Deprecated
    public final TableField<TsDebugRecord, Object> DICTIONARY = createField(DSL.name("dictionary"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regdictionary\""), this, "");

    public final TableField<TsDebugRecord, String[]> LEXEMES = createField(DSL.name("lexemes"), SQLDataType.CLOB.array(), this, "");

    private TsDebug(Name alias, Table<TsDebugRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private TsDebug(Name alias, Table<TsDebugRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public TsDebug(String alias) {
        this(DSL.name(alias), TS_DEBUG);
    }

    public TsDebug(Name alias) {
        this(alias, TS_DEBUG);
    }

    public TsDebug() {
        this(DSL.name("ts_debug"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public TsDebug as(String alias) {
        return new TsDebug(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public TsDebug as(Name alias) {
        return new TsDebug(alias, this, parameters);
    }

    @Override
    @NotNull
    public TsDebug as(Table<?> alias) {
        return new TsDebug(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public TsDebug rename(String name) {
        return new TsDebug(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public TsDebug rename(Name name) {
        return new TsDebug(name, null, parameters);
    }

    @Override
    @NotNull
    public TsDebug rename(Table<?> name) {
        return new TsDebug(name.getQualifiedName(), null, parameters);
    }

    public TsDebug call(
          String document
    ) {
        TsDebug result = new TsDebug(DSL.name("ts_debug"), null, new Field[] {
            DSL.val(document, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public TsDebug call(
          Field<String> document
    ) {
        TsDebug result = new TsDebug(DSL.name("ts_debug"), null, new Field[] {
            document
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
