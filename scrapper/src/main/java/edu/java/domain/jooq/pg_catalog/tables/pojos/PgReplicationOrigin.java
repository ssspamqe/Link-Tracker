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
public class PgReplicationOrigin implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long roident;
    private String roname;

    public PgReplicationOrigin() {}

    public PgReplicationOrigin(PgReplicationOrigin value) {
        this.roident = value.roident;
        this.roname = value.roname;
    }

    @ConstructorProperties({ "roident", "roname" })
    public PgReplicationOrigin(
        @NotNull Long roident,
        @NotNull String roname
    ) {
        this.roident = roident;
        this.roname = roname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRoident() {
        return this.roident;
    }

    public void setRoident(@NotNull Long roident) {
        this.roident = roident;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getRoname() {
        return this.roname;
    }

    public void setRoname(@NotNull String roname) {
        this.roname = roname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgReplicationOrigin other = (PgReplicationOrigin) obj;
        if (this.roident == null) {
            if (other.roident != null)
                return false;
        }
        else if (!this.roident.equals(other.roident))
            return false;
        if (this.roname == null) {
            if (other.roname != null)
                return false;
        }
        else if (!this.roname.equals(other.roname))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.roident == null) ? 0 : this.roident.hashCode());
        result = prime * result + ((this.roname == null) ? 0 : this.roname.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgReplicationOrigin (");

        sb.append(roident);
        sb.append(", ").append(roname);

        sb.append(")");
        return sb.toString();
    }
}
