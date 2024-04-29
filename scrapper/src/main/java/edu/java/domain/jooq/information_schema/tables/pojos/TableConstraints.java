/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import jakarta.validation.constraints.Size;

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
public class TableConstraints implements Serializable {

    private static final long serialVersionUID = 1L;

    private String constraintCatalog;
    private String constraintSchema;
    private String constraintName;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String constraintType;
    private String isDeferrable;
    private String initiallyDeferred;
    private String enforced;
    private String nullsDistinct;

    public TableConstraints() {}

    public TableConstraints(TableConstraints value) {
        this.constraintCatalog = value.constraintCatalog;
        this.constraintSchema = value.constraintSchema;
        this.constraintName = value.constraintName;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.constraintType = value.constraintType;
        this.isDeferrable = value.isDeferrable;
        this.initiallyDeferred = value.initiallyDeferred;
        this.enforced = value.enforced;
        this.nullsDistinct = value.nullsDistinct;
    }

    @ConstructorProperties({ "constraintCatalog", "constraintSchema", "constraintName", "tableCatalog", "tableSchema", "tableName", "constraintType", "isDeferrable", "initiallyDeferred", "enforced", "nullsDistinct" })
    public TableConstraints(
        @Nullable String constraintCatalog,
        @Nullable String constraintSchema,
        @Nullable String constraintName,
        @Nullable String tableCatalog,
        @Nullable String tableSchema,
        @Nullable String tableName,
        @Nullable String constraintType,
        @Nullable String isDeferrable,
        @Nullable String initiallyDeferred,
        @Nullable String enforced,
        @Nullable String nullsDistinct
    ) {
        this.constraintCatalog = constraintCatalog;
        this.constraintSchema = constraintSchema;
        this.constraintName = constraintName;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.constraintType = constraintType;
        this.isDeferrable = isDeferrable;
        this.initiallyDeferred = initiallyDeferred;
        this.enforced = enforced;
        this.nullsDistinct = nullsDistinct;
    }

    @Nullable
    public String getConstraintCatalog() {
        return this.constraintCatalog;
    }

    public void setConstraintCatalog(@Nullable String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    @Nullable
    public String getConstraintSchema() {
        return this.constraintSchema;
    }

    public void setConstraintSchema(@Nullable String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    @Nullable
    public String getConstraintName() {
        return this.constraintName;
    }

    public void setConstraintName(@Nullable String constraintName) {
        this.constraintName = constraintName;
    }

    @Nullable
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public void setTableCatalog(@Nullable String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Nullable
    public String getTableSchema() {
        return this.tableSchema;
    }

    public void setTableSchema(@Nullable String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Nullable
    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(@Nullable String tableName) {
        this.tableName = tableName;
    }

    @Nullable
    public String getConstraintType() {
        return this.constraintType;
    }

    public void setConstraintType(@Nullable String constraintType) {
        this.constraintType = constraintType;
    }

    @Size(max = 3)
    @Nullable
    public String getIsDeferrable() {
        return this.isDeferrable;
    }

    public void setIsDeferrable(@Nullable String isDeferrable) {
        this.isDeferrable = isDeferrable;
    }

    @Size(max = 3)
    @Nullable
    public String getInitiallyDeferred() {
        return this.initiallyDeferred;
    }

    public void setInitiallyDeferred(@Nullable String initiallyDeferred) {
        this.initiallyDeferred = initiallyDeferred;
    }

    @Size(max = 3)
    @Nullable
    public String getEnforced() {
        return this.enforced;
    }

    public void setEnforced(@Nullable String enforced) {
        this.enforced = enforced;
    }

    @Size(max = 3)
    @Nullable
    public String getNullsDistinct() {
        return this.nullsDistinct;
    }

    public void setNullsDistinct(@Nullable String nullsDistinct) {
        this.nullsDistinct = nullsDistinct;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TableConstraints other = (TableConstraints) obj;
        if (this.constraintCatalog == null) {
            if (other.constraintCatalog != null)
                return false;
        }
        else if (!this.constraintCatalog.equals(other.constraintCatalog))
            return false;
        if (this.constraintSchema == null) {
            if (other.constraintSchema != null)
                return false;
        }
        else if (!this.constraintSchema.equals(other.constraintSchema))
            return false;
        if (this.constraintName == null) {
            if (other.constraintName != null)
                return false;
        }
        else if (!this.constraintName.equals(other.constraintName))
            return false;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.constraintType == null) {
            if (other.constraintType != null)
                return false;
        }
        else if (!this.constraintType.equals(other.constraintType))
            return false;
        if (this.isDeferrable == null) {
            if (other.isDeferrable != null)
                return false;
        }
        else if (!this.isDeferrable.equals(other.isDeferrable))
            return false;
        if (this.initiallyDeferred == null) {
            if (other.initiallyDeferred != null)
                return false;
        }
        else if (!this.initiallyDeferred.equals(other.initiallyDeferred))
            return false;
        if (this.enforced == null) {
            if (other.enforced != null)
                return false;
        }
        else if (!this.enforced.equals(other.enforced))
            return false;
        if (this.nullsDistinct == null) {
            if (other.nullsDistinct != null)
                return false;
        }
        else if (!this.nullsDistinct.equals(other.nullsDistinct))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.constraintCatalog == null) ? 0 : this.constraintCatalog.hashCode());
        result = prime * result + ((this.constraintSchema == null) ? 0 : this.constraintSchema.hashCode());
        result = prime * result + ((this.constraintName == null) ? 0 : this.constraintName.hashCode());
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.constraintType == null) ? 0 : this.constraintType.hashCode());
        result = prime * result + ((this.isDeferrable == null) ? 0 : this.isDeferrable.hashCode());
        result = prime * result + ((this.initiallyDeferred == null) ? 0 : this.initiallyDeferred.hashCode());
        result = prime * result + ((this.enforced == null) ? 0 : this.enforced.hashCode());
        result = prime * result + ((this.nullsDistinct == null) ? 0 : this.nullsDistinct.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TableConstraints (");

        sb.append(constraintCatalog);
        sb.append(", ").append(constraintSchema);
        sb.append(", ").append(constraintName);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(constraintType);
        sb.append(", ").append(isDeferrable);
        sb.append(", ").append(initiallyDeferred);
        sb.append(", ").append(enforced);
        sb.append(", ").append(nullsDistinct);

        sb.append(")");
        return sb.toString();
    }
}