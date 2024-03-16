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
public class PgForeignTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long ftrelid;
    private Long ftserver;
    private String[] ftoptions;

    public PgForeignTable() {}

    public PgForeignTable(PgForeignTable value) {
        this.ftrelid = value.ftrelid;
        this.ftserver = value.ftserver;
        this.ftoptions = value.ftoptions;
    }

    @ConstructorProperties({ "ftrelid", "ftserver", "ftoptions" })
    public PgForeignTable(
        @NotNull Long ftrelid,
        @NotNull Long ftserver,
        @Nullable String[] ftoptions
    ) {
        this.ftrelid = ftrelid;
        this.ftserver = ftserver;
        this.ftoptions = ftoptions;
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_table.ftrelid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getFtrelid() {
        return this.ftrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_table.ftrelid</code>.
     */
    public void setFtrelid(@NotNull Long ftrelid) {
        this.ftrelid = ftrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_table.ftserver</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getFtserver() {
        return this.ftserver;
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_table.ftserver</code>.
     */
    public void setFtserver(@NotNull Long ftserver) {
        this.ftserver = ftserver;
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_table.ftoptions</code>.
     */
    @Nullable
    public String[] getFtoptions() {
        return this.ftoptions;
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_table.ftoptions</code>.
     */
    public void setFtoptions(@Nullable String[] ftoptions) {
        this.ftoptions = ftoptions;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgForeignTable other = (PgForeignTable) obj;
        if (this.ftrelid == null) {
            if (other.ftrelid != null)
                return false;
        }
        else if (!this.ftrelid.equals(other.ftrelid))
            return false;
        if (this.ftserver == null) {
            if (other.ftserver != null)
                return false;
        }
        else if (!this.ftserver.equals(other.ftserver))
            return false;
        if (this.ftoptions == null) {
            if (other.ftoptions != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.ftoptions, other.ftoptions))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.ftrelid == null) ? 0 : this.ftrelid.hashCode());
        result = prime * result + ((this.ftserver == null) ? 0 : this.ftserver.hashCode());
        result = prime * result + ((this.ftoptions == null) ? 0 : Arrays.deepHashCode(this.ftoptions));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgForeignTable (");

        sb.append(ftrelid);
        sb.append(", ").append(ftserver);
        sb.append(", ").append(Arrays.deepToString(ftoptions));

        sb.append(")");
        return sb.toString();
    }
}