/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables;


import am.willi.persistence.domain.mysql.Indexes;
import am.willi.persistence.domain.mysql.Keys;
import am.willi.persistence.domain.mysql.Mysql;
import am.willi.persistence.domain.mysql.tables.records.HelpKeywordRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * help keywords
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpKeyword extends TableImpl<HelpKeywordRecord> {

    private static final long serialVersionUID = -1218810325;

    /**
     * The reference instance of <code>mysql.help_keyword</code>
     */
    public static final HelpKeyword HELP_KEYWORD = new HelpKeyword();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HelpKeywordRecord> getRecordType() {
        return HelpKeywordRecord.class;
    }

    /**
     * The column <code>mysql.help_keyword.help_keyword_id</code>.
     */
    public final TableField<HelpKeywordRecord, UInteger> HELP_KEYWORD_ID = createField("help_keyword_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.help_keyword.name</code>.
     */
    public final TableField<HelpKeywordRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * Create a <code>mysql.help_keyword</code> table reference
     */
    public HelpKeyword() {
        this(DSL.name("help_keyword"), null);
    }

    /**
     * Create an aliased <code>mysql.help_keyword</code> table reference
     */
    public HelpKeyword(String alias) {
        this(DSL.name(alias), HELP_KEYWORD);
    }

    /**
     * Create an aliased <code>mysql.help_keyword</code> table reference
     */
    public HelpKeyword(Name alias) {
        this(alias, HELP_KEYWORD);
    }

    private HelpKeyword(Name alias, Table<HelpKeywordRecord> aliased) {
        this(alias, aliased, null);
    }

    private HelpKeyword(Name alias, Table<HelpKeywordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("help keywords"));
    }

    public <O extends Record> HelpKeyword(Table<O> child, ForeignKey<O, HelpKeywordRecord> key) {
        super(child, key, HELP_KEYWORD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.HELP_KEYWORD_NAME, Indexes.HELP_KEYWORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HelpKeywordRecord> getPrimaryKey() {
        return Keys.KEY_HELP_KEYWORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HelpKeywordRecord>> getKeys() {
        return Arrays.<UniqueKey<HelpKeywordRecord>>asList(Keys.KEY_HELP_KEYWORD_PRIMARY, Keys.KEY_HELP_KEYWORD_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpKeyword as(String alias) {
        return new HelpKeyword(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpKeyword as(Name alias) {
        return new HelpKeyword(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HelpKeyword rename(String name) {
        return new HelpKeyword(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HelpKeyword rename(Name name) {
        return new HelpKeyword(name, null);
    }
}
