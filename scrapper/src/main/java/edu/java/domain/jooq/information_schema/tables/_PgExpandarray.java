/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records._PgExpandarrayRecord;

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
public class _PgExpandarray extends TableImpl<_PgExpandarrayRecord> {

    private static final long serialVersionUID = 1L;

    public static final _PgExpandarray _PG_EXPANDARRAY = new _PgExpandarray();

    @Override
    @NotNull
    public Class<_PgExpandarrayRecord> getRecordType() {
        return _PgExpandarrayRecord.class;
    }

    @Deprecated
    public final TableField<_PgExpandarrayRecord, Object> X = createField(DSL.name("x"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), this, "");

    public final TableField<_PgExpandarrayRecord, Integer> N = createField(DSL.name("n"), SQLDataType.INTEGER, this, "");

    private _PgExpandarray(Name alias, Table<_PgExpandarrayRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.OTHER.array())
        });
    }

    private _PgExpandarray(Name alias, Table<_PgExpandarrayRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public _PgExpandarray(String alias) {
        this(DSL.name(alias), _PG_EXPANDARRAY);
    }

    public _PgExpandarray(Name alias) {
        this(alias, _PG_EXPANDARRAY);
    }

    public _PgExpandarray() {
        this(DSL.name("_pg_expandarray"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public _PgExpandarray as(String alias) {
        return new _PgExpandarray(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public _PgExpandarray as(Name alias) {
        return new _PgExpandarray(alias, this, parameters);
    }

    @Override
    @NotNull
    public _PgExpandarray as(Table<?> alias) {
        return new _PgExpandarray(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public _PgExpandarray rename(String name) {
        return new _PgExpandarray(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public _PgExpandarray rename(Name name) {
        return new _PgExpandarray(name, null, parameters);
    }

    @Override
    @NotNull
    public _PgExpandarray rename(Table<?> name) {
        return new _PgExpandarray(name.getQualifiedName(), null, parameters);
    }

    public _PgExpandarray call(
          Object[] __1
    ) {
        _PgExpandarray result = new _PgExpandarray(DSL.name("_pg_expandarray"), null, new Field[] {
            DSL.val(__1, SQLDataType.OTHER.array())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public _PgExpandarray call(
          Field<Object[]> __1
    ) {
        _PgExpandarray result = new _PgExpandarray(DSL.name("_pg_expandarray"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
