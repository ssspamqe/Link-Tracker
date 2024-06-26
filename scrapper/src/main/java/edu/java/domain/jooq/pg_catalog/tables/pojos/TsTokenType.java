/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

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
public class TsTokenType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer tokid;
    private String alias;
    private String description;

    public TsTokenType() {}

    public TsTokenType(TsTokenType value) {
        this.tokid = value.tokid;
        this.alias = value.alias;
        this.description = value.description;
    }

    @ConstructorProperties({ "tokid", "alias", "description" })
    public TsTokenType(
        @Nullable Integer tokid,
        @Nullable String alias,
        @Nullable String description
    ) {
        this.tokid = tokid;
        this.alias = alias;
        this.description = description;
    }

    @Nullable
    public Integer getTokid() {
        return this.tokid;
    }

    public void setTokid(@Nullable Integer tokid) {
        this.tokid = tokid;
    }

    @Nullable
    public String getAlias() {
        return this.alias;
    }

    public void setAlias(@Nullable String alias) {
        this.alias = alias;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TsTokenType other = (TsTokenType) obj;
        if (this.tokid == null) {
            if (other.tokid != null)
                return false;
        }
        else if (!this.tokid.equals(other.tokid))
            return false;
        if (this.alias == null) {
            if (other.alias != null)
                return false;
        }
        else if (!this.alias.equals(other.alias))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tokid == null) ? 0 : this.tokid.hashCode());
        result = prime * result + ((this.alias == null) ? 0 : this.alias.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TsTokenType (");

        sb.append(tokid);
        sb.append(", ").append(alias);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
