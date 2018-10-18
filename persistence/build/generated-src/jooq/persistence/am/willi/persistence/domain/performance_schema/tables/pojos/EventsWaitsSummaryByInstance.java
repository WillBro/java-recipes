/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.performance_schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

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
public class EventsWaitsSummaryByInstance implements Serializable {

    private static final long serialVersionUID = -205617819;

    private final String eventName;
    private final ULong  objectInstanceBegin;
    private final ULong  countStar;
    private final ULong  sumTimerWait;
    private final ULong  minTimerWait;
    private final ULong  avgTimerWait;
    private final ULong  maxTimerWait;

    public EventsWaitsSummaryByInstance(EventsWaitsSummaryByInstance value) {
        this.eventName = value.eventName;
        this.objectInstanceBegin = value.objectInstanceBegin;
        this.countStar = value.countStar;
        this.sumTimerWait = value.sumTimerWait;
        this.minTimerWait = value.minTimerWait;
        this.avgTimerWait = value.avgTimerWait;
        this.maxTimerWait = value.maxTimerWait;
    }

    public EventsWaitsSummaryByInstance(
        String eventName,
        ULong  objectInstanceBegin,
        ULong  countStar,
        ULong  sumTimerWait,
        ULong  minTimerWait,
        ULong  avgTimerWait,
        ULong  maxTimerWait
    ) {
        this.eventName = eventName;
        this.objectInstanceBegin = objectInstanceBegin;
        this.countStar = countStar;
        this.sumTimerWait = sumTimerWait;
        this.minTimerWait = minTimerWait;
        this.avgTimerWait = avgTimerWait;
        this.maxTimerWait = maxTimerWait;
    }

    public String getEventName() {
        return this.eventName;
    }

    public ULong getObjectInstanceBegin() {
        return this.objectInstanceBegin;
    }

    public ULong getCountStar() {
        return this.countStar;
    }

    public ULong getSumTimerWait() {
        return this.sumTimerWait;
    }

    public ULong getMinTimerWait() {
        return this.minTimerWait;
    }

    public ULong getAvgTimerWait() {
        return this.avgTimerWait;
    }

    public ULong getMaxTimerWait() {
        return this.maxTimerWait;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EventsWaitsSummaryByInstance (");

        sb.append(eventName);
        sb.append(", ").append(objectInstanceBegin);
        sb.append(", ").append(countStar);
        sb.append(", ").append(sumTimerWait);
        sb.append(", ").append(minTimerWait);
        sb.append(", ").append(avgTimerWait);
        sb.append(", ").append(maxTimerWait);

        sb.append(")");
        return sb.toString();
    }
}
