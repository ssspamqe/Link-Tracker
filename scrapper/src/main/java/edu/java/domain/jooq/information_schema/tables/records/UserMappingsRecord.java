/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.UserMappings;

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
public class UserMappingsRecord extends TableRecordImpl<UserMappingsRecord> {

    private static final long serialVersionUID = 1L;

    public void setAuthorizationIdentifier(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getAuthorizationIdentifier() {
        return (String) get(0);
    }

    public void setForeignServerCatalog(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getForeignServerCatalog() {
        return (String) get(1);
    }

    public void setForeignServerName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getForeignServerName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public UserMappingsRecord() {
        super(UserMappings.USER_MAPPINGS);
    }

    @ConstructorProperties({ "authorizationIdentifier", "foreignServerCatalog", "foreignServerName" })
    public UserMappingsRecord(@Nullable String authorizationIdentifier, @Nullable String foreignServerCatalog, @Nullable String foreignServerName) {
        super(UserMappings.USER_MAPPINGS);

        setAuthorizationIdentifier(authorizationIdentifier);
        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        resetChangedOnNotNull();
    }

    public UserMappingsRecord(edu.java.domain.jooq.information_schema.tables.pojos.UserMappings value) {
        super(UserMappings.USER_MAPPINGS);

        if (value != null) {
            setAuthorizationIdentifier(value.getAuthorizationIdentifier());
            setForeignServerCatalog(value.getForeignServerCatalog());
            setForeignServerName(value.getForeignServerName());
            resetChangedOnNotNull();
        }
    }
}
