/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatProgressAnalyze;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatProgressAnalyzeRecord extends TableRecordImpl<PgStatProgressAnalyzeRecord> {

    private static final long serialVersionUID = 1L;

    public void setPid(@Nullable Integer value) {
        set(0, value);
    }

    @Nullable
    public Integer getPid() {
        return (Integer) get(0);
    }

    public void setDatid(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getDatid() {
        return (Long) get(1);
    }

    public void setDatname(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getDatname() {
        return (String) get(2);
    }

    public void setRelid(@Nullable Long value) {
        set(3, value);
    }

    @Nullable
    public Long getRelid() {
        return (Long) get(3);
    }

    public void setPhase(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getPhase() {
        return (String) get(4);
    }

    public void setSampleBlksTotal(@Nullable Long value) {
        set(5, value);
    }

    @Nullable
    public Long getSampleBlksTotal() {
        return (Long) get(5);
    }

    public void setSampleBlksScanned(@Nullable Long value) {
        set(6, value);
    }

    @Nullable
    public Long getSampleBlksScanned() {
        return (Long) get(6);
    }

    public void setExtStatsTotal(@Nullable Long value) {
        set(7, value);
    }

    @Nullable
    public Long getExtStatsTotal() {
        return (Long) get(7);
    }

    public void setExtStatsComputed(@Nullable Long value) {
        set(8, value);
    }

    @Nullable
    public Long getExtStatsComputed() {
        return (Long) get(8);
    }

    public void setChildTablesTotal(@Nullable Long value) {
        set(9, value);
    }

    @Nullable
    public Long getChildTablesTotal() {
        return (Long) get(9);
    }

    public void setChildTablesDone(@Nullable Long value) {
        set(10, value);
    }

    @Nullable
    public Long getChildTablesDone() {
        return (Long) get(10);
    }

    public void setCurrentChildTableRelid(@Nullable Long value) {
        set(11, value);
    }

    @Nullable
    public Long getCurrentChildTableRelid() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatProgressAnalyzeRecord() {
        super(PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE);
    }

    @ConstructorProperties({ "pid", "datid", "datname", "relid", "phase", "sampleBlksTotal", "sampleBlksScanned", "extStatsTotal", "extStatsComputed", "childTablesTotal", "childTablesDone", "currentChildTableRelid" })
    public PgStatProgressAnalyzeRecord(@Nullable Integer pid, @Nullable Long datid, @Nullable String datname, @Nullable Long relid, @Nullable String phase, @Nullable Long sampleBlksTotal, @Nullable Long sampleBlksScanned, @Nullable Long extStatsTotal, @Nullable Long extStatsComputed, @Nullable Long childTablesTotal, @Nullable Long childTablesDone, @Nullable Long currentChildTableRelid) {
        super(PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE);

        setPid(pid);
        setDatid(datid);
        setDatname(datname);
        setRelid(relid);
        setPhase(phase);
        setSampleBlksTotal(sampleBlksTotal);
        setSampleBlksScanned(sampleBlksScanned);
        setExtStatsTotal(extStatsTotal);
        setExtStatsComputed(extStatsComputed);
        setChildTablesTotal(childTablesTotal);
        setChildTablesDone(childTablesDone);
        setCurrentChildTableRelid(currentChildTableRelid);
        resetChangedOnNotNull();
    }

    public PgStatProgressAnalyzeRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatProgressAnalyze value) {
        super(PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE);

        if (value != null) {
            setPid(value.getPid());
            setDatid(value.getDatid());
            setDatname(value.getDatname());
            setRelid(value.getRelid());
            setPhase(value.getPhase());
            setSampleBlksTotal(value.getSampleBlksTotal());
            setSampleBlksScanned(value.getSampleBlksScanned());
            setExtStatsTotal(value.getExtStatsTotal());
            setExtStatsComputed(value.getExtStatsComputed());
            setChildTablesTotal(value.getChildTablesTotal());
            setChildTablesDone(value.getChildTablesDone());
            setCurrentChildTableRelid(value.getCurrentChildTableRelid());
            resetChangedOnNotNull();
        }
    }
}
