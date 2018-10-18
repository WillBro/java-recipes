/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.records;


import am.willi.persistence.domain.information_schema.tables.InnodbSysColumns;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
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
public class InnodbSysColumnsRecord extends TableRecordImpl<InnodbSysColumnsRecord> implements Record6<ULong, String, ULong, Integer, Integer, Integer> {

    private static final long serialVersionUID = -793214363;

    /**
     * Setter for <code>information_schema.INNODB_SYS_COLUMNS.TABLE_ID</code>.
     */
    public InnodbSysColumnsRecord setTableId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_COLUMNS.TABLE_ID</code>.
     */
    public ULong getTableId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_COLUMNS.NAME</code>.
     */
    public InnodbSysColumnsRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_COLUMNS.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_COLUMNS.POS</code>.
     */
    public InnodbSysColumnsRecord setPos(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_COLUMNS.POS</code>.
     */
    public ULong getPos() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_COLUMNS.MTYPE</code>.
     */
    public InnodbSysColumnsRecord setMtype(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_COLUMNS.MTYPE</code>.
     */
    public Integer getMtype() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_COLUMNS.PRTYPE</code>.
     */
    public InnodbSysColumnsRecord setPrtype(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_COLUMNS.PRTYPE</code>.
     */
    public Integer getPrtype() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_COLUMNS.LEN</code>.
     */
    public InnodbSysColumnsRecord setLen(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_COLUMNS.LEN</code>.
     */
    public Integer getLen() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, String, ULong, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, String, ULong, Integer, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return InnodbSysColumns.INNODB_SYS_COLUMNS.TABLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbSysColumns.INNODB_SYS_COLUMNS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return InnodbSysColumns.INNODB_SYS_COLUMNS.POS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return InnodbSysColumns.INNODB_SYS_COLUMNS.MTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return InnodbSysColumns.INNODB_SYS_COLUMNS.PRTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return InnodbSysColumns.INNODB_SYS_COLUMNS.LEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getTableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getMtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPrtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getLen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getTableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getMtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPrtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysColumnsRecord value1(ULong value) {
        setTableId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysColumnsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysColumnsRecord value3(ULong value) {
        setPos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysColumnsRecord value4(Integer value) {
        setMtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysColumnsRecord value5(Integer value) {
        setPrtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysColumnsRecord value6(Integer value) {
        setLen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysColumnsRecord values(ULong value1, String value2, ULong value3, Integer value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbSysColumnsRecord
     */
    public InnodbSysColumnsRecord() {
        super(InnodbSysColumns.INNODB_SYS_COLUMNS);
    }

    /**
     * Create a detached, initialised InnodbSysColumnsRecord
     */
    public InnodbSysColumnsRecord(ULong tableId, String name, ULong pos, Integer mtype, Integer prtype, Integer len) {
        super(InnodbSysColumns.INNODB_SYS_COLUMNS);

        set(0, tableId);
        set(1, name);
        set(2, pos);
        set(3, mtype);
        set(4, prtype);
        set(5, len);
    }
}
