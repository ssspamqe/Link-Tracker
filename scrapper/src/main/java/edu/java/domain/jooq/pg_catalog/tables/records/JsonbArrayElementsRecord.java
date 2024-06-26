/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.JsonbArrayElements;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.JSONB;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonbArrayElementsRecord extends TableRecordImpl<JsonbArrayElementsRecord> {

    private static final long serialVersionUID = 1L;

    public void setValue(@Nullable JSONB value) {
        set(0, value);
    }

    @Nullable
    public JSONB getValue() {
        return (JSONB) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public JsonbArrayElementsRecord() {
        super(JsonbArrayElements.JSONB_ARRAY_ELEMENTS);
    }

    @ConstructorProperties({ "value" })
    public JsonbArrayElementsRecord(@Nullable JSONB value) {
        super(JsonbArrayElements.JSONB_ARRAY_ELEMENTS);

        setValue(value);
        resetChangedOnNotNull();
    }

    public JsonbArrayElementsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.JsonbArrayElements value) {
        super(JsonbArrayElements.JSONB_ARRAY_ELEMENTS);

        if (value != null) {
            setValue(value.getValue());
            resetChangedOnNotNull();
        }
    }
}
