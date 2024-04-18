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
public class PgSubscription implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private Long subdbid;
    private Object subskiplsn;
    private String subname;
    private Long subowner;
    private Boolean subenabled;
    private Boolean subbinary;
    private String substream;
    private String subtwophasestate;
    private Boolean subdisableonerr;
    private Boolean subpasswordrequired;
    private Boolean subrunasowner;
    private String subconninfo;
    private String subslotname;
    private String subsynccommit;
    private String[] subpublications;
    private String suborigin;

    public PgSubscription() {}

    public PgSubscription(PgSubscription value) {
        this.oid = value.oid;
        this.subdbid = value.subdbid;
        this.subskiplsn = value.subskiplsn;
        this.subname = value.subname;
        this.subowner = value.subowner;
        this.subenabled = value.subenabled;
        this.subbinary = value.subbinary;
        this.substream = value.substream;
        this.subtwophasestate = value.subtwophasestate;
        this.subdisableonerr = value.subdisableonerr;
        this.subpasswordrequired = value.subpasswordrequired;
        this.subrunasowner = value.subrunasowner;
        this.subconninfo = value.subconninfo;
        this.subslotname = value.subslotname;
        this.subsynccommit = value.subsynccommit;
        this.subpublications = value.subpublications;
        this.suborigin = value.suborigin;
    }

    @ConstructorProperties({ "oid", "subdbid", "subskiplsn", "subname", "subowner", "subenabled", "subbinary", "substream", "subtwophasestate", "subdisableonerr", "subpasswordrequired", "subrunasowner", "subconninfo", "subslotname", "subsynccommit", "subpublications", "suborigin" })
    public PgSubscription(
        @NotNull Long oid,
        @NotNull Long subdbid,
        @NotNull Object subskiplsn,
        @NotNull String subname,
        @NotNull Long subowner,
        @NotNull Boolean subenabled,
        @NotNull Boolean subbinary,
        @NotNull String substream,
        @NotNull String subtwophasestate,
        @NotNull Boolean subdisableonerr,
        @NotNull Boolean subpasswordrequired,
        @NotNull Boolean subrunasowner,
        @NotNull String subconninfo,
        @Nullable String subslotname,
        @NotNull String subsynccommit,
        @NotNull String[] subpublications,
        @Nullable String suborigin
    ) {
        this.oid = oid;
        this.subdbid = subdbid;
        this.subskiplsn = subskiplsn;
        this.subname = subname;
        this.subowner = subowner;
        this.subenabled = subenabled;
        this.subbinary = subbinary;
        this.substream = substream;
        this.subtwophasestate = subtwophasestate;
        this.subdisableonerr = subdisableonerr;
        this.subpasswordrequired = subpasswordrequired;
        this.subrunasowner = subrunasowner;
        this.subconninfo = subconninfo;
        this.subslotname = subslotname;
        this.subsynccommit = subsynccommit;
        this.subpublications = subpublications;
        this.suborigin = suborigin;
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
    public Long getSubdbid() {
        return this.subdbid;
    }

    public void setSubdbid(@NotNull Long subdbid) {
        this.subdbid = subdbid;
    }

    @Deprecated
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object getSubskiplsn() {
        return this.subskiplsn;
    }

    @Deprecated
    public void setSubskiplsn(@NotNull Object subskiplsn) {
        this.subskiplsn = subskiplsn;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubname() {
        return this.subname;
    }

    public void setSubname(@NotNull String subname) {
        this.subname = subname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSubowner() {
        return this.subowner;
    }

    public void setSubowner(@NotNull Long subowner) {
        this.subowner = subowner;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubenabled() {
        return this.subenabled;
    }

    public void setSubenabled(@NotNull Boolean subenabled) {
        this.subenabled = subenabled;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubbinary() {
        return this.subbinary;
    }

    public void setSubbinary(@NotNull Boolean subbinary) {
        this.subbinary = subbinary;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubstream() {
        return this.substream;
    }

    public void setSubstream(@NotNull String substream) {
        this.substream = substream;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubtwophasestate() {
        return this.subtwophasestate;
    }

    public void setSubtwophasestate(@NotNull String subtwophasestate) {
        this.subtwophasestate = subtwophasestate;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubdisableonerr() {
        return this.subdisableonerr;
    }

    public void setSubdisableonerr(@NotNull Boolean subdisableonerr) {
        this.subdisableonerr = subdisableonerr;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubpasswordrequired() {
        return this.subpasswordrequired;
    }

    public void setSubpasswordrequired(@NotNull Boolean subpasswordrequired) {
        this.subpasswordrequired = subpasswordrequired;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSubrunasowner() {
        return this.subrunasowner;
    }

    public void setSubrunasowner(@NotNull Boolean subrunasowner) {
        this.subrunasowner = subrunasowner;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubconninfo() {
        return this.subconninfo;
    }

    public void setSubconninfo(@NotNull String subconninfo) {
        this.subconninfo = subconninfo;
    }

    @Nullable
    public String getSubslotname() {
        return this.subslotname;
    }

    public void setSubslotname(@Nullable String subslotname) {
        this.subslotname = subslotname;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSubsynccommit() {
        return this.subsynccommit;
    }

    public void setSubsynccommit(@NotNull String subsynccommit) {
        this.subsynccommit = subsynccommit;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String[] getSubpublications() {
        return this.subpublications;
    }

    public void setSubpublications(@NotNull String[] subpublications) {
        this.subpublications = subpublications;
    }

    @Nullable
    public String getSuborigin() {
        return this.suborigin;
    }

    public void setSuborigin(@Nullable String suborigin) {
        this.suborigin = suborigin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgSubscription other = (PgSubscription) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.subdbid == null) {
            if (other.subdbid != null)
                return false;
        }
        else if (!this.subdbid.equals(other.subdbid))
            return false;
        if (this.subskiplsn == null) {
            if (other.subskiplsn != null)
                return false;
        }
        else if (!this.subskiplsn.equals(other.subskiplsn))
            return false;
        if (this.subname == null) {
            if (other.subname != null)
                return false;
        }
        else if (!this.subname.equals(other.subname))
            return false;
        if (this.subowner == null) {
            if (other.subowner != null)
                return false;
        }
        else if (!this.subowner.equals(other.subowner))
            return false;
        if (this.subenabled == null) {
            if (other.subenabled != null)
                return false;
        }
        else if (!this.subenabled.equals(other.subenabled))
            return false;
        if (this.subbinary == null) {
            if (other.subbinary != null)
                return false;
        }
        else if (!this.subbinary.equals(other.subbinary))
            return false;
        if (this.substream == null) {
            if (other.substream != null)
                return false;
        }
        else if (!this.substream.equals(other.substream))
            return false;
        if (this.subtwophasestate == null) {
            if (other.subtwophasestate != null)
                return false;
        }
        else if (!this.subtwophasestate.equals(other.subtwophasestate))
            return false;
        if (this.subdisableonerr == null) {
            if (other.subdisableonerr != null)
                return false;
        }
        else if (!this.subdisableonerr.equals(other.subdisableonerr))
            return false;
        if (this.subpasswordrequired == null) {
            if (other.subpasswordrequired != null)
                return false;
        }
        else if (!this.subpasswordrequired.equals(other.subpasswordrequired))
            return false;
        if (this.subrunasowner == null) {
            if (other.subrunasowner != null)
                return false;
        }
        else if (!this.subrunasowner.equals(other.subrunasowner))
            return false;
        if (this.subconninfo == null) {
            if (other.subconninfo != null)
                return false;
        }
        else if (!this.subconninfo.equals(other.subconninfo))
            return false;
        if (this.subslotname == null) {
            if (other.subslotname != null)
                return false;
        }
        else if (!this.subslotname.equals(other.subslotname))
            return false;
        if (this.subsynccommit == null) {
            if (other.subsynccommit != null)
                return false;
        }
        else if (!this.subsynccommit.equals(other.subsynccommit))
            return false;
        if (this.subpublications == null) {
            if (other.subpublications != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.subpublications, other.subpublications))
            return false;
        if (this.suborigin == null) {
            if (other.suborigin != null)
                return false;
        }
        else if (!this.suborigin.equals(other.suborigin))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.subdbid == null) ? 0 : this.subdbid.hashCode());
        result = prime * result + ((this.subskiplsn == null) ? 0 : this.subskiplsn.hashCode());
        result = prime * result + ((this.subname == null) ? 0 : this.subname.hashCode());
        result = prime * result + ((this.subowner == null) ? 0 : this.subowner.hashCode());
        result = prime * result + ((this.subenabled == null) ? 0 : this.subenabled.hashCode());
        result = prime * result + ((this.subbinary == null) ? 0 : this.subbinary.hashCode());
        result = prime * result + ((this.substream == null) ? 0 : this.substream.hashCode());
        result = prime * result + ((this.subtwophasestate == null) ? 0 : this.subtwophasestate.hashCode());
        result = prime * result + ((this.subdisableonerr == null) ? 0 : this.subdisableonerr.hashCode());
        result = prime * result + ((this.subpasswordrequired == null) ? 0 : this.subpasswordrequired.hashCode());
        result = prime * result + ((this.subrunasowner == null) ? 0 : this.subrunasowner.hashCode());
        result = prime * result + ((this.subconninfo == null) ? 0 : this.subconninfo.hashCode());
        result = prime * result + ((this.subslotname == null) ? 0 : this.subslotname.hashCode());
        result = prime * result + ((this.subsynccommit == null) ? 0 : this.subsynccommit.hashCode());
        result = prime * result + ((this.subpublications == null) ? 0 : Arrays.deepHashCode(this.subpublications));
        result = prime * result + ((this.suborigin == null) ? 0 : this.suborigin.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgSubscription (");

        sb.append(oid);
        sb.append(", ").append(subdbid);
        sb.append(", ").append(subskiplsn);
        sb.append(", ").append(subname);
        sb.append(", ").append(subowner);
        sb.append(", ").append(subenabled);
        sb.append(", ").append(subbinary);
        sb.append(", ").append(substream);
        sb.append(", ").append(subtwophasestate);
        sb.append(", ").append(subdisableonerr);
        sb.append(", ").append(subpasswordrequired);
        sb.append(", ").append(subrunasowner);
        sb.append(", ").append(subconninfo);
        sb.append(", ").append(subslotname);
        sb.append(", ").append(subsynccommit);
        sb.append(", ").append(Arrays.deepToString(subpublications));
        sb.append(", ").append(suborigin);

        sb.append(")");
        return sb.toString();
    }
}
