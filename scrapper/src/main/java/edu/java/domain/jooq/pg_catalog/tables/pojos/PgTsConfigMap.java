/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgTsConfigMap implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long mapcfg;
    private Integer maptokentype;
    private Integer mapseqno;
    private Long mapdict;

    public PgTsConfigMap() {}

    public PgTsConfigMap(PgTsConfigMap value) {
        this.mapcfg = value.mapcfg;
        this.maptokentype = value.maptokentype;
        this.mapseqno = value.mapseqno;
        this.mapdict = value.mapdict;
    }

    @ConstructorProperties({ "mapcfg", "maptokentype", "mapseqno", "mapdict" })
    public PgTsConfigMap(
        @NotNull Long mapcfg,
        @NotNull Integer maptokentype,
        @NotNull Integer mapseqno,
        @NotNull Long mapdict
    ) {
        this.mapcfg = mapcfg;
        this.maptokentype = maptokentype;
        this.mapseqno = mapseqno;
        this.mapdict = mapdict;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getMapcfg() {
        return this.mapcfg;
    }

    public void setMapcfg(@NotNull Long mapcfg) {
        this.mapcfg = mapcfg;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getMaptokentype() {
        return this.maptokentype;
    }

    public void setMaptokentype(@NotNull Integer maptokentype) {
        this.maptokentype = maptokentype;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getMapseqno() {
        return this.mapseqno;
    }

    public void setMapseqno(@NotNull Integer mapseqno) {
        this.mapseqno = mapseqno;
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getMapdict() {
        return this.mapdict;
    }

    public void setMapdict(@NotNull Long mapdict) {
        this.mapdict = mapdict;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgTsConfigMap other = (PgTsConfigMap) obj;
        if (this.mapcfg == null) {
            if (other.mapcfg != null)
                return false;
        }
        else if (!this.mapcfg.equals(other.mapcfg))
            return false;
        if (this.maptokentype == null) {
            if (other.maptokentype != null)
                return false;
        }
        else if (!this.maptokentype.equals(other.maptokentype))
            return false;
        if (this.mapseqno == null) {
            if (other.mapseqno != null)
                return false;
        }
        else if (!this.mapseqno.equals(other.mapseqno))
            return false;
        if (this.mapdict == null) {
            if (other.mapdict != null)
                return false;
        }
        else if (!this.mapdict.equals(other.mapdict))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.mapcfg == null) ? 0 : this.mapcfg.hashCode());
        result = prime * result + ((this.maptokentype == null) ? 0 : this.maptokentype.hashCode());
        result = prime * result + ((this.mapseqno == null) ? 0 : this.mapseqno.hashCode());
        result = prime * result + ((this.mapdict == null) ? 0 : this.mapdict.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTsConfigMap (");

        sb.append(mapcfg);
        sb.append(", ").append(maptokentype);
        sb.append(", ").append(mapseqno);
        sb.append(", ").append(mapdict);

        sb.append(")");
        return sb.toString();
    }
}
