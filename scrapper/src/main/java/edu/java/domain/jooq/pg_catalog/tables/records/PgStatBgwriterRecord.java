/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatBgwriter;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

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
public class PgStatBgwriterRecord extends TableRecordImpl<PgStatBgwriterRecord> {

    private static final long serialVersionUID = 1L;

    public void setCheckpointsTimed(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getCheckpointsTimed() {
        return (Long) get(0);
    }

    public void setCheckpointsReq(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getCheckpointsReq() {
        return (Long) get(1);
    }

    public void setCheckpointWriteTime(@Nullable Double value) {
        set(2, value);
    }

    @Nullable
    public Double getCheckpointWriteTime() {
        return (Double) get(2);
    }

    public void setCheckpointSyncTime(@Nullable Double value) {
        set(3, value);
    }

    @Nullable
    public Double getCheckpointSyncTime() {
        return (Double) get(3);
    }

    public void setBuffersCheckpoint(@Nullable Long value) {
        set(4, value);
    }

    @Nullable
    public Long getBuffersCheckpoint() {
        return (Long) get(4);
    }

    public void setBuffersClean(@Nullable Long value) {
        set(5, value);
    }

    @Nullable
    public Long getBuffersClean() {
        return (Long) get(5);
    }

    public void setMaxwrittenClean(@Nullable Long value) {
        set(6, value);
    }

    @Nullable
    public Long getMaxwrittenClean() {
        return (Long) get(6);
    }

    public void setBuffersBackend(@Nullable Long value) {
        set(7, value);
    }

    @Nullable
    public Long getBuffersBackend() {
        return (Long) get(7);
    }

    public void setBuffersBackendFsync(@Nullable Long value) {
        set(8, value);
    }

    @Nullable
    public Long getBuffersBackendFsync() {
        return (Long) get(8);
    }

    public void setBuffersAlloc(@Nullable Long value) {
        set(9, value);
    }

    @Nullable
    public Long getBuffersAlloc() {
        return (Long) get(9);
    }

    public void setStatsReset(@Nullable OffsetDateTime value) {
        set(10, value);
    }

    @Nullable
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatBgwriterRecord() {
        super(PgStatBgwriter.PG_STAT_BGWRITER);
    }

    @ConstructorProperties({ "checkpointsTimed", "checkpointsReq", "checkpointWriteTime", "checkpointSyncTime", "buffersCheckpoint", "buffersClean", "maxwrittenClean", "buffersBackend", "buffersBackendFsync", "buffersAlloc", "statsReset" })
    public PgStatBgwriterRecord(@Nullable Long checkpointsTimed, @Nullable Long checkpointsReq, @Nullable Double checkpointWriteTime, @Nullable Double checkpointSyncTime, @Nullable Long buffersCheckpoint, @Nullable Long buffersClean, @Nullable Long maxwrittenClean, @Nullable Long buffersBackend, @Nullable Long buffersBackendFsync, @Nullable Long buffersAlloc, @Nullable OffsetDateTime statsReset) {
        super(PgStatBgwriter.PG_STAT_BGWRITER);

        setCheckpointsTimed(checkpointsTimed);
        setCheckpointsReq(checkpointsReq);
        setCheckpointWriteTime(checkpointWriteTime);
        setCheckpointSyncTime(checkpointSyncTime);
        setBuffersCheckpoint(buffersCheckpoint);
        setBuffersClean(buffersClean);
        setMaxwrittenClean(maxwrittenClean);
        setBuffersBackend(buffersBackend);
        setBuffersBackendFsync(buffersBackendFsync);
        setBuffersAlloc(buffersAlloc);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }

    public PgStatBgwriterRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatBgwriter value) {
        super(PgStatBgwriter.PG_STAT_BGWRITER);

        if (value != null) {
            setCheckpointsTimed(value.getCheckpointsTimed());
            setCheckpointsReq(value.getCheckpointsReq());
            setCheckpointWriteTime(value.getCheckpointWriteTime());
            setCheckpointSyncTime(value.getCheckpointSyncTime());
            setBuffersCheckpoint(value.getBuffersCheckpoint());
            setBuffersClean(value.getBuffersClean());
            setMaxwrittenClean(value.getMaxwrittenClean());
            setBuffersBackend(value.getBuffersBackend());
            setBuffersBackendFsync(value.getBuffersBackendFsync());
            setBuffersAlloc(value.getBuffersAlloc());
            setStatsReset(value.getStatsReset());
            resetChangedOnNotNull();
        }
    }
}
