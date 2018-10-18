/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.performance_schema.tables;


import am.willi.persistence.domain.performance_schema.PerformanceSchema;
import am.willi.persistence.domain.performance_schema.tables.records.EventsStagesSummaryByUserByEventNameRecord;

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
public class EventsStagesSummaryByUserByEventName extends TableImpl<EventsStagesSummaryByUserByEventNameRecord> {

    private static final long serialVersionUID = -927206459;

    /**
     * The reference instance of <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
     */
    public static final EventsStagesSummaryByUserByEventName EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME = new EventsStagesSummaryByUserByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStagesSummaryByUserByEventNameRecord> getRecordType() {
        return EventsStagesSummaryByUserByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.USER</code>.
     */
    public final TableField<EventsStagesSummaryByUserByEventNameRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsStagesSummaryByUserByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesSummaryByUserByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_stages_summary_by_user_by_event_name</code> table reference
     */
    public EventsStagesSummaryByUserByEventName() {
        this(DSL.name("events_stages_summary_by_user_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_summary_by_user_by_event_name</code> table reference
     */
    public EventsStagesSummaryByUserByEventName(String alias) {
        this(DSL.name(alias), EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_summary_by_user_by_event_name</code> table reference
     */
    public EventsStagesSummaryByUserByEventName(Name alias) {
        this(alias, EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    private EventsStagesSummaryByUserByEventName(Name alias, Table<EventsStagesSummaryByUserByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStagesSummaryByUserByEventName(Name alias, Table<EventsStagesSummaryByUserByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventsStagesSummaryByUserByEventName(Table<O> child, ForeignKey<O, EventsStagesSummaryByUserByEventNameRecord> key) {
        super(child, key, EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME);
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
    public EventsStagesSummaryByUserByEventName as(String alias) {
        return new EventsStagesSummaryByUserByEventName(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesSummaryByUserByEventName as(Name alias) {
        return new EventsStagesSummaryByUserByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesSummaryByUserByEventName rename(String name) {
        return new EventsStagesSummaryByUserByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesSummaryByUserByEventName rename(Name name) {
        return new EventsStagesSummaryByUserByEventName(name, null);
    }
}
