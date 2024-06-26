/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgPublicationRecord;

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
public class PgPublication extends TableImpl<PgPublicationRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgPublication PG_PUBLICATION = new PgPublication();

    @Override
    @NotNull
    public Class<PgPublicationRecord> getRecordType() {
        return PgPublicationRecord.class;
    }

    public final TableField<PgPublicationRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgPublicationRecord, String> PUBNAME = createField(DSL.name("pubname"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgPublicationRecord, Long> PUBOWNER = createField(DSL.name("pubowner"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgPublicationRecord, Boolean> PUBALLTABLES = createField(DSL.name("puballtables"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgPublicationRecord, Boolean> PUBINSERT = createField(DSL.name("pubinsert"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgPublicationRecord, Boolean> PUBUPDATE = createField(DSL.name("pubupdate"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgPublicationRecord, Boolean> PUBDELETE = createField(DSL.name("pubdelete"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgPublicationRecord, Boolean> PUBTRUNCATE = createField(DSL.name("pubtruncate"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgPublicationRecord, Boolean> PUBVIAROOT = createField(DSL.name("pubviaroot"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private PgPublication(Name alias, Table<PgPublicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPublication(Name alias, Table<PgPublicationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgPublication(String alias) {
        this(DSL.name(alias), PG_PUBLICATION);
    }

    public PgPublication(Name alias) {
        this(alias, PG_PUBLICATION);
    }

    public PgPublication() {
        this(DSL.name("pg_publication"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgPublication as(String alias) {
        return new PgPublication(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgPublication as(Name alias) {
        return new PgPublication(alias, this);
    }

    @Override
    @NotNull
    public PgPublication as(Table<?> alias) {
        return new PgPublication(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgPublication rename(String name) {
        return new PgPublication(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgPublication rename(Name name) {
        return new PgPublication(name, null);
    }

    @Override
    @NotNull
    public PgPublication rename(Table<?> name) {
        return new PgPublication(name.getQualifiedName(), null);
    }
}
