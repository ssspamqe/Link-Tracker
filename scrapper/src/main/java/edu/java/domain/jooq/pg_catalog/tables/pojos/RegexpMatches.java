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
public class RegexpMatches implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] regexpMatches;

    public RegexpMatches() {}

    public RegexpMatches(RegexpMatches value) {
        this.regexpMatches = value.regexpMatches;
    }

    @ConstructorProperties({ "regexpMatches" })
    public RegexpMatches(
        @Nullable String[] regexpMatches
    ) {
        this.regexpMatches = regexpMatches;
    }

    @Nullable
    public String[] getRegexpMatches() {
        return this.regexpMatches;
    }

    public void setRegexpMatches(@Nullable String[] regexpMatches) {
        this.regexpMatches = regexpMatches;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final RegexpMatches other = (RegexpMatches) obj;
        if (this.regexpMatches == null) {
            if (other.regexpMatches != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.regexpMatches, other.regexpMatches))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.regexpMatches == null) ? 0 : Arrays.deepHashCode(this.regexpMatches));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RegexpMatches (");

        sb.append(Arrays.deepToString(regexpMatches));

        sb.append(")");
        return sb.toString();
    }
}
