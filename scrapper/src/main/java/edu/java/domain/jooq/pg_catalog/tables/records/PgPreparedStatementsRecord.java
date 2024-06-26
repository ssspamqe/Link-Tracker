/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgPreparedStatements;

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
public class PgPreparedStatementsRecord extends TableRecordImpl<PgPreparedStatementsRecord> {

    private static final long serialVersionUID = 1L;

    public void setName(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getName() {
        return (String) get(0);
    }

    public void setStatement(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getStatement() {
        return (String) get(1);
    }

    public void setPrepareTime(@Nullable OffsetDateTime value) {
        set(2, value);
    }

    @Nullable
    public OffsetDateTime getPrepareTime() {
        return (OffsetDateTime) get(2);
    }

    public void setParameterTypes(@Nullable Object[] value) {
        set(3, value);
    }

    @Nullable
    public Object[] getParameterTypes() {
        return (Object[]) get(3);
    }

    public void setResultTypes(@Nullable Object[] value) {
        set(4, value);
    }

    @Nullable
    public Object[] getResultTypes() {
        return (Object[]) get(4);
    }

    public void setFromSql(@Nullable Boolean value) {
        set(5, value);
    }

    @Nullable
    public Boolean getFromSql() {
        return (Boolean) get(5);
    }

    public void setGenericPlans(@Nullable Long value) {
        set(6, value);
    }

    @Nullable
    public Long getGenericPlans() {
        return (Long) get(6);
    }

    public void setCustomPlans(@Nullable Long value) {
        set(7, value);
    }

    @Nullable
    public Long getCustomPlans() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgPreparedStatementsRecord() {
        super(PgPreparedStatements.PG_PREPARED_STATEMENTS);
    }

    @ConstructorProperties({ "name", "statement", "prepareTime", "parameterTypes", "resultTypes", "fromSql", "genericPlans", "customPlans" })
    public PgPreparedStatementsRecord(@Nullable String name, @Nullable String statement, @Nullable OffsetDateTime prepareTime, @Nullable Object[] parameterTypes, @Nullable Object[] resultTypes, @Nullable Boolean fromSql, @Nullable Long genericPlans, @Nullable Long customPlans) {
        super(PgPreparedStatements.PG_PREPARED_STATEMENTS);

        setName(name);
        setStatement(statement);
        setPrepareTime(prepareTime);
        setParameterTypes(parameterTypes);
        setResultTypes(resultTypes);
        setFromSql(fromSql);
        setGenericPlans(genericPlans);
        setCustomPlans(customPlans);
        resetChangedOnNotNull();
    }

    public PgPreparedStatementsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgPreparedStatements value) {
        super(PgPreparedStatements.PG_PREPARED_STATEMENTS);

        if (value != null) {
            setName(value.getName());
            setStatement(value.getStatement());
            setPrepareTime(value.getPrepareTime());
            setParameterTypes(value.getParameterTypes());
            setResultTypes(value.getResultTypes());
            setFromSql(value.getFromSql());
            setGenericPlans(value.getGenericPlans());
            setCustomPlans(value.getCustomPlans());
            resetChangedOnNotNull();
        }
    }
}
