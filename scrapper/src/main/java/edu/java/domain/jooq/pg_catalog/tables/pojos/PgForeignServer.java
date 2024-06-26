/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

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
public class PgForeignServer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String srvname;
    private Long srvowner;
    private Long srvfdw;
    private String srvtype;
    private String srvversion;
    private String[] srvacl;
    private String[] srvoptions;

    public PgForeignServer() {}

    public PgForeignServer(PgForeignServer value) {
        this.oid = value.oid;
        this.srvname = value.srvname;
        this.srvowner = value.srvowner;
        this.srvfdw = value.srvfdw;
        this.srvtype = value.srvtype;
        this.srvversion = value.srvversion;
        this.srvacl = value.srvacl;
        this.srvoptions = value.srvoptions;
    }

    @ConstructorProperties({ "oid", "srvname", "srvowner", "srvfdw", "srvtype", "srvversion", "srvacl", "srvoptions" })
    public PgForeignServer(
        @NotNull Long oid,
        @NotNull String srvname,
        @NotNull Long srvowner,
        @NotNull Long srvfdw,
        @Nullable String srvtype,
        @Nullable String srvversion,
        @Nullable String[] srvacl,
        @Nullable String[] srvoptions
    ) {
        this.oid = oid;
        this.srvname = srvname;
        this.srvowner = srvowner;
        this.srvfdw = srvfdw;
        this.srvtype = srvtype;
        this.srvversion = srvversion;
        this.srvacl = srvacl;
        this.srvoptions = srvoptions;
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
    public String getSrvname() {
        return this.srvname;
    }

    public void setSrvname(@NotNull String srvname) {
        this.srvname = srvname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSrvowner() {
        return this.srvowner;
    }

    public void setSrvowner(@NotNull Long srvowner) {
        this.srvowner = srvowner;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSrvfdw() {
        return this.srvfdw;
    }

    public void setSrvfdw(@NotNull Long srvfdw) {
        this.srvfdw = srvfdw;
    }

    @Nullable
    public String getSrvtype() {
        return this.srvtype;
    }

    public void setSrvtype(@Nullable String srvtype) {
        this.srvtype = srvtype;
    }

    @Nullable
    public String getSrvversion() {
        return this.srvversion;
    }

    public void setSrvversion(@Nullable String srvversion) {
        this.srvversion = srvversion;
    }

    @Nullable
    public String[] getSrvacl() {
        return this.srvacl;
    }

    public void setSrvacl(@Nullable String[] srvacl) {
        this.srvacl = srvacl;
    }

    @Nullable
    public String[] getSrvoptions() {
        return this.srvoptions;
    }

    public void setSrvoptions(@Nullable String[] srvoptions) {
        this.srvoptions = srvoptions;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgForeignServer other = (PgForeignServer) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.srvname == null) {
            if (other.srvname != null)
                return false;
        }
        else if (!this.srvname.equals(other.srvname))
            return false;
        if (this.srvowner == null) {
            if (other.srvowner != null)
                return false;
        }
        else if (!this.srvowner.equals(other.srvowner))
            return false;
        if (this.srvfdw == null) {
            if (other.srvfdw != null)
                return false;
        }
        else if (!this.srvfdw.equals(other.srvfdw))
            return false;
        if (this.srvtype == null) {
            if (other.srvtype != null)
                return false;
        }
        else if (!this.srvtype.equals(other.srvtype))
            return false;
        if (this.srvversion == null) {
            if (other.srvversion != null)
                return false;
        }
        else if (!this.srvversion.equals(other.srvversion))
            return false;
        if (this.srvacl == null) {
            if (other.srvacl != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.srvacl, other.srvacl))
            return false;
        if (this.srvoptions == null) {
            if (other.srvoptions != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.srvoptions, other.srvoptions))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.srvname == null) ? 0 : this.srvname.hashCode());
        result = prime * result + ((this.srvowner == null) ? 0 : this.srvowner.hashCode());
        result = prime * result + ((this.srvfdw == null) ? 0 : this.srvfdw.hashCode());
        result = prime * result + ((this.srvtype == null) ? 0 : this.srvtype.hashCode());
        result = prime * result + ((this.srvversion == null) ? 0 : this.srvversion.hashCode());
        result = prime * result + ((this.srvacl == null) ? 0 : Arrays.deepHashCode(this.srvacl));
        result = prime * result + ((this.srvoptions == null) ? 0 : Arrays.deepHashCode(this.srvoptions));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgForeignServer (");

        sb.append(oid);
        sb.append(", ").append(srvname);
        sb.append(", ").append(srvowner);
        sb.append(", ").append(srvfdw);
        sb.append(", ").append(srvtype);
        sb.append(", ").append(srvversion);
        sb.append(", ").append(Arrays.deepToString(srvacl));
        sb.append(", ").append(Arrays.deepToString(srvoptions));

        sb.append(")");
        return sb.toString();
    }
}
