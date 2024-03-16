/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_;


import edu.java.domain.jooq.DefaultCatalog;
import edu.java.domain.jooq.public_.tables.ChatLinks;
import edu.java.domain.jooq.public_.tables.Chats;
import edu.java.domain.jooq.public_.tables.Databasechangelog;
import edu.java.domain.jooq.public_.tables.Databasechangeloglock;
import edu.java.domain.jooq.public_.tables.GitHubRepositories;
import edu.java.domain.jooq.public_.tables.Links;
import edu.java.domain.jooq.public_.tables.StackOverflowQuestions;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.chat_links</code>.
     */
    public final ChatLinks CHAT_LINKS = ChatLinks.CHAT_LINKS;

    /**
     * The table <code>public.chats</code>.
     */
    public final Chats CHATS = Chats.CHATS;

    /**
     * The table <code>public.databasechangelog</code>.
     */
    public final Databasechangelog DATABASECHANGELOG = Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>public.databasechangeloglock</code>.
     */
    public final Databasechangeloglock DATABASECHANGELOGLOCK = Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>public.git_hub_repositories</code>.
     */
    public final GitHubRepositories GIT_HUB_REPOSITORIES = GitHubRepositories.GIT_HUB_REPOSITORIES;

    /**
     * The table <code>public.links</code>.
     */
    public final Links LINKS = Links.LINKS;

    /**
     * The table <code>public.stack_overflow_questions</code>.
     */
    public final StackOverflowQuestions STACK_OVERFLOW_QUESTIONS = StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    @NotNull
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    @NotNull
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            ChatLinks.CHAT_LINKS,
            Chats.CHATS,
            Databasechangelog.DATABASECHANGELOG,
            Databasechangeloglock.DATABASECHANGELOGLOCK,
            GitHubRepositories.GIT_HUB_REPOSITORIES,
            Links.LINKS,
            StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS
        );
    }
}