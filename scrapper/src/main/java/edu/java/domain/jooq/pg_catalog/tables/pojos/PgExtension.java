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
public class PgExtension implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String extname;
    private Long extowner;
    private Long extnamespace;
    private Boolean extrelocatable;
    private String extversion;
    private Long[] extconfig;
    private String[] extcondition;

    public PgExtension() {}

    public PgExtension(PgExtension value) {
        this.oid = value.oid;
        this.extname = value.extname;
        this.extowner = value.extowner;
        this.extnamespace = value.extnamespace;
        this.extrelocatable = value.extrelocatable;
        this.extversion = value.extversion;
        this.extconfig = value.extconfig;
        this.extcondition = value.extcondition;
    }

    @ConstructorProperties({ "oid", "extname", "extowner", "extnamespace", "extrelocatable", "extversion", "extconfig", "extcondition" })
    public PgExtension(
        @NotNull Long oid,
        @NotNull String extname,
        @NotNull Long extowner,
        @NotNull Long extnamespace,
        @NotNull Boolean extrelocatable,
        @NotNull String extversion,
        @Nullable Long[] extconfig,
        @Nullable String[] extcondition
    ) {
        this.oid = oid;
        this.extname = extname;
        this.extowner = extowner;
        this.extnamespace = extnamespace;
        this.extrelocatable = extrelocatable;
        this.extversion = extversion;
        this.extconfig = extconfig;
        this.extcondition = extcondition;
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
    public String getExtname() {
        return this.extname;
    }

    public void setExtname(@NotNull String extname) {
        this.extname = extname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getExtowner() {
        return this.extowner;
    }

    public void setExtowner(@NotNull Long extowner) {
        this.extowner = extowner;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getExtnamespace() {
        return this.extnamespace;
    }

    public void setExtnamespace(@NotNull Long extnamespace) {
        this.extnamespace = extnamespace;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getExtrelocatable() {
        return this.extrelocatable;
    }

    public void setExtrelocatable(@NotNull Boolean extrelocatable) {
        this.extrelocatable = extrelocatable;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getExtversion() {
        return this.extversion;
    }

    public void setExtversion(@NotNull String extversion) {
        this.extversion = extversion;
    }

    @Nullable
    public Long[] getExtconfig() {
        return this.extconfig;
    }

    public void setExtconfig(@Nullable Long[] extconfig) {
        this.extconfig = extconfig;
    }

    @Nullable
    public String[] getExtcondition() {
        return this.extcondition;
    }

    public void setExtcondition(@Nullable String[] extcondition) {
        this.extcondition = extcondition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgExtension other = (PgExtension) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.extname == null) {
            if (other.extname != null)
                return false;
        }
        else if (!this.extname.equals(other.extname))
            return false;
        if (this.extowner == null) {
            if (other.extowner != null)
                return false;
        }
        else if (!this.extowner.equals(other.extowner))
            return false;
        if (this.extnamespace == null) {
            if (other.extnamespace != null)
                return false;
        }
        else if (!this.extnamespace.equals(other.extnamespace))
            return false;
        if (this.extrelocatable == null) {
            if (other.extrelocatable != null)
                return false;
        }
        else if (!this.extrelocatable.equals(other.extrelocatable))
            return false;
        if (this.extversion == null) {
            if (other.extversion != null)
                return false;
        }
        else if (!this.extversion.equals(other.extversion))
            return false;
        if (this.extconfig == null) {
            if (other.extconfig != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.extconfig, other.extconfig))
            return false;
        if (this.extcondition == null) {
            if (other.extcondition != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.extcondition, other.extcondition))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.extname == null) ? 0 : this.extname.hashCode());
        result = prime * result + ((this.extowner == null) ? 0 : this.extowner.hashCode());
        result = prime * result + ((this.extnamespace == null) ? 0 : this.extnamespace.hashCode());
        result = prime * result + ((this.extrelocatable == null) ? 0 : this.extrelocatable.hashCode());
        result = prime * result + ((this.extversion == null) ? 0 : this.extversion.hashCode());
        result = prime * result + ((this.extconfig == null) ? 0 : Arrays.deepHashCode(this.extconfig));
        result = prime * result + ((this.extcondition == null) ? 0 : Arrays.deepHashCode(this.extcondition));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgExtension (");

        sb.append(oid);
        sb.append(", ").append(extname);
        sb.append(", ").append(extowner);
        sb.append(", ").append(extnamespace);
        sb.append(", ").append(extrelocatable);
        sb.append(", ").append(extversion);
        sb.append(", ").append(Arrays.deepToString(extconfig));
        sb.append(", ").append(Arrays.deepToString(extcondition));

        sb.append(")");
        return sb.toString();
    }
}