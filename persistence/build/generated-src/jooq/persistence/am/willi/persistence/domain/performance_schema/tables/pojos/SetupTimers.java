/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.performance_schema.tables.pojos;


import am.willi.persistence.domain.performance_schema.enums.SetupTimersTimerName;

import java.io.Serializable;

import javax.annotation.Generated;


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
public class SetupTimers implements Serializable {

    private static final long serialVersionUID = -1451536843;

    private final String               name;
    private final SetupTimersTimerName timerName;

    public SetupTimers(SetupTimers value) {
        this.name = value.name;
        this.timerName = value.timerName;
    }

    public SetupTimers(
        String               name,
        SetupTimersTimerName timerName
    ) {
        this.name = name;
        this.timerName = timerName;
    }

    public String getName() {
        return this.name;
    }

    public SetupTimersTimerName getTimerName() {
        return this.timerName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SetupTimers (");

        sb.append(name);
        sb.append(", ").append(timerName);

        sb.append(")");
        return sb.toString();
    }
}
