/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.JsonArrayElements;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.JSON;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonArrayElementsRecord extends TableRecordImpl<JsonArrayElementsRecord> {

    private static final long serialVersionUID = 1L;

    public void setValue(@Nullable JSON value) {
        set(0, value);
    }

    @Nullable
    public JSON getValue() {
        return (JSON) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public JsonArrayElementsRecord() {
        super(JsonArrayElements.JSON_ARRAY_ELEMENTS);
    }

    @ConstructorProperties({ "value" })
    public JsonArrayElementsRecord(@Nullable JSON value) {
        super(JsonArrayElements.JSON_ARRAY_ELEMENTS);

        setValue(value);
        resetChangedOnNotNull();
    }

    public JsonArrayElementsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.JsonArrayElements value) {
        super(JsonArrayElements.JSON_ARRAY_ELEMENTS);

        if (value != null) {
            setValue(value.getValue());
            resetChangedOnNotNull();
        }
    }
}
