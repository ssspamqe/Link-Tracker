/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.SqlFeaturesRecord;

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
public class SqlFeatures extends TableImpl<SqlFeaturesRecord> {

    private static final long serialVersionUID = 1L;

    public static final SqlFeatures SQL_FEATURES = new SqlFeatures();

    @Override
    @NotNull
    public Class<SqlFeaturesRecord> getRecordType() {
        return SqlFeaturesRecord.class;
    }

    public final TableField<SqlFeaturesRecord, String> FEATURE_ID = createField(DSL.name("feature_id"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SqlFeaturesRecord, String> FEATURE_NAME = createField(DSL.name("feature_name"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SqlFeaturesRecord, String> SUB_FEATURE_ID = createField(DSL.name("sub_feature_id"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SqlFeaturesRecord, String> SUB_FEATURE_NAME = createField(DSL.name("sub_feature_name"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SqlFeaturesRecord, String> IS_SUPPORTED = createField(DSL.name("is_supported"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<SqlFeaturesRecord, String> IS_VERIFIED_BY = createField(DSL.name("is_verified_by"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SqlFeaturesRecord, String> COMMENTS = createField(DSL.name("comments"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private SqlFeatures(Name alias, Table<SqlFeaturesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlFeatures(Name alias, Table<SqlFeaturesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public SqlFeatures(String alias) {
        this(DSL.name(alias), SQL_FEATURES);
    }

    public SqlFeatures(Name alias) {
        this(alias, SQL_FEATURES);
    }

    public SqlFeatures() {
        this(DSL.name("sql_features"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public SqlFeatures as(String alias) {
        return new SqlFeatures(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public SqlFeatures as(Name alias) {
        return new SqlFeatures(alias, this);
    }

    @Override
    @NotNull
    public SqlFeatures as(Table<?> alias) {
        return new SqlFeatures(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public SqlFeatures rename(String name) {
        return new SqlFeatures(DSL.name(name), null);
    }

    @Override
    @NotNull
    public SqlFeatures rename(Name name) {
        return new SqlFeatures(name, null);
    }

    @Override
    @NotNull
    public SqlFeatures rename(Table<?> name) {
        return new SqlFeatures(name.getQualifiedName(), null);
    }
}
