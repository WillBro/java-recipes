/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * MySQL plugins
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Plugin implements Serializable {

    private static final long serialVersionUID = -2037378695;

    private final String name;
    private final String dl;

    public Plugin(Plugin value) {
        this.name = value.name;
        this.dl = value.dl;
    }

    public Plugin(
        String name,
        String dl
    ) {
        this.name = name;
        this.dl = dl;
    }

    public String getName() {
        return this.name;
    }

    public String getDl() {
        return this.dl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Plugin (");

        sb.append(name);
        sb.append(", ").append(dl);

        sb.append(")");
        return sb.toString();
    }
}
