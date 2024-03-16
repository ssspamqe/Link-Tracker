/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.TableConstraints;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


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
public class TableConstraintsRecord extends TableRecordImpl<TableConstraintsRecord> implements Record11<String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    public void setConstraintCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    @Nullable
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.constraint_schema</code>.
     */
    public void setConstraintSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.constraint_schema</code>.
     */
    @Nullable
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.constraint_name</code>.
     */
    public void setConstraintName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.constraint_name</code>.
     */
    @Nullable
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.table_schema</code>.
     */
    public void setTableSchema(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.table_constraints.table_name</code>.
     */
    public void setTableName(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.constraint_type</code>.
     */
    public void setConstraintType(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.constraint_type</code>.
     */
    @Nullable
    public String getConstraintType() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.is_deferrable</code>.
     */
    public void setIsDeferrable(@Nullable String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.is_deferrable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsDeferrable() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.initially_deferred</code>.
     */
    public void setInitiallyDeferred(@Nullable String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.initially_deferred</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getInitiallyDeferred() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.table_constraints.enforced</code>.
     */
    public void setEnforced(@Nullable String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.enforced</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getEnforced() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.nulls_distinct</code>.
     */
    public void setNullsDistinct(@Nullable String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.nulls_distinct</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getNullsDistinct() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row11<String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row11<String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return TableConstraints.TABLE_CONSTRAINTS.TABLE_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return TableConstraints.TABLE_CONSTRAINTS.TABLE_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return TableConstraints.TABLE_CONSTRAINTS.TABLE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_TYPE;
    }

    @Override
    @NotNull
    public Field<String> field8() {
        return TableConstraints.TABLE_CONSTRAINTS.IS_DEFERRABLE;
    }

    @Override
    @NotNull
    public Field<String> field9() {
        return TableConstraints.TABLE_CONSTRAINTS.INITIALLY_DEFERRED;
    }

    @Override
    @NotNull
    public Field<String> field10() {
        return TableConstraints.TABLE_CONSTRAINTS.ENFORCED;
    }

    @Override
    @NotNull
    public Field<String> field11() {
        return TableConstraints.TABLE_CONSTRAINTS.NULLS_DISTINCT;
    }

    @Override
    @Nullable
    public String component1() {
        return getConstraintCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getConstraintSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getConstraintName();
    }

    @Override
    @Nullable
    public String component4() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String component5() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String component6() {
        return getTableName();
    }

    @Override
    @Nullable
    public String component7() {
        return getConstraintType();
    }

    @Override
    @Nullable
    public String component8() {
        return getIsDeferrable();
    }

    @Override
    @Nullable
    public String component9() {
        return getInitiallyDeferred();
    }

    @Override
    @Nullable
    public String component10() {
        return getEnforced();
    }

    @Override
    @Nullable
    public String component11() {
        return getNullsDistinct();
    }

    @Override
    @Nullable
    public String value1() {
        return getConstraintCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getConstraintSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getConstraintName();
    }

    @Override
    @Nullable
    public String value4() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String value5() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String value6() {
        return getTableName();
    }

    @Override
    @Nullable
    public String value7() {
        return getConstraintType();
    }

    @Override
    @Nullable
    public String value8() {
        return getIsDeferrable();
    }

    @Override
    @Nullable
    public String value9() {
        return getInitiallyDeferred();
    }

    @Override
    @Nullable
    public String value10() {
        return getEnforced();
    }

    @Override
    @Nullable
    public String value11() {
        return getNullsDistinct();
    }

    @Override
    @NotNull
    public TableConstraintsRecord value1(@Nullable String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value2(@Nullable String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value3(@Nullable String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value4(@Nullable String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value5(@Nullable String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value6(@Nullable String value) {
        setTableName(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value7(@Nullable String value) {
        setConstraintType(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value8(@Nullable String value) {
        setIsDeferrable(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value9(@Nullable String value) {
        setInitiallyDeferred(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value10(@Nullable String value) {
        setEnforced(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord value11(@Nullable String value) {
        setNullsDistinct(value);
        return this;
    }

    @Override
    @NotNull
    public TableConstraintsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7, @Nullable String value8, @Nullable String value9, @Nullable String value10, @Nullable String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TableConstraintsRecord
     */
    public TableConstraintsRecord() {
        super(TableConstraints.TABLE_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised TableConstraintsRecord
     */
    @ConstructorProperties({ "constraintCatalog", "constraintSchema", "constraintName", "tableCatalog", "tableSchema", "tableName", "constraintType", "isDeferrable", "initiallyDeferred", "enforced", "nullsDistinct" })
    public TableConstraintsRecord(@Nullable String constraintCatalog, @Nullable String constraintSchema, @Nullable String constraintName, @Nullable String tableCatalog, @Nullable String tableSchema, @Nullable String tableName, @Nullable String constraintType, @Nullable String isDeferrable, @Nullable String initiallyDeferred, @Nullable String enforced, @Nullable String nullsDistinct) {
        super(TableConstraints.TABLE_CONSTRAINTS);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setConstraintType(constraintType);
        setIsDeferrable(isDeferrable);
        setInitiallyDeferred(initiallyDeferred);
        setEnforced(enforced);
        setNullsDistinct(nullsDistinct);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TableConstraintsRecord
     */
    public TableConstraintsRecord(edu.java.domain.jooq.information_schema.tables.pojos.TableConstraints value) {
        super(TableConstraints.TABLE_CONSTRAINTS);

        if (value != null) {
            setConstraintCatalog(value.getConstraintCatalog());
            setConstraintSchema(value.getConstraintSchema());
            setConstraintName(value.getConstraintName());
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setConstraintType(value.getConstraintType());
            setIsDeferrable(value.getIsDeferrable());
            setInitiallyDeferred(value.getInitiallyDeferred());
            setEnforced(value.getEnforced());
            setNullsDistinct(value.getNullsDistinct());
            resetChangedOnNotNull();
        }
    }
}