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
public class PgTsDict implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String dictname;
    private Long dictnamespace;
    private Long dictowner;
    private Long dicttemplate;
    private String dictinitoption;

    public PgTsDict() {}

    public PgTsDict(PgTsDict value) {
        this.oid = value.oid;
        this.dictname = value.dictname;
        this.dictnamespace = value.dictnamespace;
        this.dictowner = value.dictowner;
        this.dicttemplate = value.dicttemplate;
        this.dictinitoption = value.dictinitoption;
    }

    @ConstructorProperties({ "oid", "dictname", "dictnamespace", "dictowner", "dicttemplate", "dictinitoption" })
    public PgTsDict(
        @NotNull Long oid,
        @NotNull String dictname,
        @NotNull Long dictnamespace,
        @NotNull Long dictowner,
        @NotNull Long dicttemplate,
        @Nullable String dictinitoption
    ) {
        this.oid = oid;
        this.dictname = dictname;
        this.dictnamespace = dictnamespace;
        this.dictowner = dictowner;
        this.dicttemplate = dicttemplate;
        this.dictinitoption = dictinitoption;
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
    public String getDictname() {
        return this.dictname;
    }

    public void setDictname(@NotNull String dictname) {
        this.dictname = dictname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDictnamespace() {
        return this.dictnamespace;
    }

    public void setDictnamespace(@NotNull Long dictnamespace) {
        this.dictnamespace = dictnamespace;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDictowner() {
        return this.dictowner;
    }

    public void setDictowner(@NotNull Long dictowner) {
        this.dictowner = dictowner;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getDicttemplate() {
        return this.dicttemplate;
    }

    public void setDicttemplate(@NotNull Long dicttemplate) {
        this.dicttemplate = dicttemplate;
    }

    @Nullable
    public String getDictinitoption() {
        return this.dictinitoption;
    }

    public void setDictinitoption(@Nullable String dictinitoption) {
        this.dictinitoption = dictinitoption;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgTsDict other = (PgTsDict) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.dictname == null) {
            if (other.dictname != null)
                return false;
        }
        else if (!this.dictname.equals(other.dictname))
            return false;
        if (this.dictnamespace == null) {
            if (other.dictnamespace != null)
                return false;
        }
        else if (!this.dictnamespace.equals(other.dictnamespace))
            return false;
        if (this.dictowner == null) {
            if (other.dictowner != null)
                return false;
        }
        else if (!this.dictowner.equals(other.dictowner))
            return false;
        if (this.dicttemplate == null) {
            if (other.dicttemplate != null)
                return false;
        }
        else if (!this.dicttemplate.equals(other.dicttemplate))
            return false;
        if (this.dictinitoption == null) {
            if (other.dictinitoption != null)
                return false;
        }
        else if (!this.dictinitoption.equals(other.dictinitoption))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.dictname == null) ? 0 : this.dictname.hashCode());
        result = prime * result + ((this.dictnamespace == null) ? 0 : this.dictnamespace.hashCode());
        result = prime * result + ((this.dictowner == null) ? 0 : this.dictowner.hashCode());
        result = prime * result + ((this.dicttemplate == null) ? 0 : this.dicttemplate.hashCode());
        result = prime * result + ((this.dictinitoption == null) ? 0 : this.dictinitoption.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTsDict (");

        sb.append(oid);
        sb.append(", ").append(dictname);
        sb.append(", ").append(dictnamespace);
        sb.append(", ").append(dictowner);
        sb.append(", ").append(dicttemplate);
        sb.append(", ").append(dictinitoption);

        sb.append(")");
        return sb.toString();
    }
}
