/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.UserMappingsRecord;

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
public class UserMappings extends TableImpl<UserMappingsRecord> {

    private static final long serialVersionUID = 1L;

    public static final UserMappings USER_MAPPINGS = new UserMappings();

    @Override
    @NotNull
    public Class<UserMappingsRecord> getRecordType() {
        return UserMappingsRecord.class;
    }

    public final TableField<UserMappingsRecord, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserMappingsRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserMappingsRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private UserMappings(Name alias, Table<UserMappingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserMappings(Name alias, Table<UserMappingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public UserMappings(String alias) {
        this(DSL.name(alias), USER_MAPPINGS);
    }

    public UserMappings(Name alias) {
        this(alias, USER_MAPPINGS);
    }

    public UserMappings() {
        this(DSL.name("user_mappings"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public UserMappings as(String alias) {
        return new UserMappings(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public UserMappings as(Name alias) {
        return new UserMappings(alias, this);
    }

    @Override
    @NotNull
    public UserMappings as(Table<?> alias) {
        return new UserMappings(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public UserMappings rename(String name) {
        return new UserMappings(DSL.name(name), null);
    }

    @Override
    @NotNull
    public UserMappings rename(Name name) {
        return new UserMappings(name, null);
    }

    @Override
    @NotNull
    public UserMappings rename(Table<?> name) {
        return new UserMappings(name.getQualifiedName(), null);
    }
}
