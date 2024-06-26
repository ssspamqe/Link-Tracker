/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.SequencesRecord;

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
public class Sequences extends TableImpl<SequencesRecord> {

    private static final long serialVersionUID = 1L;

    public static final Sequences SEQUENCES = new Sequences();

    @Override
    @NotNull
    public Class<SequencesRecord> getRecordType() {
        return SequencesRecord.class;
    }

    public final TableField<SequencesRecord, String> SEQUENCE_CATALOG = createField(DSL.name("sequence_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<SequencesRecord, String> SEQUENCE_SCHEMA = createField(DSL.name("sequence_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<SequencesRecord, String> SEQUENCE_NAME = createField(DSL.name("sequence_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<SequencesRecord, String> DATA_TYPE = createField(DSL.name("data_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SequencesRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<SequencesRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<SequencesRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<SequencesRecord, String> START_VALUE = createField(DSL.name("start_value"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SequencesRecord, String> MINIMUM_VALUE = createField(DSL.name("minimum_value"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SequencesRecord, String> MAXIMUM_VALUE = createField(DSL.name("maximum_value"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SequencesRecord, String> INCREMENT = createField(DSL.name("increment"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<SequencesRecord, String> CYCLE_OPTION = createField(DSL.name("cycle_option"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private Sequences(Name alias, Table<SequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sequences(Name alias, Table<SequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public Sequences(String alias) {
        this(DSL.name(alias), SEQUENCES);
    }

    public Sequences(Name alias) {
        this(alias, SEQUENCES);
    }

    public Sequences() {
        this(DSL.name("sequences"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public Sequences as(String alias) {
        return new Sequences(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Sequences as(Name alias) {
        return new Sequences(alias, this);
    }

    @Override
    @NotNull
    public Sequences as(Table<?> alias) {
        return new Sequences(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public Sequences rename(String name) {
        return new Sequences(DSL.name(name), null);
    }

    @Override
    @NotNull
    public Sequences rename(Name name) {
        return new Sequences(name, null);
    }

    @Override
    @NotNull
    public Sequences rename(Table<?> name) {
        return new Sequences(name.getQualifiedName(), null);
    }
}
