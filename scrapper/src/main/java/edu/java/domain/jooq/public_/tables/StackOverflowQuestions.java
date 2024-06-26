/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables;


import edu.java.domain.jooq.public_.Public;
import edu.java.domain.jooq.public_.tables.records.StackOverflowQuestionsRecord;

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
public class StackOverflowQuestions extends TableImpl<StackOverflowQuestionsRecord> {

    private static final long serialVersionUID = 1L;

    public static final StackOverflowQuestions STACK_OVERFLOW_QUESTIONS = new StackOverflowQuestions();

    @Override
    @NotNull
    public Class<StackOverflowQuestionsRecord> getRecordType() {
        return StackOverflowQuestionsRecord.class;
    }

    public final TableField<StackOverflowQuestionsRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<StackOverflowQuestionsRecord, Long> LINK_ID = createField(DSL.name("link_id"), SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<StackOverflowQuestionsRecord, String> DESCRIPTION_MD5_HASH = createField(DSL.name("description_md5_hash"), SQLDataType.CLOB.nullable(false), this, "");

    public final TableField<StackOverflowQuestionsRecord, Long[]> ANSWERS_IDS = createField(DSL.name("answers_ids"), SQLDataType.BIGINT.nullable(false).array(), this, "");

    private StackOverflowQuestions(Name alias, Table<StackOverflowQuestionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private StackOverflowQuestions(Name alias, Table<StackOverflowQuestionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public StackOverflowQuestions(String alias) {
        this(DSL.name(alias), STACK_OVERFLOW_QUESTIONS);
    }

    public StackOverflowQuestions(Name alias) {
        this(alias, STACK_OVERFLOW_QUESTIONS);
    }

    public StackOverflowQuestions() {
        this(DSL.name("stack_overflow_questions"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @NotNull
    public StackOverflowQuestions as(String alias) {
        return new StackOverflowQuestions(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public StackOverflowQuestions as(Name alias) {
        return new StackOverflowQuestions(alias, this);
    }

    @Override
    @NotNull
    public StackOverflowQuestions as(Table<?> alias) {
        return new StackOverflowQuestions(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public StackOverflowQuestions rename(String name) {
        return new StackOverflowQuestions(DSL.name(name), null);
    }

    @Override
    @NotNull
    public StackOverflowQuestions rename(Name name) {
        return new StackOverflowQuestions(name, null);
    }

    @Override
    @NotNull
    public StackOverflowQuestions rename(Table<?> name) {
        return new StackOverflowQuestions(name.getQualifiedName(), null);
    }
}
