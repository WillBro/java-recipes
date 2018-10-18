/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.records;


import am.willi.persistence.domain.information_schema.tables.Events;

import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class EventsRecord extends TableRecordImpl<EventsRecord> {

    private static final long serialVersionUID = 552302373;

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_CATALOG</code>.
     */
    public EventsRecord setEventCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_CATALOG</code>.
     */
    public String getEventCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
     */
    public EventsRecord setEventSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
     */
    public String getEventSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_NAME</code>.
     */
    public EventsRecord setEventName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.EVENTS.DEFINER</code>.
     */
    public EventsRecord setDefiner(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.DEFINER</code>.
     */
    public String getDefiner() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.EVENTS.TIME_ZONE</code>.
     */
    public EventsRecord setTimeZone(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.TIME_ZONE</code>.
     */
    public String getTimeZone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_BODY</code>.
     */
    public EventsRecord setEventBody(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_BODY</code>.
     */
    public String getEventBody() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
     */
    public EventsRecord setEventDefinition(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
     */
    public String getEventDefinition() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_TYPE</code>.
     */
    public EventsRecord setEventType(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_TYPE</code>.
     */
    public String getEventType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EXECUTE_AT</code>.
     */
    public EventsRecord setExecuteAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EXECUTE_AT</code>.
     */
    public Timestamp getExecuteAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
     */
    public EventsRecord setIntervalValue(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
     */
    public String getIntervalValue() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
     */
    public EventsRecord setIntervalField(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
     */
    public String getIntervalField() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.EVENTS.SQL_MODE</code>.
     */
    public EventsRecord setSqlMode(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.SQL_MODE</code>.
     */
    public String getSqlMode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.EVENTS.STARTS</code>.
     */
    public EventsRecord setStarts(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.STARTS</code>.
     */
    public Timestamp getStarts() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>information_schema.EVENTS.ENDS</code>.
     */
    public EventsRecord setEnds(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.ENDS</code>.
     */
    public Timestamp getEnds() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>information_schema.EVENTS.STATUS</code>.
     */
    public EventsRecord setStatus(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.EVENTS.ON_COMPLETION</code>.
     */
    public EventsRecord setOnCompletion(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.ON_COMPLETION</code>.
     */
    public String getOnCompletion() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.EVENTS.CREATED</code>.
     */
    public EventsRecord setCreated(Timestamp value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.CREATED</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>information_schema.EVENTS.LAST_ALTERED</code>.
     */
    public EventsRecord setLastAltered(Timestamp value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.LAST_ALTERED</code>.
     */
    public Timestamp getLastAltered() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>information_schema.EVENTS.LAST_EXECUTED</code>.
     */
    public EventsRecord setLastExecuted(Timestamp value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.LAST_EXECUTED</code>.
     */
    public Timestamp getLastExecuted() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_COMMENT</code>.
     */
    public EventsRecord setEventComment(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_COMMENT</code>.
     */
    public String getEventComment() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.EVENTS.ORIGINATOR</code>.
     */
    public EventsRecord setOriginator(Long value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.ORIGINATOR</code>.
     */
    public Long getOriginator() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
     */
    public EventsRecord setCharacterSetClient(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return (String) get(21);
    }

    /**
     * Setter for <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
     */
    public EventsRecord setCollationConnection(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return (String) get(22);
    }

    /**
     * Setter for <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
     */
    public EventsRecord setDatabaseCollation(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
     */
    public String getDatabaseCollation() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsRecord
     */
    public EventsRecord() {
        super(Events.EVENTS);
    }

    /**
     * Create a detached, initialised EventsRecord
     */
    public EventsRecord(String eventCatalog, String eventSchema, String eventName, String definer, String timeZone, String eventBody, String eventDefinition, String eventType, Timestamp executeAt, String intervalValue, String intervalField, String sqlMode, Timestamp starts, Timestamp ends, String status, String onCompletion, Timestamp created, Timestamp lastAltered, Timestamp lastExecuted, String eventComment, Long originator, String characterSetClient, String collationConnection, String databaseCollation) {
        super(Events.EVENTS);

        set(0, eventCatalog);
        set(1, eventSchema);
        set(2, eventName);
        set(3, definer);
        set(4, timeZone);
        set(5, eventBody);
        set(6, eventDefinition);
        set(7, eventType);
        set(8, executeAt);
        set(9, intervalValue);
        set(10, intervalField);
        set(11, sqlMode);
        set(12, starts);
        set(13, ends);
        set(14, status);
        set(15, onCompletion);
        set(16, created);
        set(17, lastAltered);
        set(18, lastExecuted);
        set(19, eventComment);
        set(20, originator);
        set(21, characterSetClient);
        set(22, collationConnection);
        set(23, databaseCollation);
    }
}
