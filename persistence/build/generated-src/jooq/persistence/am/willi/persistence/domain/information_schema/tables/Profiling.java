/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables;


import am.willi.persistence.domain.information_schema.InformationSchema;
import am.willi.persistence.domain.information_schema.tables.records.ProfilingRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Profiling extends TableImpl<ProfilingRecord> {

    private static final long serialVersionUID = 257808487;

    /**
     * The reference instance of <code>information_schema.PROFILING</code>
     */
    public static final Profiling PROFILING = new Profiling();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfilingRecord> getRecordType() {
        return ProfilingRecord.class;
    }

    /**
     * The column <code>information_schema.PROFILING.QUERY_ID</code>.
     */
    public final TableField<ProfilingRecord, Integer> QUERY_ID = createField("QUERY_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SEQ</code>.
     */
    public final TableField<ProfilingRecord, Integer> SEQ = createField("SEQ", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.STATE</code>.
     */
    public final TableField<ProfilingRecord, String> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROFILING.DURATION</code>.
     */
    public final TableField<ProfilingRecord, BigDecimal> DURATION = createField("DURATION", org.jooq.impl.SQLDataType.DECIMAL(9, 6).nullable(false).defaultValue(org.jooq.impl.DSL.field("0.000000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CPU_USER</code>.
     */
    public final TableField<ProfilingRecord, BigDecimal> CPU_USER = createField("CPU_USER", org.jooq.impl.SQLDataType.DECIMAL(9, 6).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CPU_SYSTEM</code>.
     */
    public final TableField<ProfilingRecord, BigDecimal> CPU_SYSTEM = createField("CPU_SYSTEM", org.jooq.impl.SQLDataType.DECIMAL(9, 6).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CONTEXT_VOLUNTARY</code>.
     */
    public final TableField<ProfilingRecord, Integer> CONTEXT_VOLUNTARY = createField("CONTEXT_VOLUNTARY", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CONTEXT_INVOLUNTARY</code>.
     */
    public final TableField<ProfilingRecord, Integer> CONTEXT_INVOLUNTARY = createField("CONTEXT_INVOLUNTARY", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.BLOCK_OPS_IN</code>.
     */
    public final TableField<ProfilingRecord, Integer> BLOCK_OPS_IN = createField("BLOCK_OPS_IN", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.BLOCK_OPS_OUT</code>.
     */
    public final TableField<ProfilingRecord, Integer> BLOCK_OPS_OUT = createField("BLOCK_OPS_OUT", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.MESSAGES_SENT</code>.
     */
    public final TableField<ProfilingRecord, Integer> MESSAGES_SENT = createField("MESSAGES_SENT", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.MESSAGES_RECEIVED</code>.
     */
    public final TableField<ProfilingRecord, Integer> MESSAGES_RECEIVED = createField("MESSAGES_RECEIVED", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.PAGE_FAULTS_MAJOR</code>.
     */
    public final TableField<ProfilingRecord, Integer> PAGE_FAULTS_MAJOR = createField("PAGE_FAULTS_MAJOR", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.PAGE_FAULTS_MINOR</code>.
     */
    public final TableField<ProfilingRecord, Integer> PAGE_FAULTS_MINOR = createField("PAGE_FAULTS_MINOR", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SWAPS</code>.
     */
    public final TableField<ProfilingRecord, Integer> SWAPS = createField("SWAPS", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SOURCE_FUNCTION</code>.
     */
    public final TableField<ProfilingRecord, String> SOURCE_FUNCTION = createField("SOURCE_FUNCTION", org.jooq.impl.SQLDataType.VARCHAR(30).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SOURCE_FILE</code>.
     */
    public final TableField<ProfilingRecord, String> SOURCE_FILE = createField("SOURCE_FILE", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SOURCE_LINE</code>.
     */
    public final TableField<ProfilingRecord, Integer> SOURCE_LINE = createField("SOURCE_LINE", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.PROFILING</code> table reference
     */
    public Profiling() {
        this(DSL.name("PROFILING"), null);
    }

    /**
     * Create an aliased <code>information_schema.PROFILING</code> table reference
     */
    public Profiling(String alias) {
        this(DSL.name(alias), PROFILING);
    }

    /**
     * Create an aliased <code>information_schema.PROFILING</code> table reference
     */
    public Profiling(Name alias) {
        this(alias, PROFILING);
    }

    private Profiling(Name alias, Table<ProfilingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Profiling(Name alias, Table<ProfilingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Profiling(Table<O> child, ForeignKey<O, ProfilingRecord> key) {
        super(child, key, PROFILING);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Profiling as(String alias) {
        return new Profiling(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Profiling as(Name alias) {
        return new Profiling(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Profiling rename(String name) {
        return new Profiling(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Profiling rename(Name name) {
        return new Profiling(name, null);
    }
}
