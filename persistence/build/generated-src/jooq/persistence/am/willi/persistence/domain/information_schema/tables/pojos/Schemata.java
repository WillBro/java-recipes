/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.pojos;


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
public class Schemata implements Serializable {

    private static final long serialVersionUID = -460412410;

    private final String catalogName;
    private final String schemaName;
    private final String defaultCharacterSetName;
    private final String defaultCollationName;
    private final String sqlPath;

    public Schemata(Schemata value) {
        this.catalogName = value.catalogName;
        this.schemaName = value.schemaName;
        this.defaultCharacterSetName = value.defaultCharacterSetName;
        this.defaultCollationName = value.defaultCollationName;
        this.sqlPath = value.sqlPath;
    }

    public Schemata(
        String catalogName,
        String schemaName,
        String defaultCharacterSetName,
        String defaultCollationName,
        String sqlPath
    ) {
        this.catalogName = catalogName;
        this.schemaName = schemaName;
        this.defaultCharacterSetName = defaultCharacterSetName;
        this.defaultCollationName = defaultCollationName;
        this.sqlPath = sqlPath;
    }

    public String getCatalogName() {
        return this.catalogName;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public String getDefaultCharacterSetName() {
        return this.defaultCharacterSetName;
    }

    public String getDefaultCollationName() {
        return this.defaultCollationName;
    }

    public String getSqlPath() {
        return this.sqlPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Schemata (");

        sb.append(catalogName);
        sb.append(", ").append(schemaName);
        sb.append(", ").append(defaultCharacterSetName);
        sb.append(", ").append(defaultCollationName);
        sb.append(", ").append(sqlPath);

        sb.append(")");
        return sb.toString();
    }
}
