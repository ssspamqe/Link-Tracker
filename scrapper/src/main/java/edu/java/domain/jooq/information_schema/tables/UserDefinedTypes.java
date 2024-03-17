/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.UserDefinedTypesRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class UserDefinedTypes extends TableImpl<UserDefinedTypesRecord> {

    private static final long serialVersionUID = 1L;

    public static final UserDefinedTypes USER_DEFINED_TYPES = new UserDefinedTypes();

    @Override
    @NotNull
    public Class<UserDefinedTypesRecord> getRecordType() {
        return UserDefinedTypesRecord.class;
    }

    public final TableField<UserDefinedTypesRecord, String> USER_DEFINED_TYPE_CATALOG = createField(DSL.name("user_defined_type_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> USER_DEFINED_TYPE_SCHEMA = createField(DSL.name("user_defined_type_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> USER_DEFINED_TYPE_NAME = createField(DSL.name("user_defined_type_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> USER_DEFINED_TYPE_CATEGORY = createField(DSL.name("user_defined_type_category"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> IS_INSTANTIABLE = createField(DSL.name("is_instantiable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> IS_FINAL = createField(DSL.name("is_final"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> ORDERING_FORM = createField(DSL.name("ordering_form"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> ORDERING_CATEGORY = createField(DSL.name("ordering_category"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> ORDERING_ROUTINE_CATALOG = createField(DSL.name("ordering_routine_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> ORDERING_ROUTINE_SCHEMA = createField(DSL.name("ordering_routine_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> ORDERING_ROUTINE_NAME = createField(DSL.name("ordering_routine_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> REFERENCE_TYPE = createField(DSL.name("reference_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> DATA_TYPE = createField(DSL.name("data_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> SOURCE_DTD_IDENTIFIER = createField(DSL.name("source_dtd_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<UserDefinedTypesRecord, String> REF_DTD_IDENTIFIER = createField(DSL.name("ref_dtd_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private UserDefinedTypes(Name alias, Table<UserDefinedTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserDefinedTypes(Name alias, Table<UserDefinedTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public UserDefinedTypes(String alias) {
        this(DSL.name(alias), USER_DEFINED_TYPES);
    }

    public UserDefinedTypes(Name alias) {
        this(alias, USER_DEFINED_TYPES);
    }

    public UserDefinedTypes() {
        this(DSL.name("user_defined_types"), null);
    }

    public <O extends Record> UserDefinedTypes(Table<O> child, ForeignKey<O, UserDefinedTypesRecord> key) {
        super(child, key, USER_DEFINED_TYPES);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public UserDefinedTypes as(String alias) {
        return new UserDefinedTypes(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public UserDefinedTypes as(Name alias) {
        return new UserDefinedTypes(alias, this);
    }

    @Override
    @NotNull
    public UserDefinedTypes as(Table<?> alias) {
        return new UserDefinedTypes(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public UserDefinedTypes rename(String name) {
        return new UserDefinedTypes(DSL.name(name), null);
    }

    @Override
    @NotNull
    public UserDefinedTypes rename(Name name) {
        return new UserDefinedTypes(name, null);
    }

    @Override
    @NotNull
    public UserDefinedTypes rename(Table<?> name) {
        return new UserDefinedTypes(name.getQualifiedName(), null);
    }
}
