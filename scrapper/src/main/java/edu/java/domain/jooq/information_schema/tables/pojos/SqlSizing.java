/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


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
public class SqlSizing implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sizingId;
    private String sizingName;
    private Integer supportedValue;
    private String comments;

    public SqlSizing() {}

    public SqlSizing(SqlSizing value) {
        this.sizingId = value.sizingId;
        this.sizingName = value.sizingName;
        this.supportedValue = value.supportedValue;
        this.comments = value.comments;
    }

    @ConstructorProperties({ "sizingId", "sizingName", "supportedValue", "comments" })
    public SqlSizing(
        @Nullable Integer sizingId,
        @Nullable String sizingName,
        @Nullable Integer supportedValue,
        @Nullable String comments
    ) {
        this.sizingId = sizingId;
        this.sizingName = sizingName;
        this.supportedValue = supportedValue;
        this.comments = comments;
    }

    @Nullable
    public Integer getSizingId() {
        return this.sizingId;
    }

    public void setSizingId(@Nullable Integer sizingId) {
        this.sizingId = sizingId;
    }

    @Nullable
    public String getSizingName() {
        return this.sizingName;
    }

    public void setSizingName(@Nullable String sizingName) {
        this.sizingName = sizingName;
    }

    @Nullable
    public Integer getSupportedValue() {
        return this.supportedValue;
    }

    public void setSupportedValue(@Nullable Integer supportedValue) {
        this.supportedValue = supportedValue;
    }

    @Nullable
    public String getComments() {
        return this.comments;
    }

    public void setComments(@Nullable String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SqlSizing other = (SqlSizing) obj;
        if (this.sizingId == null) {
            if (other.sizingId != null)
                return false;
        }
        else if (!this.sizingId.equals(other.sizingId))
            return false;
        if (this.sizingName == null) {
            if (other.sizingName != null)
                return false;
        }
        else if (!this.sizingName.equals(other.sizingName))
            return false;
        if (this.supportedValue == null) {
            if (other.supportedValue != null)
                return false;
        }
        else if (!this.supportedValue.equals(other.supportedValue))
            return false;
        if (this.comments == null) {
            if (other.comments != null)
                return false;
        }
        else if (!this.comments.equals(other.comments))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.sizingId == null) ? 0 : this.sizingId.hashCode());
        result = prime * result + ((this.sizingName == null) ? 0 : this.sizingName.hashCode());
        result = prime * result + ((this.supportedValue == null) ? 0 : this.supportedValue.hashCode());
        result = prime * result + ((this.comments == null) ? 0 : this.comments.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlSizing (");

        sb.append(sizingId);
        sb.append(", ").append(sizingName);
        sb.append(", ").append(supportedValue);
        sb.append(", ").append(comments);

        sb.append(")");
        return sb.toString();
    }
}
