/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables;


import am.willi.persistence.domain.mysql.Indexes;
import am.willi.persistence.domain.mysql.Keys;
import am.willi.persistence.domain.mysql.Mysql;
import am.willi.persistence.domain.mysql.tables.records.IndexStatsRecord;

import java.math.BigDecimal;
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
 * Statistics on Indexes
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndexStats extends TableImpl<IndexStatsRecord> {

    private static final long serialVersionUID = 1203688539;

    /**
     * The reference instance of <code>mysql.index_stats</code>
     */
    public static final IndexStats INDEX_STATS = new IndexStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IndexStatsRecord> getRecordType() {
        return IndexStatsRecord.class;
    }

    /**
     * The column <code>mysql.index_stats.db_name</code>.
     */
    public final TableField<IndexStatsRecord, String> DB_NAME = createField("db_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.index_stats.table_name</code>.
     */
    public final TableField<IndexStatsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.index_stats.index_name</code>.
     */
    public final TableField<IndexStatsRecord, String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.index_stats.prefix_arity</code>.
     */
    public final TableField<IndexStatsRecord, UInteger> PREFIX_ARITY = createField("prefix_arity", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.index_stats.avg_frequency</code>.
     */
    public final TableField<IndexStatsRecord, BigDecimal> AVG_FREQUENCY = createField("avg_frequency", org.jooq.impl.SQLDataType.DECIMAL(12, 4).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * Create a <code>mysql.index_stats</code> table reference
     */
    public IndexStats() {
        this(DSL.name("index_stats"), null);
    }

    /**
     * Create an aliased <code>mysql.index_stats</code> table reference
     */
    public IndexStats(String alias) {
        this(DSL.name(alias), INDEX_STATS);
    }

    /**
     * Create an aliased <code>mysql.index_stats</code> table reference
     */
    public IndexStats(Name alias) {
        this(alias, INDEX_STATS);
    }

    private IndexStats(Name alias, Table<IndexStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private IndexStats(Name alias, Table<IndexStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Statistics on Indexes"));
    }

    public <O extends Record> IndexStats(Table<O> child, ForeignKey<O, IndexStatsRecord> key) {
        super(child, key, INDEX_STATS);
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
        return Arrays.<Index>asList(Indexes.INDEX_STATS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IndexStatsRecord> getPrimaryKey() {
        return Keys.KEY_INDEX_STATS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IndexStatsRecord>> getKeys() {
        return Arrays.<UniqueKey<IndexStatsRecord>>asList(Keys.KEY_INDEX_STATS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexStats as(String alias) {
        return new IndexStats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexStats as(Name alias) {
        return new IndexStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IndexStats rename(String name) {
        return new IndexStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IndexStats rename(Name name) {
        return new IndexStats(name, null);
    }
}