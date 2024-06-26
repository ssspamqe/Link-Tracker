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
public class PgType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String typname;
    private Long typnamespace;
    private Long typowner;
    private Short typlen;
    private Boolean typbyval;
    private String typtype;
    private String typcategory;
    private Boolean typispreferred;
    private Boolean typisdefined;
    private String typdelim;
    private Long typrelid;
    private String typsubscript;
    private Long typelem;
    private Long typarray;
    private String typinput;
    private String typoutput;
    private String typreceive;
    private String typsend;
    private String typmodin;
    private String typmodout;
    private String typanalyze;
    private String typalign;
    private String typstorage;
    private Boolean typnotnull;
    private Long typbasetype;
    private Integer typtypmod;
    private Integer typndims;
    private Long typcollation;
    private Object typdefaultbin;
    private String typdefault;
    private String[] typacl;

    public PgType() {}

    public PgType(PgType value) {
        this.oid = value.oid;
        this.typname = value.typname;
        this.typnamespace = value.typnamespace;
        this.typowner = value.typowner;
        this.typlen = value.typlen;
        this.typbyval = value.typbyval;
        this.typtype = value.typtype;
        this.typcategory = value.typcategory;
        this.typispreferred = value.typispreferred;
        this.typisdefined = value.typisdefined;
        this.typdelim = value.typdelim;
        this.typrelid = value.typrelid;
        this.typsubscript = value.typsubscript;
        this.typelem = value.typelem;
        this.typarray = value.typarray;
        this.typinput = value.typinput;
        this.typoutput = value.typoutput;
        this.typreceive = value.typreceive;
        this.typsend = value.typsend;
        this.typmodin = value.typmodin;
        this.typmodout = value.typmodout;
        this.typanalyze = value.typanalyze;
        this.typalign = value.typalign;
        this.typstorage = value.typstorage;
        this.typnotnull = value.typnotnull;
        this.typbasetype = value.typbasetype;
        this.typtypmod = value.typtypmod;
        this.typndims = value.typndims;
        this.typcollation = value.typcollation;
        this.typdefaultbin = value.typdefaultbin;
        this.typdefault = value.typdefault;
        this.typacl = value.typacl;
    }

    @ConstructorProperties({ "oid", "typname", "typnamespace", "typowner", "typlen", "typbyval", "typtype", "typcategory", "typispreferred", "typisdefined", "typdelim", "typrelid", "typsubscript", "typelem", "typarray", "typinput", "typoutput", "typreceive", "typsend", "typmodin", "typmodout", "typanalyze", "typalign", "typstorage", "typnotnull", "typbasetype", "typtypmod", "typndims", "typcollation", "typdefaultbin", "typdefault", "typacl" })
    public PgType(
        @NotNull Long oid,
        @NotNull String typname,
        @NotNull Long typnamespace,
        @NotNull Long typowner,
        @NotNull Short typlen,
        @NotNull Boolean typbyval,
        @NotNull String typtype,
        @NotNull String typcategory,
        @NotNull Boolean typispreferred,
        @NotNull Boolean typisdefined,
        @NotNull String typdelim,
        @NotNull Long typrelid,
        @NotNull String typsubscript,
        @NotNull Long typelem,
        @NotNull Long typarray,
        @NotNull String typinput,
        @NotNull String typoutput,
        @NotNull String typreceive,
        @NotNull String typsend,
        @NotNull String typmodin,
        @NotNull String typmodout,
        @NotNull String typanalyze,
        @NotNull String typalign,
        @NotNull String typstorage,
        @NotNull Boolean typnotnull,
        @NotNull Long typbasetype,
        @NotNull Integer typtypmod,
        @NotNull Integer typndims,
        @NotNull Long typcollation,
        @Nullable Object typdefaultbin,
        @Nullable String typdefault,
        @Nullable String[] typacl
    ) {
        this.oid = oid;
        this.typname = typname;
        this.typnamespace = typnamespace;
        this.typowner = typowner;
        this.typlen = typlen;
        this.typbyval = typbyval;
        this.typtype = typtype;
        this.typcategory = typcategory;
        this.typispreferred = typispreferred;
        this.typisdefined = typisdefined;
        this.typdelim = typdelim;
        this.typrelid = typrelid;
        this.typsubscript = typsubscript;
        this.typelem = typelem;
        this.typarray = typarray;
        this.typinput = typinput;
        this.typoutput = typoutput;
        this.typreceive = typreceive;
        this.typsend = typsend;
        this.typmodin = typmodin;
        this.typmodout = typmodout;
        this.typanalyze = typanalyze;
        this.typalign = typalign;
        this.typstorage = typstorage;
        this.typnotnull = typnotnull;
        this.typbasetype = typbasetype;
        this.typtypmod = typtypmod;
        this.typndims = typndims;
        this.typcollation = typcollation;
        this.typdefaultbin = typdefaultbin;
        this.typdefault = typdefault;
        this.typacl = typacl;
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
    public String getTypname() {
        return this.typname;
    }

    public void setTypname(@NotNull String typname) {
        this.typname = typname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTypnamespace() {
        return this.typnamespace;
    }

    public void setTypnamespace(@NotNull Long typnamespace) {
        this.typnamespace = typnamespace;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTypowner() {
        return this.typowner;
    }

    public void setTypowner(@NotNull Long typowner) {
        this.typowner = typowner;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getTyplen() {
        return this.typlen;
    }

    public void setTyplen(@NotNull Short typlen) {
        this.typlen = typlen;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getTypbyval() {
        return this.typbyval;
    }

    public void setTypbyval(@NotNull Boolean typbyval) {
        this.typbyval = typbyval;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTyptype() {
        return this.typtype;
    }

    public void setTyptype(@NotNull String typtype) {
        this.typtype = typtype;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypcategory() {
        return this.typcategory;
    }

    public void setTypcategory(@NotNull String typcategory) {
        this.typcategory = typcategory;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getTypispreferred() {
        return this.typispreferred;
    }

    public void setTypispreferred(@NotNull Boolean typispreferred) {
        this.typispreferred = typispreferred;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getTypisdefined() {
        return this.typisdefined;
    }

    public void setTypisdefined(@NotNull Boolean typisdefined) {
        this.typisdefined = typisdefined;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypdelim() {
        return this.typdelim;
    }

    public void setTypdelim(@NotNull String typdelim) {
        this.typdelim = typdelim;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTyprelid() {
        return this.typrelid;
    }

    public void setTyprelid(@NotNull Long typrelid) {
        this.typrelid = typrelid;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypsubscript() {
        return this.typsubscript;
    }

    public void setTypsubscript(@NotNull String typsubscript) {
        this.typsubscript = typsubscript;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTypelem() {
        return this.typelem;
    }

    public void setTypelem(@NotNull Long typelem) {
        this.typelem = typelem;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTyparray() {
        return this.typarray;
    }

    public void setTyparray(@NotNull Long typarray) {
        this.typarray = typarray;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypinput() {
        return this.typinput;
    }

    public void setTypinput(@NotNull String typinput) {
        this.typinput = typinput;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypoutput() {
        return this.typoutput;
    }

    public void setTypoutput(@NotNull String typoutput) {
        this.typoutput = typoutput;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypreceive() {
        return this.typreceive;
    }

    public void setTypreceive(@NotNull String typreceive) {
        this.typreceive = typreceive;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypsend() {
        return this.typsend;
    }

    public void setTypsend(@NotNull String typsend) {
        this.typsend = typsend;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypmodin() {
        return this.typmodin;
    }

    public void setTypmodin(@NotNull String typmodin) {
        this.typmodin = typmodin;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypmodout() {
        return this.typmodout;
    }

    public void setTypmodout(@NotNull String typmodout) {
        this.typmodout = typmodout;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypanalyze() {
        return this.typanalyze;
    }

    public void setTypanalyze(@NotNull String typanalyze) {
        this.typanalyze = typanalyze;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypalign() {
        return this.typalign;
    }

    public void setTypalign(@NotNull String typalign) {
        this.typalign = typalign;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTypstorage() {
        return this.typstorage;
    }

    public void setTypstorage(@NotNull String typstorage) {
        this.typstorage = typstorage;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getTypnotnull() {
        return this.typnotnull;
    }

    public void setTypnotnull(@NotNull Boolean typnotnull) {
        this.typnotnull = typnotnull;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTypbasetype() {
        return this.typbasetype;
    }

    public void setTypbasetype(@NotNull Long typbasetype) {
        this.typbasetype = typbasetype;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getTyptypmod() {
        return this.typtypmod;
    }

    public void setTyptypmod(@NotNull Integer typtypmod) {
        this.typtypmod = typtypmod;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getTypndims() {
        return this.typndims;
    }

    public void setTypndims(@NotNull Integer typndims) {
        this.typndims = typndims;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTypcollation() {
        return this.typcollation;
    }

    public void setTypcollation(@NotNull Long typcollation) {
        this.typcollation = typcollation;
    }

    @Deprecated
    @Nullable
    public Object getTypdefaultbin() {
        return this.typdefaultbin;
    }

    @Deprecated
    public void setTypdefaultbin(@Nullable Object typdefaultbin) {
        this.typdefaultbin = typdefaultbin;
    }

    @Nullable
    public String getTypdefault() {
        return this.typdefault;
    }

    public void setTypdefault(@Nullable String typdefault) {
        this.typdefault = typdefault;
    }

    @Nullable
    public String[] getTypacl() {
        return this.typacl;
    }

    public void setTypacl(@Nullable String[] typacl) {
        this.typacl = typacl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgType other = (PgType) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.typname == null) {
            if (other.typname != null)
                return false;
        }
        else if (!this.typname.equals(other.typname))
            return false;
        if (this.typnamespace == null) {
            if (other.typnamespace != null)
                return false;
        }
        else if (!this.typnamespace.equals(other.typnamespace))
            return false;
        if (this.typowner == null) {
            if (other.typowner != null)
                return false;
        }
        else if (!this.typowner.equals(other.typowner))
            return false;
        if (this.typlen == null) {
            if (other.typlen != null)
                return false;
        }
        else if (!this.typlen.equals(other.typlen))
            return false;
        if (this.typbyval == null) {
            if (other.typbyval != null)
                return false;
        }
        else if (!this.typbyval.equals(other.typbyval))
            return false;
        if (this.typtype == null) {
            if (other.typtype != null)
                return false;
        }
        else if (!this.typtype.equals(other.typtype))
            return false;
        if (this.typcategory == null) {
            if (other.typcategory != null)
                return false;
        }
        else if (!this.typcategory.equals(other.typcategory))
            return false;
        if (this.typispreferred == null) {
            if (other.typispreferred != null)
                return false;
        }
        else if (!this.typispreferred.equals(other.typispreferred))
            return false;
        if (this.typisdefined == null) {
            if (other.typisdefined != null)
                return false;
        }
        else if (!this.typisdefined.equals(other.typisdefined))
            return false;
        if (this.typdelim == null) {
            if (other.typdelim != null)
                return false;
        }
        else if (!this.typdelim.equals(other.typdelim))
            return false;
        if (this.typrelid == null) {
            if (other.typrelid != null)
                return false;
        }
        else if (!this.typrelid.equals(other.typrelid))
            return false;
        if (this.typsubscript == null) {
            if (other.typsubscript != null)
                return false;
        }
        else if (!this.typsubscript.equals(other.typsubscript))
            return false;
        if (this.typelem == null) {
            if (other.typelem != null)
                return false;
        }
        else if (!this.typelem.equals(other.typelem))
            return false;
        if (this.typarray == null) {
            if (other.typarray != null)
                return false;
        }
        else if (!this.typarray.equals(other.typarray))
            return false;
        if (this.typinput == null) {
            if (other.typinput != null)
                return false;
        }
        else if (!this.typinput.equals(other.typinput))
            return false;
        if (this.typoutput == null) {
            if (other.typoutput != null)
                return false;
        }
        else if (!this.typoutput.equals(other.typoutput))
            return false;
        if (this.typreceive == null) {
            if (other.typreceive != null)
                return false;
        }
        else if (!this.typreceive.equals(other.typreceive))
            return false;
        if (this.typsend == null) {
            if (other.typsend != null)
                return false;
        }
        else if (!this.typsend.equals(other.typsend))
            return false;
        if (this.typmodin == null) {
            if (other.typmodin != null)
                return false;
        }
        else if (!this.typmodin.equals(other.typmodin))
            return false;
        if (this.typmodout == null) {
            if (other.typmodout != null)
                return false;
        }
        else if (!this.typmodout.equals(other.typmodout))
            return false;
        if (this.typanalyze == null) {
            if (other.typanalyze != null)
                return false;
        }
        else if (!this.typanalyze.equals(other.typanalyze))
            return false;
        if (this.typalign == null) {
            if (other.typalign != null)
                return false;
        }
        else if (!this.typalign.equals(other.typalign))
            return false;
        if (this.typstorage == null) {
            if (other.typstorage != null)
                return false;
        }
        else if (!this.typstorage.equals(other.typstorage))
            return false;
        if (this.typnotnull == null) {
            if (other.typnotnull != null)
                return false;
        }
        else if (!this.typnotnull.equals(other.typnotnull))
            return false;
        if (this.typbasetype == null) {
            if (other.typbasetype != null)
                return false;
        }
        else if (!this.typbasetype.equals(other.typbasetype))
            return false;
        if (this.typtypmod == null) {
            if (other.typtypmod != null)
                return false;
        }
        else if (!this.typtypmod.equals(other.typtypmod))
            return false;
        if (this.typndims == null) {
            if (other.typndims != null)
                return false;
        }
        else if (!this.typndims.equals(other.typndims))
            return false;
        if (this.typcollation == null) {
            if (other.typcollation != null)
                return false;
        }
        else if (!this.typcollation.equals(other.typcollation))
            return false;
        if (this.typdefaultbin == null) {
            if (other.typdefaultbin != null)
                return false;
        }
        else if (!this.typdefaultbin.equals(other.typdefaultbin))
            return false;
        if (this.typdefault == null) {
            if (other.typdefault != null)
                return false;
        }
        else if (!this.typdefault.equals(other.typdefault))
            return false;
        if (this.typacl == null) {
            if (other.typacl != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.typacl, other.typacl))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.typname == null) ? 0 : this.typname.hashCode());
        result = prime * result + ((this.typnamespace == null) ? 0 : this.typnamespace.hashCode());
        result = prime * result + ((this.typowner == null) ? 0 : this.typowner.hashCode());
        result = prime * result + ((this.typlen == null) ? 0 : this.typlen.hashCode());
        result = prime * result + ((this.typbyval == null) ? 0 : this.typbyval.hashCode());
        result = prime * result + ((this.typtype == null) ? 0 : this.typtype.hashCode());
        result = prime * result + ((this.typcategory == null) ? 0 : this.typcategory.hashCode());
        result = prime * result + ((this.typispreferred == null) ? 0 : this.typispreferred.hashCode());
        result = prime * result + ((this.typisdefined == null) ? 0 : this.typisdefined.hashCode());
        result = prime * result + ((this.typdelim == null) ? 0 : this.typdelim.hashCode());
        result = prime * result + ((this.typrelid == null) ? 0 : this.typrelid.hashCode());
        result = prime * result + ((this.typsubscript == null) ? 0 : this.typsubscript.hashCode());
        result = prime * result + ((this.typelem == null) ? 0 : this.typelem.hashCode());
        result = prime * result + ((this.typarray == null) ? 0 : this.typarray.hashCode());
        result = prime * result + ((this.typinput == null) ? 0 : this.typinput.hashCode());
        result = prime * result + ((this.typoutput == null) ? 0 : this.typoutput.hashCode());
        result = prime * result + ((this.typreceive == null) ? 0 : this.typreceive.hashCode());
        result = prime * result + ((this.typsend == null) ? 0 : this.typsend.hashCode());
        result = prime * result + ((this.typmodin == null) ? 0 : this.typmodin.hashCode());
        result = prime * result + ((this.typmodout == null) ? 0 : this.typmodout.hashCode());
        result = prime * result + ((this.typanalyze == null) ? 0 : this.typanalyze.hashCode());
        result = prime * result + ((this.typalign == null) ? 0 : this.typalign.hashCode());
        result = prime * result + ((this.typstorage == null) ? 0 : this.typstorage.hashCode());
        result = prime * result + ((this.typnotnull == null) ? 0 : this.typnotnull.hashCode());
        result = prime * result + ((this.typbasetype == null) ? 0 : this.typbasetype.hashCode());
        result = prime * result + ((this.typtypmod == null) ? 0 : this.typtypmod.hashCode());
        result = prime * result + ((this.typndims == null) ? 0 : this.typndims.hashCode());
        result = prime * result + ((this.typcollation == null) ? 0 : this.typcollation.hashCode());
        result = prime * result + ((this.typdefaultbin == null) ? 0 : this.typdefaultbin.hashCode());
        result = prime * result + ((this.typdefault == null) ? 0 : this.typdefault.hashCode());
        result = prime * result + ((this.typacl == null) ? 0 : Arrays.deepHashCode(this.typacl));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgType (");

        sb.append(oid);
        sb.append(", ").append(typname);
        sb.append(", ").append(typnamespace);
        sb.append(", ").append(typowner);
        sb.append(", ").append(typlen);
        sb.append(", ").append(typbyval);
        sb.append(", ").append(typtype);
        sb.append(", ").append(typcategory);
        sb.append(", ").append(typispreferred);
        sb.append(", ").append(typisdefined);
        sb.append(", ").append(typdelim);
        sb.append(", ").append(typrelid);
        sb.append(", ").append(typsubscript);
        sb.append(", ").append(typelem);
        sb.append(", ").append(typarray);
        sb.append(", ").append(typinput);
        sb.append(", ").append(typoutput);
        sb.append(", ").append(typreceive);
        sb.append(", ").append(typsend);
        sb.append(", ").append(typmodin);
        sb.append(", ").append(typmodout);
        sb.append(", ").append(typanalyze);
        sb.append(", ").append(typalign);
        sb.append(", ").append(typstorage);
        sb.append(", ").append(typnotnull);
        sb.append(", ").append(typbasetype);
        sb.append(", ").append(typtypmod);
        sb.append(", ").append(typndims);
        sb.append(", ").append(typcollation);
        sb.append(", ").append(typdefaultbin);
        sb.append(", ").append(typdefault);
        sb.append(", ").append(Arrays.deepToString(typacl));

        sb.append(")");
        return sb.toString();
    }
}
