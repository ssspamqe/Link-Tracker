/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.JsonbPopulateRecordsetRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.JSONB;
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
public class JsonbPopulateRecordset extends TableImpl<JsonbPopulateRecordsetRecord> {

    private static final long serialVersionUID = 1L;

    public static final JsonbPopulateRecordset JSONB_POPULATE_RECORDSET = new JsonbPopulateRecordset();

    @Override
    @NotNull
    public Class<JsonbPopulateRecordsetRecord> getRecordType() {
        return JsonbPopulateRecordsetRecord.class;
    }

    @Deprecated
    public final TableField<JsonbPopulateRecordsetRecord, Object> JSONB_POPULATE_RECORDSET_ = createField(DSL.name("jsonb_populate_recordset"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"anyelement\""), this, "");

    private JsonbPopulateRecordset(Name alias, Table<JsonbPopulateRecordsetRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\"")),
            DSL.val(null, SQLDataType.JSONB)
        });
    }

    private JsonbPopulateRecordset(Name alias, Table<JsonbPopulateRecordsetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public JsonbPopulateRecordset(String alias) {
        this(DSL.name(alias), JSONB_POPULATE_RECORDSET);
    }

    public JsonbPopulateRecordset(Name alias) {
        this(alias, JSONB_POPULATE_RECORDSET);
    }

    public JsonbPopulateRecordset() {
        this(DSL.name("jsonb_populate_recordset"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public JsonbPopulateRecordset as(String alias) {
        return new JsonbPopulateRecordset(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public JsonbPopulateRecordset as(Name alias) {
        return new JsonbPopulateRecordset(alias, this, parameters);
    }

    @Override
    @NotNull
    public JsonbPopulateRecordset as(Table<?> alias) {
        return new JsonbPopulateRecordset(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public JsonbPopulateRecordset rename(String name) {
        return new JsonbPopulateRecordset(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public JsonbPopulateRecordset rename(Name name) {
        return new JsonbPopulateRecordset(name, null, parameters);
    }

    @Override
    @NotNull
    public JsonbPopulateRecordset rename(Table<?> name) {
        return new JsonbPopulateRecordset(name.getQualifiedName(), null, parameters);
    }

    public JsonbPopulateRecordset call(
          Object __1
        , JSONB __2
    ) {
        JsonbPopulateRecordset result = new JsonbPopulateRecordset(DSL.name("jsonb_populate_recordset"), null, new Field[] {
            DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\"")),
            DSL.val(__2, SQLDataType.JSONB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public JsonbPopulateRecordset call(
          Field<Object> __1
        , Field<JSONB> __2
    ) {
        JsonbPopulateRecordset result = new JsonbPopulateRecordset(DSL.name("jsonb_populate_recordset"), null, new Field[] {
            __1,
            __2
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
