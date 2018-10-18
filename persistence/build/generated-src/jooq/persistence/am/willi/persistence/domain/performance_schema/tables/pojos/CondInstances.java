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
public class CondInstances implements Serializable {

    private static final long serialVersionUID = -1836689761;

    private final String name;
    private final ULong  objectInstanceBegin;

    public CondInstances(CondInstances value) {
        this.name = value.name;
        this.objectInstanceBegin = value.objectInstanceBegin;
    }

    public CondInstances(
        String name,
        ULong  objectInstanceBegin
    ) {
        this.name = name;
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public String getName() {
        return this.name;
    }

    public ULong getObjectInstanceBegin() {
        return this.objectInstanceBegin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CondInstances (");

        sb.append(name);
        sb.append(", ").append(objectInstanceBegin);

        sb.append(")");
        return sb.toString();
    }
}