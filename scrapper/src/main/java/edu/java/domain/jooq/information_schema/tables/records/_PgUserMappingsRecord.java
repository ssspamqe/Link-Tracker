/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables._PgUserMappings;

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
public class _PgUserMappingsRecord extends TableRecordImpl<_PgUserMappingsRecord> {

    private static final long serialVersionUID = 1L;

    public void setOid(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getOid() {
        return (Long) get(0);
    }

    public void setUmoptions(@Nullable String[] value) {
        set(1, value);
    }

    @Nullable
    public String[] getUmoptions() {
        return (String[]) get(1);
    }

    public void setUmuser(@Nullable Long value) {
        set(2, value);
    }

    @Nullable
    public Long getUmuser() {
        return (Long) get(2);
    }

    public void setAuthorizationIdentifier(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getAuthorizationIdentifier() {
        return (String) get(3);
    }

    public void setForeignServerCatalog(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getForeignServerCatalog() {
        return (String) get(4);
    }

    public void setForeignServerName(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getForeignServerName() {
        return (String) get(5);
    }

    public void setSrvowner(@Nullable String value) {
        set(6, value);
    }

    @Nullable
    public String getSrvowner() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public _PgUserMappingsRecord() {
        super(_PgUserMappings._PG_USER_MAPPINGS);
    }

    @ConstructorProperties({ "oid", "umoptions", "umuser", "authorizationIdentifier", "foreignServerCatalog", "foreignServerName", "srvowner" })
    public _PgUserMappingsRecord(@Nullable Long oid, @Nullable String[] umoptions, @Nullable Long umuser, @Nullable String authorizationIdentifier, @Nullable String foreignServerCatalog, @Nullable String foreignServerName, @Nullable String srvowner) {
        super(_PgUserMappings._PG_USER_MAPPINGS);

        setOid(oid);
        setUmoptions(umoptions);
        setUmuser(umuser);
        setAuthorizationIdentifier(authorizationIdentifier);
        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        setSrvowner(srvowner);
        resetChangedOnNotNull();
    }

    public _PgUserMappingsRecord(edu.java.domain.jooq.information_schema.tables.pojos._PgUserMappings value) {
        super(_PgUserMappings._PG_USER_MAPPINGS);

        if (value != null) {
            setOid(value.getOid());
            setUmoptions(value.getUmoptions());
            setUmuser(value.getUmuser());
            setAuthorizationIdentifier(value.getAuthorizationIdentifier());
            setForeignServerCatalog(value.getForeignServerCatalog());
            setForeignServerName(value.getForeignServerName());
            setSrvowner(value.getSrvowner());
            resetChangedOnNotNull();
        }
    }
}
