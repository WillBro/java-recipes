/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum ProcSqlDataAccess implements EnumType {

    CONTAINS_SQL("CONTAINS_SQL"),

    NO_SQL("NO_SQL"),

    READS_SQL_DATA("READS_SQL_DATA"),

    MODIFIES_SQL_DATA("MODIFIES_SQL_DATA");

    private final String literal;

    private ProcSqlDataAccess(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "proc_sql_data_access";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
