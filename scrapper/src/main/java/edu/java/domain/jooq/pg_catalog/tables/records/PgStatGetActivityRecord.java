/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatGetActivity;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;
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
public class PgStatGetActivityRecord extends TableRecordImpl<PgStatGetActivityRecord> {

    private static final long serialVersionUID = 1L;

    public void setDatid(@Nullable Long value) {
        set(0, value);
    }

    @Nullable
    public Long getDatid() {
        return (Long) get(0);
    }

    public void setPid(@Nullable Integer value) {
        set(1, value);
    }

    @Nullable
    public Integer getPid() {
        return (Integer) get(1);
    }

    public void setUsesysid(@Nullable Long value) {
        set(2, value);
    }

    @Nullable
    public Long getUsesysid() {
        return (Long) get(2);
    }

    public void setApplicationName(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getApplicationName() {
        return (String) get(3);
    }

    public void setState(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getState() {
        return (String) get(4);
    }

    public void setQuery(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getQuery() {
        return (String) get(5);
    }

    public void setWaitEventType(@Nullable String value) {
        set(6, value);
    }

    @Nullable
    public String getWaitEventType() {
        return (String) get(6);
    }

    public void setWaitEvent(@Nullable String value) {
        set(7, value);
    }

    @Nullable
    public String getWaitEvent() {
        return (String) get(7);
    }

    public void setXactStart(@Nullable OffsetDateTime value) {
        set(8, value);
    }

    @Nullable
    public OffsetDateTime getXactStart() {
        return (OffsetDateTime) get(8);
    }

    public void setQueryStart(@Nullable OffsetDateTime value) {
        set(9, value);
    }

    @Nullable
    public OffsetDateTime getQueryStart() {
        return (OffsetDateTime) get(9);
    }

    public void setBackendStart(@Nullable OffsetDateTime value) {
        set(10, value);
    }

    @Nullable
    public OffsetDateTime getBackendStart() {
        return (OffsetDateTime) get(10);
    }

    public void setStateChange(@Nullable OffsetDateTime value) {
        set(11, value);
    }

    @Nullable
    public OffsetDateTime getStateChange() {
        return (OffsetDateTime) get(11);
    }

    @Deprecated
    public void setClientAddr(@Nullable Object value) {
        set(12, value);
    }

    @Deprecated
    @Nullable
    public Object getClientAddr() {
        return get(12);
    }

    public void setClientHostname(@Nullable String value) {
        set(13, value);
    }

    @Nullable
    public String getClientHostname() {
        return (String) get(13);
    }

    public void setClientPort(@Nullable Integer value) {
        set(14, value);
    }

    @Nullable
    public Integer getClientPort() {
        return (Integer) get(14);
    }

    public void setBackendXid(@Nullable Long value) {
        set(15, value);
    }

    @Nullable
    public Long getBackendXid() {
        return (Long) get(15);
    }

    public void setBackendXmin(@Nullable Long value) {
        set(16, value);
    }

    @Nullable
    public Long getBackendXmin() {
        return (Long) get(16);
    }

    public void setBackendType(@Nullable String value) {
        set(17, value);
    }

    @Nullable
    public String getBackendType() {
        return (String) get(17);
    }

    public void setSsl(@Nullable Boolean value) {
        set(18, value);
    }

    @Nullable
    public Boolean getSsl() {
        return (Boolean) get(18);
    }

    public void setSslversion(@Nullable String value) {
        set(19, value);
    }

    @Nullable
    public String getSslversion() {
        return (String) get(19);
    }

    public void setSslcipher(@Nullable String value) {
        set(20, value);
    }

    @Nullable
    public String getSslcipher() {
        return (String) get(20);
    }

    public void setSslbits(@Nullable Integer value) {
        set(21, value);
    }

    @Nullable
    public Integer getSslbits() {
        return (Integer) get(21);
    }

    public void setSslClientDn(@Nullable String value) {
        set(22, value);
    }

    @Nullable
    public String getSslClientDn() {
        return (String) get(22);
    }

    public void setSslClientSerial(@Nullable BigDecimal value) {
        set(23, value);
    }

    @Nullable
    public BigDecimal getSslClientSerial() {
        return (BigDecimal) get(23);
    }

    public void setSslIssuerDn(@Nullable String value) {
        set(24, value);
    }

    @Nullable
    public String getSslIssuerDn() {
        return (String) get(24);
    }

    public void setGssAuth(@Nullable Boolean value) {
        set(25, value);
    }

    @Nullable
    public Boolean getGssAuth() {
        return (Boolean) get(25);
    }

    public void setGssPrinc(@Nullable String value) {
        set(26, value);
    }

    @Nullable
    public String getGssPrinc() {
        return (String) get(26);
    }

    public void setGssEnc(@Nullable Boolean value) {
        set(27, value);
    }

    @Nullable
    public Boolean getGssEnc() {
        return (Boolean) get(27);
    }

    public void setGssDelegation(@Nullable Boolean value) {
        set(28, value);
    }

    @Nullable
    public Boolean getGssDelegation() {
        return (Boolean) get(28);
    }

    public void setLeaderPid(@Nullable Integer value) {
        set(29, value);
    }

    @Nullable
    public Integer getLeaderPid() {
        return (Integer) get(29);
    }

    public void setQueryId(@Nullable Long value) {
        set(30, value);
    }

    @Nullable
    public Long getQueryId() {
        return (Long) get(30);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgStatGetActivityRecord() {
        super(PgStatGetActivity.PG_STAT_GET_ACTIVITY);
    }

    @ConstructorProperties({ "datid", "pid", "usesysid", "applicationName", "state", "query", "waitEventType", "waitEvent", "xactStart", "queryStart", "backendStart", "stateChange", "clientAddr", "clientHostname", "clientPort", "backendXid", "backendXmin", "backendType", "ssl", "sslversion", "sslcipher", "sslbits", "sslClientDn", "sslClientSerial", "sslIssuerDn", "gssAuth", "gssPrinc", "gssEnc", "gssDelegation", "leaderPid", "queryId" })
    public PgStatGetActivityRecord(@Nullable Long datid, @Nullable Integer pid, @Nullable Long usesysid, @Nullable String applicationName, @Nullable String state, @Nullable String query, @Nullable String waitEventType, @Nullable String waitEvent, @Nullable OffsetDateTime xactStart, @Nullable OffsetDateTime queryStart, @Nullable OffsetDateTime backendStart, @Nullable OffsetDateTime stateChange, @Nullable Object clientAddr, @Nullable String clientHostname, @Nullable Integer clientPort, @Nullable Long backendXid, @Nullable Long backendXmin, @Nullable String backendType, @Nullable Boolean ssl, @Nullable String sslversion, @Nullable String sslcipher, @Nullable Integer sslbits, @Nullable String sslClientDn, @Nullable BigDecimal sslClientSerial, @Nullable String sslIssuerDn, @Nullable Boolean gssAuth, @Nullable String gssPrinc, @Nullable Boolean gssEnc, @Nullable Boolean gssDelegation, @Nullable Integer leaderPid, @Nullable Long queryId) {
        super(PgStatGetActivity.PG_STAT_GET_ACTIVITY);

        setDatid(datid);
        setPid(pid);
        setUsesysid(usesysid);
        setApplicationName(applicationName);
        setState(state);
        setQuery(query);
        setWaitEventType(waitEventType);
        setWaitEvent(waitEvent);
        setXactStart(xactStart);
        setQueryStart(queryStart);
        setBackendStart(backendStart);
        setStateChange(stateChange);
        setClientAddr(clientAddr);
        setClientHostname(clientHostname);
        setClientPort(clientPort);
        setBackendXid(backendXid);
        setBackendXmin(backendXmin);
        setBackendType(backendType);
        setSsl(ssl);
        setSslversion(sslversion);
        setSslcipher(sslcipher);
        setSslbits(sslbits);
        setSslClientDn(sslClientDn);
        setSslClientSerial(sslClientSerial);
        setSslIssuerDn(sslIssuerDn);
        setGssAuth(gssAuth);
        setGssPrinc(gssPrinc);
        setGssEnc(gssEnc);
        setGssDelegation(gssDelegation);
        setLeaderPid(leaderPid);
        setQueryId(queryId);
        resetChangedOnNotNull();
    }

    public PgStatGetActivityRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatGetActivity value) {
        super(PgStatGetActivity.PG_STAT_GET_ACTIVITY);

        if (value != null) {
            setDatid(value.getDatid());
            setPid(value.getPid());
            setUsesysid(value.getUsesysid());
            setApplicationName(value.getApplicationName());
            setState(value.getState());
            setQuery(value.getQuery());
            setWaitEventType(value.getWaitEventType());
            setWaitEvent(value.getWaitEvent());
            setXactStart(value.getXactStart());
            setQueryStart(value.getQueryStart());
            setBackendStart(value.getBackendStart());
            setStateChange(value.getStateChange());
            setClientAddr(value.getClientAddr());
            setClientHostname(value.getClientHostname());
            setClientPort(value.getClientPort());
            setBackendXid(value.getBackendXid());
            setBackendXmin(value.getBackendXmin());
            setBackendType(value.getBackendType());
            setSsl(value.getSsl());
            setSslversion(value.getSslversion());
            setSslcipher(value.getSslcipher());
            setSslbits(value.getSslbits());
            setSslClientDn(value.getSslClientDn());
            setSslClientSerial(value.getSslClientSerial());
            setSslIssuerDn(value.getSslIssuerDn());
            setGssAuth(value.getGssAuth());
            setGssPrinc(value.getGssPrinc());
            setGssEnc(value.getGssEnc());
            setGssDelegation(value.getGssDelegation());
            setLeaderPid(value.getLeaderPid());
            setQueryId(value.getQueryId());
            resetChangedOnNotNull();
        }
    }
}
