/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables;


import am.willi.persistence.domain.mysql.Indexes;
import am.willi.persistence.domain.mysql.Keys;
import am.willi.persistence.domain.mysql.Mysql;
import am.willi.persistence.domain.mysql.tables.records.TablesPrivRecord;

import java.sql.Timestamp;
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


/**
 * Table privileges
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablesPriv extends TableImpl<TablesPrivRecord> {

    private static final long serialVersionUID = 722802158;

    /**
     * The reference instance of <code>mysql.tables_priv</code>
     */
    public static final TablesPriv TABLES_PRIV = new TablesPriv();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablesPrivRecord> getRecordType() {
        return TablesPrivRecord.class;
    }

    /**
     * The column <code>mysql.tables_priv.Host</code>.
     */
    public final TableField<TablesPrivRecord, String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.tables_priv.Db</code>.
     */
    public final TableField<TablesPrivRecord, String> DB = createField("Db", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.tables_priv.User</code>.
     */
    public final TableField<TablesPrivRecord, String> USER = createField("User", org.jooq.impl.SQLDataType.CHAR(80).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.tables_priv.Table_name</code>.
     */
    public final TableField<TablesPrivRecord, String> TABLE_NAME = createField("Table_name", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.tables_priv.Grantor</code>.
     */
    public final TableField<TablesPrivRecord, String> GRANTOR = createField("Grantor", org.jooq.impl.SQLDataType.CHAR(141).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.tables_priv.Timestamp</code>.
     */
    public final TableField<TablesPrivRecord, Timestamp> TIMESTAMP = createField("Timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.tables_priv.Table_priv</code>.
     */
    public final TableField<TablesPrivRecord, String> TABLE_PRIV = createField("Table_priv", org.jooq.impl.SQLDataType.VARCHAR(121).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.tables_priv.Column_priv</code>.
     */
    public final TableField<TablesPrivRecord, String> COLUMN_PRIV = createField("Column_priv", org.jooq.impl.SQLDataType.VARCHAR(31).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mysql.tables_priv</code> table reference
     */
    public TablesPriv() {
        this(DSL.name("tables_priv"), null);
    }

    /**
     * Create an aliased <code>mysql.tables_priv</code> table reference
     */
    public TablesPriv(String alias) {
        this(DSL.name(alias), TABLES_PRIV);
    }

    /**
     * Create an aliased <code>mysql.tables_priv</code> table reference
     */
    public TablesPriv(Name alias) {
        this(alias, TABLES_PRIV);
    }

    private TablesPriv(Name alias, Table<TablesPrivRecord> aliased) {
        this(alias, aliased, null);
    }

    private TablesPriv(Name alias, Table<TablesPrivRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Table privileges"));
    }

    public <O extends Record> TablesPriv(Table<O> child, ForeignKey<O, TablesPrivRecord> key) {
        super(child, key, TABLES_PRIV);
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
        return Arrays.<Index>asList(Indexes.TABLES_PRIV_GRANTOR, Indexes.TABLES_PRIV_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TablesPrivRecord> getPrimaryKey() {
        return Keys.KEY_TABLES_PRIV_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TablesPrivRecord>> getKeys() {
        return Arrays.<UniqueKey<TablesPrivRecord>>asList(Keys.KEY_TABLES_PRIV_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablesPriv as(String alias) {
        return new TablesPriv(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablesPriv as(Name alias) {
        return new TablesPriv(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TablesPriv rename(String name) {
        return new TablesPriv(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TablesPriv rename(Name name) {
        return new TablesPriv(name, null);
    }
}