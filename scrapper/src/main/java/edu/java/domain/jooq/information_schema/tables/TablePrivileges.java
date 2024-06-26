/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.TablePrivilegesRecord;

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
public class TablePrivileges extends TableImpl<TablePrivilegesRecord> {

    private static final long serialVersionUID = 1L;

    public static final TablePrivileges TABLE_PRIVILEGES = new TablePrivileges();

    @Override
    @NotNull
    public Class<TablePrivilegesRecord> getRecordType() {
        return TablePrivilegesRecord.class;
    }

    public final TableField<TablePrivilegesRecord, String> GRANTOR = createField(DSL.name("grantor"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TablePrivilegesRecord, String> GRANTEE = createField(DSL.name("grantee"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TablePrivilegesRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TablePrivilegesRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TablePrivilegesRecord, String> TABLE_NAME = createField(DSL.name("table_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<TablePrivilegesRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<TablePrivilegesRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    public final TableField<TablePrivilegesRecord, String> WITH_HIERARCHY = createField(DSL.name("with_hierarchy"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private TablePrivileges(Name alias, Table<TablePrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TablePrivileges(Name alias, Table<TablePrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public TablePrivileges(String alias) {
        this(DSL.name(alias), TABLE_PRIVILEGES);
    }

    public TablePrivileges(Name alias) {
        this(alias, TABLE_PRIVILEGES);
    }

    public TablePrivileges() {
        this(DSL.name("table_privileges"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public TablePrivileges as(String alias) {
        return new TablePrivileges(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public TablePrivileges as(Name alias) {
        return new TablePrivileges(alias, this);
    }

    @Override
    @NotNull
    public TablePrivileges as(Table<?> alias) {
        return new TablePrivileges(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public TablePrivileges rename(String name) {
        return new TablePrivileges(DSL.name(name), null);
    }

    @Override
    @NotNull
    public TablePrivileges rename(Name name) {
        return new TablePrivileges(name, null);
    }

    @Override
    @NotNull
    public TablePrivileges rename(Table<?> name) {
        return new TablePrivileges(name.getQualifiedName(), null);
    }
}
