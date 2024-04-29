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
public class PgAm implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String amname;
    private String amhandler;
    private String amtype;

    public PgAm() {}

    public PgAm(PgAm value) {
        this.oid = value.oid;
        this.amname = value.amname;
        this.amhandler = value.amhandler;
        this.amtype = value.amtype;
    }

    @ConstructorProperties({ "oid", "amname", "amhandler", "amtype" })
    public PgAm(
        @NotNull Long oid,
        @NotNull String amname,
        @NotNull String amhandler,
        @NotNull String amtype
    ) {
        this.oid = oid;
        this.amname = amname;
        this.amhandler = amhandler;
        this.amtype = amtype;
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
    public String getAmname() {
        return this.amname;
    }

    public void setAmname(@NotNull String amname) {
        this.amname = amname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getAmhandler() {
        return this.amhandler;
    }

    public void setAmhandler(@NotNull String amhandler) {
        this.amhandler = amhandler;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getAmtype() {
        return this.amtype;
    }

    public void setAmtype(@NotNull String amtype) {
        this.amtype = amtype;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgAm other = (PgAm) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.amname == null) {
            if (other.amname != null)
                return false;
        }
        else if (!this.amname.equals(other.amname))
            return false;
        if (this.amhandler == null) {
            if (other.amhandler != null)
                return false;
        }
        else if (!this.amhandler.equals(other.amhandler))
            return false;
        if (this.amtype == null) {
            if (other.amtype != null)
                return false;
        }
        else if (!this.amtype.equals(other.amtype))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.amname == null) ? 0 : this.amname.hashCode());
        result = prime * result + ((this.amhandler == null) ? 0 : this.amhandler.hashCode());
        result = prime * result + ((this.amtype == null) ? 0 : this.amtype.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAm (");

        sb.append(oid);
        sb.append(", ").append(amname);
        sb.append(", ").append(amhandler);
        sb.append(", ").append(amtype);

        sb.append(")");
        return sb.toString();
    }
}