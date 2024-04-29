/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgMcvListItems implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer index;
    private String[] values;
    private Boolean[] nulls;
    private Double frequency;
    private Double baseFrequency;

    public PgMcvListItems() {}

    public PgMcvListItems(PgMcvListItems value) {
        this.index = value.index;
        this.values = value.values;
        this.nulls = value.nulls;
        this.frequency = value.frequency;
        this.baseFrequency = value.baseFrequency;
    }

    @ConstructorProperties({ "index", "values", "nulls", "frequency", "baseFrequency" })
    public PgMcvListItems(
        @Nullable Integer index,
        @Nullable String[] values,
        @Nullable Boolean[] nulls,
        @Nullable Double frequency,
        @Nullable Double baseFrequency
    ) {
        this.index = index;
        this.values = values;
        this.nulls = nulls;
        this.frequency = frequency;
        this.baseFrequency = baseFrequency;
    }

    @Nullable
    public Integer getIndex() {
        return this.index;
    }

    public void setIndex(@Nullable Integer index) {
        this.index = index;
    }

    @Nullable
    public String[] getValues() {
        return this.values;
    }

    public void setValues(@Nullable String[] values) {
        this.values = values;
    }

    @Nullable
    public Boolean[] getNulls() {
        return this.nulls;
    }

    public void setNulls(@Nullable Boolean[] nulls) {
        this.nulls = nulls;
    }

    @Nullable
    public Double getFrequency() {
        return this.frequency;
    }

    public void setFrequency(@Nullable Double frequency) {
        this.frequency = frequency;
    }

    @Nullable
    public Double getBaseFrequency() {
        return this.baseFrequency;
    }

    public void setBaseFrequency(@Nullable Double baseFrequency) {
        this.baseFrequency = baseFrequency;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgMcvListItems other = (PgMcvListItems) obj;
        if (this.index == null) {
            if (other.index != null)
                return false;
        }
        else if (!this.index.equals(other.index))
            return false;
        if (this.values == null) {
            if (other.values != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.values, other.values))
            return false;
        if (this.nulls == null) {
            if (other.nulls != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.nulls, other.nulls))
            return false;
        if (this.frequency == null) {
            if (other.frequency != null)
                return false;
        }
        else if (!this.frequency.equals(other.frequency))
            return false;
        if (this.baseFrequency == null) {
            if (other.baseFrequency != null)
                return false;
        }
        else if (!this.baseFrequency.equals(other.baseFrequency))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.index == null) ? 0 : this.index.hashCode());
        result = prime * result + ((this.values == null) ? 0 : Arrays.deepHashCode(this.values));
        result = prime * result + ((this.nulls == null) ? 0 : Arrays.deepHashCode(this.nulls));
        result = prime * result + ((this.frequency == null) ? 0 : this.frequency.hashCode());
        result = prime * result + ((this.baseFrequency == null) ? 0 : this.baseFrequency.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgMcvListItems (");

        sb.append(index);
        sb.append(", ").append(Arrays.deepToString(values));
        sb.append(", ").append(Arrays.deepToString(nulls));
        sb.append(", ").append(frequency);
        sb.append(", ").append(baseFrequency);

        sb.append(")");
        return sb.toString();
    }
}