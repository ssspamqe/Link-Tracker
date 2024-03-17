/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgPublicationRelRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
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
public class PgPublicationRel extends TableImpl<PgPublicationRelRecord> {

    private static final long serialVersionUID = 1L;

    public static final PgPublicationRel PG_PUBLICATION_REL = new PgPublicationRel();

    @Override
    @NotNull
    public Class<PgPublicationRelRecord> getRecordType() {
        return PgPublicationRelRecord.class;
    }

    public final TableField<PgPublicationRelRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgPublicationRelRecord, Long> PRPUBID = createField(DSL.name("prpubid"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<PgPublicationRelRecord, Long> PRRELID = createField(DSL.name("prrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    @Deprecated
    public final TableField<PgPublicationRelRecord, Object> PRQUAL = createField(DSL.name("prqual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    public final TableField<PgPublicationRelRecord, Object[]> PRATTRS = createField(DSL.name("prattrs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").array(), this, "");

    private PgPublicationRel(Name alias, Table<PgPublicationRelRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPublicationRel(Name alias, Table<PgPublicationRelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public PgPublicationRel(String alias) {
        this(DSL.name(alias), PG_PUBLICATION_REL);
    }

    public PgPublicationRel(Name alias) {
        this(alias, PG_PUBLICATION_REL);
    }

    public PgPublicationRel() {
        this(DSL.name("pg_publication_rel"), null);
    }

    public <O extends Record> PgPublicationRel(Table<O> child, ForeignKey<O, PgPublicationRelRecord> key) {
        super(child, key, PG_PUBLICATION_REL);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgPublicationRelRecord> getPrimaryKey() {
        return Keys.PG_PUBLICATION_REL_OID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgPublicationRelRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_PUBLICATION_REL_PRRELID_PRPUBID_INDEX);
    }

    @Override
    @NotNull
    public PgPublicationRel as(String alias) {
        return new PgPublicationRel(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgPublicationRel as(Name alias) {
        return new PgPublicationRel(alias, this);
    }

    @Override
    @NotNull
    public PgPublicationRel as(Table<?> alias) {
        return new PgPublicationRel(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public PgPublicationRel rename(String name) {
        return new PgPublicationRel(DSL.name(name), null);
    }

    @Override
    @NotNull
    public PgPublicationRel rename(Name name) {
        return new PgPublicationRel(name, null);
    }

    @Override
    @NotNull
    public PgPublicationRel rename(Table<?> name) {
        return new PgPublicationRel(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Long, Long, Long, Object, Object[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    public <U> SelectField<U> mapping(Function5<? super Long, ? super Long, ? super Long, ? super Object, ? super Object[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super Long, ? super Long, ? super Object, ? super Object[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
