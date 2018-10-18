/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.performance_schema.tables.pojos;


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
public class SessionConnectAttrs implements Serializable {

    private static final long serialVersionUID = 2079996498;

    private final Integer processlistId;
    private final String  attrName;
    private final String  attrValue;
    private final Integer ordinalPosition;

    public SessionConnectAttrs(SessionConnectAttrs value) {
        this.processlistId = value.processlistId;
        this.attrName = value.attrName;
        this.attrValue = value.attrValue;
        this.ordinalPosition = value.ordinalPosition;
    }

    public SessionConnectAttrs(
        Integer processlistId,
        String  attrName,
        String  attrValue,
        Integer ordinalPosition
    ) {
        this.processlistId = processlistId;
        this.attrName = attrName;
        this.attrValue = attrValue;
        this.ordinalPosition = ordinalPosition;
    }

    public Integer getProcesslistId() {
        return this.processlistId;
    }

    public String getAttrName() {
        return this.attrName;
    }

    public String getAttrValue() {
        return this.attrValue;
    }

    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SessionConnectAttrs (");

        sb.append(processlistId);
        sb.append(", ").append(attrName);
        sb.append(", ").append(attrValue);
        sb.append(", ").append(ordinalPosition);

        sb.append(")");
        return sb.toString();
    }
}