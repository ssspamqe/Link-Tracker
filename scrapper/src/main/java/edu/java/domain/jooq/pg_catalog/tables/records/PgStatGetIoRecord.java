/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatGetIo;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;


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
public class PgStatGetIoRecord extends TableRecordImpl<PgStatGetIoRecord> implements Record18<String, String, String, Long, Double, Long, Double, Long, Double, Long, Double, Long, Long, Long, Long, Long, Double, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.backend_type</code>.
     */
    public void setBackendType(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.backend_type</code>.
     */
    @Nullable
    public String getBackendType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.object</code>.
     */
    public void setObject(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.object</code>.
     */
    @Nullable
    public String getObject() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.context</code>.
     */
    public void setContext(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.context</code>.
     */
    @Nullable
    public String getContext() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.reads</code>.
     */
    public void setReads(@Nullable Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.reads</code>.
     */
    @Nullable
    public Long getReads() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.read_time</code>.
     */
    public void setReadTime(@Nullable Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.read_time</code>.
     */
    @Nullable
    public Double getReadTime() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.writes</code>.
     */
    public void setWrites(@Nullable Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.writes</code>.
     */
    @Nullable
    public Long getWrites() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.write_time</code>.
     */
    public void setWriteTime(@Nullable Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.write_time</code>.
     */
    @Nullable
    public Double getWriteTime() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.writebacks</code>.
     */
    public void setWritebacks(@Nullable Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.writebacks</code>.
     */
    @Nullable
    public Long getWritebacks() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.writeback_time</code>.
     */
    public void setWritebackTime(@Nullable Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.writeback_time</code>.
     */
    @Nullable
    public Double getWritebackTime() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.extends</code>.
     */
    public void setExtends(@Nullable Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.extends</code>.
     */
    @Nullable
    public Long getExtends() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.extend_time</code>.
     */
    public void setExtendTime(@Nullable Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.extend_time</code>.
     */
    @Nullable
    public Double getExtendTime() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.op_bytes</code>.
     */
    public void setOpBytes(@Nullable Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.op_bytes</code>.
     */
    @Nullable
    public Long getOpBytes() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.hits</code>.
     */
    public void setHits(@Nullable Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.hits</code>.
     */
    @Nullable
    public Long getHits() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.evictions</code>.
     */
    public void setEvictions(@Nullable Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.evictions</code>.
     */
    @Nullable
    public Long getEvictions() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.reuses</code>.
     */
    public void setReuses(@Nullable Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.reuses</code>.
     */
    @Nullable
    public Long getReuses() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.fsyncs</code>.
     */
    public void setFsyncs(@Nullable Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.fsyncs</code>.
     */
    @Nullable
    public Long getFsyncs() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.fsync_time</code>.
     */
    public void setFsyncTime(@Nullable Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.fsync_time</code>.
     */
    @Nullable
    public Double getFsyncTime() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.stats_reset</code>.
     */
    public void setStatsReset(@Nullable OffsetDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.stats_reset</code>.
     */
    @Nullable
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row18<String, String, String, Long, Double, Long, Double, Long, Double, Long, Double, Long, Long, Long, Long, Long, Double, OffsetDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row18<String, String, String, Long, Double, Long, Double, Long, Double, Long, Double, Long, Long, Long, Long, Long, Double, OffsetDateTime> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgStatGetIo.PG_STAT_GET_IO.BACKEND_TYPE;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgStatGetIo.PG_STAT_GET_IO.OBJECT;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgStatGetIo.PG_STAT_GET_IO.CONTEXT;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgStatGetIo.PG_STAT_GET_IO.READS;
    }

    @Override
    @NotNull
    public Field<Double> field5() {
        return PgStatGetIo.PG_STAT_GET_IO.READ_TIME;
    }

    @Override
    @NotNull
    public Field<Long> field6() {
        return PgStatGetIo.PG_STAT_GET_IO.WRITES;
    }

    @Override
    @NotNull
    public Field<Double> field7() {
        return PgStatGetIo.PG_STAT_GET_IO.WRITE_TIME;
    }

    @Override
    @NotNull
    public Field<Long> field8() {
        return PgStatGetIo.PG_STAT_GET_IO.WRITEBACKS;
    }

    @Override
    @NotNull
    public Field<Double> field9() {
        return PgStatGetIo.PG_STAT_GET_IO.WRITEBACK_TIME;
    }

    @Override
    @NotNull
    public Field<Long> field10() {
        return PgStatGetIo.PG_STAT_GET_IO.EXTENDS;
    }

    @Override
    @NotNull
    public Field<Double> field11() {
        return PgStatGetIo.PG_STAT_GET_IO.EXTEND_TIME;
    }

    @Override
    @NotNull
    public Field<Long> field12() {
        return PgStatGetIo.PG_STAT_GET_IO.OP_BYTES;
    }

    @Override
    @NotNull
    public Field<Long> field13() {
        return PgStatGetIo.PG_STAT_GET_IO.HITS;
    }

    @Override
    @NotNull
    public Field<Long> field14() {
        return PgStatGetIo.PG_STAT_GET_IO.EVICTIONS;
    }

    @Override
    @NotNull
    public Field<Long> field15() {
        return PgStatGetIo.PG_STAT_GET_IO.REUSES;
    }

    @Override
    @NotNull
    public Field<Long> field16() {
        return PgStatGetIo.PG_STAT_GET_IO.FSYNCS;
    }

    @Override
    @NotNull
    public Field<Double> field17() {
        return PgStatGetIo.PG_STAT_GET_IO.FSYNC_TIME;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field18() {
        return PgStatGetIo.PG_STAT_GET_IO.STATS_RESET;
    }

    @Override
    @Nullable
    public String component1() {
        return getBackendType();
    }

    @Override
    @Nullable
    public String component2() {
        return getObject();
    }

    @Override
    @Nullable
    public String component3() {
        return getContext();
    }

    @Override
    @Nullable
    public Long component4() {
        return getReads();
    }

    @Override
    @Nullable
    public Double component5() {
        return getReadTime();
    }

    @Override
    @Nullable
    public Long component6() {
        return getWrites();
    }

    @Override
    @Nullable
    public Double component7() {
        return getWriteTime();
    }

    @Override
    @Nullable
    public Long component8() {
        return getWritebacks();
    }

    @Override
    @Nullable
    public Double component9() {
        return getWritebackTime();
    }

    @Override
    @Nullable
    public Long component10() {
        return getExtends();
    }

    @Override
    @Nullable
    public Double component11() {
        return getExtendTime();
    }

    @Override
    @Nullable
    public Long component12() {
        return getOpBytes();
    }

    @Override
    @Nullable
    public Long component13() {
        return getHits();
    }

    @Override
    @Nullable
    public Long component14() {
        return getEvictions();
    }

    @Override
    @Nullable
    public Long component15() {
        return getReuses();
    }

    @Override
    @Nullable
    public Long component16() {
        return getFsyncs();
    }

    @Override
    @Nullable
    public Double component17() {
        return getFsyncTime();
    }

    @Override
    @Nullable
    public OffsetDateTime component18() {
        return getStatsReset();
    }

    @Override
    @Nullable
    public String value1() {
        return getBackendType();
    }

    @Override
    @Nullable
    public String value2() {
        return getObject();
    }

    @Override
    @Nullable
    public String value3() {
        return getContext();
    }

    @Override
    @Nullable
    public Long value4() {
        return getReads();
    }

    @Override
    @Nullable
    public Double value5() {
        return getReadTime();
    }

    @Override
    @Nullable
    public Long value6() {
        return getWrites();
    }

    @Override
    @Nullable
    public Double value7() {
        return getWriteTime();
    }

    @Override
    @Nullable
    public Long value8() {
        return getWritebacks();
    }

    @Override
    @Nullable
    public Double value9() {
        return getWritebackTime();
    }

    @Override
    @Nullable
    public Long value10() {
        return getExtends();
    }

    @Override
    @Nullable
    public Double value11() {
        return getExtendTime();
    }

    @Override
    @Nullable
    public Long value12() {
        return getOpBytes();
    }

    @Override
    @Nullable
    public Long value13() {
        return getHits();
    }

    @Override
    @Nullable
    public Long value14() {
        return getEvictions();
    }

    @Override
    @Nullable
    public Long value15() {
        return getReuses();
    }

    @Override
    @Nullable
    public Long value16() {
        return getFsyncs();
    }

    @Override
    @Nullable
    public Double value17() {
        return getFsyncTime();
    }

    @Override
    @Nullable
    public OffsetDateTime value18() {
        return getStatsReset();
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value1(@Nullable String value) {
        setBackendType(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value2(@Nullable String value) {
        setObject(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value3(@Nullable String value) {
        setContext(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value4(@Nullable Long value) {
        setReads(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value5(@Nullable Double value) {
        setReadTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value6(@Nullable Long value) {
        setWrites(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value7(@Nullable Double value) {
        setWriteTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value8(@Nullable Long value) {
        setWritebacks(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value9(@Nullable Double value) {
        setWritebackTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value10(@Nullable Long value) {
        setExtends(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value11(@Nullable Double value) {
        setExtendTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value12(@Nullable Long value) {
        setOpBytes(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value13(@Nullable Long value) {
        setHits(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value14(@Nullable Long value) {
        setEvictions(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value15(@Nullable Long value) {
        setReuses(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value16(@Nullable Long value) {
        setFsyncs(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value17(@Nullable Double value) {
        setFsyncTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord value18(@Nullable OffsetDateTime value) {
        setStatsReset(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetIoRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable Long value4, @Nullable Double value5, @Nullable Long value6, @Nullable Double value7, @Nullable Long value8, @Nullable Double value9, @Nullable Long value10, @Nullable Double value11, @Nullable Long value12, @Nullable Long value13, @Nullable Long value14, @Nullable Long value15, @Nullable Long value16, @Nullable Double value17, @Nullable OffsetDateTime value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatGetIoRecord
     */
    public PgStatGetIoRecord() {
        super(PgStatGetIo.PG_STAT_GET_IO);
    }

    /**
     * Create a detached, initialised PgStatGetIoRecord
     */
    @ConstructorProperties({ "backendType", "object", "context", "reads", "readTime", "writes", "writeTime", "writebacks", "writebackTime", "extends_", "extendTime", "opBytes", "hits", "evictions", "reuses", "fsyncs", "fsyncTime", "statsReset" })
    public PgStatGetIoRecord(@Nullable String backendType, @Nullable String object, @Nullable String context, @Nullable Long reads, @Nullable Double readTime, @Nullable Long writes, @Nullable Double writeTime, @Nullable Long writebacks, @Nullable Double writebackTime, @Nullable Long extends_, @Nullable Double extendTime, @Nullable Long opBytes, @Nullable Long hits, @Nullable Long evictions, @Nullable Long reuses, @Nullable Long fsyncs, @Nullable Double fsyncTime, @Nullable OffsetDateTime statsReset) {
        super(PgStatGetIo.PG_STAT_GET_IO);

        setBackendType(backendType);
        setObject(object);
        setContext(context);
        setReads(reads);
        setReadTime(readTime);
        setWrites(writes);
        setWriteTime(writeTime);
        setWritebacks(writebacks);
        setWritebackTime(writebackTime);
        setExtends(extends_);
        setExtendTime(extendTime);
        setOpBytes(opBytes);
        setHits(hits);
        setEvictions(evictions);
        setReuses(reuses);
        setFsyncs(fsyncs);
        setFsyncTime(fsyncTime);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatGetIoRecord
     */
    public PgStatGetIoRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatGetIo value) {
        super(PgStatGetIo.PG_STAT_GET_IO);

        if (value != null) {
            setBackendType(value.getBackendType());
            setObject(value.getObject());
            setContext(value.getContext());
            setReads(value.getReads());
            setReadTime(value.getReadTime());
            setWrites(value.getWrites());
            setWriteTime(value.getWriteTime());
            setWritebacks(value.getWritebacks());
            setWritebackTime(value.getWritebackTime());
            setExtends(value.getExtends());
            setExtendTime(value.getExtendTime());
            setOpBytes(value.getOpBytes());
            setHits(value.getHits());
            setEvictions(value.getEvictions());
            setReuses(value.getReuses());
            setFsyncs(value.getFsyncs());
            setFsyncTime(value.getFsyncTime());
            setStatsReset(value.getStatsReset());
            resetChangedOnNotNull();
        }
    }
}