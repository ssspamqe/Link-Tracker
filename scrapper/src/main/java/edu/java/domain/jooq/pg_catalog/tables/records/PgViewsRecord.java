/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgViews;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PgViewsRecord extends TableRecordImpl<PgViewsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_views.schemaname</code>.
     */
    public void setSchemaname(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_views.schemaname</code>.
     */
    @Nullable
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_views.viewname</code>.
     */
    public void setViewname(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_views.viewname</code>.
     */
    @Nullable
    public String getViewname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_views.viewowner</code>.
     */
    public void setViewowner(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_views.viewowner</code>.
     */
    @Nullable
    public String getViewowner() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_views.definition</code>.
     */
    public void setDefinition(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_views.definition</code>.
     */
    @Nullable
    public String getDefinition() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgViews.PG_VIEWS.SCHEMANAME;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgViews.PG_VIEWS.VIEWNAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgViews.PG_VIEWS.VIEWOWNER;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return PgViews.PG_VIEWS.DEFINITION;
    }

    @Override
    @Nullable
    public String component1() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String component2() {
        return getViewname();
    }

    @Override
    @Nullable
    public String component3() {
        return getViewowner();
    }

    @Override
    @Nullable
    public String component4() {
        return getDefinition();
    }

    @Override
    @Nullable
    public String value1() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String value2() {
        return getViewname();
    }

    @Override
    @Nullable
    public String value3() {
        return getViewowner();
    }

    @Override
    @Nullable
    public String value4() {
        return getDefinition();
    }

    @Override
    @NotNull
    public PgViewsRecord value1(@Nullable String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    @NotNull
    public PgViewsRecord value2(@Nullable String value) {
        setViewname(value);
        return this;
    }

    @Override
    @NotNull
    public PgViewsRecord value3(@Nullable String value) {
        setViewowner(value);
        return this;
    }

    @Override
    @NotNull
    public PgViewsRecord value4(@Nullable String value) {
        setDefinition(value);
        return this;
    }

    @Override
    @NotNull
    public PgViewsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgViewsRecord
     */
    public PgViewsRecord() {
        super(PgViews.PG_VIEWS);
    }

    /**
     * Create a detached, initialised PgViewsRecord
     */
    @ConstructorProperties({ "schemaname", "viewname", "viewowner", "definition" })
    public PgViewsRecord(@Nullable String schemaname, @Nullable String viewname, @Nullable String viewowner, @Nullable String definition) {
        super(PgViews.PG_VIEWS);

        setSchemaname(schemaname);
        setViewname(viewname);
        setViewowner(viewowner);
        setDefinition(definition);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgViewsRecord
     */
    public PgViewsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgViews value) {
        super(PgViews.PG_VIEWS);

        if (value != null) {
            setSchemaname(value.getSchemaname());
            setViewname(value.getViewname());
            setViewowner(value.getViewowner());
            setDefinition(value.getDefinition());
            resetChangedOnNotNull();
        }
    }
}