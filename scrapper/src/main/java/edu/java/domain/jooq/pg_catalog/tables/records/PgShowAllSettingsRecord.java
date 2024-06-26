/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgShowAllSettings;

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
public class PgShowAllSettingsRecord extends TableRecordImpl<PgShowAllSettingsRecord> {

    private static final long serialVersionUID = 1L;

    public void setName(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getName() {
        return (String) get(0);
    }

    public void setSetting(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getSetting() {
        return (String) get(1);
    }

    public void setUnit(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getUnit() {
        return (String) get(2);
    }

    public void setCategory(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getCategory() {
        return (String) get(3);
    }

    public void setShortDesc(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getShortDesc() {
        return (String) get(4);
    }

    public void setExtraDesc(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getExtraDesc() {
        return (String) get(5);
    }

    public void setContext(@Nullable String value) {
        set(6, value);
    }

    @Nullable
    public String getContext() {
        return (String) get(6);
    }

    public void setVartype(@Nullable String value) {
        set(7, value);
    }

    @Nullable
    public String getVartype() {
        return (String) get(7);
    }

    public void setSource(@Nullable String value) {
        set(8, value);
    }

    @Nullable
    public String getSource() {
        return (String) get(8);
    }

    public void setMinVal(@Nullable String value) {
        set(9, value);
    }

    @Nullable
    public String getMinVal() {
        return (String) get(9);
    }

    public void setMaxVal(@Nullable String value) {
        set(10, value);
    }

    @Nullable
    public String getMaxVal() {
        return (String) get(10);
    }

    public void setEnumvals(@Nullable String[] value) {
        set(11, value);
    }

    @Nullable
    public String[] getEnumvals() {
        return (String[]) get(11);
    }

    public void setBootVal(@Nullable String value) {
        set(12, value);
    }

    @Nullable
    public String getBootVal() {
        return (String) get(12);
    }

    public void setResetVal(@Nullable String value) {
        set(13, value);
    }

    @Nullable
    public String getResetVal() {
        return (String) get(13);
    }

    public void setSourcefile(@Nullable String value) {
        set(14, value);
    }

    @Nullable
    public String getSourcefile() {
        return (String) get(14);
    }

    public void setSourceline(@Nullable Integer value) {
        set(15, value);
    }

    @Nullable
    public Integer getSourceline() {
        return (Integer) get(15);
    }

    public void setPendingRestart(@Nullable Boolean value) {
        set(16, value);
    }

    @Nullable
    public Boolean getPendingRestart() {
        return (Boolean) get(16);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgShowAllSettingsRecord() {
        super(PgShowAllSettings.PG_SHOW_ALL_SETTINGS);
    }

    @ConstructorProperties({ "name", "setting", "unit", "category", "shortDesc", "extraDesc", "context", "vartype", "source", "minVal", "maxVal", "enumvals", "bootVal", "resetVal", "sourcefile", "sourceline", "pendingRestart" })
    public PgShowAllSettingsRecord(@Nullable String name, @Nullable String setting, @Nullable String unit, @Nullable String category, @Nullable String shortDesc, @Nullable String extraDesc, @Nullable String context, @Nullable String vartype, @Nullable String source, @Nullable String minVal, @Nullable String maxVal, @Nullable String[] enumvals, @Nullable String bootVal, @Nullable String resetVal, @Nullable String sourcefile, @Nullable Integer sourceline, @Nullable Boolean pendingRestart) {
        super(PgShowAllSettings.PG_SHOW_ALL_SETTINGS);

        setName(name);
        setSetting(setting);
        setUnit(unit);
        setCategory(category);
        setShortDesc(shortDesc);
        setExtraDesc(extraDesc);
        setContext(context);
        setVartype(vartype);
        setSource(source);
        setMinVal(minVal);
        setMaxVal(maxVal);
        setEnumvals(enumvals);
        setBootVal(bootVal);
        setResetVal(resetVal);
        setSourcefile(sourcefile);
        setSourceline(sourceline);
        setPendingRestart(pendingRestart);
        resetChangedOnNotNull();
    }

    public PgShowAllSettingsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgShowAllSettings value) {
        super(PgShowAllSettings.PG_SHOW_ALL_SETTINGS);

        if (value != null) {
            setName(value.getName());
            setSetting(value.getSetting());
            setUnit(value.getUnit());
            setCategory(value.getCategory());
            setShortDesc(value.getShortDesc());
            setExtraDesc(value.getExtraDesc());
            setContext(value.getContext());
            setVartype(value.getVartype());
            setSource(value.getSource());
            setMinVal(value.getMinVal());
            setMaxVal(value.getMaxVal());
            setEnumvals(value.getEnumvals());
            setBootVal(value.getBootVal());
            setResetVal(value.getResetVal());
            setSourcefile(value.getSourcefile());
            setSourceline(value.getSourceline());
            setPendingRestart(value.getPendingRestart());
            resetChangedOnNotNull();
        }
    }
}
