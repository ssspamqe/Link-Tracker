/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.TsDebug;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class TsDebugRecord extends TableRecordImpl<TsDebugRecord> {

    private static final long serialVersionUID = 1L;

    public void setAlias(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getAlias() {
        return (String) get(0);
    }

    public void setDescription(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getDescription() {
        return (String) get(1);
    }

    public void setToken(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getToken() {
        return (String) get(2);
    }

    public void setDictionaries(@Nullable Object[] value) {
        set(3, value);
    }

    @Nullable
    public Object[] getDictionaries() {
        return (Object[]) get(3);
    }

    @Deprecated
    public void setDictionary(@Nullable Object value) {
        set(4, value);
    }

    @Deprecated
    @Nullable
    public Object getDictionary() {
        return get(4);
    }

    public void setLexemes(@Nullable String[] value) {
        set(5, value);
    }

    @Nullable
    public String[] getLexemes() {
        return (String[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public TsDebugRecord() {
        super(TsDebug.TS_DEBUG);
    }

    @ConstructorProperties({ "alias", "description", "token", "dictionaries", "dictionary", "lexemes" })
    public TsDebugRecord(@Nullable String alias, @Nullable String description, @Nullable String token, @Nullable Object[] dictionaries, @Nullable Object dictionary, @Nullable String[] lexemes) {
        super(TsDebug.TS_DEBUG);

        setAlias(alias);
        setDescription(description);
        setToken(token);
        setDictionaries(dictionaries);
        setDictionary(dictionary);
        setLexemes(lexemes);
        resetChangedOnNotNull();
    }

    public TsDebugRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.TsDebug value) {
        super(TsDebug.TS_DEBUG);

        if (value != null) {
            setAlias(value.getAlias());
            setDescription(value.getDescription());
            setToken(value.getToken());
            setDictionaries(value.getDictionaries());
            setDictionary(value.getDictionary());
            setLexemes(value.getLexemes());
            resetChangedOnNotNull();
        }
    }
}