/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgSequenceRecord;

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
public class PgSequence extends TableImpl<PgSequenceRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgSequence PG_SEQUENCE = new PgSequence();

    @Override
    @NotNull
    public Class<PgSequenceRecord> getRecordType() {
        return PgSequenceRecord.class;
    }

    public final TableField<PgSequenceRecord, Long> SEQRELID = createField(DSL.name("seqrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSequenceRecord, Long> SEQTYPID = createField(DSL.name("seqtypid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSequenceRecord, Long> SEQSTART = createField(DSL.name("seqstart"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSequenceRecord, Long> SEQINCREMENT = createField(DSL.name("seqincrement"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSequenceRecord, Long> SEQMAX = createField(DSL.name("seqmax"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSequenceRecord, Long> SEQMIN = createField(DSL.name("seqmin"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSequenceRecord, Long> SEQCACHE = createField(DSL.name("seqcache"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgSequenceRecord, Boolean> SEQCYCLE = createField(DSL.name("seqcycle"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private PgSequence(Name alias, Table<PgSequenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSequence(Name alias, Table<PgSequenceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgSequence(String alias) {
        this(DSL.name(alias), PG_SEQUENCE);
    }

    public PgSequence(Name alias) {
        this(alias, PG_SEQUENCE);
    }

    public PgSequence() {
        this(DSL.name("pg_sequence"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgSequence as(String alias) {
        return new PgSequence(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgSequence as(Name alias) {
        return new PgSequence(alias, this);
    }

    @Override
    @NotNull
    public PgSequence as(Table<?> alias) {
        return new PgSequence(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgSequence rename(String name) {
        return new PgSequence(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgSequence rename(Name name) {
        return new PgSequence(name, null);
    }

    @Override
    @NotNull
    public PgSequence rename(Table<?> name) {
        return new PgSequence(name.getQualifiedName(), null);
    }
}
