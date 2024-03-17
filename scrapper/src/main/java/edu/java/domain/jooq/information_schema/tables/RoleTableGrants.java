/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.RoleTableGrantsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
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
public class RoleTableGrants extends TableImpl<RoleTableGrantsRecord> {

    private static final long serialVersionUID = 1L;

    public static final RoleTableGrants ROLE_TABLE_GRANTS = new RoleTableGrants();

    @Override
    @NotNull
    public Class<RoleTableGrantsRecord> getRecordType() {
        return RoleTableGrantsRecord.class;
    }

    public final TableField<RoleTableGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleTableGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleTableGrantsRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleTableGrantsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleTableGrantsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoleTableGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoleTableGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoleTableGrantsRecord, String> WITH_HIERARCHY = createField(DSL.name("with_hierarchy"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleTableGrants(Name alias, Table<RoleTableGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleTableGrants(Name alias, Table<RoleTableGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public RoleTableGrants(String alias) {
        this(DSL.name(alias), ROLE_TABLE_GRANTS);
    }

    public RoleTableGrants(Name alias) {
        this(alias, ROLE_TABLE_GRANTS);
    }

    public RoleTableGrants() {
        this(DSL.name("role_table_grants"), null);
    }

    public <O extends Record> RoleTableGrants(Table<O> child, ForeignKey<O, RoleTableGrantsRecord> key) {
        super(child, key, ROLE_TABLE_GRANTS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public RoleTableGrants as(String alias) {
        return new RoleTableGrants(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public RoleTableGrants as(Name alias) {
        return new RoleTableGrants(alias, this);
    }

    @Override
    @NotNull
    public RoleTableGrants as(Table<?> alias) {
        return new RoleTableGrants(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public RoleTableGrants rename(String name) {
        return new RoleTableGrants(DSL.name(name), null);
    }

    @Override
    @NotNull
    public RoleTableGrants rename(Name name) {
        return new RoleTableGrants(name, null);
    }

    @Override
    @NotNull
    public RoleTableGrants rename(Table<?> name) {
        return new RoleTableGrants(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
