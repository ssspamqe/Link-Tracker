/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

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
public class PgPolicies implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schemaname;
    private String tablename;
    private String policyname;
    private String permissive;
    private String[] roles;
    private String cmd;
    private String qual;
    private String withCheck;

    public PgPolicies() {}

    public PgPolicies(PgPolicies value) {
        this.schemaname = value.schemaname;
        this.tablename = value.tablename;
        this.policyname = value.policyname;
        this.permissive = value.permissive;
        this.roles = value.roles;
        this.cmd = value.cmd;
        this.qual = value.qual;
        this.withCheck = value.withCheck;
    }

    @ConstructorProperties({ "schemaname", "tablename", "policyname", "permissive", "roles", "cmd", "qual", "withCheck" })
    public PgPolicies(
        @Nullable String schemaname,
        @Nullable String tablename,
        @Nullable String policyname,
        @Nullable String permissive,
        @Nullable String[] roles,
        @Nullable String cmd,
        @Nullable String qual,
        @Nullable String withCheck
    ) {
        this.schemaname = schemaname;
        this.tablename = tablename;
        this.policyname = policyname;
        this.permissive = permissive;
        this.roles = roles;
        this.cmd = cmd;
        this.qual = qual;
        this.withCheck = withCheck;
    }

    @Nullable
    public String getSchemaname() {
        return this.schemaname;
    }

    public void setSchemaname(@Nullable String schemaname) {
        this.schemaname = schemaname;
    }

    @Nullable
    public String getTablename() {
        return this.tablename;
    }

    public void setTablename(@Nullable String tablename) {
        this.tablename = tablename;
    }

    @Nullable
    public String getPolicyname() {
        return this.policyname;
    }

    public void setPolicyname(@Nullable String policyname) {
        this.policyname = policyname;
    }

    @Nullable
    public String getPermissive() {
        return this.permissive;
    }

    public void setPermissive(@Nullable String permissive) {
        this.permissive = permissive;
    }

    @Nullable
    public String[] getRoles() {
        return this.roles;
    }

    public void setRoles(@Nullable String[] roles) {
        this.roles = roles;
    }

    @Nullable
    public String getCmd() {
        return this.cmd;
    }

    public void setCmd(@Nullable String cmd) {
        this.cmd = cmd;
    }

    @Nullable
    public String getQual() {
        return this.qual;
    }

    public void setQual(@Nullable String qual) {
        this.qual = qual;
    }

    @Nullable
    public String getWithCheck() {
        return this.withCheck;
    }

    public void setWithCheck(@Nullable String withCheck) {
        this.withCheck = withCheck;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgPolicies other = (PgPolicies) obj;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.tablename == null) {
            if (other.tablename != null)
                return false;
        }
        else if (!this.tablename.equals(other.tablename))
            return false;
        if (this.policyname == null) {
            if (other.policyname != null)
                return false;
        }
        else if (!this.policyname.equals(other.policyname))
            return false;
        if (this.permissive == null) {
            if (other.permissive != null)
                return false;
        }
        else if (!this.permissive.equals(other.permissive))
            return false;
        if (this.roles == null) {
            if (other.roles != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.roles, other.roles))
            return false;
        if (this.cmd == null) {
            if (other.cmd != null)
                return false;
        }
        else if (!this.cmd.equals(other.cmd))
            return false;
        if (this.qual == null) {
            if (other.qual != null)
                return false;
        }
        else if (!this.qual.equals(other.qual))
            return false;
        if (this.withCheck == null) {
            if (other.withCheck != null)
                return false;
        }
        else if (!this.withCheck.equals(other.withCheck))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.tablename == null) ? 0 : this.tablename.hashCode());
        result = prime * result + ((this.policyname == null) ? 0 : this.policyname.hashCode());
        result = prime * result + ((this.permissive == null) ? 0 : this.permissive.hashCode());
        result = prime * result + ((this.roles == null) ? 0 : Arrays.deepHashCode(this.roles));
        result = prime * result + ((this.cmd == null) ? 0 : this.cmd.hashCode());
        result = prime * result + ((this.qual == null) ? 0 : this.qual.hashCode());
        result = prime * result + ((this.withCheck == null) ? 0 : this.withCheck.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPolicies (");

        sb.append(schemaname);
        sb.append(", ").append(tablename);
        sb.append(", ").append(policyname);
        sb.append(", ").append(permissive);
        sb.append(", ").append(Arrays.deepToString(roles));
        sb.append(", ").append(cmd);
        sb.append(", ").append(qual);
        sb.append(", ").append(withCheck);

        sb.append(")");
        return sb.toString();
    }
}