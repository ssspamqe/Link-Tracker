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
public class PgStatSubscription implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long subid;
    private String subname;
    private Integer pid;
    private Integer leaderPid;
    private Long relid;
    private Object receivedLsn;
    private OffsetDateTime lastMsgSendTime;
    private OffsetDateTime lastMsgReceiptTime;
    private Object latestEndLsn;
    private OffsetDateTime latestEndTime;

    public PgStatSubscription() {}

    public PgStatSubscription(PgStatSubscription value) {
        this.subid = value.subid;
        this.subname = value.subname;
        this.pid = value.pid;
        this.leaderPid = value.leaderPid;
        this.relid = value.relid;
        this.receivedLsn = value.receivedLsn;
        this.lastMsgSendTime = value.lastMsgSendTime;
        this.lastMsgReceiptTime = value.lastMsgReceiptTime;
        this.latestEndLsn = value.latestEndLsn;
        this.latestEndTime = value.latestEndTime;
    }

    @ConstructorProperties({ "subid", "subname", "pid", "leaderPid", "relid", "receivedLsn", "lastMsgSendTime", "lastMsgReceiptTime", "latestEndLsn", "latestEndTime" })
    public PgStatSubscription(
        @Nullable Long subid,
        @Nullable String subname,
        @Nullable Integer pid,
        @Nullable Integer leaderPid,
        @Nullable Long relid,
        @Nullable Object receivedLsn,
        @Nullable OffsetDateTime lastMsgSendTime,
        @Nullable OffsetDateTime lastMsgReceiptTime,
        @Nullable Object latestEndLsn,
        @Nullable OffsetDateTime latestEndTime
    ) {
        this.subid = subid;
        this.subname = subname;
        this.pid = pid;
        this.leaderPid = leaderPid;
        this.relid = relid;
        this.receivedLsn = receivedLsn;
        this.lastMsgSendTime = lastMsgSendTime;
        this.lastMsgReceiptTime = lastMsgReceiptTime;
        this.latestEndLsn = latestEndLsn;
        this.latestEndTime = latestEndTime;
    }

    @Nullable
    public Long getSubid() {
        return this.subid;
    }

    public void setSubid(@Nullable Long subid) {
        this.subid = subid;
    }

    @Nullable
    public String getSubname() {
        return this.subname;
    }

    public void setSubname(@Nullable String subname) {
        this.subname = subname;
    }

    @Nullable
    public Integer getPid() {
        return this.pid;
    }

    public void setPid(@Nullable Integer pid) {
        this.pid = pid;
    }

    @Nullable
    public Integer getLeaderPid() {
        return this.leaderPid;
    }

    public void setLeaderPid(@Nullable Integer leaderPid) {
        this.leaderPid = leaderPid;
    }

    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    @Deprecated
    @Nullable
    public Object getReceivedLsn() {
        return this.receivedLsn;
    }

    @Deprecated
    public void setReceivedLsn(@Nullable Object receivedLsn) {
        this.receivedLsn = receivedLsn;
    }

    @Nullable
    public OffsetDateTime getLastMsgSendTime() {
        return this.lastMsgSendTime;
    }

    public void setLastMsgSendTime(@Nullable OffsetDateTime lastMsgSendTime) {
        this.lastMsgSendTime = lastMsgSendTime;
    }

    @Nullable
    public OffsetDateTime getLastMsgReceiptTime() {
        return this.lastMsgReceiptTime;
    }

    public void setLastMsgReceiptTime(@Nullable OffsetDateTime lastMsgReceiptTime) {
        this.lastMsgReceiptTime = lastMsgReceiptTime;
    }

    @Deprecated
    @Nullable
    public Object getLatestEndLsn() {
        return this.latestEndLsn;
    }

    @Deprecated
    public void setLatestEndLsn(@Nullable Object latestEndLsn) {
        this.latestEndLsn = latestEndLsn;
    }

    @Nullable
    public OffsetDateTime getLatestEndTime() {
        return this.latestEndTime;
    }

    public void setLatestEndTime(@Nullable OffsetDateTime latestEndTime) {
        this.latestEndTime = latestEndTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatSubscription other = (PgStatSubscription) obj;
        if (this.subid == null) {
            if (other.subid != null)
                return false;
        }
        else if (!this.subid.equals(other.subid))
            return false;
        if (this.subname == null) {
            if (other.subname != null)
                return false;
        }
        else if (!this.subname.equals(other.subname))
            return false;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.leaderPid == null) {
            if (other.leaderPid != null)
                return false;
        }
        else if (!this.leaderPid.equals(other.leaderPid))
            return false;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.receivedLsn == null) {
            if (other.receivedLsn != null)
                return false;
        }
        else if (!this.receivedLsn.equals(other.receivedLsn))
            return false;
        if (this.lastMsgSendTime == null) {
            if (other.lastMsgSendTime != null)
                return false;
        }
        else if (!this.lastMsgSendTime.equals(other.lastMsgSendTime))
            return false;
        if (this.lastMsgReceiptTime == null) {
            if (other.lastMsgReceiptTime != null)
                return false;
        }
        else if (!this.lastMsgReceiptTime.equals(other.lastMsgReceiptTime))
            return false;
        if (this.latestEndLsn == null) {
            if (other.latestEndLsn != null)
                return false;
        }
        else if (!this.latestEndLsn.equals(other.latestEndLsn))
            return false;
        if (this.latestEndTime == null) {
            if (other.latestEndTime != null)
                return false;
        }
        else if (!this.latestEndTime.equals(other.latestEndTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.subid == null) ? 0 : this.subid.hashCode());
        result = prime * result + ((this.subname == null) ? 0 : this.subname.hashCode());
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.leaderPid == null) ? 0 : this.leaderPid.hashCode());
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.receivedLsn == null) ? 0 : this.receivedLsn.hashCode());
        result = prime * result + ((this.lastMsgSendTime == null) ? 0 : this.lastMsgSendTime.hashCode());
        result = prime * result + ((this.lastMsgReceiptTime == null) ? 0 : this.lastMsgReceiptTime.hashCode());
        result = prime * result + ((this.latestEndLsn == null) ? 0 : this.latestEndLsn.hashCode());
        result = prime * result + ((this.latestEndTime == null) ? 0 : this.latestEndTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatSubscription (");

        sb.append(subid);
        sb.append(", ").append(subname);
        sb.append(", ").append(pid);
        sb.append(", ").append(leaderPid);
        sb.append(", ").append(relid);
        sb.append(", ").append(receivedLsn);
        sb.append(", ").append(lastMsgSendTime);
        sb.append(", ").append(lastMsgReceiptTime);
        sb.append(", ").append(latestEndLsn);
        sb.append(", ").append(latestEndTime);

        sb.append(")");
        return sb.toString();
    }
}
