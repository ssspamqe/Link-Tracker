/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.ViewsRecord;

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
public class Views extends TableImpl<ViewsRecord> {

    private static final long serialVersionUID = 1L;

    public static final Views VIEWS = new Views();

    @Override
    @NotNull
    public Class<ViewsRecord> getRecordType() {
        return ViewsRecord.class;
    }

    public final TableField<ViewsRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ViewsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ViewsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ViewsRecord, String> VIEW_DEFINITION = createField(DSL.name("view_definition"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<ViewsRecord, String> CHECK_OPTION = createField(DSL.name("check_option"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<ViewsRecord, String> IS_UPDATABLE = createField(DSL.name("is_updatable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<ViewsRecord, String> IS_INSERTABLE_INTO = createField(DSL.name("is_insertable_into"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<ViewsRecord, String> IS_TRIGGER_UPDATABLE = createField(DSL.name("is_trigger_updatable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<ViewsRecord, String> IS_TRIGGER_DELETABLE = createField(DSL.name("is_trigger_deletable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<ViewsRecord, String> IS_TRIGGER_INSERTABLE_INTO = createField(DSL.name("is_trigger_insertable_into"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private Views(Name alias, Table<ViewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Views(Name alias, Table<ViewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public Views(String alias) {
        this(DSL.name(alias), VIEWS);
    }

    public Views(Name alias) {
        this(alias, VIEWS);
    }

    public Views() {
        this(DSL.name("views"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public Views as(String alias) {
        return new Views(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Views as(Name alias) {
        return new Views(alias, this);
    }

    @Override
    @NotNull
    public Views as(Table<?> alias) {
        return new Views(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public Views rename(String name) {
        return new Views(DSL.name(name), null);
    }

    @Override
    @NotNull
    public Views rename(Name name) {
        return new Views(name, null);
    }

    @Override
    @NotNull
    public Views rename(Table<?> name) {
        return new Views(name.getQualifiedName(), null);
    }
}