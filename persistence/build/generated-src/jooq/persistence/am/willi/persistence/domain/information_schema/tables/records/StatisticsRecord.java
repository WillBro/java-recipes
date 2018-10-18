/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.records;


import am.willi.persistence.domain.information_schema.tables.Statistics;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class StatisticsRecord extends TableRecordImpl<StatisticsRecord> implements Record16<String, String, String, Long, String, String, Long, String, String, Long, Long, String, String, String, String, String> {

    private static final long serialVersionUID = 36292008;

    /**
     * Setter for <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
     */
    public StatisticsRecord setTableCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
     */
    public StatisticsRecord setTableSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.TABLE_NAME</code>.
     */
    public StatisticsRecord setTableName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.NON_UNIQUE</code>.
     */
    public StatisticsRecord setNonUnique(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.NON_UNIQUE</code>.
     */
    public Long getNonUnique() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
     */
    public StatisticsRecord setIndexSchema(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
     */
    public String getIndexSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.INDEX_NAME</code>.
     */
    public StatisticsRecord setIndexName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
     */
    public StatisticsRecord setSeqInIndex(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
     */
    public Long getSeqInIndex() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.COLUMN_NAME</code>.
     */
    public StatisticsRecord setColumnName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.COLLATION</code>.
     */
    public StatisticsRecord setCollation(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.COLLATION</code>.
     */
    public String getCollation() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.CARDINALITY</code>.
     */
    public StatisticsRecord setCardinality(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.CARDINALITY</code>.
     */
    public Long getCardinality() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.SUB_PART</code>.
     */
    public StatisticsRecord setSubPart(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.SUB_PART</code>.
     */
    public Long getSubPart() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.PACKED</code>.
     */
    public StatisticsRecord setPacked(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.PACKED</code>.
     */
    public String getPacked() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.NULLABLE</code>.
     */
    public StatisticsRecord setNullable(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.NULLABLE</code>.
     */
    public String getNullable() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.INDEX_TYPE</code>.
     */
    public StatisticsRecord setIndexType(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_TYPE</code>.
     */
    public String getIndexType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.COMMENT</code>.
     */
    public StatisticsRecord setComment(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.COMMENT</code>.
     */
    public String getComment() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
     */
    public StatisticsRecord setIndexComment(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
     */
    public String getIndexComment() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, String, Long, String, String, Long, String, String, Long, Long, String, String, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, String, Long, String, String, Long, String, String, Long, Long, String, String, String, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Statistics.STATISTICS.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Statistics.STATISTICS.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Statistics.STATISTICS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Statistics.STATISTICS.NON_UNIQUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Statistics.STATISTICS.INDEX_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Statistics.STATISTICS.INDEX_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Statistics.STATISTICS.SEQ_IN_INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Statistics.STATISTICS.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Statistics.STATISTICS.COLLATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return Statistics.STATISTICS.CARDINALITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return Statistics.STATISTICS.SUB_PART;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Statistics.STATISTICS.PACKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Statistics.STATISTICS.NULLABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Statistics.STATISTICS.INDEX_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Statistics.STATISTICS.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Statistics.STATISTICS.INDEX_COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getNonUnique();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIndexSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getSeqInIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCollation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getCardinality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getSubPart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getPacked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getNullable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getIndexType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getIndexComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getNonUnique();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIndexSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getSeqInIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCollation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getCardinality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getSubPart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPacked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getNullable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getIndexType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getIndexComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value4(Long value) {
        setNonUnique(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value5(String value) {
        setIndexSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value6(String value) {
        setIndexName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value7(Long value) {
        setSeqInIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value8(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value9(String value) {
        setCollation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value10(Long value) {
        setCardinality(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value11(Long value) {
        setSubPart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value12(String value) {
        setPacked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value13(String value) {
        setNullable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value14(String value) {
        setIndexType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value15(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord value16(String value) {
        setIndexComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsRecord values(String value1, String value2, String value3, Long value4, String value5, String value6, Long value7, String value8, String value9, Long value10, Long value11, String value12, String value13, String value14, String value15, String value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatisticsRecord
     */
    public StatisticsRecord() {
        super(Statistics.STATISTICS);
    }

    /**
     * Create a detached, initialised StatisticsRecord
     */
    public StatisticsRecord(String tableCatalog, String tableSchema, String tableName, Long nonUnique, String indexSchema, String indexName, Long seqInIndex, String columnName, String collation, Long cardinality, Long subPart, String packed, String nullable, String indexType, String comment, String indexComment) {
        super(Statistics.STATISTICS);

        set(0, tableCatalog);
        set(1, tableSchema);
        set(2, tableName);
        set(3, nonUnique);
        set(4, indexSchema);
        set(5, indexName);
        set(6, seqInIndex);
        set(7, columnName);
        set(8, collation);
        set(9, cardinality);
        set(10, subPart);
        set(11, packed);
        set(12, nullable);
        set(13, indexType);
        set(14, comment);
        set(15, indexComment);
    }
}