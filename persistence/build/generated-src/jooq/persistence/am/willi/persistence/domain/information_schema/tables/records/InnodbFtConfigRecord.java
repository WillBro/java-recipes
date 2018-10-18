/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.records;


import am.willi.persistence.domain.information_schema.tables.InnodbFtConfig;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class InnodbFtConfigRecord extends TableRecordImpl<InnodbFtConfigRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -671251805;

    /**
     * Setter for <code>information_schema.INNODB_FT_CONFIG.KEY</code>.
     */
    public InnodbFtConfigRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_CONFIG.KEY</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_FT_CONFIG.VALUE</code>.
     */
    public InnodbFtConfigRecord setValue(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_CONFIG.VALUE</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InnodbFtConfig.INNODB_FT_CONFIG.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbFtConfig.INNODB_FT_CONFIG.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbFtConfigRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbFtConfigRecord value2(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbFtConfigRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbFtConfigRecord
     */
    public InnodbFtConfigRecord() {
        super(InnodbFtConfig.INNODB_FT_CONFIG);
    }

    /**
     * Create a detached, initialised InnodbFtConfigRecord
     */
    public InnodbFtConfigRecord(String key, String value) {
        super(InnodbFtConfig.INNODB_FT_CONFIG);

        set(0, key);
        set(1, value);
    }
}
