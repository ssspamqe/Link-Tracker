/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.ForeignDataWrapperOptionsRecord;

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
public class ForeignDataWrapperOptions extends TableImpl<ForeignDataWrapperOptionsRecord> {

    private static final long serialVersionUID = 1L;

    public static final ForeignDataWrapperOptions FOREIGN_DATA_WRAPPER_OPTIONS = new ForeignDataWrapperOptions();

    @Override
    @NotNull
    public Class<ForeignDataWrapperOptionsRecord> getRecordType() {
        return ForeignDataWrapperOptionsRecord.class;
    }

    public final TableField<ForeignDataWrapperOptionsRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField(DSL.name("foreign_data_wrapper_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignDataWrapperOptionsRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField(DSL.name("foreign_data_wrapper_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignDataWrapperOptionsRecord, String> OPTION_NAME = createField(DSL.name("option_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ForeignDataWrapperOptionsRecord, String> OPTION_VALUE = createField(DSL.name("option_value"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private ForeignDataWrapperOptions(Name alias, Table<ForeignDataWrapperOptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignDataWrapperOptions(Name alias, Table<ForeignDataWrapperOptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public ForeignDataWrapperOptions(String alias) {
        this(DSL.name(alias), FOREIGN_DATA_WRAPPER_OPTIONS);
    }

    public ForeignDataWrapperOptions(Name alias) {
        this(alias, FOREIGN_DATA_WRAPPER_OPTIONS);
    }

    public ForeignDataWrapperOptions() {
        this(DSL.name("foreign_data_wrapper_options"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public ForeignDataWrapperOptions as(String alias) {
        return new ForeignDataWrapperOptions(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public ForeignDataWrapperOptions as(Name alias) {
        return new ForeignDataWrapperOptions(alias, this);
    }

    @Override
    @NotNull
    public ForeignDataWrapperOptions as(Table<?> alias) {
        return new ForeignDataWrapperOptions(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public ForeignDataWrapperOptions rename(String name) {
        return new ForeignDataWrapperOptions(DSL.name(name), null);
    }

    @Override
    @NotNull
    public ForeignDataWrapperOptions rename(Name name) {
        return new ForeignDataWrapperOptions(name, null);
    }

    @Override
    @NotNull
    public ForeignDataWrapperOptions rename(Table<?> name) {
        return new ForeignDataWrapperOptions(name.getQualifiedName(), null);
    }
}
