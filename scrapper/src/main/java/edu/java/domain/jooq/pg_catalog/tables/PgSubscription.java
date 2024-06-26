/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgSubscriptionRecord;

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
public class PgSubscription extends TableImpl<PgSubscriptionRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgSubscription PG_SUBSCRIPTION = new PgSubscription();

    @Override
    @NotNull
    public Class<PgSubscriptionRecord> getRecordType() {
        return PgSubscriptionRecord.class;
    }

    public final TableField<PgSubscriptionRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, Long> SUBDBID = createField(DSL.name("subdbid"), SQLDataType.BIGINT.nullable(false), this, "");

    @Deprecated
    public final TableField<PgSubscriptionRecord, Object> SUBSKIPLSN = createField(DSL.name("subskiplsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"").nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, String> SUBNAME = createField(DSL.name("subname"), SQLDataType.VARCHAR.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, Long> SUBOWNER = createField(DSL.name("subowner"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, Boolean> SUBENABLED = createField(DSL.name("subenabled"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, Boolean> SUBBINARY = createField(DSL.name("subbinary"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, String> SUBSTREAM = createField(DSL.name("substream"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, String> SUBTWOPHASESTATE = createField(DSL.name("subtwophasestate"), SQLDataType.CHAR.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, Boolean> SUBDISABLEONERR = createField(DSL.name("subdisableonerr"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, Boolean> SUBPASSWORDREQUIRED = createField(DSL.name("subpasswordrequired"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, Boolean> SUBRUNASOWNER = createField(DSL.name("subrunasowner"), SQLDataType.BOOLEAN.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, String> SUBCONNINFO = createField(DSL.name("subconninfo"), SQLDataType.CLOB.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, String> SUBSLOTNAME = createField(DSL.name("subslotname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgSubscriptionRecord, String> SUBSYNCCOMMIT = createField(DSL.name("subsynccommit"), SQLDataType.CLOB.nullable(false), this, "");

    public final TableField<PgSubscriptionRecord, String[]> SUBPUBLICATIONS = createField(DSL.name("subpublications"), SQLDataType.CLOB.nullable(false).array(), this, "");

    public final TableField<PgSubscriptionRecord, String> SUBORIGIN = createField(DSL.name("suborigin"), SQLDataType.CLOB, this, "");

    private PgSubscription(Name alias, Table<PgSubscriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSubscription(Name alias, Table<PgSubscriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgSubscription(String alias) {
        this(DSL.name(alias), PG_SUBSCRIPTION);
    }

    public PgSubscription(Name alias) {
        this(alias, PG_SUBSCRIPTION);
    }

    public PgSubscription() {
        this(DSL.name("pg_subscription"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgSubscription as(String alias) {
        return new PgSubscription(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgSubscription as(Name alias) {
        return new PgSubscription(alias, this);
    }

    @Override
    @NotNull
    public PgSubscription as(Table<?> alias) {
        return new PgSubscription(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgSubscription rename(String name) {
        return new PgSubscription(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgSubscription rename(Name name) {
        return new PgSubscription(name, null);
    }

    @Override
    @NotNull
    public PgSubscription rename(Table<?> name) {
        return new PgSubscription(name.getQualifiedName(), null);
    }
}
