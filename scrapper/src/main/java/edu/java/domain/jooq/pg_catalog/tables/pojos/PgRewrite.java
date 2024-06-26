/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgRewrite implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String rulename;
    private Long evClass;
    private String evType;
    private String evEnabled;
    private Boolean isInstead;
    private Object evQual;
    private Object evAction;

    public PgRewrite() {}

    public PgRewrite(PgRewrite value) {
        this.oid = value.oid;
        this.rulename = value.rulename;
        this.evClass = value.evClass;
        this.evType = value.evType;
        this.evEnabled = value.evEnabled;
        this.isInstead = value.isInstead;
        this.evQual = value.evQual;
        this.evAction = value.evAction;
    }

    @ConstructorProperties({ "oid", "rulename", "evClass", "evType", "evEnabled", "isInstead", "evQual", "evAction" })
    public PgRewrite(
        @NotNull Long oid,
        @NotNull String rulename,
        @NotNull Long evClass,
        @NotNull String evType,
        @NotNull String evEnabled,
        @NotNull Boolean isInstead,
        @NotNull Object evQual,
        @NotNull Object evAction
    ) {
        this.oid = oid;
        this.rulename = rulename;
        this.evClass = evClass;
        this.evType = evType;
        this.evEnabled = evEnabled;
        this.isInstead = isInstead;
        this.evQual = evQual;
        this.evAction = evAction;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getRulename() {
        return this.rulename;
    }

    public void setRulename(@NotNull String rulename) {
        this.rulename = rulename;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getEvClass() {
        return this.evClass;
    }

    public void setEvClass(@NotNull Long evClass) {
        this.evClass = evClass;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getEvType() {
        return this.evType;
    }

    public void setEvType(@NotNull String evType) {
        this.evType = evType;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getEvEnabled() {
        return this.evEnabled;
    }

    public void setEvEnabled(@NotNull String evEnabled) {
        this.evEnabled = evEnabled;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIsInstead() {
        return this.isInstead;
    }

    public void setIsInstead(@NotNull Boolean isInstead) {
        this.isInstead = isInstead;
    }

    @Deprecated
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object getEvQual() {
        return this.evQual;
    }

    @Deprecated
    public void setEvQual(@NotNull Object evQual) {
        this.evQual = evQual;
    }

    @Deprecated
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object getEvAction() {
        return this.evAction;
    }

    @Deprecated
    public void setEvAction(@NotNull Object evAction) {
        this.evAction = evAction;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgRewrite other = (PgRewrite) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.rulename == null) {
            if (other.rulename != null)
                return false;
        }
        else if (!this.rulename.equals(other.rulename))
            return false;
        if (this.evClass == null) {
            if (other.evClass != null)
                return false;
        }
        else if (!this.evClass.equals(other.evClass))
            return false;
        if (this.evType == null) {
            if (other.evType != null)
                return false;
        }
        else if (!this.evType.equals(other.evType))
            return false;
        if (this.evEnabled == null) {
            if (other.evEnabled != null)
                return false;
        }
        else if (!this.evEnabled.equals(other.evEnabled))
            return false;
        if (this.isInstead == null) {
            if (other.isInstead != null)
                return false;
        }
        else if (!this.isInstead.equals(other.isInstead))
            return false;
        if (this.evQual == null) {
            if (other.evQual != null)
                return false;
        }
        else if (!this.evQual.equals(other.evQual))
            return false;
        if (this.evAction == null) {
            if (other.evAction != null)
                return false;
        }
        else if (!this.evAction.equals(other.evAction))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.rulename == null) ? 0 : this.rulename.hashCode());
        result = prime * result + ((this.evClass == null) ? 0 : this.evClass.hashCode());
        result = prime * result + ((this.evType == null) ? 0 : this.evType.hashCode());
        result = prime * result + ((this.evEnabled == null) ? 0 : this.evEnabled.hashCode());
        result = prime * result + ((this.isInstead == null) ? 0 : this.isInstead.hashCode());
        result = prime * result + ((this.evQual == null) ? 0 : this.evQual.hashCode());
        result = prime * result + ((this.evAction == null) ? 0 : this.evAction.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgRewrite (");

        sb.append(oid);
        sb.append(", ").append(rulename);
        sb.append(", ").append(evClass);
        sb.append(", ").append(evType);
        sb.append(", ").append(evEnabled);
        sb.append(", ").append(isInstead);
        sb.append(", ").append(evQual);
        sb.append(", ").append(evAction);

        sb.append(")");
        return sb.toString();
    }
}
