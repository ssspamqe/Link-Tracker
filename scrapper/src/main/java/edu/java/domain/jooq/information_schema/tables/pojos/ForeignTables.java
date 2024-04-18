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
public class ForeignTables implements Serializable {

    private static final long serialVersionUID = 1L;

    private String foreignTableCatalog;
    private String foreignTableSchema;
    private String foreignTableName;
    private String foreignServerCatalog;
    private String foreignServerName;

    public ForeignTables() {}

    public ForeignTables(ForeignTables value) {
        this.foreignTableCatalog = value.foreignTableCatalog;
        this.foreignTableSchema = value.foreignTableSchema;
        this.foreignTableName = value.foreignTableName;
        this.foreignServerCatalog = value.foreignServerCatalog;
        this.foreignServerName = value.foreignServerName;
    }

    @ConstructorProperties({ "foreignTableCatalog", "foreignTableSchema", "foreignTableName", "foreignServerCatalog", "foreignServerName" })
    public ForeignTables(
        @Nullable String foreignTableCatalog,
        @Nullable String foreignTableSchema,
        @Nullable String foreignTableName,
        @Nullable String foreignServerCatalog,
        @Nullable String foreignServerName
    ) {
        this.foreignTableCatalog = foreignTableCatalog;
        this.foreignTableSchema = foreignTableSchema;
        this.foreignTableName = foreignTableName;
        this.foreignServerCatalog = foreignServerCatalog;
        this.foreignServerName = foreignServerName;
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
    public String getForeignServerCatalog() {
        return this.foreignServerCatalog;
    }

    public void setForeignServerCatalog(@Nullable String foreignServerCatalog) {
        this.foreignServerCatalog = foreignServerCatalog;
    }

    @Nullable
    public String getForeignServerName() {
        return this.foreignServerName;
    }

    public void setForeignServerName(@Nullable String foreignServerName) {
        this.foreignServerName = foreignServerName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ForeignTables other = (ForeignTables) obj;
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
        if (this.foreignServerCatalog == null) {
            if (other.foreignServerCatalog != null)
                return false;
        }
        else if (!this.foreignServerCatalog.equals(other.foreignServerCatalog))
            return false;
        if (this.foreignServerName == null) {
            if (other.foreignServerName != null)
                return false;
        }
        else if (!this.foreignServerName.equals(other.foreignServerName))
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
        result = prime * result + ((this.foreignServerCatalog == null) ? 0 : this.foreignServerCatalog.hashCode());
        result = prime * result + ((this.foreignServerName == null) ? 0 : this.foreignServerName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ForeignTables (");

        sb.append(foreignTableCatalog);
        sb.append(", ").append(foreignTableSchema);
        sb.append(", ").append(foreignTableName);
        sb.append(", ").append(foreignServerCatalog);
        sb.append(", ").append(foreignServerName);

        sb.append(")");
        return sb.toString();
    }
}
