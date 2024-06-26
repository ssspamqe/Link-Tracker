/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgSequencesRecord;

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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgSequences extends TableImpl<PgSequencesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgSequences PG_SEQUENCES = new PgSequences();

    @Override
    @NotNull
    public Class<PgSequencesRecord> getRecordType() {
        return PgSequencesRecord.class;
    }

    public final TableField<PgSequencesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgSequencesRecord, String> SEQUENCENAME = createField(DSL.name("sequencename"), SQLDataType.VARCHAR, this, "");

    public final TableField<PgSequencesRecord, String> SEQUENCEOWNER = createField(DSL.name("sequenceowner"), SQLDataType.VARCHAR, this, "");

    @Deprecated
    public final TableField<PgSequencesRecord, Object> DATA_TYPE = createField(DSL.name("data_type"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regtype\""), this, "");

    public final TableField<PgSequencesRecord, Long> START_VALUE = createField(DSL.name("start_value"), SQLDataType.BIGINT, this, "");

    public final TableField<PgSequencesRecord, Long> MIN_VALUE = createField(DSL.name("min_value"), SQLDataType.BIGINT, this, "");

    public final TableField<PgSequencesRecord, Long> MAX_VALUE = createField(DSL.name("max_value"), SQLDataType.BIGINT, this, "");

    public final TableField<PgSequencesRecord, Long> INCREMENT_BY = createField(DSL.name("increment_by"), SQLDataType.BIGINT, this, "");

    public final TableField<PgSequencesRecord, Boolean> CYCLE = createField(DSL.name("cycle"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgSequencesRecord, Long> CACHE_SIZE = createField(DSL.name("cache_size"), SQLDataType.BIGINT, this, "");

    public final TableField<PgSequencesRecord, Long> LAST_VALUE = createField(DSL.name("last_value"), SQLDataType.BIGINT, this, "");

    private PgSequences(Name alias, Table<PgSequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSequences(Name alias, Table<PgSequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgSequences(String alias) {
        this(DSL.name(alias), PG_SEQUENCES);
    }

    public PgSequences(Name alias) {
        this(alias, PG_SEQUENCES);
    }

    public PgSequences() {
        this(DSL.name("pg_sequences"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgSequences as(String alias) {
        return new PgSequences(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgSequences as(Name alias) {
        return new PgSequences(alias, this);
    }

    @Override
    @NotNull
    public PgSequences as(Table<?> alias) {
        return new PgSequences(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgSequences rename(String name) {
        return new PgSequences(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgSequences rename(Name name) {
        return new PgSequences(name, null);
    }

    @Override
    @NotNull
    public PgSequences rename(Table<?> name) {
        return new PgSequences(name.getQualifiedName(), null);
    }
}
