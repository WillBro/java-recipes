/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables;


import am.willi.persistence.domain.mysql.Indexes;
import am.willi.persistence.domain.mysql.Keys;
import am.willi.persistence.domain.mysql.Mysql;
import am.willi.persistence.domain.mysql.enums.TransactionRegistryIsolationLevel;
import am.willi.persistence.domain.mysql.tables.records.TransactionRegistryRecord;

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
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransactionRegistry extends TableImpl<TransactionRegistryRecord> {

    private static final long serialVersionUID = 1499975845;

    /**
     * The reference instance of <code>mysql.transaction_registry</code>
     */
    public static final TransactionRegistry TRANSACTION_REGISTRY = new TransactionRegistry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransactionRegistryRecord> getRecordType() {
        return TransactionRegistryRecord.class;
    }

    /**
     * The column <code>mysql.transaction_registry.transaction_id</code>.
     */
    public final TableField<TransactionRegistryRecord, ULong> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.transaction_registry.commit_id</code>.
     */
    public final TableField<TransactionRegistryRecord, ULong> COMMIT_ID = createField("commit_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.transaction_registry.begin_timestamp</code>.
     */
    public final TableField<TransactionRegistryRecord, Timestamp> BEGIN_TIMESTAMP = createField("begin_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("'0000-00-00 00:00:00.000000'", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.transaction_registry.commit_timestamp</code>.
     */
    public final TableField<TransactionRegistryRecord, Timestamp> COMMIT_TIMESTAMP = createField("commit_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("'0000-00-00 00:00:00.000000'", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.transaction_registry.isolation_level</code>.
     */
    public final TableField<TransactionRegistryRecord, TransactionRegistryIsolationLevel> ISOLATION_LEVEL = createField("isolation_level", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false).asEnumDataType(am.willi.persistence.domain.mysql.enums.TransactionRegistryIsolationLevel.class), this, "");

    /**
     * Create a <code>mysql.transaction_registry</code> table reference
     */
    public TransactionRegistry() {
        this(DSL.name("transaction_registry"), null);
    }

    /**
     * Create an aliased <code>mysql.transaction_registry</code> table reference
     */
    public TransactionRegistry(String alias) {
        this(DSL.name(alias), TRANSACTION_REGISTRY);
    }

    /**
     * Create an aliased <code>mysql.transaction_registry</code> table reference
     */
    public TransactionRegistry(Name alias) {
        this(alias, TRANSACTION_REGISTRY);
    }

    private TransactionRegistry(Name alias, Table<TransactionRegistryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TransactionRegistry(Name alias, Table<TransactionRegistryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TransactionRegistry(Table<O> child, ForeignKey<O, TransactionRegistryRecord> key) {
        super(child, key, TRANSACTION_REGISTRY);
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
        return Arrays.<Index>asList(Indexes.TRANSACTION_REGISTRY_BEGIN_TIMESTAMP, Indexes.TRANSACTION_REGISTRY_COMMIT_ID, Indexes.TRANSACTION_REGISTRY_COMMIT_TIMESTAMP, Indexes.TRANSACTION_REGISTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TransactionRegistryRecord> getPrimaryKey() {
        return Keys.KEY_TRANSACTION_REGISTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TransactionRegistryRecord>> getKeys() {
        return Arrays.<UniqueKey<TransactionRegistryRecord>>asList(Keys.KEY_TRANSACTION_REGISTRY_PRIMARY, Keys.KEY_TRANSACTION_REGISTRY_COMMIT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistry as(String alias) {
        return new TransactionRegistry(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistry as(Name alias) {
        return new TransactionRegistry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TransactionRegistry rename(String name) {
        return new TransactionRegistry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TransactionRegistry rename(Name name) {
        return new TransactionRegistry(name, null);
    }
}
