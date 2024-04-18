/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ConstraintTableUsage;

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
public class ConstraintTableUsageRecord extends TableRecordImpl<ConstraintTableUsageRecord> {

    private static final long serialVersionUID = 1L;

    public void setTableCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getTableCatalog() {
        return (String) get(0);
    }

    public void setTableSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getTableSchema() {
        return (String) get(1);
    }

    public void setTableName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getTableName() {
        return (String) get(2);
    }

    public void setConstraintCatalog(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getConstraintCatalog() {
        return (String) get(3);
    }

    public void setConstraintSchema(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getConstraintSchema() {
        return (String) get(4);
    }

    public void setConstraintName(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getConstraintName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public ConstraintTableUsageRecord() {
        super(ConstraintTableUsage.CONSTRAINT_TABLE_USAGE);
    }

    @ConstructorProperties({ "tableCatalog", "tableSchema", "tableName", "constraintCatalog", "constraintSchema", "constraintName" })
    public ConstraintTableUsageRecord(@Nullable String tableCatalog, @Nullable String tableSchema, @Nullable String tableName, @Nullable String constraintCatalog, @Nullable String constraintSchema, @Nullable String constraintName) {
        super(ConstraintTableUsage.CONSTRAINT_TABLE_USAGE);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        resetChangedOnNotNull();
    }

    public ConstraintTableUsageRecord(edu.java.domain.jooq.information_schema.tables.pojos.ConstraintTableUsage value) {
        super(ConstraintTableUsage.CONSTRAINT_TABLE_USAGE);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setConstraintCatalog(value.getConstraintCatalog());
            setConstraintSchema(value.getConstraintSchema());
            setConstraintName(value.getConstraintName());
            resetChangedOnNotNull();
        }
    }
}
