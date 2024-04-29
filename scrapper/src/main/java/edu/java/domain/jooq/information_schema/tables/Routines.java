/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.RoutinesRecord;

import java.time.OffsetDateTime;

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
public class Routines extends TableImpl<RoutinesRecord> {

    private static final long serialVersionUID = 1L;

    public static final Routines ROUTINES = new Routines();

    @Override
    @NotNull
    public Class<RoutinesRecord> getRecordType() {
        return RoutinesRecord.class;
    }

    public final TableField<RoutinesRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> ROUTINE_TYPE = createField(DSL.name("routine_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> MODULE_CATALOG = createField(DSL.name("module_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> MODULE_SCHEMA = createField(DSL.name("module_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> MODULE_NAME = createField(DSL.name("module_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> UDT_NAME = createField(DSL.name("udt_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> DATA_TYPE = createField(DSL.name("data_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> TYPE_UDT_CATALOG = createField(DSL.name("type_udt_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> TYPE_UDT_SCHEMA = createField(DSL.name("type_udt_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> TYPE_UDT_NAME = createField(DSL.name("type_udt_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> ROUTINE_BODY = createField(DSL.name("routine_body"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> ROUTINE_DEFINITION = createField(DSL.name("routine_definition"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> EXTERNAL_NAME = createField(DSL.name("external_name"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> EXTERNAL_LANGUAGE = createField(DSL.name("external_language"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> PARAMETER_STYLE = createField(DSL.name("parameter_style"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> IS_DETERMINISTIC = createField(DSL.name("is_deterministic"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> SQL_DATA_ACCESS = createField(DSL.name("sql_data_access"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> IS_NULL_CALL = createField(DSL.name("is_null_call"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> SQL_PATH = createField(DSL.name("sql_path"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> SCHEMA_LEVEL_ROUTINE = createField(DSL.name("schema_level_routine"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> MAX_DYNAMIC_RESULT_SETS = createField(DSL.name("max_dynamic_result_sets"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> IS_USER_DEFINED_CAST = createField(DSL.name("is_user_defined_cast"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> IS_IMPLICITLY_INVOCABLE = createField(DSL.name("is_implicitly_invocable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> SECURITY_TYPE = createField(DSL.name("security_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_CATALOG = createField(DSL.name("to_sql_specific_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_SCHEMA = createField(DSL.name("to_sql_specific_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_NAME = createField(DSL.name("to_sql_specific_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> AS_LOCATOR = createField(DSL.name("as_locator"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoutinesRecord, OffsetDateTime> CREATED = createField(DSL.name("created"), edu.java.domain.jooq.information_schema.Domains.TIME_STAMP.getDataType(), this, "");

    public final TableField<RoutinesRecord, OffsetDateTime> LAST_ALTERED = createField(DSL.name("last_altered"), edu.java.domain.jooq.information_schema.Domains.TIME_STAMP.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> NEW_SAVEPOINT_LEVEL = createField(DSL.name("new_savepoint_level"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> IS_UDT_DEPENDENT = createField(DSL.name("is_udt_dependent"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_FROM_DATA_TYPE = createField(DSL.name("result_cast_from_data_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_AS_LOCATOR = createField(DSL.name("result_cast_as_locator"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> RESULT_CAST_CHAR_MAX_LENGTH = createField(DSL.name("result_cast_char_max_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> RESULT_CAST_CHAR_OCTET_LENGTH = createField(DSL.name("result_cast_char_octet_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_CATALOG = createField(DSL.name("result_cast_char_set_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_SCHEMA = createField(DSL.name("result_cast_char_set_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_NAME = createField(DSL.name("result_cast_char_set_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_CATALOG = createField(DSL.name("result_cast_collation_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_SCHEMA = createField(DSL.name("result_cast_collation_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_NAME = createField(DSL.name("result_cast_collation_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_PRECISION = createField(DSL.name("result_cast_numeric_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_PRECISION_RADIX = createField(DSL.name("result_cast_numeric_precision_radix"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_SCALE = createField(DSL.name("result_cast_numeric_scale"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> RESULT_CAST_DATETIME_PRECISION = createField(DSL.name("result_cast_datetime_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_INTERVAL_TYPE = createField(DSL.name("result_cast_interval_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> RESULT_CAST_INTERVAL_PRECISION = createField(DSL.name("result_cast_interval_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_CATALOG = createField(DSL.name("result_cast_type_udt_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_SCHEMA = createField(DSL.name("result_cast_type_udt_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_NAME = createField(DSL.name("result_cast_type_udt_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_CATALOG = createField(DSL.name("result_cast_scope_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_SCHEMA = createField(DSL.name("result_cast_scope_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_NAME = createField(DSL.name("result_cast_scope_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<RoutinesRecord, Integer> RESULT_CAST_MAXIMUM_CARDINALITY = createField(DSL.name("result_cast_maximum_cardinality"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<RoutinesRecord, String> RESULT_CAST_DTD_IDENTIFIER = createField(DSL.name("result_cast_dtd_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private Routines(Name alias, Table<RoutinesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Routines(Name alias, Table<RoutinesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public Routines(String alias) {
        this(DSL.name(alias), ROUTINES);
    }

    public Routines(Name alias) {
        this(alias, ROUTINES);
    }

    public Routines() {
        this(DSL.name("routines"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public Routines as(String alias) {
        return new Routines(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Routines as(Name alias) {
        return new Routines(alias, this);
    }

    @Override
    @NotNull
    public Routines as(Table<?> alias) {
        return new Routines(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public Routines rename(String name) {
        return new Routines(DSL.name(name), null);
    }

    @Override
    @NotNull
    public Routines rename(Name name) {
        return new Routines(name, null);
    }

    @Override
    @NotNull
    public Routines rename(Table<?> name) {
        return new Routines(name.getQualifiedName(), null);
    }
}