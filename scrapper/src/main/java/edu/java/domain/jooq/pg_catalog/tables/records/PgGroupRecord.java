/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGroup;

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
public class PgGroupRecord extends TableRecordImpl<PgGroupRecord> {

    private static final long serialVersionUID = 1L;

    public void setGroname(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getGroname() {
        return (String) get(0);
    }

    public void setGrosysid(@Nullable Long value) {
        set(1, value);
    }

    @Nullable
    public Long getGrosysid() {
        return (Long) get(1);
    }

    public void setGrolist(@Nullable Long[] value) {
        set(2, value);
    }

    @Nullable
    public Long[] getGrolist() {
        return (Long[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgGroupRecord() {
        super(PgGroup.PG_GROUP);
    }

    @ConstructorProperties({ "groname", "grosysid", "grolist" })
    public PgGroupRecord(@Nullable String groname, @Nullable Long grosysid, @Nullable Long[] grolist) {
        super(PgGroup.PG_GROUP);

        setGroname(groname);
        setGrosysid(grosysid);
        setGrolist(grolist);
        resetChangedOnNotNull();
    }

    public PgGroupRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGroup value) {
        super(PgGroup.PG_GROUP);

        if (value != null) {
            setGroname(value.getGroname());
            setGrosysid(value.getGrosysid());
            setGrolist(value.getGrolist());
            resetChangedOnNotNull();
        }
    }
}
