/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetCatalogForeignKeys;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class PgGetCatalogForeignKeysRecord extends TableRecordImpl<PgGetCatalogForeignKeysRecord> implements Record6<Object, String[], Object, String[], Boolean, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setFktable(@Nullable Object value) {
        set(0, value);
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
    public Object getFktable() {
        return get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_catalog_foreign_keys.fkcols</code>.
     */
    public void setFkcols(@Nullable String[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_catalog_foreign_keys.fkcols</code>.
     */
    @Nullable
    public String[] getFkcols() {
        return (String[]) get(1);
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
    public void setPktable(@Nullable Object value) {
        set(2, value);
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
    public Object getPktable() {
        return get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_catalog_foreign_keys.pkcols</code>.
     */
    public void setPkcols(@Nullable String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_catalog_foreign_keys.pkcols</code>.
     */
    @Nullable
    public String[] getPkcols() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_catalog_foreign_keys.is_array</code>.
     */
    public void setIsArray(@Nullable Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_catalog_foreign_keys.is_array</code>.
     */
    @Nullable
    public Boolean getIsArray() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_catalog_foreign_keys.is_opt</code>.
     */
    public void setIsOpt(@Nullable Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_catalog_foreign_keys.is_opt</code>.
     */
    @Nullable
    public Boolean getIsOpt() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<Object, String[], Object, String[], Boolean, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<Object, String[], Object, String[], Boolean, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
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
    @Override
    @NotNull
    public Field<Object> field1() {
        return PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS.FKTABLE;
    }

    @Override
    @NotNull
    public Field<String[]> field2() {
        return PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS.FKCOLS;
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
    @Override
    @NotNull
    public Field<Object> field3() {
        return PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS.PKTABLE;
    }

    @Override
    @NotNull
    public Field<String[]> field4() {
        return PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS.PKCOLS;
    }

    @Override
    @NotNull
    public Field<Boolean> field5() {
        return PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS.IS_ARRAY;
    }

    @Override
    @NotNull
    public Field<Boolean> field6() {
        return PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS.IS_OPT;
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
    @Override
    @Nullable
    public Object component1() {
        return getFktable();
    }

    @Override
    @Nullable
    public String[] component2() {
        return getFkcols();
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
    @Override
    @Nullable
    public Object component3() {
        return getPktable();
    }

    @Override
    @Nullable
    public String[] component4() {
        return getPkcols();
    }

    @Override
    @Nullable
    public Boolean component5() {
        return getIsArray();
    }

    @Override
    @Nullable
    public Boolean component6() {
        return getIsOpt();
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
    @Override
    @Nullable
    public Object value1() {
        return getFktable();
    }

    @Override
    @Nullable
    public String[] value2() {
        return getFkcols();
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
    @Override
    @Nullable
    public Object value3() {
        return getPktable();
    }

    @Override
    @Nullable
    public String[] value4() {
        return getPkcols();
    }

    @Override
    @Nullable
    public Boolean value5() {
        return getIsArray();
    }

    @Override
    @Nullable
    public Boolean value6() {
        return getIsOpt();
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
    @Override
    @NotNull
    public PgGetCatalogForeignKeysRecord value1(@Nullable Object value) {
        setFktable(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetCatalogForeignKeysRecord value2(@Nullable String[] value) {
        setFkcols(value);
        return this;
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
    @Override
    @NotNull
    public PgGetCatalogForeignKeysRecord value3(@Nullable Object value) {
        setPktable(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetCatalogForeignKeysRecord value4(@Nullable String[] value) {
        setPkcols(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetCatalogForeignKeysRecord value5(@Nullable Boolean value) {
        setIsArray(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetCatalogForeignKeysRecord value6(@Nullable Boolean value) {
        setIsOpt(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetCatalogForeignKeysRecord values(@Nullable Object value1, @Nullable String[] value2, @Nullable Object value3, @Nullable String[] value4, @Nullable Boolean value5, @Nullable Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetCatalogForeignKeysRecord
     */
    public PgGetCatalogForeignKeysRecord() {
        super(PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS);
    }

    /**
     * Create a detached, initialised PgGetCatalogForeignKeysRecord
     */
    @ConstructorProperties({ "fktable", "fkcols", "pktable", "pkcols", "isArray", "isOpt" })
    public PgGetCatalogForeignKeysRecord(@Nullable Object fktable, @Nullable String[] fkcols, @Nullable Object pktable, @Nullable String[] pkcols, @Nullable Boolean isArray, @Nullable Boolean isOpt) {
        super(PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS);

        setFktable(fktable);
        setFkcols(fkcols);
        setPktable(pktable);
        setPkcols(pkcols);
        setIsArray(isArray);
        setIsOpt(isOpt);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgGetCatalogForeignKeysRecord
     */
    public PgGetCatalogForeignKeysRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGetCatalogForeignKeys value) {
        super(PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS);

        if (value != null) {
            setFktable(value.getFktable());
            setFkcols(value.getFkcols());
            setPktable(value.getPktable());
            setPkcols(value.getPkcols());
            setIsArray(value.getIsArray());
            setIsOpt(value.getIsOpt());
            resetChangedOnNotNull();
        }
    }
}