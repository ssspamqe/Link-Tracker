/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ForeignDataWrappers;

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
public class ForeignDataWrappersRecord extends TableRecordImpl<ForeignDataWrappersRecord> {

    private static final long serialVersionUID = 1L;

    public void setForeignDataWrapperCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getForeignDataWrapperCatalog() {
        return (String) get(0);
    }

    public void setForeignDataWrapperName(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getForeignDataWrapperName() {
        return (String) get(1);
    }

    public void setAuthorizationIdentifier(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getAuthorizationIdentifier() {
        return (String) get(2);
    }

    public void setLibraryName(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getLibraryName() {
        return (String) get(3);
    }

    public void setForeignDataWrapperLanguage(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getForeignDataWrapperLanguage() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public ForeignDataWrappersRecord() {
        super(ForeignDataWrappers.FOREIGN_DATA_WRAPPERS);
    }

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
