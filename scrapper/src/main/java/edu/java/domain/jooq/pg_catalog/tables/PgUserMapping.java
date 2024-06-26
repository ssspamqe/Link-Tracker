/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgUserMappingRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgUserMapping extends TableImpl<PgUserMappingRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgUserMapping PG_USER_MAPPING = new PgUserMapping();

    @Override
    @NotNull
    public Class<PgUserMappingRecord> getRecordType() {
        return PgUserMappingRecord.class;
    }

    public final TableField<PgUserMappingRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgUserMappingRecord, Long> UMUSER = createField(DSL.name("umuser"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgUserMappingRecord, Long> UMSERVER = createField(DSL.name("umserver"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgUserMappingRecord, String[]> UMOPTIONS = createField(DSL.name("umoptions"), SQLDataType.CLOB.array(), this, "");

    private PgUserMapping(Name alias, Table<PgUserMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgUserMapping(Name alias, Table<PgUserMappingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgUserMapping(String alias) {
        this(DSL.name(alias), PG_USER_MAPPING);
    }

    public PgUserMapping(Name alias) {
        this(alias, PG_USER_MAPPING);
    }

    public PgUserMapping() {
        this(DSL.name("pg_user_mapping"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgUserMapping as(String alias) {
        return new PgUserMapping(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgUserMapping as(Name alias) {
        return new PgUserMapping(alias, this);
    }

    @Override
    @NotNull
    public PgUserMapping as(Table<?> alias) {
        return new PgUserMapping(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgUserMapping rename(String name) {
        return new PgUserMapping(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgUserMapping rename(Name name) {
        return new PgUserMapping(name, null);
    }

    @Override
    @NotNull
    public PgUserMapping rename(Table<?> name) {
        return new PgUserMapping(name.getQualifiedName(), null);
    }
}
