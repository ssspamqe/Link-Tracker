/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.TriggeredUpdateColumns;

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
public class TriggeredUpdateColumnsRecord extends TableRecordImpl<TriggeredUpdateColumnsRecord> {

    private static final long serialVersionUID = 1L;

    public void setTriggerCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getTriggerCatalog() {
        return (String) get(0);
    }

    public void setTriggerSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getTriggerSchema() {
        return (String) get(1);
    }

    public void setTriggerName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getTriggerName() {
        return (String) get(2);
    }

    public void setEventObjectCatalog(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getEventObjectCatalog() {
        return (String) get(3);
    }

    public void setEventObjectSchema(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getEventObjectSchema() {
        return (String) get(4);
    }

    public void setEventObjectTable(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getEventObjectTable() {
        return (String) get(5);
    }

    public void setEventObjectColumn(@Nullable String value) {
        set(6, value);
    }

    @Nullable
    public String getEventObjectColumn() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public TriggeredUpdateColumnsRecord() {
        super(TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS);
    }

    @ConstructorProperties({ "triggerCatalog", "triggerSchema", "triggerName", "eventObjectCatalog", "eventObjectSchema", "eventObjectTable", "eventObjectColumn" })
    public TriggeredUpdateColumnsRecord(@Nullable String triggerCatalog, @Nullable String triggerSchema, @Nullable String triggerName, @Nullable String eventObjectCatalog, @Nullable String eventObjectSchema, @Nullable String eventObjectTable, @Nullable String eventObjectColumn) {
        super(TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS);

        setTriggerCatalog(triggerCatalog);
        setTriggerSchema(triggerSchema);
        setTriggerName(triggerName);
        setEventObjectCatalog(eventObjectCatalog);
        setEventObjectSchema(eventObjectSchema);
        setEventObjectTable(eventObjectTable);
        setEventObjectColumn(eventObjectColumn);
        resetChangedOnNotNull();
    }

    public TriggeredUpdateColumnsRecord(edu.java.domain.jooq.information_schema.tables.pojos.TriggeredUpdateColumns value) {
        super(TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS);

        if (value != null) {
            setTriggerCatalog(value.getTriggerCatalog());
            setTriggerSchema(value.getTriggerSchema());
            setTriggerName(value.getTriggerName());
            setEventObjectCatalog(value.getEventObjectCatalog());
            setEventObjectSchema(value.getEventObjectSchema());
            setEventObjectTable(value.getEventObjectTable());
            setEventObjectColumn(value.getEventObjectColumn());
            resetChangedOnNotNull();
        }
    }
}