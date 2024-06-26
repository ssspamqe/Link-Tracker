/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.SchemataRecord;

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
public class Schemata extends TableImpl<SchemataRecord> {

    private static final long serialVersionUID = 1L;

    public static final Schemata SCHEMATA = new Schemata();

    @Override
    @NotNull
    public Class<SchemataRecord> getRecordType() {
        return SchemataRecord.class;
    }

    public final TableField<SchemataRecord, String> CATALOG_NAME = createField(DSL.name("catalog_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<SchemataRecord, String> SCHEMA_NAME = createField(DSL.name("schema_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<SchemataRecord, String> SCHEMA_OWNER = createField(DSL.name("schema_owner"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<SchemataRecord, String> DEFAULT_CHARACTER_SET_CATALOG = createField(DSL.name("default_character_set_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<SchemataRecord, String> DEFAULT_CHARACTER_SET_SCHEMA = createField(DSL.name("default_character_set_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<SchemataRecord, String> DEFAULT_CHARACTER_SET_NAME = createField(DSL.name("default_character_set_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<SchemataRecord, String> SQL_PATH = createField(DSL.name("sql_path"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private Schemata(Name alias, Table<SchemataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Schemata(Name alias, Table<SchemataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public Schemata(String alias) {
        this(DSL.name(alias), SCHEMATA);
    }

    public Schemata(Name alias) {
        this(alias, SCHEMATA);
    }

    public Schemata() {
        this(DSL.name("schemata"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public Schemata as(String alias) {
        return new Schemata(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Schemata as(Name alias) {
        return new Schemata(alias, this);
    }

    @Override
    @NotNull
    public Schemata as(Table<?> alias) {
        return new Schemata(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public Schemata rename(String name) {
        return new Schemata(DSL.name(name), null);
    }

    @Override
    @NotNull
    public Schemata rename(Name name) {
        return new Schemata(name, null);
    }

    @Override
    @NotNull
    public Schemata rename(Table<?> name) {
        return new Schemata(name.getQualifiedName(), null);
    }
}
