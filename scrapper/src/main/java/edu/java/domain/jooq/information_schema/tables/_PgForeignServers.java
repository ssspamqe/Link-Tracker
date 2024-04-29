/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records._PgForeignServersRecord;

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
public class _PgForeignServers extends TableImpl<_PgForeignServersRecord> {

    private static final long serialVersionUID = 1L;

    public static final _PgForeignServers _PG_FOREIGN_SERVERS = new _PgForeignServers();

    @Override
    @NotNull
    public Class<_PgForeignServersRecord> getRecordType() {
        return _PgForeignServersRecord.class;
    }

    public final TableField<_PgForeignServersRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT, this, "");

    public final TableField<_PgForeignServersRecord, String[]> SRVOPTIONS = createField(DSL.name("srvoptions"), SQLDataType.CLOB.array(), this, "");

    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField(DSL.name("foreign_data_wrapper_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField(DSL.name("foreign_data_wrapper_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_TYPE = createField(DSL.name("foreign_server_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_VERSION = createField(DSL.name("foreign_server_version"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<_PgForeignServersRecord, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public _PgForeignServers(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_SERVERS);
    }

    public _PgForeignServers(Name alias) {
        this(alias, _PG_FOREIGN_SERVERS);
    }

    public _PgForeignServers() {
        this(DSL.name("_pg_foreign_servers"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public _PgForeignServers as(String alias) {
        return new _PgForeignServers(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public _PgForeignServers as(Name alias) {
        return new _PgForeignServers(alias, this);
    }

    @Override
    @NotNull
    public _PgForeignServers as(Table<?> alias) {
        return new _PgForeignServers(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public _PgForeignServers rename(String name) {
        return new _PgForeignServers(DSL.name(name), null);
    }

    @Override
    @NotNull
    public _PgForeignServers rename(Name name) {
        return new _PgForeignServers(name, null);
    }

    @Override
    @NotNull
    public _PgForeignServers rename(Table<?> name) {
        return new _PgForeignServers(name.getQualifiedName(), null);
    }
}