/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables.records;


import am.willi.persistence.domain.mysql.tables.TimeZoneLeapSecond;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Leap seconds information for time zones
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneLeapSecondRecord extends UpdatableRecordImpl<TimeZoneLeapSecondRecord> implements Record2<Long, Integer> {

    private static final long serialVersionUID = 173173658;

    /**
     * Setter for <code>mysql.time_zone_leap_second.Transition_time</code>.
     */
    public TimeZoneLeapSecondRecord setTransitionTime(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.time_zone_leap_second.Transition_time</code>.
     */
    public Long getTransitionTime() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>mysql.time_zone_leap_second.Correction</code>.
     */
    public TimeZoneLeapSecondRecord setCorrection(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.time_zone_leap_second.Correction</code>.
     */
    public Integer getCorrection() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND.TRANSITION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND.CORRECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getTransitionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCorrection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getTransitionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCorrection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimeZoneLeapSecondRecord value1(Long value) {
        setTransitionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimeZoneLeapSecondRecord value2(Integer value) {
        setCorrection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimeZoneLeapSecondRecord values(Long value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TimeZoneLeapSecondRecord
     */
    public TimeZoneLeapSecondRecord() {
        super(TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND);
    }

    /**
     * Create a detached, initialised TimeZoneLeapSecondRecord
     */
    public TimeZoneLeapSecondRecord(Long transitionTime, Integer correction) {
        super(TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND);

        set(0, transitionTime);
        set(1, correction);
    }
}