/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgHbaFileRulesRecord;

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
public class PgHbaFileRules extends TableImpl<PgHbaFileRulesRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgHbaFileRules PG_HBA_FILE_RULES = new PgHbaFileRules();

    @Override
    @NotNull
    public Class<PgHbaFileRulesRecord> getRecordType() {
        return PgHbaFileRulesRecord.class;
    }

    public final TableField<PgHbaFileRulesRecord, Integer> RULE_NUMBER = createField(DSL.name("rule_number"), SQLDataType.INTEGER, this, "");

    public final TableField<PgHbaFileRulesRecord, String> FILE_NAME = createField(DSL.name("file_name"), SQLDataType.CLOB, this, "");

    public final TableField<PgHbaFileRulesRecord, Integer> LINE_NUMBER = createField(DSL.name("line_number"), SQLDataType.INTEGER, this, "");

    public final TableField<PgHbaFileRulesRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.CLOB, this, "");

    public final TableField<PgHbaFileRulesRecord, String[]> DATABASE = createField(DSL.name("database"), SQLDataType.CLOB.array(), this, "");

    public final TableField<PgHbaFileRulesRecord, String[]> USER_NAME = createField(DSL.name("user_name"), SQLDataType.CLOB.array(), this, "");

    public final TableField<PgHbaFileRulesRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.CLOB, this, "");

    public final TableField<PgHbaFileRulesRecord, String> NETMASK = createField(DSL.name("netmask"), SQLDataType.CLOB, this, "");

    public final TableField<PgHbaFileRulesRecord, String> AUTH_METHOD = createField(DSL.name("auth_method"), SQLDataType.CLOB, this, "");

    public final TableField<PgHbaFileRulesRecord, String[]> OPTIONS = createField(DSL.name("options"), SQLDataType.CLOB.array(), this, "");

    public final TableField<PgHbaFileRulesRecord, String> ERROR = createField(DSL.name("error"), SQLDataType.CLOB, this, "");

    private PgHbaFileRules(Name alias, Table<PgHbaFileRulesRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgHbaFileRules(Name alias, Table<PgHbaFileRulesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public PgHbaFileRules(String alias) {
        this(DSL.name(alias), PG_HBA_FILE_RULES);
    }

    public PgHbaFileRules(Name alias) {
        this(alias, PG_HBA_FILE_RULES);
    }

    public PgHbaFileRules() {
        this(DSL.name("pg_hba_file_rules"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgHbaFileRules as(String alias) {
        return new PgHbaFileRules(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgHbaFileRules as(Name alias) {
        return new PgHbaFileRules(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgHbaFileRules as(Table<?> alias) {
        return new PgHbaFileRules(alias.getQualifiedName(), this, parameters);
    }

    @Override
    @NotNull
    public PgHbaFileRules rename(String name) {
        return new PgHbaFileRules(DSL.name(name), null, parameters);
    }

    @Override
    @NotNull
    public PgHbaFileRules rename(Name name) {
        return new PgHbaFileRules(name, null, parameters);
    }

    @Override
    @NotNull
    public PgHbaFileRules rename(Table<?> name) {
        return new PgHbaFileRules(name.getQualifiedName(), null, parameters);
    }

    public PgHbaFileRules call() {
        PgHbaFileRules result = new PgHbaFileRules(DSL.name("pg_hba_file_rules"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
