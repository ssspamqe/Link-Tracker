/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.OffsetDateTime;

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
public class PgLockStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private String locktype;
    private Long database;
    private Long relation;
    private Integer page;
    private Short tuple;
    private String virtualxid;
    private Long transactionid;
    private Long classid;
    private Long objid;
    private Short objsubid;
    private String virtualtransaction;
    private Integer pid;
    private String mode;
    private Boolean granted;
    private Boolean fastpath;
    private OffsetDateTime waitstart;

    public PgLockStatus() {}

    public PgLockStatus(PgLockStatus value) {
        this.locktype = value.locktype;
        this.database = value.database;
        this.relation = value.relation;
        this.page = value.page;
        this.tuple = value.tuple;
        this.virtualxid = value.virtualxid;
        this.transactionid = value.transactionid;
        this.classid = value.classid;
        this.objid = value.objid;
        this.objsubid = value.objsubid;
        this.virtualtransaction = value.virtualtransaction;
        this.pid = value.pid;
        this.mode = value.mode;
        this.granted = value.granted;
        this.fastpath = value.fastpath;
        this.waitstart = value.waitstart;
    }

    @ConstructorProperties({ "locktype", "database", "relation", "page", "tuple", "virtualxid", "transactionid", "classid", "objid", "objsubid", "virtualtransaction", "pid", "mode", "granted", "fastpath", "waitstart" })
    public PgLockStatus(
        @Nullable String locktype,
        @Nullable Long database,
        @Nullable Long relation,
        @Nullable Integer page,
        @Nullable Short tuple,
        @Nullable String virtualxid,
        @Nullable Long transactionid,
        @Nullable Long classid,
        @Nullable Long objid,
        @Nullable Short objsubid,
        @Nullable String virtualtransaction,
        @Nullable Integer pid,
        @Nullable String mode,
        @Nullable Boolean granted,
        @Nullable Boolean fastpath,
        @Nullable OffsetDateTime waitstart
    ) {
        this.locktype = locktype;
        this.database = database;
        this.relation = relation;
        this.page = page;
        this.tuple = tuple;
        this.virtualxid = virtualxid;
        this.transactionid = transactionid;
        this.classid = classid;
        this.objid = objid;
        this.objsubid = objsubid;
        this.virtualtransaction = virtualtransaction;
        this.pid = pid;
        this.mode = mode;
        this.granted = granted;
        this.fastpath = fastpath;
        this.waitstart = waitstart;
    }

    @Nullable
    public String getLocktype() {
        return this.locktype;
    }

    public void setLocktype(@Nullable String locktype) {
        this.locktype = locktype;
    }

    @Nullable
    public Long getDatabase() {
        return this.database;
    }

    public void setDatabase(@Nullable Long database) {
        this.database = database;
    }

    @Nullable
    public Long getRelation() {
        return this.relation;
    }

    public void setRelation(@Nullable Long relation) {
        this.relation = relation;
    }

    @Nullable
    public Integer getPage() {
        return this.page;
    }

    public void setPage(@Nullable Integer page) {
        this.page = page;
    }

    @Nullable
    public Short getTuple() {
        return this.tuple;
    }

    public void setTuple(@Nullable Short tuple) {
        this.tuple = tuple;
    }

    @Nullable
    public String getVirtualxid() {
        return this.virtualxid;
    }

    public void setVirtualxid(@Nullable String virtualxid) {
        this.virtualxid = virtualxid;
    }

    @Nullable
    public Long getTransactionid() {
        return this.transactionid;
    }

    public void setTransactionid(@Nullable Long transactionid) {
        this.transactionid = transactionid;
    }

    @Nullable
    public Long getClassid() {
        return this.classid;
    }

    public void setClassid(@Nullable Long classid) {
        this.classid = classid;
    }

    @Nullable
    public Long getObjid() {
        return this.objid;
    }

    public void setObjid(@Nullable Long objid) {
        this.objid = objid;
    }

    @Nullable
    public Short getObjsubid() {
        return this.objsubid;
    }

    public void setObjsubid(@Nullable Short objsubid) {
        this.objsubid = objsubid;
    }

    @Nullable
    public String getVirtualtransaction() {
        return this.virtualtransaction;
    }

    public void setVirtualtransaction(@Nullable String virtualtransaction) {
        this.virtualtransaction = virtualtransaction;
    }

    @Nullable
    public Integer getPid() {
        return this.pid;
    }

    public void setPid(@Nullable Integer pid) {
        this.pid = pid;
    }

    @Nullable
    public String getMode() {
        return this.mode;
    }

    public void setMode(@Nullable String mode) {
        this.mode = mode;
    }

    @Nullable
    public Boolean getGranted() {
        return this.granted;
    }

    public void setGranted(@Nullable Boolean granted) {
        this.granted = granted;
    }

    @Nullable
    public Boolean getFastpath() {
        return this.fastpath;
    }

    public void setFastpath(@Nullable Boolean fastpath) {
        this.fastpath = fastpath;
    }

    @Nullable
    public OffsetDateTime getWaitstart() {
        return this.waitstart;
    }

    public void setWaitstart(@Nullable OffsetDateTime waitstart) {
        this.waitstart = waitstart;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgLockStatus other = (PgLockStatus) obj;
        if (this.locktype == null) {
            if (other.locktype != null)
                return false;
        }
        else if (!this.locktype.equals(other.locktype))
            return false;
        if (this.database == null) {
            if (other.database != null)
                return false;
        }
        else if (!this.database.equals(other.database))
            return false;
        if (this.relation == null) {
            if (other.relation != null)
                return false;
        }
        else if (!this.relation.equals(other.relation))
            return false;
        if (this.page == null) {
            if (other.page != null)
                return false;
        }
        else if (!this.page.equals(other.page))
            return false;
        if (this.tuple == null) {
            if (other.tuple != null)
                return false;
        }
        else if (!this.tuple.equals(other.tuple))
            return false;
        if (this.virtualxid == null) {
            if (other.virtualxid != null)
                return false;
        }
        else if (!this.virtualxid.equals(other.virtualxid))
            return false;
        if (this.transactionid == null) {
            if (other.transactionid != null)
                return false;
        }
        else if (!this.transactionid.equals(other.transactionid))
            return false;
        if (this.classid == null) {
            if (other.classid != null)
                return false;
        }
        else if (!this.classid.equals(other.classid))
            return false;
        if (this.objid == null) {
            if (other.objid != null)
                return false;
        }
        else if (!this.objid.equals(other.objid))
            return false;
        if (this.objsubid == null) {
            if (other.objsubid != null)
                return false;
        }
        else if (!this.objsubid.equals(other.objsubid))
            return false;
        if (this.virtualtransaction == null) {
            if (other.virtualtransaction != null)
                return false;
        }
        else if (!this.virtualtransaction.equals(other.virtualtransaction))
            return false;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.mode == null) {
            if (other.mode != null)
                return false;
        }
        else if (!this.mode.equals(other.mode))
            return false;
        if (this.granted == null) {
            if (other.granted != null)
                return false;
        }
        else if (!this.granted.equals(other.granted))
            return false;
        if (this.fastpath == null) {
            if (other.fastpath != null)
                return false;
        }
        else if (!this.fastpath.equals(other.fastpath))
            return false;
        if (this.waitstart == null) {
            if (other.waitstart != null)
                return false;
        }
        else if (!this.waitstart.equals(other.waitstart))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.locktype == null) ? 0 : this.locktype.hashCode());
        result = prime * result + ((this.database == null) ? 0 : this.database.hashCode());
        result = prime * result + ((this.relation == null) ? 0 : this.relation.hashCode());
        result = prime * result + ((this.page == null) ? 0 : this.page.hashCode());
        result = prime * result + ((this.tuple == null) ? 0 : this.tuple.hashCode());
        result = prime * result + ((this.virtualxid == null) ? 0 : this.virtualxid.hashCode());
        result = prime * result + ((this.transactionid == null) ? 0 : this.transactionid.hashCode());
        result = prime * result + ((this.classid == null) ? 0 : this.classid.hashCode());
        result = prime * result + ((this.objid == null) ? 0 : this.objid.hashCode());
        result = prime * result + ((this.objsubid == null) ? 0 : this.objsubid.hashCode());
        result = prime * result + ((this.virtualtransaction == null) ? 0 : this.virtualtransaction.hashCode());
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.mode == null) ? 0 : this.mode.hashCode());
        result = prime * result + ((this.granted == null) ? 0 : this.granted.hashCode());
        result = prime * result + ((this.fastpath == null) ? 0 : this.fastpath.hashCode());
        result = prime * result + ((this.waitstart == null) ? 0 : this.waitstart.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgLockStatus (");

        sb.append(locktype);
        sb.append(", ").append(database);
        sb.append(", ").append(relation);
        sb.append(", ").append(page);
        sb.append(", ").append(tuple);
        sb.append(", ").append(virtualxid);
        sb.append(", ").append(transactionid);
        sb.append(", ").append(classid);
        sb.append(", ").append(objid);
        sb.append(", ").append(objsubid);
        sb.append(", ").append(virtualtransaction);
        sb.append(", ").append(pid);
        sb.append(", ").append(mode);
        sb.append(", ").append(granted);
        sb.append(", ").append(fastpath);
        sb.append(", ").append(waitstart);

        sb.append(")");
        return sb.toString();
    }
}
