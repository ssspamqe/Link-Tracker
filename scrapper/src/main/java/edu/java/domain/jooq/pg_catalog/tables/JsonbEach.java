/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.JsonbEachRecord;

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
public class JsonbEach extends TableImpl<JsonbEachRecord> {

    private static final long serialVersionUID = 1L;

    public static final JsonbEach JSONB_EACH = new JsonbEach();

    @Override
    @NotNull
    public Class<JsonbEachRecord> getRecordType() {
        return JsonbEachRecord.class;
    }

    public final TableField<JsonbEachRecord, String> KEY = createField(DSL.name("key"), SQLDataType.CLOB, this, "");

    public final TableField<JsonbEachRecord, JSONB> VALUE = createField(DSL.name("value"), SQLDataType.JSONB, this, "");

    private JsonbEach(Name alias, Table<JsonbEachRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSONB)
        });
    }

    private JsonbEach(Name alias, Table<JsonbEachRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public JsonbEach(String alias) {
        this(DSL.name(alias), JSONB_EACH);
    }

    public JsonbEach(Name alias) {
        this(alias, JSONB_EACH);
    }

    public JsonbEach() {
        this(DSL.name("jsonb_each"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public JsonbEach as(String alias) {
        return new JsonbEach(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public JsonbEach as(Name alias) {
        return new JsonbEach(alias, this, parameters);
    }

    @Override
    @NotNull
    public JsonbEach as(Table<?> alias) {
        return new JsonbEach(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public JsonbEach rename(String name) {
        return new JsonbEach(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public JsonbEach rename(Name name) {
        return new JsonbEach(name, null, parameters);
    }

    @Override
    @NotNull
    public JsonbEach rename(Table<?> name) {
        return new JsonbEach(name.getQualifiedName(), null, parameters);
    }

    public JsonbEach call(
          JSONB fromJson
    ) {
        JsonbEach result = new JsonbEach(DSL.name("jsonb_each"), null, new Field[] {
            DSL.val(fromJson, SQLDataType.JSONB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public JsonbEach call(
          Field<JSONB> fromJson
    ) {
        JsonbEach result = new JsonbEach(DSL.name("jsonb_each"), null, new Field[] {
            fromJson
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
