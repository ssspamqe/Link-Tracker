/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgPreparedStatementsRecord;

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
public class PgPreparedStatements extends TableImpl<PgPreparedStatementsRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgPreparedStatements PG_PREPARED_STATEMENTS = new PgPreparedStatements();

    @Override
    @NotNull
    public Class<PgPreparedStatementsRecord> getRecordType() {
        return PgPreparedStatementsRecord.class;
    }

    public final TableField<PgPreparedStatementsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    public final TableField<PgPreparedStatementsRecord, String> STATEMENT = createField(DSL.name("statement"), SQLDataType.CLOB, this, "");

    public final TableField<PgPreparedStatementsRecord, OffsetDateTime> PREPARE_TIME = createField(DSL.name("prepare_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    public final TableField<PgPreparedStatementsRecord, Object[]> PARAMETER_TYPES = createField(DSL.name("parameter_types"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regtype\"").array(), this, "");

    public final TableField<PgPreparedStatementsRecord, Object[]> RESULT_TYPES = createField(DSL.name("result_types"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regtype\"").array(), this, "");

    public final TableField<PgPreparedStatementsRecord, Boolean> FROM_SQL = createField(DSL.name("from_sql"), SQLDataType.BOOLEAN, this, "");

    public final TableField<PgPreparedStatementsRecord, Long> GENERIC_PLANS = createField(DSL.name("generic_plans"), SQLDataType.BIGINT, this, "");

    public final TableField<PgPreparedStatementsRecord, Long> CUSTOM_PLANS = createField(DSL.name("custom_plans"), SQLDataType.BIGINT, this, "");

    private PgPreparedStatements(Name alias, Table<PgPreparedStatementsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPreparedStatements(Name alias, Table<PgPreparedStatementsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public PgPreparedStatements(String alias) {
        this(DSL.name(alias), PG_PREPARED_STATEMENTS);
    }

    public PgPreparedStatements(Name alias) {
        this(alias, PG_PREPARED_STATEMENTS);
    }

    public PgPreparedStatements() {
        this(DSL.name("pg_prepared_statements"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgPreparedStatements as(String alias) {
        return new PgPreparedStatements(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgPreparedStatements as(Name alias) {
        return new PgPreparedStatements(alias, this);
    }

    @Override
    @NotNull
    public PgPreparedStatements as(Table<?> alias) {
        return new PgPreparedStatements(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgPreparedStatements rename(String name) {
        return new PgPreparedStatements(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgPreparedStatements rename(Name name) {
        return new PgPreparedStatements(name, null);
    }

    @Override
    @NotNull
    public PgPreparedStatements rename(Table<?> name) {
        return new PgPreparedStatements(name.getQualifiedName(), null);
    }
}
