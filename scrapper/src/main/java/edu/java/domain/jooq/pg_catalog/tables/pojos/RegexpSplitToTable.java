/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

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
public class RegexpSplitToTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private String regexpSplitToTable;

    public RegexpSplitToTable() {}

    public RegexpSplitToTable(RegexpSplitToTable value) {
        this.regexpSplitToTable = value.regexpSplitToTable;
    }

    @ConstructorProperties({ "regexpSplitToTable" })
    public RegexpSplitToTable(
        @Nullable String regexpSplitToTable
    ) {
        this.regexpSplitToTable = regexpSplitToTable;
    }

    @Nullable
    public String getRegexpSplitToTable() {
        return this.regexpSplitToTable;
    }

    public void setRegexpSplitToTable(@Nullable String regexpSplitToTable) {
        this.regexpSplitToTable = regexpSplitToTable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final RegexpSplitToTable other = (RegexpSplitToTable) obj;
        if (this.regexpSplitToTable == null) {
            if (other.regexpSplitToTable != null)
                return false;
        }
        else if (!this.regexpSplitToTable.equals(other.regexpSplitToTable))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.regexpSplitToTable == null) ? 0 : this.regexpSplitToTable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RegexpSplitToTable (");

        sb.append(regexpSplitToTable);

        sb.append(")");
        return sb.toString();
    }
}