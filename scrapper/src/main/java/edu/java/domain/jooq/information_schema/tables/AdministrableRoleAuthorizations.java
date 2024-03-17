/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.AdministrableRoleAuthorizationsRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
public class AdministrableRoleAuthorizations extends TableImpl<AdministrableRoleAuthorizationsRecord> {

    private static final long serialVersionUID = 1L;

    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = new AdministrableRoleAuthorizations();

    @Override
    @NotNull
    public Class<AdministrableRoleAuthorizationsRecord> getRecordType() {
        return AdministrableRoleAuthorizationsRecord.class;
    }

    public final TableField<AdministrableRoleAuthorizationsRecord, String> GRANTEE = createField(DSL.name("grantee"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<AdministrableRoleAuthorizationsRecord, String> ROLE_NAME = createField(DSL.name("role_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public AdministrableRoleAuthorizations(String alias) {
        this(DSL.name(alias), ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    public AdministrableRoleAuthorizations(Name alias) {
        this(alias, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    public AdministrableRoleAuthorizations() {
        this(DSL.name("administrable_role_authorizations"), null);
    }

    public <O extends Record> AdministrableRoleAuthorizations(Table<O> child, ForeignKey<O, AdministrableRoleAuthorizationsRecord> key) {
        super(child, key, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizations as(String alias) {
        return new AdministrableRoleAuthorizations(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizations as(Name alias) {
        return new AdministrableRoleAuthorizations(alias, this);
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizations as(Table<?> alias) {
        return new AdministrableRoleAuthorizations(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizations rename(String name) {
        return new AdministrableRoleAuthorizations(DSL.name(name), null);
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizations rename(Name name) {
        return new AdministrableRoleAuthorizations(name, null);
    }

    @Override
    @NotNull
    public AdministrableRoleAuthorizations rename(Table<?> name) {
        return new AdministrableRoleAuthorizations(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function3<? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
