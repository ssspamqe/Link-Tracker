/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonPopulateRecordset implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object jsonPopulateRecordset;

    public JsonPopulateRecordset() {}

    public JsonPopulateRecordset(JsonPopulateRecordset value) {
        this.jsonPopulateRecordset = value.jsonPopulateRecordset;
    }

    @ConstructorProperties({ "jsonPopulateRecordset" })
    public JsonPopulateRecordset(
        @Nullable Object jsonPopulateRecordset
    ) {
        this.jsonPopulateRecordset = jsonPopulateRecordset;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getJsonPopulateRecordset() {
        return this.jsonPopulateRecordset;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setJsonPopulateRecordset(@Nullable Object jsonPopulateRecordset) {
        this.jsonPopulateRecordset = jsonPopulateRecordset;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final JsonPopulateRecordset other = (JsonPopulateRecordset) obj;
        if (this.jsonPopulateRecordset == null) {
            if (other.jsonPopulateRecordset != null)
                return false;
        }
        else if (!this.jsonPopulateRecordset.equals(other.jsonPopulateRecordset))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.jsonPopulateRecordset == null) ? 0 : this.jsonPopulateRecordset.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JsonPopulateRecordset (");

        sb.append(jsonPopulateRecordset);

        sb.append(")");
        return sb.toString();
    }
}