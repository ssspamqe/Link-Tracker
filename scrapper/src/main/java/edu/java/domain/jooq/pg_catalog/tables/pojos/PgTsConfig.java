/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


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
public class PgTsConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String cfgname;
    private Long cfgnamespace;
    private Long cfgowner;
    private Long cfgparser;

    public PgTsConfig() {}

    public PgTsConfig(PgTsConfig value) {
        this.oid = value.oid;
        this.cfgname = value.cfgname;
        this.cfgnamespace = value.cfgnamespace;
        this.cfgowner = value.cfgowner;
        this.cfgparser = value.cfgparser;
    }

    @ConstructorProperties({ "oid", "cfgname", "cfgnamespace", "cfgowner", "cfgparser" })
    public PgTsConfig(
        @NotNull Long oid,
        @NotNull String cfgname,
        @NotNull Long cfgnamespace,
        @NotNull Long cfgowner,
        @NotNull Long cfgparser
    ) {
        this.oid = oid;
        this.cfgname = cfgname;
        this.cfgnamespace = cfgnamespace;
        this.cfgowner = cfgowner;
        this.cfgparser = cfgparser;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.oid</code>.
     */
    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getCfgname() {
        return this.cfgname;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgname</code>.
     */
    public void setCfgname(@NotNull String cfgname) {
        this.cfgname = cfgname;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgnamespace</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getCfgnamespace() {
        return this.cfgnamespace;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgnamespace</code>.
     */
    public void setCfgnamespace(@NotNull Long cfgnamespace) {
        this.cfgnamespace = cfgnamespace;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgowner</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getCfgowner() {
        return this.cfgowner;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgowner</code>.
     */
    public void setCfgowner(@NotNull Long cfgowner) {
        this.cfgowner = cfgowner;
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgparser</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getCfgparser() {
        return this.cfgparser;
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgparser</code>.
     */
    public void setCfgparser(@NotNull Long cfgparser) {
        this.cfgparser = cfgparser;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgTsConfig other = (PgTsConfig) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.cfgname == null) {
            if (other.cfgname != null)
                return false;
        }
        else if (!this.cfgname.equals(other.cfgname))
            return false;
        if (this.cfgnamespace == null) {
            if (other.cfgnamespace != null)
                return false;
        }
        else if (!this.cfgnamespace.equals(other.cfgnamespace))
            return false;
        if (this.cfgowner == null) {
            if (other.cfgowner != null)
                return false;
        }
        else if (!this.cfgowner.equals(other.cfgowner))
            return false;
        if (this.cfgparser == null) {
            if (other.cfgparser != null)
                return false;
        }
        else if (!this.cfgparser.equals(other.cfgparser))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.cfgname == null) ? 0 : this.cfgname.hashCode());
        result = prime * result + ((this.cfgnamespace == null) ? 0 : this.cfgnamespace.hashCode());
        result = prime * result + ((this.cfgowner == null) ? 0 : this.cfgowner.hashCode());
        result = prime * result + ((this.cfgparser == null) ? 0 : this.cfgparser.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTsConfig (");

        sb.append(oid);
        sb.append(", ").append(cfgname);
        sb.append(", ").append(cfgnamespace);
        sb.append(", ").append(cfgowner);
        sb.append(", ").append(cfgparser);

        sb.append(")");
        return sb.toString();
    }
}