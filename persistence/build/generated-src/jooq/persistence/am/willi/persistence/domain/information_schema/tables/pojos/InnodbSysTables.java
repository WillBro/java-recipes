/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UInteger;
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
public class InnodbSysTables implements Serializable {

    private static final long serialVersionUID = -1060992054;

    private final ULong    tableId;
    private final String   name;
    private final Integer  flag;
    private final Integer  nCols;
    private final Integer  space;
    private final String   rowFormat;
    private final UInteger zipPageSize;
    private final String   spaceType;

    public InnodbSysTables(InnodbSysTables value) {
        this.tableId = value.tableId;
        this.name = value.name;
        this.flag = value.flag;
        this.nCols = value.nCols;
        this.space = value.space;
        this.rowFormat = value.rowFormat;
        this.zipPageSize = value.zipPageSize;
        this.spaceType = value.spaceType;
    }

    public InnodbSysTables(
        ULong    tableId,
        String   name,
        Integer  flag,
        Integer  nCols,
        Integer  space,
        String   rowFormat,
        UInteger zipPageSize,
        String   spaceType
    ) {
        this.tableId = tableId;
        this.name = name;
        this.flag = flag;
        this.nCols = nCols;
        this.space = space;
        this.rowFormat = rowFormat;
        this.zipPageSize = zipPageSize;
        this.spaceType = spaceType;
    }

    public ULong getTableId() {
        return this.tableId;
    }

    public String getName() {
        return this.name;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public Integer getNCols() {
        return this.nCols;
    }

    public Integer getSpace() {
        return this.space;
    }

    public String getRowFormat() {
        return this.rowFormat;
    }

    public UInteger getZipPageSize() {
        return this.zipPageSize;
    }

    public String getSpaceType() {
        return this.spaceType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbSysTables (");

        sb.append(tableId);
        sb.append(", ").append(name);
        sb.append(", ").append(flag);
        sb.append(", ").append(nCols);
        sb.append(", ").append(space);
        sb.append(", ").append(rowFormat);
        sb.append(", ").append(zipPageSize);
        sb.append(", ").append(spaceType);

        sb.append(")");
        return sb.toString();
    }
}
