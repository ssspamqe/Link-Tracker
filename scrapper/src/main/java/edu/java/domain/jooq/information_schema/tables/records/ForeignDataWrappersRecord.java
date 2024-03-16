/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ForeignDataWrappers;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class ForeignDataWrappersRecord extends TableRecordImpl<ForeignDataWrappersRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    public void setForeignDataWrapperCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    @Nullable
    public String getForeignDataWrapperCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    public void setForeignDataWrapperName(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    @Nullable
    public String getForeignDataWrapperName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrappers.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrappers.authorization_identifier</code>.
     */
    @Nullable
    public String getAuthorizationIdentifier() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrappers.library_name</code>.
     */
    public void setLibraryName(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrappers.library_name</code>.
     */
    @Nullable
    public String getLibraryName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    public void setForeignDataWrapperLanguage(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    @Nullable
    public String getForeignDataWrapperLanguage() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return ForeignDataWrappers.FOREIGN_DATA_WRAPPERS.FOREIGN_DATA_WRAPPER_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return ForeignDataWrappers.FOREIGN_DATA_WRAPPERS.FOREIGN_DATA_WRAPPER_NAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return ForeignDataWrappers.FOREIGN_DATA_WRAPPERS.AUTHORIZATION_IDENTIFIER;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return ForeignDataWrappers.FOREIGN_DATA_WRAPPERS.LIBRARY_NAME;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return ForeignDataWrappers.FOREIGN_DATA_WRAPPERS.FOREIGN_DATA_WRAPPER_LANGUAGE;
    }

    @Override
    @Nullable
    public String component1() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getForeignDataWrapperName();
    }

    @Override
    @Nullable
    public String component3() {
        return getAuthorizationIdentifier();
    }

    @Override
    @Nullable
    public String component4() {
        return getLibraryName();
    }

    @Override
    @Nullable
    public String component5() {
        return getForeignDataWrapperLanguage();
    }

    @Override
    @Nullable
    public String value1() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getForeignDataWrapperName();
    }

    @Override
    @Nullable
    public String value3() {
        return getAuthorizationIdentifier();
    }

    @Override
    @Nullable
    public String value4() {
        return getLibraryName();
    }

    @Override
    @Nullable
    public String value5() {
        return getForeignDataWrapperLanguage();
    }

    @Override
    @NotNull
    public ForeignDataWrappersRecord value1(@Nullable String value) {
        setForeignDataWrapperCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignDataWrappersRecord value2(@Nullable String value) {
        setForeignDataWrapperName(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignDataWrappersRecord value3(@Nullable String value) {
        setAuthorizationIdentifier(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignDataWrappersRecord value4(@Nullable String value) {
        setLibraryName(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignDataWrappersRecord value5(@Nullable String value) {
        setForeignDataWrapperLanguage(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignDataWrappersRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ForeignDataWrappersRecord
     */
    public ForeignDataWrappersRecord() {
        super(ForeignDataWrappers.FOREIGN_DATA_WRAPPERS);
    }

    /**
     * Create a detached, initialised ForeignDataWrappersRecord
     */
    @ConstructorProperties({ "foreignDataWrapperCatalog", "foreignDataWrapperName", "authorizationIdentifier", "libraryName", "foreignDataWrapperLanguage" })
    public ForeignDataWrappersRecord(@Nullable String foreignDataWrapperCatalog, @Nullable String foreignDataWrapperName, @Nullable String authorizationIdentifier, @Nullable String libraryName, @Nullable String foreignDataWrapperLanguage) {
        super(ForeignDataWrappers.FOREIGN_DATA_WRAPPERS);

        setForeignDataWrapperCatalog(foreignDataWrapperCatalog);
        setForeignDataWrapperName(foreignDataWrapperName);
        setAuthorizationIdentifier(authorizationIdentifier);
        setLibraryName(libraryName);
        setForeignDataWrapperLanguage(foreignDataWrapperLanguage);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ForeignDataWrappersRecord
     */
    public ForeignDataWrappersRecord(edu.java.domain.jooq.information_schema.tables.pojos.ForeignDataWrappers value) {
        super(ForeignDataWrappers.FOREIGN_DATA_WRAPPERS);

        if (value != null) {
            setForeignDataWrapperCatalog(value.getForeignDataWrapperCatalog());
            setForeignDataWrapperName(value.getForeignDataWrapperName());
            setAuthorizationIdentifier(value.getAuthorizationIdentifier());
            setLibraryName(value.getLibraryName());
            setForeignDataWrapperLanguage(value.getForeignDataWrapperLanguage());
            resetChangedOnNotNull();
        }
    }
}