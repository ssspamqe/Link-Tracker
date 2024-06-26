/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.AdministrableRoleAuthorizations;

import jakarta.validation.constraints.Size;

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
public class AdministrableRoleAuthorizationsRecord extends TableRecordImpl<AdministrableRoleAuthorizationsRecord> {

    private static final long serialVersionUID = 1L;

    public void setGrantee(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getGrantee() {
        return (String) get(0);
    }

    public void setRoleName(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getRoleName() {
        return (String) get(1);
    }

    public void setIsGrantable(@Nullable String value) {
        set(2, value);
    }

    @Size(max = 3)
    @Nullable
    public String getIsGrantable() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public AdministrableRoleAuthorizationsRecord() {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    @ConstructorProperties({ "grantee", "roleName", "isGrantable" })
    public AdministrableRoleAuthorizationsRecord(@Nullable String grantee, @Nullable String roleName, @Nullable String isGrantable) {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);

        setGrantee(grantee);
        setRoleName(roleName);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }

    public AdministrableRoleAuthorizationsRecord(edu.java.domain.jooq.information_schema.tables.pojos.AdministrableRoleAuthorizations value) {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);

        if (value != null) {
            setGrantee(value.getGrantee());
            setRoleName(value.getRoleName());
            setIsGrantable(value.getIsGrantable());
            resetChangedOnNotNull();
        }
    }
}
