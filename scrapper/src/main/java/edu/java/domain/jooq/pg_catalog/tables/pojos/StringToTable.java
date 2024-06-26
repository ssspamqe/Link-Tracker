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
public class StringToTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stringToTable;

    public StringToTable() {}

    public StringToTable(StringToTable value) {
        this.stringToTable = value.stringToTable;
    }

    @ConstructorProperties({ "stringToTable" })
    public StringToTable(
        @Nullable String stringToTable
    ) {
        this.stringToTable = stringToTable;
    }

    @Nullable
    public String getStringToTable() {
        return this.stringToTable;
    }

    public void setStringToTable(@Nullable String stringToTable) {
        this.stringToTable = stringToTable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final StringToTable other = (StringToTable) obj;
        if (this.stringToTable == null) {
            if (other.stringToTable != null)
                return false;
        }
        else if (!this.stringToTable.equals(other.stringToTable))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.stringToTable == null) ? 0 : this.stringToTable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StringToTable (");

        sb.append(stringToTable);

        sb.append(")");
        return sb.toString();
    }
}
