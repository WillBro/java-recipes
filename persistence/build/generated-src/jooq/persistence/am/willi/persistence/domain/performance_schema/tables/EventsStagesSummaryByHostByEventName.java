/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.performance_schema.tables;


import am.willi.persistence.domain.performance_schema.PerformanceSchema;
import am.willi.persistence.domain.performance_schema.tables.records.EventsStagesSummaryByHostByEventNameRecord;

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
public class EventsStagesSummaryByHostByEventName extends TableImpl<EventsStagesSummaryByHostByEventNameRecord> {

    private static final long serialVersionUID = 680197064;

    /**
     * The reference instance of <code>performance_schema.events_stages_summary_by_host_by_event_name</code>
     */
    public static final EventsStagesSummaryByHostByEventName EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME = new EventsStagesSummaryByHostByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStagesSummaryByHostByEventNameRecord> getRecordType() {
        return EventsStagesSummaryByHostByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_stages_summary_by_host_by_event_name.HOST</code>.
     */
    public final TableField<EventsStagesSummaryByHostByEventNameRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR(60).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_host_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsStagesSummaryByHostByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_host_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsStagesSummaryByHostByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_host_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesSummaryByHostByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_host_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesSummaryByHostByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_host_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesSummaryByHostByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_host_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesSummaryByHostByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_stages_summary_by_host_by_event_name</code> table reference
     */
    public EventsStagesSummaryByHostByEventName() {
        this(DSL.name("events_stages_summary_by_host_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_summary_by_host_by_event_name</code> table reference
     */
    public EventsStagesSummaryByHostByEventName(String alias) {
        this(DSL.name(alias), EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_summary_by_host_by_event_name</code> table reference
     */
    public EventsStagesSummaryByHostByEventName(Name alias) {
        this(alias, EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME);
    }

    private EventsStagesSummaryByHostByEventName(Name alias, Table<EventsStagesSummaryByHostByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStagesSummaryByHostByEventName(Name alias, Table<EventsStagesSummaryByHostByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventsStagesSummaryByHostByEventName(Table<O> child, ForeignKey<O, EventsStagesSummaryByHostByEventNameRecord> key) {
        super(child, key, EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME);
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
    public EventsStagesSummaryByHostByEventName as(String alias) {
        return new EventsStagesSummaryByHostByEventName(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesSummaryByHostByEventName as(Name alias) {
        return new EventsStagesSummaryByHostByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesSummaryByHostByEventName rename(String name) {
        return new EventsStagesSummaryByHostByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesSummaryByHostByEventName rename(Name name) {
        return new EventsStagesSummaryByHostByEventName(name, null);
    }
}
