/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.CheckConstraintRoutineUsageRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
public class CheckConstraintRoutineUsage extends TableImpl<CheckConstraintRoutineUsageRecord> {

    private static final long serialVersionUID = 1L;

    public static final CheckConstraintRoutineUsage CHECK_CONSTRAINT_ROUTINE_USAGE = new CheckConstraintRoutineUsage();

    @Override
    @NotNull
    public Class<CheckConstraintRoutineUsageRecord> getRecordType() {
        return CheckConstraintRoutineUsageRecord.class;
    }

    public final TableField<CheckConstraintRoutineUsageRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<CheckConstraintRoutineUsageRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<CheckConstraintRoutineUsageRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<CheckConstraintRoutineUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<CheckConstraintRoutineUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<CheckConstraintRoutineUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private CheckConstraintRoutineUsage(Name alias, Table<CheckConstraintRoutineUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private CheckConstraintRoutineUsage(Name alias, Table<CheckConstraintRoutineUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public CheckConstraintRoutineUsage(String alias) {
        this(DSL.name(alias), CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    public CheckConstraintRoutineUsage(Name alias) {
        this(alias, CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    public CheckConstraintRoutineUsage() {
        this(DSL.name("check_constraint_routine_usage"), null);
    }

    public <O extends Record> CheckConstraintRoutineUsage(Table<O> child, ForeignKey<O, CheckConstraintRoutineUsageRecord> key) {
        super(child, key, CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsage as(String alias) {
        return new CheckConstraintRoutineUsage(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsage as(Name alias) {
        return new CheckConstraintRoutineUsage(alias, this);
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsage as(Table<?> alias) {
        return new CheckConstraintRoutineUsage(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsage rename(String name) {
        return new CheckConstraintRoutineUsage(DSL.name(name), null);
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsage rename(Name name) {
        return new CheckConstraintRoutineUsage(name, null);
    }

    @Override
    @NotNull
    public CheckConstraintRoutineUsage rename(Table<?> name) {
        return new CheckConstraintRoutineUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
