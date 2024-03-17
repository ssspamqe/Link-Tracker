/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.TriggersRecord;

import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function17;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row17;
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
public class Triggers extends TableImpl<TriggersRecord> {

    private static final long serialVersionUID = 1L;

    public static final Triggers TRIGGERS = new Triggers();

    @Override
    @NotNull
    public Class<TriggersRecord> getRecordType() {
        return TriggersRecord.class;
    }

    public final TableField<TriggersRecord, String> TRIGGER_CATALOG = createField(DSL.name("trigger_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, String> TRIGGER_SCHEMA = createField(DSL.name("trigger_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, String> TRIGGER_NAME = createField(DSL.name("trigger_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, String> EVENT_MANIPULATION = createField(DSL.name("event_manipulation"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<TriggersRecord, String> EVENT_OBJECT_CATALOG = createField(DSL.name("event_object_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, String> EVENT_OBJECT_SCHEMA = createField(DSL.name("event_object_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, String> EVENT_OBJECT_TABLE = createField(DSL.name("event_object_table"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, Integer> ACTION_ORDER = createField(DSL.name("action_order"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<TriggersRecord, String> ACTION_CONDITION = createField(DSL.name("action_condition"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<TriggersRecord, String> ACTION_STATEMENT = createField(DSL.name("action_statement"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<TriggersRecord, String> ACTION_ORIENTATION = createField(DSL.name("action_orientation"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<TriggersRecord, String> ACTION_TIMING = createField(DSL.name("action_timing"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<TriggersRecord, String> ACTION_REFERENCE_OLD_TABLE = createField(DSL.name("action_reference_old_table"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, String> ACTION_REFERENCE_NEW_TABLE = createField(DSL.name("action_reference_new_table"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, String> ACTION_REFERENCE_OLD_ROW = createField(DSL.name("action_reference_old_row"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, String> ACTION_REFERENCE_NEW_ROW = createField(DSL.name("action_reference_new_row"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TriggersRecord, OffsetDateTime> CREATED = createField(DSL.name("created"), edu.java.domain.jooq.information_schema.Domains.TIME_STAMP.getDataType(), this, "");

    private Triggers(Name alias, Table<TriggersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Triggers(Name alias, Table<TriggersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public Triggers(String alias) {
        this(DSL.name(alias), TRIGGERS);
    }

    public Triggers(Name alias) {
        this(alias, TRIGGERS);
    }

    public Triggers() {
        this(DSL.name("triggers"), null);
    }

    public <O extends Record> Triggers(Table<O> child, ForeignKey<O, TriggersRecord> key) {
        super(child, key, TRIGGERS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public Triggers as(String alias) {
        return new Triggers(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Triggers as(Name alias) {
        return new Triggers(alias, this);
    }

    @Override
    @NotNull
    public Triggers as(Table<?> alias) {
        return new Triggers(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public Triggers rename(String name) {
        return new Triggers(DSL.name(name), null);
    }

    @Override
    @NotNull
    public Triggers rename(Name name) {
        return new Triggers(name, null);
    }

    @Override
    @NotNull
    public Triggers rename(Table<?> name) {
        return new Triggers(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row17<String, String, String, String, String, String, String, Integer, String, String, String, String, String, String, String, String, OffsetDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function17<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function17<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
