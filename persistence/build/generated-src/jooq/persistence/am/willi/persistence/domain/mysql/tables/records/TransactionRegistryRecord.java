/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables.records;


import am.willi.persistence.domain.mysql.enums.TransactionRegistryIsolationLevel;
import am.willi.persistence.domain.mysql.tables.TransactionRegistry;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
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
public class TransactionRegistryRecord extends UpdatableRecordImpl<TransactionRegistryRecord> implements Record5<ULong, ULong, Timestamp, Timestamp, TransactionRegistryIsolationLevel> {

    private static final long serialVersionUID = 2100853094;

    /**
     * Setter for <code>mysql.transaction_registry.transaction_id</code>.
     */
    public TransactionRegistryRecord setTransactionId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.transaction_registry.transaction_id</code>.
     */
    public ULong getTransactionId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>mysql.transaction_registry.commit_id</code>.
     */
    public TransactionRegistryRecord setCommitId(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.transaction_registry.commit_id</code>.
     */
    public ULong getCommitId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>mysql.transaction_registry.begin_timestamp</code>.
     */
    public TransactionRegistryRecord setBeginTimestamp(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mysql.transaction_registry.begin_timestamp</code>.
     */
    public Timestamp getBeginTimestamp() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>mysql.transaction_registry.commit_timestamp</code>.
     */
    public TransactionRegistryRecord setCommitTimestamp(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mysql.transaction_registry.commit_timestamp</code>.
     */
    public Timestamp getCommitTimestamp() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>mysql.transaction_registry.isolation_level</code>.
     */
    public TransactionRegistryRecord setIsolationLevel(TransactionRegistryIsolationLevel value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>mysql.transaction_registry.isolation_level</code>.
     */
    public TransactionRegistryIsolationLevel getIsolationLevel() {
        return (TransactionRegistryIsolationLevel) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, ULong, Timestamp, Timestamp, TransactionRegistryIsolationLevel> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, ULong, Timestamp, Timestamp, TransactionRegistryIsolationLevel> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TransactionRegistry.TRANSACTION_REGISTRY.TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return TransactionRegistry.TRANSACTION_REGISTRY.COMMIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TransactionRegistry.TRANSACTION_REGISTRY.BEGIN_TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TransactionRegistry.TRANSACTION_REGISTRY.COMMIT_TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TransactionRegistryIsolationLevel> field5() {
        return TransactionRegistry.TRANSACTION_REGISTRY.ISOLATION_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component2() {
        return getCommitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getBeginTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCommitTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistryIsolationLevel component5() {
        return getIsolationLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getCommitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getBeginTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCommitTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistryIsolationLevel value5() {
        return getIsolationLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistryRecord value1(ULong value) {
        setTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistryRecord value2(ULong value) {
        setCommitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistryRecord value3(Timestamp value) {
        setBeginTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistryRecord value4(Timestamp value) {
        setCommitTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistryRecord value5(TransactionRegistryIsolationLevel value) {
        setIsolationLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRegistryRecord values(ULong value1, ULong value2, Timestamp value3, Timestamp value4, TransactionRegistryIsolationLevel value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionRegistryRecord
     */
    public TransactionRegistryRecord() {
        super(TransactionRegistry.TRANSACTION_REGISTRY);
    }

    /**
     * Create a detached, initialised TransactionRegistryRecord
     */
    public TransactionRegistryRecord(ULong transactionId, ULong commitId, Timestamp beginTimestamp, Timestamp commitTimestamp, TransactionRegistryIsolationLevel isolationLevel) {
        super(TransactionRegistry.TRANSACTION_REGISTRY);

        set(0, transactionId);
        set(1, commitId);
        set(2, beginTimestamp);
        set(3, commitTimestamp);
        set(4, isolationLevel);
    }
}