/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.performance_schema.tables;


import am.willi.persistence.domain.performance_schema.PerformanceSchema;
import am.willi.persistence.domain.performance_schema.enums.EventsStatementsHistoryLongNestingEventType;
import am.willi.persistence.domain.performance_schema.tables.records.EventsStatementsHistoryLongRecord;

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
public class EventsStatementsHistoryLong extends TableImpl<EventsStatementsHistoryLongRecord> {

    private static final long serialVersionUID = -950303801;

    /**
     * The reference instance of <code>performance_schema.events_statements_history_long</code>
     */
    public static final EventsStatementsHistoryLong EVENTS_STATEMENTS_HISTORY_LONG = new EventsStatementsHistoryLong();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStatementsHistoryLongRecord> getRecordType() {
        return EventsStatementsHistoryLongRecord.class;
    }

    /**
     * The column <code>performance_schema.events_statements_history_long.THREAD_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.EVENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.END_EVENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.EVENT_NAME</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SOURCE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.TIMER_START</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.TIMER_END</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.LOCK_TIME</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> LOCK_TIME = createField("LOCK_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SQL_TEXT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> SQL_TEXT = createField("SQL_TEXT", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.DIGEST</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> DIGEST = createField("DIGEST", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.DIGEST_TEXT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> DIGEST_TEXT = createField("DIGEST_TEXT", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.CURRENT_SCHEMA</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> CURRENT_SCHEMA = createField("CURRENT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_TYPE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_SCHEMA</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_NAME</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.MYSQL_ERRNO</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, Integer> MYSQL_ERRNO = createField("MYSQL_ERRNO", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.RETURNED_SQLSTATE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> RETURNED_SQLSTATE = createField("RETURNED_SQLSTATE", org.jooq.impl.SQLDataType.VARCHAR(5).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.MESSAGE_TEXT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, String> MESSAGE_TEXT = createField("MESSAGE_TEXT", org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ERRORS</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ERRORS = createField("ERRORS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.WARNINGS</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> WARNINGS = createField("WARNINGS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ROWS_AFFECTED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ROWS_AFFECTED = createField("ROWS_AFFECTED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ROWS_SENT</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ROWS_SENT = createField("ROWS_SENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.ROWS_EXAMINED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> ROWS_EXAMINED = createField("ROWS_EXAMINED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> CREATED_TMP_DISK_TABLES = createField("CREATED_TMP_DISK_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.CREATED_TMP_TABLES</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> CREATED_TMP_TABLES = createField("CREATED_TMP_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_FULL_JOIN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_FULL_JOIN = createField("SELECT_FULL_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_FULL_RANGE_JOIN = createField("SELECT_FULL_RANGE_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_RANGE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_RANGE = createField("SELECT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_RANGE_CHECK</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_RANGE_CHECK = createField("SELECT_RANGE_CHECK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SELECT_SCAN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SELECT_SCAN = createField("SELECT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_MERGE_PASSES</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_MERGE_PASSES = createField("SORT_MERGE_PASSES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_RANGE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_RANGE = createField("SORT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_ROWS</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_ROWS = createField("SORT_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.SORT_SCAN</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> SORT_SCAN = createField("SORT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NO_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> NO_INDEX_USED = createField("NO_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> NO_GOOD_INDEX_USED = createField("NO_GOOD_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>performance_schema.events_statements_history_long.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsStatementsHistoryLongRecord, EventsStatementsHistoryLongNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(9).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(am.willi.persistence.domain.performance_schema.enums.EventsStatementsHistoryLongNestingEventType.class), this, "");

    /**
     * Create a <code>performance_schema.events_statements_history_long</code> table reference
     */
    public EventsStatementsHistoryLong() {
        this(DSL.name("events_statements_history_long"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_history_long</code> table reference
     */
    public EventsStatementsHistoryLong(String alias) {
        this(DSL.name(alias), EVENTS_STATEMENTS_HISTORY_LONG);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_history_long</code> table reference
     */
    public EventsStatementsHistoryLong(Name alias) {
        this(alias, EVENTS_STATEMENTS_HISTORY_LONG);
    }

    private EventsStatementsHistoryLong(Name alias, Table<EventsStatementsHistoryLongRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStatementsHistoryLong(Name alias, Table<EventsStatementsHistoryLongRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventsStatementsHistoryLong(Table<O> child, ForeignKey<O, EventsStatementsHistoryLongRecord> key) {
        super(child, key, EVENTS_STATEMENTS_HISTORY_LONG);
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
    public EventsStatementsHistoryLong as(String alias) {
        return new EventsStatementsHistoryLong(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStatementsHistoryLong as(Name alias) {
        return new EventsStatementsHistoryLong(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsHistoryLong rename(String name) {
        return new EventsStatementsHistoryLong(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsHistoryLong rename(Name name) {
        return new EventsStatementsHistoryLong(name, null);
    }
}
