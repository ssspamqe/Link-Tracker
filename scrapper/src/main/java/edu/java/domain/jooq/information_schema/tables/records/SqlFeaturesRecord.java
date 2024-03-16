/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.SqlFeatures;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SqlFeaturesRecord extends TableRecordImpl<SqlFeaturesRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.sql_features.feature_id</code>.
     */
    public void setFeatureId(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.sql_features.feature_id</code>.
     */
    @Nullable
    public String getFeatureId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.sql_features.feature_name</code>.
     */
    public void setFeatureName(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.sql_features.feature_name</code>.
     */
    @Nullable
    public String getFeatureName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.sql_features.sub_feature_id</code>.
     */
    public void setSubFeatureId(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.sql_features.sub_feature_id</code>.
     */
    @Nullable
    public String getSubFeatureId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.sql_features.sub_feature_name</code>.
     */
    public void setSubFeatureName(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.sql_features.sub_feature_name</code>.
     */
    @Nullable
    public String getSubFeatureName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.sql_features.is_supported</code>.
     */
    public void setIsSupported(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.sql_features.is_supported</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsSupported() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.sql_features.is_verified_by</code>.
     */
    public void setIsVerifiedBy(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.sql_features.is_verified_by</code>.
     */
    @Nullable
    public String getIsVerifiedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.sql_features.comments</code>.
     */
    public void setComments(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.sql_features.comments</code>.
     */
    @Nullable
    public String getComments() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return SqlFeatures.SQL_FEATURES.FEATURE_ID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return SqlFeatures.SQL_FEATURES.FEATURE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return SqlFeatures.SQL_FEATURES.SUB_FEATURE_ID;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return SqlFeatures.SQL_FEATURES.SUB_FEATURE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return SqlFeatures.SQL_FEATURES.IS_SUPPORTED;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return SqlFeatures.SQL_FEATURES.IS_VERIFIED_BY;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return SqlFeatures.SQL_FEATURES.COMMENTS;
    }

    @Override
    @Nullable
    public String component1() {
        return getFeatureId();
    }

    @Override
    @Nullable
    public String component2() {
        return getFeatureName();
    }

    @Override
    @Nullable
    public String component3() {
        return getSubFeatureId();
    }

    @Override
    @Nullable
    public String component4() {
        return getSubFeatureName();
    }

    @Override
    @Nullable
    public String component5() {
        return getIsSupported();
    }

    @Override
    @Nullable
    public String component6() {
        return getIsVerifiedBy();
    }

    @Override
    @Nullable
    public String component7() {
        return getComments();
    }

    @Override
    @Nullable
    public String value1() {
        return getFeatureId();
    }

    @Override
    @Nullable
    public String value2() {
        return getFeatureName();
    }

    @Override
    @Nullable
    public String value3() {
        return getSubFeatureId();
    }

    @Override
    @Nullable
    public String value4() {
        return getSubFeatureName();
    }

    @Override
    @Nullable
    public String value5() {
        return getIsSupported();
    }

    @Override
    @Nullable
    public String value6() {
        return getIsVerifiedBy();
    }

    @Override
    @Nullable
    public String value7() {
        return getComments();
    }

    @Override
    @NotNull
    public SqlFeaturesRecord value1(@Nullable String value) {
        setFeatureId(value);
        return this;
    }

    @Override
    @NotNull
    public SqlFeaturesRecord value2(@Nullable String value) {
        setFeatureName(value);
        return this;
    }

    @Override
    @NotNull
    public SqlFeaturesRecord value3(@Nullable String value) {
        setSubFeatureId(value);
        return this;
    }

    @Override
    @NotNull
    public SqlFeaturesRecord value4(@Nullable String value) {
        setSubFeatureName(value);
        return this;
    }

    @Override
    @NotNull
    public SqlFeaturesRecord value5(@Nullable String value) {
        setIsSupported(value);
        return this;
    }

    @Override
    @NotNull
    public SqlFeaturesRecord value6(@Nullable String value) {
        setIsVerifiedBy(value);
        return this;
    }

    @Override
    @NotNull
    public SqlFeaturesRecord value7(@Nullable String value) {
        setComments(value);
        return this;
    }

    @Override
    @NotNull
    public SqlFeaturesRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SqlFeaturesRecord
     */
    public SqlFeaturesRecord() {
        super(SqlFeatures.SQL_FEATURES);
    }

    /**
     * Create a detached, initialised SqlFeaturesRecord
     */
    @ConstructorProperties({ "featureId", "featureName", "subFeatureId", "subFeatureName", "isSupported", "isVerifiedBy", "comments" })
    public SqlFeaturesRecord(@Nullable String featureId, @Nullable String featureName, @Nullable String subFeatureId, @Nullable String subFeatureName, @Nullable String isSupported, @Nullable String isVerifiedBy, @Nullable String comments) {
        super(SqlFeatures.SQL_FEATURES);

        setFeatureId(featureId);
        setFeatureName(featureName);
        setSubFeatureId(subFeatureId);
        setSubFeatureName(subFeatureName);
        setIsSupported(isSupported);
        setIsVerifiedBy(isVerifiedBy);
        setComments(comments);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised SqlFeaturesRecord
     */
    public SqlFeaturesRecord(edu.java.domain.jooq.information_schema.tables.pojos.SqlFeatures value) {
        super(SqlFeatures.SQL_FEATURES);

        if (value != null) {
            setFeatureId(value.getFeatureId());
            setFeatureName(value.getFeatureName());
            setSubFeatureId(value.getSubFeatureId());
            setSubFeatureName(value.getSubFeatureName());
            setIsSupported(value.getIsSupported());
            setIsVerifiedBy(value.getIsVerifiedBy());
            setComments(value.getComments());
            resetChangedOnNotNull();
        }
    }
}