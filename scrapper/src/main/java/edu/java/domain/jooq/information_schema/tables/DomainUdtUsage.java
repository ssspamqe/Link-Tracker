/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.DomainUdtUsageRecord;

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
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DomainUdtUsage extends TableImpl<DomainUdtUsageRecord> {

    private static final long serialVersionUID = 1L;

    public static final DomainUdtUsage DOMAIN_UDT_USAGE = new DomainUdtUsage();

    @Override
    @NotNull
    public Class<DomainUdtUsageRecord> getRecordType() {
        return DomainUdtUsageRecord.class;
    }

    public final TableField<DomainUdtUsageRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<DomainUdtUsageRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<DomainUdtUsageRecord, String> UDT_NAME = createField(DSL.name("udt_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<DomainUdtUsageRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<DomainUdtUsageRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<DomainUdtUsageRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private DomainUdtUsage(Name alias, Table<DomainUdtUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private DomainUdtUsage(Name alias, Table<DomainUdtUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public DomainUdtUsage(String alias) {
        this(DSL.name(alias), DOMAIN_UDT_USAGE);
    }

    public DomainUdtUsage(Name alias) {
        this(alias, DOMAIN_UDT_USAGE);
    }

    public DomainUdtUsage() {
        this(DSL.name("domain_udt_usage"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public DomainUdtUsage as(String alias) {
        return new DomainUdtUsage(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public DomainUdtUsage as(Name alias) {
        return new DomainUdtUsage(alias, this);
    }

    @Override
    @NotNull
    public DomainUdtUsage as(Table<?> alias) {
        return new DomainUdtUsage(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public DomainUdtUsage rename(String name) {
        return new DomainUdtUsage(DSL.name(name), null);
    }

    @Override
    @NotNull
    public DomainUdtUsage rename(Name name) {
        return new DomainUdtUsage(name, null);
    }

    @Override
    @NotNull
    public DomainUdtUsage rename(Table<?> name) {
        return new DomainUdtUsage(name.getQualifiedName(), null);
    }
}
