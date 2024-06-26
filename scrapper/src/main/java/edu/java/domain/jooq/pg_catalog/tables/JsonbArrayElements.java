/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.JsonbArrayElementsRecord;

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
public class JsonbArrayElements extends TableImpl<JsonbArrayElementsRecord> {

    private static final long serialVersionUID = 1L;

    public static final JsonbArrayElements JSONB_ARRAY_ELEMENTS = new JsonbArrayElements();

    @Override
    @NotNull
    public Class<JsonbArrayElementsRecord> getRecordType() {
        return JsonbArrayElementsRecord.class;
    }

    public final TableField<JsonbArrayElementsRecord, JSONB> VALUE = createField(DSL.name("value"), SQLDataType.JSONB, this, "");

    private JsonbArrayElements(Name alias, Table<JsonbArrayElementsRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSONB)
        });
    }

    private JsonbArrayElements(Name alias, Table<JsonbArrayElementsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public JsonbArrayElements(String alias) {
        this(DSL.name(alias), JSONB_ARRAY_ELEMENTS);
    }

    public JsonbArrayElements(Name alias) {
        this(alias, JSONB_ARRAY_ELEMENTS);
    }

    public JsonbArrayElements() {
        this(DSL.name("jsonb_array_elements"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public JsonbArrayElements as(String alias) {
        return new JsonbArrayElements(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public JsonbArrayElements as(Name alias) {
        return new JsonbArrayElements(alias, this, parameters);
    }

    @Override
    @NotNull
    public JsonbArrayElements as(Table<?> alias) {
        return new JsonbArrayElements(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public JsonbArrayElements rename(String name) {
        return new JsonbArrayElements(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public JsonbArrayElements rename(Name name) {
        return new JsonbArrayElements(name, null, parameters);
    }

    @Override
    @NotNull
    public JsonbArrayElements rename(Table<?> name) {
        return new JsonbArrayElements(name.getQualifiedName(), null, parameters);
    }

    public JsonbArrayElements call(
          JSONB fromJson
    ) {
        JsonbArrayElements result = new JsonbArrayElements(DSL.name("jsonb_array_elements"), null, new Field[] {
            DSL.val(fromJson, SQLDataType.JSONB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    public JsonbArrayElements call(
          Field<JSONB> fromJson
    ) {
        JsonbArrayElements result = new JsonbArrayElements(DSL.name("jsonb_array_elements"), null, new Field[] {
            fromJson
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
