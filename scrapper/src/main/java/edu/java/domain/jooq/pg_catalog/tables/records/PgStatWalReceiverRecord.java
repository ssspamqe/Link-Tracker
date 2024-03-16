/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatWalReceiver;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class PgStatWalReceiverRecord extends TableRecordImpl<PgStatWalReceiverRecord> implements Record15<Integer, String, Object, Integer, Object, Object, Integer, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime, String, String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.pid</code>.
     */
    public void setPid(@Nullable Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.pid</code>.
     */
    @Nullable
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.status</code>.
     */
    public void setStatus(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.status</code>.
     */
    @Nullable
    public String getStatus() {
        return (String) get(1);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setReceiveStartLsn(@Nullable Object value) {
        set(2, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getReceiveStartLsn() {
        return get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_wal_receiver.receive_start_tli</code>.
     */
    public void setReceiveStartTli(@Nullable Integer value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_wal_receiver.receive_start_tli</code>.
     */
    @Nullable
    public Integer getReceiveStartTli() {
        return (Integer) get(3);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setWrittenLsn(@Nullable Object value) {
        set(4, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getWrittenLsn() {
        return get(4);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setFlushedLsn(@Nullable Object value) {
        set(5, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getFlushedLsn() {
        return get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.received_tli</code>.
     */
    public void setReceivedTli(@Nullable Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.received_tli</code>.
     */
    @Nullable
    public Integer getReceivedTli() {
        return (Integer) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_wal_receiver.last_msg_send_time</code>.
     */
    public void setLastMsgSendTime(@Nullable OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_wal_receiver.last_msg_send_time</code>.
     */
    @Nullable
    public OffsetDateTime getLastMsgSendTime() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_wal_receiver.last_msg_receipt_time</code>.
     */
    public void setLastMsgReceiptTime(@Nullable OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_wal_receiver.last_msg_receipt_time</code>.
     */
    @Nullable
    public OffsetDateTime getLastMsgReceiptTime() {
        return (OffsetDateTime) get(8);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setLatestEndLsn(@Nullable Object value) {
        set(9, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getLatestEndLsn() {
        return get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.latest_end_time</code>.
     */
    public void setLatestEndTime(@Nullable OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.latest_end_time</code>.
     */
    @Nullable
    public OffsetDateTime getLatestEndTime() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.slot_name</code>.
     */
    public void setSlotName(@Nullable String value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.slot_name</code>.
     */
    @Nullable
    public String getSlotName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.sender_host</code>.
     */
    public void setSenderHost(@Nullable String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.sender_host</code>.
     */
    @Nullable
    public String getSenderHost() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.sender_port</code>.
     */
    public void setSenderPort(@Nullable Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.sender_port</code>.
     */
    @Nullable
    public Integer getSenderPort() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal_receiver.conninfo</code>.
     */
    public void setConninfo(@Nullable String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal_receiver.conninfo</code>.
     */
    @Nullable
    public String getConninfo() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row15<Integer, String, Object, Integer, Object, Object, Integer, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime, String, String, Integer, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row15<Integer, String, Object, Integer, Object, Object, Integer, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime, String, String, Integer, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Integer> field1() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.PID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.STATUS;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public Field<Object> field3() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.RECEIVE_START_LSN;
    }

    @Override
    @NotNull
    public Field<Integer> field4() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.RECEIVE_START_TLI;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public Field<Object> field5() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.WRITTEN_LSN;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public Field<Object> field6() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.FLUSHED_LSN;
    }

    @Override
    @NotNull
    public Field<Integer> field7() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.RECEIVED_TLI;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field8() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.LAST_MSG_SEND_TIME;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field9() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.LAST_MSG_RECEIPT_TIME;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public Field<Object> field10() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.LATEST_END_LSN;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field11() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.LATEST_END_TIME;
    }

    @Override
    @NotNull
    public Field<String> field12() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.SLOT_NAME;
    }

    @Override
    @NotNull
    public Field<String> field13() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.SENDER_HOST;
    }

    @Override
    @NotNull
    public Field<Integer> field14() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.SENDER_PORT;
    }

    @Override
    @NotNull
    public Field<String> field15() {
        return PgStatWalReceiver.PG_STAT_WAL_RECEIVER.CONNINFO;
    }

    @Override
    @Nullable
    public Integer component1() {
        return getPid();
    }

    @Override
    @Nullable
    public String component2() {
        return getStatus();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object component3() {
        return getReceiveStartLsn();
    }

    @Override
    @Nullable
    public Integer component4() {
        return getReceiveStartTli();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object component5() {
        return getWrittenLsn();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object component6() {
        return getFlushedLsn();
    }

    @Override
    @Nullable
    public Integer component7() {
        return getReceivedTli();
    }

    @Override
    @Nullable
    public OffsetDateTime component8() {
        return getLastMsgSendTime();
    }

    @Override
    @Nullable
    public OffsetDateTime component9() {
        return getLastMsgReceiptTime();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object component10() {
        return getLatestEndLsn();
    }

    @Override
    @Nullable
    public OffsetDateTime component11() {
        return getLatestEndTime();
    }

    @Override
    @Nullable
    public String component12() {
        return getSlotName();
    }

    @Override
    @Nullable
    public String component13() {
        return getSenderHost();
    }

    @Override
    @Nullable
    public Integer component14() {
        return getSenderPort();
    }

    @Override
    @Nullable
    public String component15() {
        return getConninfo();
    }

    @Override
    @Nullable
    public Integer value1() {
        return getPid();
    }

    @Override
    @Nullable
    public String value2() {
        return getStatus();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object value3() {
        return getReceiveStartLsn();
    }

    @Override
    @Nullable
    public Integer value4() {
        return getReceiveStartTli();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object value5() {
        return getWrittenLsn();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object value6() {
        return getFlushedLsn();
    }

    @Override
    @Nullable
    public Integer value7() {
        return getReceivedTli();
    }

    @Override
    @Nullable
    public OffsetDateTime value8() {
        return getLastMsgSendTime();
    }

    @Override
    @Nullable
    public OffsetDateTime value9() {
        return getLastMsgReceiptTime();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @Nullable
    public Object value10() {
        return getLatestEndLsn();
    }

    @Override
    @Nullable
    public OffsetDateTime value11() {
        return getLatestEndTime();
    }

    @Override
    @Nullable
    public String value12() {
        return getSlotName();
    }

    @Override
    @Nullable
    public String value13() {
        return getSenderHost();
    }

    @Override
    @Nullable
    public Integer value14() {
        return getSenderPort();
    }

    @Override
    @Nullable
    public String value15() {
        return getConninfo();
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value1(@Nullable Integer value) {
        setPid(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value2(@Nullable String value) {
        setStatus(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public PgStatWalReceiverRecord value3(@Nullable Object value) {
        setReceiveStartLsn(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value4(@Nullable Integer value) {
        setReceiveStartTli(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public PgStatWalReceiverRecord value5(@Nullable Object value) {
        setWrittenLsn(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public PgStatWalReceiverRecord value6(@Nullable Object value) {
        setFlushedLsn(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value7(@Nullable Integer value) {
        setReceivedTli(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value8(@Nullable OffsetDateTime value) {
        setLastMsgSendTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value9(@Nullable OffsetDateTime value) {
        setLastMsgReceiptTime(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    @NotNull
    public PgStatWalReceiverRecord value10(@Nullable Object value) {
        setLatestEndLsn(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value11(@Nullable OffsetDateTime value) {
        setLatestEndTime(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value12(@Nullable String value) {
        setSlotName(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value13(@Nullable String value) {
        setSenderHost(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value14(@Nullable Integer value) {
        setSenderPort(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord value15(@Nullable String value) {
        setConninfo(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatWalReceiverRecord values(@Nullable Integer value1, @Nullable String value2, @Nullable Object value3, @Nullable Integer value4, @Nullable Object value5, @Nullable Object value6, @Nullable Integer value7, @Nullable OffsetDateTime value8, @Nullable OffsetDateTime value9, @Nullable Object value10, @Nullable OffsetDateTime value11, @Nullable String value12, @Nullable String value13, @Nullable Integer value14, @Nullable String value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatWalReceiverRecord
     */
    public PgStatWalReceiverRecord() {
        super(PgStatWalReceiver.PG_STAT_WAL_RECEIVER);
    }

    /**
     * Create a detached, initialised PgStatWalReceiverRecord
     */
    @ConstructorProperties({ "pid", "status", "receiveStartLsn", "receiveStartTli", "writtenLsn", "flushedLsn", "receivedTli", "lastMsgSendTime", "lastMsgReceiptTime", "latestEndLsn", "latestEndTime", "slotName", "senderHost", "senderPort", "conninfo" })
    public PgStatWalReceiverRecord(@Nullable Integer pid, @Nullable String status, @Nullable Object receiveStartLsn, @Nullable Integer receiveStartTli, @Nullable Object writtenLsn, @Nullable Object flushedLsn, @Nullable Integer receivedTli, @Nullable OffsetDateTime lastMsgSendTime, @Nullable OffsetDateTime lastMsgReceiptTime, @Nullable Object latestEndLsn, @Nullable OffsetDateTime latestEndTime, @Nullable String slotName, @Nullable String senderHost, @Nullable Integer senderPort, @Nullable String conninfo) {
        super(PgStatWalReceiver.PG_STAT_WAL_RECEIVER);

        setPid(pid);
        setStatus(status);
        setReceiveStartLsn(receiveStartLsn);
        setReceiveStartTli(receiveStartTli);
        setWrittenLsn(writtenLsn);
        setFlushedLsn(flushedLsn);
        setReceivedTli(receivedTli);
        setLastMsgSendTime(lastMsgSendTime);
        setLastMsgReceiptTime(lastMsgReceiptTime);
        setLatestEndLsn(latestEndLsn);
        setLatestEndTime(latestEndTime);
        setSlotName(slotName);
        setSenderHost(senderHost);
        setSenderPort(senderPort);
        setConninfo(conninfo);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatWalReceiverRecord
     */
    public PgStatWalReceiverRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatWalReceiver value) {
        super(PgStatWalReceiver.PG_STAT_WAL_RECEIVER);

        if (value != null) {
            setPid(value.getPid());
            setStatus(value.getStatus());
            setReceiveStartLsn(value.getReceiveStartLsn());
            setReceiveStartTli(value.getReceiveStartTli());
            setWrittenLsn(value.getWrittenLsn());
            setFlushedLsn(value.getFlushedLsn());
            setReceivedTli(value.getReceivedTli());
            setLastMsgSendTime(value.getLastMsgSendTime());
            setLastMsgReceiptTime(value.getLastMsgReceiptTime());
            setLatestEndLsn(value.getLatestEndLsn());
            setLatestEndTime(value.getLatestEndTime());
            setSlotName(value.getSlotName());
            setSenderHost(value.getSenderHost());
            setSenderPort(value.getSenderPort());
            setConninfo(value.getConninfo());
            resetChangedOnNotNull();
        }
    }
}