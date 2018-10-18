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
public class EventsStagesSummaryByThreadByEventName implements Serializable {

    private static final long serialVersionUID = -1238542387;

    private final ULong  threadId;
    private final String eventName;
    private final ULong  countStar;
    private final ULong  sumTimerWait;
    private final ULong  minTimerWait;
    private final ULong  avgTimerWait;
    private final ULong  maxTimerWait;

    public EventsStagesSummaryByThreadByEventName(EventsStagesSummaryByThreadByEventName value) {
        this.threadId = value.threadId;
        this.eventName = value.eventName;
        this.countStar = value.countStar;
        this.sumTimerWait = value.sumTimerWait;
        this.minTimerWait = value.minTimerWait;
        this.avgTimerWait = value.avgTimerWait;
        this.maxTimerWait = value.maxTimerWait;
    }

    public EventsStagesSummaryByThreadByEventName(
        ULong  threadId,
        String eventName,
        ULong  countStar,
        ULong  sumTimerWait,
        ULong  minTimerWait,
        ULong  avgTimerWait,
        ULong  maxTimerWait
    ) {
        this.threadId = threadId;
        this.eventName = eventName;
        this.countStar = countStar;
        this.sumTimerWait = sumTimerWait;
        this.minTimerWait = minTimerWait;
        this.avgTimerWait = avgTimerWait;
        this.maxTimerWait = maxTimerWait;
    }

    public ULong getThreadId() {
        return this.threadId;
    }

    public String getEventName() {
        return this.eventName;
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
        StringBuilder sb = new StringBuilder("EventsStagesSummaryByThreadByEventName (");

        sb.append(threadId);
        sb.append(", ").append(eventName);
        sb.append(", ").append(countStar);
        sb.append(", ").append(sumTimerWait);
        sb.append(", ").append(minTimerWait);
        sb.append(", ").append(avgTimerWait);
        sb.append(", ").append(maxTimerWait);

        sb.append(")");
        return sb.toString();
    }
}
