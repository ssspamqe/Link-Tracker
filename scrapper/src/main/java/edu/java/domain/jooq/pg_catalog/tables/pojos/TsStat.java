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
public class TsStat implements Serializable {

    private static final long serialVersionUID = 1L;

    private String word;
    private Integer ndoc;
    private Integer nentry;

    public TsStat() {}

    public TsStat(TsStat value) {
        this.word = value.word;
        this.ndoc = value.ndoc;
        this.nentry = value.nentry;
    }

    @ConstructorProperties({ "word", "ndoc", "nentry" })
    public TsStat(
        @Nullable String word,
        @Nullable Integer ndoc,
        @Nullable Integer nentry
    ) {
        this.word = word;
        this.ndoc = ndoc;
        this.nentry = nentry;
    }

    @Nullable
    public String getWord() {
        return this.word;
    }

    public void setWord(@Nullable String word) {
        this.word = word;
    }

    @Nullable
    public Integer getNdoc() {
        return this.ndoc;
    }

    public void setNdoc(@Nullable Integer ndoc) {
        this.ndoc = ndoc;
    }

    @Nullable
    public Integer getNentry() {
        return this.nentry;
    }

    public void setNentry(@Nullable Integer nentry) {
        this.nentry = nentry;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TsStat other = (TsStat) obj;
        if (this.word == null) {
            if (other.word != null)
                return false;
        }
        else if (!this.word.equals(other.word))
            return false;
        if (this.ndoc == null) {
            if (other.ndoc != null)
                return false;
        }
        else if (!this.ndoc.equals(other.ndoc))
            return false;
        if (this.nentry == null) {
            if (other.nentry != null)
                return false;
        }
        else if (!this.nentry.equals(other.nentry))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.word == null) ? 0 : this.word.hashCode());
        result = prime * result + ((this.ndoc == null) ? 0 : this.ndoc.hashCode());
        result = prime * result + ((this.nentry == null) ? 0 : this.nentry.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TsStat (");

        sb.append(word);
        sb.append(", ").append(ndoc);
        sb.append(", ").append(nentry);

        sb.append(")");
        return sb.toString();
    }
}
