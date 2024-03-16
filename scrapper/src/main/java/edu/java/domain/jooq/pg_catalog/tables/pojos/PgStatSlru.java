/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatSlru implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Long blksZeroed;
    private Long blksHit;
    private Long blksRead;
    private Long blksWritten;
    private Long blksExists;
    private Long flushes;
    private Long truncates;
    private OffsetDateTime statsReset;

    public PgStatSlru() {}

    public PgStatSlru(PgStatSlru value) {
        this.name = value.name;
        this.blksZeroed = value.blksZeroed;
        this.blksHit = value.blksHit;
        this.blksRead = value.blksRead;
        this.blksWritten = value.blksWritten;
        this.blksExists = value.blksExists;
        this.flushes = value.flushes;
        this.truncates = value.truncates;
        this.statsReset = value.statsReset;
    }

    @ConstructorProperties({ "name", "blksZeroed", "blksHit", "blksRead", "blksWritten", "blksExists", "flushes", "truncates", "statsReset" })
    public PgStatSlru(
        @Nullable String name,
        @Nullable Long blksZeroed,
        @Nullable Long blksHit,
        @Nullable Long blksRead,
        @Nullable Long blksWritten,
        @Nullable Long blksExists,
        @Nullable Long flushes,
        @Nullable Long truncates,
        @Nullable OffsetDateTime statsReset
    ) {
        this.name = name;
        this.blksZeroed = blksZeroed;
        this.blksHit = blksHit;
        this.blksRead = blksRead;
        this.blksWritten = blksWritten;
        this.blksExists = blksExists;
        this.flushes = flushes;
        this.truncates = truncates;
        this.statsReset = statsReset;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.name</code>.
     */
    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.name</code>.
     */
    public void setName(@Nullable String name) {
        this.name = name;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_zeroed</code>.
     */
    @Nullable
    public Long getBlksZeroed() {
        return this.blksZeroed;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_zeroed</code>.
     */
    public void setBlksZeroed(@Nullable Long blksZeroed) {
        this.blksZeroed = blksZeroed;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_hit</code>.
     */
    @Nullable
    public Long getBlksHit() {
        return this.blksHit;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_hit</code>.
     */
    public void setBlksHit(@Nullable Long blksHit) {
        this.blksHit = blksHit;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_read</code>.
     */
    @Nullable
    public Long getBlksRead() {
        return this.blksRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_read</code>.
     */
    public void setBlksRead(@Nullable Long blksRead) {
        this.blksRead = blksRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_written</code>.
     */
    @Nullable
    public Long getBlksWritten() {
        return this.blksWritten;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_written</code>.
     */
    public void setBlksWritten(@Nullable Long blksWritten) {
        this.blksWritten = blksWritten;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_exists</code>.
     */
    @Nullable
    public Long getBlksExists() {
        return this.blksExists;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_exists</code>.
     */
    public void setBlksExists(@Nullable Long blksExists) {
        this.blksExists = blksExists;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.flushes</code>.
     */
    @Nullable
    public Long getFlushes() {
        return this.flushes;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.flushes</code>.
     */
    public void setFlushes(@Nullable Long flushes) {
        this.flushes = flushes;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.truncates</code>.
     */
    @Nullable
    public Long getTruncates() {
        return this.truncates;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.truncates</code>.
     */
    public void setTruncates(@Nullable Long truncates) {
        this.truncates = truncates;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.stats_reset</code>.
     */
    @Nullable
    public OffsetDateTime getStatsReset() {
        return this.statsReset;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.stats_reset</code>.
     */
    public void setStatsReset(@Nullable OffsetDateTime statsReset) {
        this.statsReset = statsReset;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatSlru other = (PgStatSlru) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.blksZeroed == null) {
            if (other.blksZeroed != null)
                return false;
        }
        else if (!this.blksZeroed.equals(other.blksZeroed))
            return false;
        if (this.blksHit == null) {
            if (other.blksHit != null)
                return false;
        }
        else if (!this.blksHit.equals(other.blksHit))
            return false;
        if (this.blksRead == null) {
            if (other.blksRead != null)
                return false;
        }
        else if (!this.blksRead.equals(other.blksRead))
            return false;
        if (this.blksWritten == null) {
            if (other.blksWritten != null)
                return false;
        }
        else if (!this.blksWritten.equals(other.blksWritten))
            return false;
        if (this.blksExists == null) {
            if (other.blksExists != null)
                return false;
        }
        else if (!this.blksExists.equals(other.blksExists))
            return false;
        if (this.flushes == null) {
            if (other.flushes != null)
                return false;
        }
        else if (!this.flushes.equals(other.flushes))
            return false;
        if (this.truncates == null) {
            if (other.truncates != null)
                return false;
        }
        else if (!this.truncates.equals(other.truncates))
            return false;
        if (this.statsReset == null) {
            if (other.statsReset != null)
                return false;
        }
        else if (!this.statsReset.equals(other.statsReset))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.blksZeroed == null) ? 0 : this.blksZeroed.hashCode());
        result = prime * result + ((this.blksHit == null) ? 0 : this.blksHit.hashCode());
        result = prime * result + ((this.blksRead == null) ? 0 : this.blksRead.hashCode());
        result = prime * result + ((this.blksWritten == null) ? 0 : this.blksWritten.hashCode());
        result = prime * result + ((this.blksExists == null) ? 0 : this.blksExists.hashCode());
        result = prime * result + ((this.flushes == null) ? 0 : this.flushes.hashCode());
        result = prime * result + ((this.truncates == null) ? 0 : this.truncates.hashCode());
        result = prime * result + ((this.statsReset == null) ? 0 : this.statsReset.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatSlru (");

        sb.append(name);
        sb.append(", ").append(blksZeroed);
        sb.append(", ").append(blksHit);
        sb.append(", ").append(blksRead);
        sb.append(", ").append(blksWritten);
        sb.append(", ").append(blksExists);
        sb.append(", ").append(flushes);
        sb.append(", ").append(truncates);
        sb.append(", ").append(statsReset);

        sb.append(")");
        return sb.toString();
    }
}