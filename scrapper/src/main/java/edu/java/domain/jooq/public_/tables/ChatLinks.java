/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables;


import edu.java.domain.jooq.public_.Public;
import edu.java.domain.jooq.public_.tables.records.ChatLinksRecord;

import java.time.LocalDateTime;

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
public class ChatLinks extends TableImpl<ChatLinksRecord> {

    private static final long serialVersionUID = 1L;

    public static final ChatLinks CHAT_LINKS = new ChatLinks();

    @Override
    @NotNull
    public Class<ChatLinksRecord> getRecordType() {
        return ChatLinksRecord.class;
    }

    public final TableField<ChatLinksRecord, Long> CHAT_ID = createField(DSL.name("chat_id"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<ChatLinksRecord, Long> LINK_ID = createField(DSL.name("link_id"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<ChatLinksRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1970-01-01 00:00:00'::timestamp without time zone"), SQLDataType.LOCALDATETIME)), this, "");

    private ChatLinks(Name alias, Table<ChatLinksRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChatLinks(Name alias, Table<ChatLinksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public ChatLinks(String alias) {
        this(DSL.name(alias), CHAT_LINKS);
    }

    public ChatLinks(Name alias) {
        this(alias, CHAT_LINKS);
    }

    public ChatLinks() {
        this(DSL.name("chat_links"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @NotNull
    public ChatLinks as(String alias) {
        return new ChatLinks(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public ChatLinks as(Name alias) {
        return new ChatLinks(alias, this);
    }

    @Override
    @NotNull
    public ChatLinks as(Table<?> alias) {
        return new ChatLinks(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public ChatLinks rename(String name) {
        return new ChatLinks(DSL.name(name), null);
    }

    @Override
    @NotNull
    public ChatLinks rename(Name name) {
        return new ChatLinks(name, null);
    }

    @Override
    @NotNull
    public ChatLinks rename(Table<?> name) {
        return new ChatLinks(name.getQualifiedName(), null);
    }
}
