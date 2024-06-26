/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.JsonbArrayElementsText;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonbArrayElementsTextRecord extends TableRecordImpl<JsonbArrayElementsTextRecord> {

    private static final long serialVersionUID = 1L;

    public void setValue(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getValue() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public JsonbArrayElementsTextRecord() {
        super(JsonbArrayElementsText.JSONB_ARRAY_ELEMENTS_TEXT);
    }

    @ConstructorProperties({ "value" })
    public JsonbArrayElementsTextRecord(@Nullable String value) {
        super(JsonbArrayElementsText.JSONB_ARRAY_ELEMENTS_TEXT);

        setValue(value);
        resetChangedOnNotNull();
    }

    public JsonbArrayElementsTextRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.JsonbArrayElementsText value) {
        super(JsonbArrayElementsText.JSONB_ARRAY_ELEMENTS_TEXT);

        if (value != null) {
            setValue(value.getValue());
            resetChangedOnNotNull();
        }
    }
}
