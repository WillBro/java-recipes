/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.performance_schema.tables;


import am.willi.persistence.domain.performance_schema.PerformanceSchema;
import am.willi.persistence.domain.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord;

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
public class EventsWaitsSummaryByInstance extends TableImpl<EventsWaitsSummaryByInstanceRecord> {

    private static final long serialVersionUID = -1967265313;

    /**
     * The reference instance of <code>performance_schema.events_waits_summary_by_instance</code>
     */
    public static final EventsWaitsSummaryByInstance EVENTS_WAITS_SUMMARY_BY_INSTANCE = new EventsWaitsSummaryByInstance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsSummaryByInstanceRecord> getRecordType() {
        return EventsWaitsSummaryByInstanceRecord.class;
    }

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsSummaryByInstanceRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsWaitsSummaryByInstanceRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.COUNT_STAR</code>.
     */
    public final TableField<EventsWaitsSummaryByInstanceRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByInstanceRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByInstanceRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByInstanceRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByInstanceRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_waits_summary_by_instance</code> table reference
     */
    public EventsWaitsSummaryByInstance() {
        this(DSL.name("events_waits_summary_by_instance"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_by_instance</code> table reference
     */
    public EventsWaitsSummaryByInstance(String alias) {
        this(DSL.name(alias), EVENTS_WAITS_SUMMARY_BY_INSTANCE);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_by_instance</code> table reference
     */
    public EventsWaitsSummaryByInstance(Name alias) {
        this(alias, EVENTS_WAITS_SUMMARY_BY_INSTANCE);
    }

    private EventsWaitsSummaryByInstance(Name alias, Table<EventsWaitsSummaryByInstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsWaitsSummaryByInstance(Name alias, Table<EventsWaitsSummaryByInstanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventsWaitsSummaryByInstance(Table<O> child, ForeignKey<O, EventsWaitsSummaryByInstanceRecord> key) {
        super(child, key, EVENTS_WAITS_SUMMARY_BY_INSTANCE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstance as(String alias) {
        return new EventsWaitsSummaryByInstance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstance as(Name alias) {
        return new EventsWaitsSummaryByInstance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByInstance rename(String name) {
        return new EventsWaitsSummaryByInstance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByInstance rename(Name name) {
        return new EventsWaitsSummaryByInstance(name, null);
    }
}
