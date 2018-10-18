/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables;


import am.willi.persistence.domain.mysql.Indexes;
import am.willi.persistence.domain.mysql.Keys;
import am.willi.persistence.domain.mysql.Mysql;
import am.willi.persistence.domain.mysql.tables.records.TableStatsRecord;

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
import org.jooq.types.ULong;


/**
 * Statistics on Tables
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableStats extends TableImpl<TableStatsRecord> {

    private static final long serialVersionUID = 656671268;

    /**
     * The reference instance of <code>mysql.table_stats</code>
     */
    public static final TableStats TABLE_STATS = new TableStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableStatsRecord> getRecordType() {
        return TableStatsRecord.class;
    }

    /**
     * The column <code>mysql.table_stats.db_name</code>.
     */
    public final TableField<TableStatsRecord, String> DB_NAME = createField("db_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.table_stats.table_name</code>.
     */
    public final TableField<TableStatsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.table_stats.cardinality</code>.
     */
    public final TableField<TableStatsRecord, ULong> CARDINALITY = createField("cardinality", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>mysql.table_stats</code> table reference
     */
    public TableStats() {
        this(DSL.name("table_stats"), null);
    }

    /**
     * Create an aliased <code>mysql.table_stats</code> table reference
     */
    public TableStats(String alias) {
        this(DSL.name(alias), TABLE_STATS);
    }

    /**
     * Create an aliased <code>mysql.table_stats</code> table reference
     */
    public TableStats(Name alias) {
        this(alias, TABLE_STATS);
    }

    private TableStats(Name alias, Table<TableStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableStats(Name alias, Table<TableStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Statistics on Tables"));
    }

    public <O extends Record> TableStats(Table<O> child, ForeignKey<O, TableStatsRecord> key) {
        super(child, key, TABLE_STATS);
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
        return Arrays.<Index>asList(Indexes.TABLE_STATS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TableStatsRecord> getPrimaryKey() {
        return Keys.KEY_TABLE_STATS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TableStatsRecord>> getKeys() {
        return Arrays.<UniqueKey<TableStatsRecord>>asList(Keys.KEY_TABLE_STATS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableStats as(String alias) {
        return new TableStats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableStats as(Name alias) {
        return new TableStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableStats rename(String name) {
        return new TableStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableStats rename(Name name) {
        return new TableStats(name, null);
    }
}
