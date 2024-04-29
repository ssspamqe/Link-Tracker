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
public class PgStatProgressBasebackup implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;
    private String phase;
    private Long backupTotal;
    private Long backupStreamed;
    private Long tablespacesTotal;
    private Long tablespacesStreamed;

    public PgStatProgressBasebackup() {}

    public PgStatProgressBasebackup(PgStatProgressBasebackup value) {
        this.pid = value.pid;
        this.phase = value.phase;
        this.backupTotal = value.backupTotal;
        this.backupStreamed = value.backupStreamed;
        this.tablespacesTotal = value.tablespacesTotal;
        this.tablespacesStreamed = value.tablespacesStreamed;
    }

    @ConstructorProperties({ "pid", "phase", "backupTotal", "backupStreamed", "tablespacesTotal", "tablespacesStreamed" })
    public PgStatProgressBasebackup(
        @Nullable Integer pid,
        @Nullable String phase,
        @Nullable Long backupTotal,
        @Nullable Long backupStreamed,
        @Nullable Long tablespacesTotal,
        @Nullable Long tablespacesStreamed
    ) {
        this.pid = pid;
        this.phase = phase;
        this.backupTotal = backupTotal;
        this.backupStreamed = backupStreamed;
        this.tablespacesTotal = tablespacesTotal;
        this.tablespacesStreamed = tablespacesStreamed;
    }

    @Nullable
    public Integer getPid() {
        return this.pid;
    }

    public void setPid(@Nullable Integer pid) {
        this.pid = pid;
    }

    @Nullable
    public String getPhase() {
        return this.phase;
    }

    public void setPhase(@Nullable String phase) {
        this.phase = phase;
    }

    @Nullable
    public Long getBackupTotal() {
        return this.backupTotal;
    }

    public void setBackupTotal(@Nullable Long backupTotal) {
        this.backupTotal = backupTotal;
    }

    @Nullable
    public Long getBackupStreamed() {
        return this.backupStreamed;
    }

    public void setBackupStreamed(@Nullable Long backupStreamed) {
        this.backupStreamed = backupStreamed;
    }

    @Nullable
    public Long getTablespacesTotal() {
        return this.tablespacesTotal;
    }

    public void setTablespacesTotal(@Nullable Long tablespacesTotal) {
        this.tablespacesTotal = tablespacesTotal;
    }

    @Nullable
    public Long getTablespacesStreamed() {
        return this.tablespacesStreamed;
    }

    public void setTablespacesStreamed(@Nullable Long tablespacesStreamed) {
        this.tablespacesStreamed = tablespacesStreamed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatProgressBasebackup other = (PgStatProgressBasebackup) obj;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.phase == null) {
            if (other.phase != null)
                return false;
        }
        else if (!this.phase.equals(other.phase))
            return false;
        if (this.backupTotal == null) {
            if (other.backupTotal != null)
                return false;
        }
        else if (!this.backupTotal.equals(other.backupTotal))
            return false;
        if (this.backupStreamed == null) {
            if (other.backupStreamed != null)
                return false;
        }
        else if (!this.backupStreamed.equals(other.backupStreamed))
            return false;
        if (this.tablespacesTotal == null) {
            if (other.tablespacesTotal != null)
                return false;
        }
        else if (!this.tablespacesTotal.equals(other.tablespacesTotal))
            return false;
        if (this.tablespacesStreamed == null) {
            if (other.tablespacesStreamed != null)
                return false;
        }
        else if (!this.tablespacesStreamed.equals(other.tablespacesStreamed))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.phase == null) ? 0 : this.phase.hashCode());
        result = prime * result + ((this.backupTotal == null) ? 0 : this.backupTotal.hashCode());
        result = prime * result + ((this.backupStreamed == null) ? 0 : this.backupStreamed.hashCode());
        result = prime * result + ((this.tablespacesTotal == null) ? 0 : this.tablespacesTotal.hashCode());
        result = prime * result + ((this.tablespacesStreamed == null) ? 0 : this.tablespacesStreamed.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatProgressBasebackup (");

        sb.append(pid);
        sb.append(", ").append(phase);
        sb.append(", ").append(backupTotal);
        sb.append(", ").append(backupStreamed);
        sb.append(", ").append(tablespacesTotal);
        sb.append(", ").append(tablespacesStreamed);

        sb.append(")");
        return sb.toString();
    }
}