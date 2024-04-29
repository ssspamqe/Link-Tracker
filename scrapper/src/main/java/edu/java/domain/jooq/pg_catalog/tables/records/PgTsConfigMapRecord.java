/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgTsConfigMap;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgTsConfigMapRecord extends TableRecordImpl<PgTsConfigMapRecord> {

    private static final long serialVersionUID = 1L;

    public void setMapcfg(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getMapcfg() {
        return (Long) get(0);
    }

    public void setMaptokentype(@NotNull Integer value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getMaptokentype() {
        return (Integer) get(1);
    }

    public void setMapseqno(@NotNull Integer value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getMapseqno() {
        return (Integer) get(2);
    }

    public void setMapdict(@NotNull Long value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getMapdict() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgTsConfigMapRecord() {
        super(PgTsConfigMap.PG_TS_CONFIG_MAP);
    }

    @ConstructorProperties({ "mapcfg", "maptokentype", "mapseqno", "mapdict" })
    public PgTsConfigMapRecord(@NotNull Long mapcfg, @NotNull Integer maptokentype, @NotNull Integer mapseqno, @NotNull Long mapdict) {
        super(PgTsConfigMap.PG_TS_CONFIG_MAP);

        setMapcfg(mapcfg);
        setMaptokentype(maptokentype);
        setMapseqno(mapseqno);
        setMapdict(mapdict);
        resetChangedOnNotNull();
    }

    public PgTsConfigMapRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgTsConfigMap value) {
        super(PgTsConfigMap.PG_TS_CONFIG_MAP);

        if (value != null) {
            setMapcfg(value.getMapcfg());
            setMaptokentype(value.getMaptokentype());
            setMapseqno(value.getMapseqno());
            setMapdict(value.getMapdict());
            resetChangedOnNotNull();
        }
    }
}