/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


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
public class ForeignTableOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    private String foreignTableCatalog;
    private String foreignTableSchema;
    private String foreignTableName;
    private String optionName;
    private String optionValue;

    public ForeignTableOptions() {}

    public ForeignTableOptions(ForeignTableOptions value) {
        this.foreignTableCatalog = value.foreignTableCatalog;
        this.foreignTableSchema = value.foreignTableSchema;
        this.foreignTableName = value.foreignTableName;
        this.optionName = value.optionName;
        this.optionValue = value.optionValue;
    }

    @ConstructorProperties({ "foreignTableCatalog", "foreignTableSchema", "foreignTableName", "optionName", "optionValue" })
    public ForeignTableOptions(
        @Nullable String foreignTableCatalog,
        @Nullable String foreignTableSchema,
        @Nullable String foreignTableName,
        @Nullable String optionName,
        @Nullable String optionValue
    ) {
        this.foreignTableCatalog = foreignTableCatalog;
        this.foreignTableSchema = foreignTableSchema;
        this.foreignTableName = foreignTableName;
        this.optionName = optionName;
        this.optionValue = optionValue;
    }

    @Nullable
    public String getForeignTableCatalog() {
        return this.foreignTableCatalog;
    }

    public void setForeignTableCatalog(@Nullable String foreignTableCatalog) {
        this.foreignTableCatalog = foreignTableCatalog;
    }

    @Nullable
    public String getForeignTableSchema() {
        return this.foreignTableSchema;
    }

    public void setForeignTableSchema(@Nullable String foreignTableSchema) {
        this.foreignTableSchema = foreignTableSchema;
    }

    @Nullable
    public String getForeignTableName() {
        return this.foreignTableName;
    }

    public void setForeignTableName(@Nullable String foreignTableName) {
        this.foreignTableName = foreignTableName;
    }

    @Nullable
    public String getOptionName() {
        return this.optionName;
    }

    public void setOptionName(@Nullable String optionName) {
        this.optionName = optionName;
    }

    @Nullable
    public String getOptionValue() {
        return this.optionValue;
    }

    public void setOptionValue(@Nullable String optionValue) {
        this.optionValue = optionValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ForeignTableOptions other = (ForeignTableOptions) obj;
        if (this.foreignTableCatalog == null) {
            if (other.foreignTableCatalog != null)
                return false;
        }
        else if (!this.foreignTableCatalog.equals(other.foreignTableCatalog))
            return false;
        if (this.foreignTableSchema == null) {
            if (other.foreignTableSchema != null)
                return false;
        }
        else if (!this.foreignTableSchema.equals(other.foreignTableSchema))
            return false;
        if (this.foreignTableName == null) {
            if (other.foreignTableName != null)
                return false;
        }
        else if (!this.foreignTableName.equals(other.foreignTableName))
            return false;
        if (this.optionName == null) {
            if (other.optionName != null)
                return false;
        }
        else if (!this.optionName.equals(other.optionName))
            return false;
        if (this.optionValue == null) {
            if (other.optionValue != null)
                return false;
        }
        else if (!this.optionValue.equals(other.optionValue))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.foreignTableCatalog == null) ? 0 : this.foreignTableCatalog.hashCode());
        result = prime * result + ((this.foreignTableSchema == null) ? 0 : this.foreignTableSchema.hashCode());
        result = prime * result + ((this.foreignTableName == null) ? 0 : this.foreignTableName.hashCode());
        result = prime * result + ((this.optionName == null) ? 0 : this.optionName.hashCode());
        result = prime * result + ((this.optionValue == null) ? 0 : this.optionValue.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ForeignTableOptions (");

        sb.append(foreignTableCatalog);
        sb.append(", ").append(foreignTableSchema);
        sb.append(", ").append(foreignTableName);
        sb.append(", ").append(optionName);
        sb.append(", ").append(optionValue);

        sb.append(")");
        return sb.toString();
    }
}
