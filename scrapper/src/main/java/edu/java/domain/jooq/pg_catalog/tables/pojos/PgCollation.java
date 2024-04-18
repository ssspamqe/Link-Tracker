/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgCollation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String collname;
    private Long collnamespace;
    private Long collowner;
    private String collprovider;
    private Boolean collisdeterministic;
    private Integer collencoding;
    private String collcollate;
    private String collctype;
    private String colliculocale;
    private String collicurules;
    private String collversion;

    public PgCollation() {}

    public PgCollation(PgCollation value) {
        this.oid = value.oid;
        this.collname = value.collname;
        this.collnamespace = value.collnamespace;
        this.collowner = value.collowner;
        this.collprovider = value.collprovider;
        this.collisdeterministic = value.collisdeterministic;
        this.collencoding = value.collencoding;
        this.collcollate = value.collcollate;
        this.collctype = value.collctype;
        this.colliculocale = value.colliculocale;
        this.collicurules = value.collicurules;
        this.collversion = value.collversion;
    }

    @ConstructorProperties({ "oid", "collname", "collnamespace", "collowner", "collprovider", "collisdeterministic", "collencoding", "collcollate", "collctype", "colliculocale", "collicurules", "collversion" })
    public PgCollation(
        @NotNull Long oid,
        @NotNull String collname,
        @NotNull Long collnamespace,
        @NotNull Long collowner,
        @NotNull String collprovider,
        @NotNull Boolean collisdeterministic,
        @NotNull Integer collencoding,
        @Nullable String collcollate,
        @Nullable String collctype,
        @Nullable String colliculocale,
        @Nullable String collicurules,
        @Nullable String collversion
    ) {
        this.oid = oid;
        this.collname = collname;
        this.collnamespace = collnamespace;
        this.collowner = collowner;
        this.collprovider = collprovider;
        this.collisdeterministic = collisdeterministic;
        this.collencoding = collencoding;
        this.collcollate = collcollate;
        this.collctype = collctype;
        this.colliculocale = colliculocale;
        this.collicurules = collicurules;
        this.collversion = collversion;
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
    public String getCollname() {
        return this.collname;
    }

    public void setCollname(@NotNull String collname) {
        this.collname = collname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getCollnamespace() {
        return this.collnamespace;
    }

    public void setCollnamespace(@NotNull Long collnamespace) {
        this.collnamespace = collnamespace;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getCollowner() {
        return this.collowner;
    }

    public void setCollowner(@NotNull Long collowner) {
        this.collowner = collowner;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getCollprovider() {
        return this.collprovider;
    }

    public void setCollprovider(@NotNull String collprovider) {
        this.collprovider = collprovider;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getCollisdeterministic() {
        return this.collisdeterministic;
    }

    public void setCollisdeterministic(@NotNull Boolean collisdeterministic) {
        this.collisdeterministic = collisdeterministic;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getCollencoding() {
        return this.collencoding;
    }

    public void setCollencoding(@NotNull Integer collencoding) {
        this.collencoding = collencoding;
    }

    @Nullable
    public String getCollcollate() {
        return this.collcollate;
    }

    public void setCollcollate(@Nullable String collcollate) {
        this.collcollate = collcollate;
    }

    @Nullable
    public String getCollctype() {
        return this.collctype;
    }

    public void setCollctype(@Nullable String collctype) {
        this.collctype = collctype;
    }

    @Nullable
    public String getColliculocale() {
        return this.colliculocale;
    }

    public void setColliculocale(@Nullable String colliculocale) {
        this.colliculocale = colliculocale;
    }

    @Nullable
    public String getCollicurules() {
        return this.collicurules;
    }

    public void setCollicurules(@Nullable String collicurules) {
        this.collicurules = collicurules;
    }

    @Nullable
    public String getCollversion() {
        return this.collversion;
    }

    public void setCollversion(@Nullable String collversion) {
        this.collversion = collversion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgCollation other = (PgCollation) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.collname == null) {
            if (other.collname != null)
                return false;
        }
        else if (!this.collname.equals(other.collname))
            return false;
        if (this.collnamespace == null) {
            if (other.collnamespace != null)
                return false;
        }
        else if (!this.collnamespace.equals(other.collnamespace))
            return false;
        if (this.collowner == null) {
            if (other.collowner != null)
                return false;
        }
        else if (!this.collowner.equals(other.collowner))
            return false;
        if (this.collprovider == null) {
            if (other.collprovider != null)
                return false;
        }
        else if (!this.collprovider.equals(other.collprovider))
            return false;
        if (this.collisdeterministic == null) {
            if (other.collisdeterministic != null)
                return false;
        }
        else if (!this.collisdeterministic.equals(other.collisdeterministic))
            return false;
        if (this.collencoding == null) {
            if (other.collencoding != null)
                return false;
        }
        else if (!this.collencoding.equals(other.collencoding))
            return false;
        if (this.collcollate == null) {
            if (other.collcollate != null)
                return false;
        }
        else if (!this.collcollate.equals(other.collcollate))
            return false;
        if (this.collctype == null) {
            if (other.collctype != null)
                return false;
        }
        else if (!this.collctype.equals(other.collctype))
            return false;
        if (this.colliculocale == null) {
            if (other.colliculocale != null)
                return false;
        }
        else if (!this.colliculocale.equals(other.colliculocale))
            return false;
        if (this.collicurules == null) {
            if (other.collicurules != null)
                return false;
        }
        else if (!this.collicurules.equals(other.collicurules))
            return false;
        if (this.collversion == null) {
            if (other.collversion != null)
                return false;
        }
        else if (!this.collversion.equals(other.collversion))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.collname == null) ? 0 : this.collname.hashCode());
        result = prime * result + ((this.collnamespace == null) ? 0 : this.collnamespace.hashCode());
        result = prime * result + ((this.collowner == null) ? 0 : this.collowner.hashCode());
        result = prime * result + ((this.collprovider == null) ? 0 : this.collprovider.hashCode());
        result = prime * result + ((this.collisdeterministic == null) ? 0 : this.collisdeterministic.hashCode());
        result = prime * result + ((this.collencoding == null) ? 0 : this.collencoding.hashCode());
        result = prime * result + ((this.collcollate == null) ? 0 : this.collcollate.hashCode());
        result = prime * result + ((this.collctype == null) ? 0 : this.collctype.hashCode());
        result = prime * result + ((this.colliculocale == null) ? 0 : this.colliculocale.hashCode());
        result = prime * result + ((this.collicurules == null) ? 0 : this.collicurules.hashCode());
        result = prime * result + ((this.collversion == null) ? 0 : this.collversion.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgCollation (");

        sb.append(oid);
        sb.append(", ").append(collname);
        sb.append(", ").append(collnamespace);
        sb.append(", ").append(collowner);
        sb.append(", ").append(collprovider);
        sb.append(", ").append(collisdeterministic);
        sb.append(", ").append(collencoding);
        sb.append(", ").append(collcollate);
        sb.append(", ").append(collctype);
        sb.append(", ").append(colliculocale);
        sb.append(", ").append(collicurules);
        sb.append(", ").append(collversion);

        sb.append(")");
        return sb.toString();
    }
}
