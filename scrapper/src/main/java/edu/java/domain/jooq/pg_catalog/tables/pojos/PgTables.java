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
public class PgTables implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schemaname;
    private String tablename;
    private String tableowner;
    private String tablespace;
    private Boolean hasindexes;
    private Boolean hasrules;
    private Boolean hastriggers;
    private Boolean rowsecurity;

    public PgTables() {}

    public PgTables(PgTables value) {
        this.schemaname = value.schemaname;
        this.tablename = value.tablename;
        this.tableowner = value.tableowner;
        this.tablespace = value.tablespace;
        this.hasindexes = value.hasindexes;
        this.hasrules = value.hasrules;
        this.hastriggers = value.hastriggers;
        this.rowsecurity = value.rowsecurity;
    }

    @ConstructorProperties({ "schemaname", "tablename", "tableowner", "tablespace", "hasindexes", "hasrules", "hastriggers", "rowsecurity" })
    public PgTables(
        @Nullable String schemaname,
        @Nullable String tablename,
        @Nullable String tableowner,
        @Nullable String tablespace,
        @Nullable Boolean hasindexes,
        @Nullable Boolean hasrules,
        @Nullable Boolean hastriggers,
        @Nullable Boolean rowsecurity
    ) {
        this.schemaname = schemaname;
        this.tablename = tablename;
        this.tableowner = tableowner;
        this.tablespace = tablespace;
        this.hasindexes = hasindexes;
        this.hasrules = hasrules;
        this.hastriggers = hastriggers;
        this.rowsecurity = rowsecurity;
    }

    @Nullable
    public String getSchemaname() {
        return this.schemaname;
    }

    public void setSchemaname(@Nullable String schemaname) {
        this.schemaname = schemaname;
    }

    @Nullable
    public String getTablename() {
        return this.tablename;
    }

    public void setTablename(@Nullable String tablename) {
        this.tablename = tablename;
    }

    @Nullable
    public String getTableowner() {
        return this.tableowner;
    }

    public void setTableowner(@Nullable String tableowner) {
        this.tableowner = tableowner;
    }

    @Nullable
    public String getTablespace() {
        return this.tablespace;
    }

    public void setTablespace(@Nullable String tablespace) {
        this.tablespace = tablespace;
    }

    @Nullable
    public Boolean getHasindexes() {
        return this.hasindexes;
    }

    public void setHasindexes(@Nullable Boolean hasindexes) {
        this.hasindexes = hasindexes;
    }

    @Nullable
    public Boolean getHasrules() {
        return this.hasrules;
    }

    public void setHasrules(@Nullable Boolean hasrules) {
        this.hasrules = hasrules;
    }

    @Nullable
    public Boolean getHastriggers() {
        return this.hastriggers;
    }

    public void setHastriggers(@Nullable Boolean hastriggers) {
        this.hastriggers = hastriggers;
    }

    @Nullable
    public Boolean getRowsecurity() {
        return this.rowsecurity;
    }

    public void setRowsecurity(@Nullable Boolean rowsecurity) {
        this.rowsecurity = rowsecurity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgTables other = (PgTables) obj;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.tablename == null) {
            if (other.tablename != null)
                return false;
        }
        else if (!this.tablename.equals(other.tablename))
            return false;
        if (this.tableowner == null) {
            if (other.tableowner != null)
                return false;
        }
        else if (!this.tableowner.equals(other.tableowner))
            return false;
        if (this.tablespace == null) {
            if (other.tablespace != null)
                return false;
        }
        else if (!this.tablespace.equals(other.tablespace))
            return false;
        if (this.hasindexes == null) {
            if (other.hasindexes != null)
                return false;
        }
        else if (!this.hasindexes.equals(other.hasindexes))
            return false;
        if (this.hasrules == null) {
            if (other.hasrules != null)
                return false;
        }
        else if (!this.hasrules.equals(other.hasrules))
            return false;
        if (this.hastriggers == null) {
            if (other.hastriggers != null)
                return false;
        }
        else if (!this.hastriggers.equals(other.hastriggers))
            return false;
        if (this.rowsecurity == null) {
            if (other.rowsecurity != null)
                return false;
        }
        else if (!this.rowsecurity.equals(other.rowsecurity))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.tablename == null) ? 0 : this.tablename.hashCode());
        result = prime * result + ((this.tableowner == null) ? 0 : this.tableowner.hashCode());
        result = prime * result + ((this.tablespace == null) ? 0 : this.tablespace.hashCode());
        result = prime * result + ((this.hasindexes == null) ? 0 : this.hasindexes.hashCode());
        result = prime * result + ((this.hasrules == null) ? 0 : this.hasrules.hashCode());
        result = prime * result + ((this.hastriggers == null) ? 0 : this.hastriggers.hashCode());
        result = prime * result + ((this.rowsecurity == null) ? 0 : this.rowsecurity.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTables (");

        sb.append(schemaname);
        sb.append(", ").append(tablename);
        sb.append(", ").append(tableowner);
        sb.append(", ").append(tablespace);
        sb.append(", ").append(hasindexes);
        sb.append(", ").append(hasrules);
        sb.append(", ").append(hastriggers);
        sb.append(", ").append(rowsecurity);

        sb.append(")");
        return sb.toString();
    }
}
