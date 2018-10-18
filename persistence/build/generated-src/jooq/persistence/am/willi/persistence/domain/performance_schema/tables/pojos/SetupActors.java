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
public class SetupActors implements Serializable {

    private static final long serialVersionUID = -1083721217;

    private final String host;
    private final String user;
    private final String role;

    public SetupActors(SetupActors value) {
        this.host = value.host;
        this.user = value.user;
        this.role = value.role;
    }

    public SetupActors(
        String host,
        String user,
        String role
    ) {
        this.host = host;
        this.user = user;
        this.role = role;
    }

    public String getHost() {
        return this.host;
    }

    public String getUser() {
        return this.user;
    }

    public String getRole() {
        return this.role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SetupActors (");

        sb.append(host);
        sb.append(", ").append(user);
        sb.append(", ").append(role);

        sb.append(")");
        return sb.toString();
    }
}
