/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * Time zone transition types
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransitionType implements Serializable {

    private static final long serialVersionUID = 723058442;

    private final UInteger timeZoneId;
    private final UInteger transitionTypeId;
    private final Integer  offset;
    private final UByte    isDst;
    private final String   abbreviation;

    public TimeZoneTransitionType(TimeZoneTransitionType value) {
        this.timeZoneId = value.timeZoneId;
        this.transitionTypeId = value.transitionTypeId;
        this.offset = value.offset;
        this.isDst = value.isDst;
        this.abbreviation = value.abbreviation;
    }

    public TimeZoneTransitionType(
        UInteger timeZoneId,
        UInteger transitionTypeId,
        Integer  offset,
        UByte    isDst,
        String   abbreviation
    ) {
        this.timeZoneId = timeZoneId;
        this.transitionTypeId = transitionTypeId;
        this.offset = offset;
        this.isDst = isDst;
        this.abbreviation = abbreviation;
    }

    public UInteger getTimeZoneId() {
        return this.timeZoneId;
    }

    public UInteger getTransitionTypeId() {
        return this.transitionTypeId;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public UByte getIsDst() {
        return this.isDst;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TimeZoneTransitionType (");

        sb.append(timeZoneId);
        sb.append(", ").append(transitionTypeId);
        sb.append(", ").append(offset);
        sb.append(", ").append(isDst);
        sb.append(", ").append(abbreviation);

        sb.append(")");
        return sb.toString();
    }
}
