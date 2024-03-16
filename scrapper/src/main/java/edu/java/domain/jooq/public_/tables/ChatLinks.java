/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables;


import edu.java.domain.jooq.public_.Keys;
import edu.java.domain.jooq.public_.Public;
import edu.java.domain.jooq.public_.tables.records.ChatLinksRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
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

    /**
     * The reference instance of <code>public.chat_links</code>
     */
    public static final ChatLinks CHAT_LINKS = new ChatLinks();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<ChatLinksRecord> getRecordType() {
        return ChatLinksRecord.class;
    }

    /**
     * The column <code>public.chat_links.id</code>.
     */
    public final TableField<ChatLinksRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.chat_links.chat_id</code>.
     */
    public final TableField<ChatLinksRecord, Long> CHAT_ID = createField(DSL.name("chat_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.chat_links.link_id</code>.
     */
    public final TableField<ChatLinksRecord, Long> LINK_ID = createField(DSL.name("link_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.chat_links.created_at</code>.
     */
    public final TableField<ChatLinksRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    private ChatLinks(Name alias, Table<ChatLinksRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChatLinks(Name alias, Table<ChatLinksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.chat_links</code> table reference
     */
    public ChatLinks(String alias) {
        this(DSL.name(alias), CHAT_LINKS);
    }

    /**
     * Create an aliased <code>public.chat_links</code> table reference
     */
    public ChatLinks(Name alias) {
        this(alias, CHAT_LINKS);
    }

    /**
     * Create a <code>public.chat_links</code> table reference
     */
    public ChatLinks() {
        this(DSL.name("chat_links"), null);
    }

    public <O extends Record> ChatLinks(Table<O> child, ForeignKey<O, ChatLinksRecord> key) {
        super(child, key, CHAT_LINKS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @NotNull
    public Identity<ChatLinksRecord, Long> getIdentity() {
        return (Identity<ChatLinksRecord, Long>) super.getIdentity();
    }

    @Override
    @NotNull
    public UniqueKey<ChatLinksRecord> getPrimaryKey() {
        return Keys.CHAT_LINKS_PKEY;
    }

    @Override
    @NotNull
    public List<UniqueKey<ChatLinksRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.CHAT_LINKS_CHAT_ID_LINK_ID_KEY);
    }

    @Override
    @NotNull
    public List<ForeignKey<ChatLinksRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CHAT_LINKS__CHAT_LINKS_CHAT_ID_FKEY, Keys.CHAT_LINKS__CHAT_LINKS_LINK_ID_FKEY);
    }

    private transient Chats _chats;
    private transient Links _links;

    /**
     * Get the implicit join path to the <code>public.chats</code> table.
     */
    public Chats chats() {
        if (_chats == null)
            _chats = new Chats(this, Keys.CHAT_LINKS__CHAT_LINKS_CHAT_ID_FKEY);

        return _chats;
    }

    /**
     * Get the implicit join path to the <code>public.links</code> table.
     */
    public Links links() {
        if (_links == null)
            _links = new Links(this, Keys.CHAT_LINKS__CHAT_LINKS_LINK_ID_FKEY);

        return _links;
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

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public ChatLinks rename(String name) {
        return new ChatLinks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public ChatLinks rename(Name name) {
        return new ChatLinks(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public ChatLinks rename(Table<?> name) {
        return new ChatLinks(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, Long, Long, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super Long, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super Long, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}