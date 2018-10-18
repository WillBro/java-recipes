/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class InnodbTableStats implements Serializable {

    private static final long serialVersionUID = -1399281350;

    private final String    databaseName;
    private final String    tableName;
    private final Timestamp lastUpdate;
    private final ULong     nRows;
    private final ULong     clusteredIndexSize;
    private final ULong     sumOfOtherIndexSizes;

    public InnodbTableStats(InnodbTableStats value) {
        this.databaseName = value.databaseName;
        this.tableName = value.tableName;
        this.lastUpdate = value.lastUpdate;
        this.nRows = value.nRows;
        this.clusteredIndexSize = value.clusteredIndexSize;
        this.sumOfOtherIndexSizes = value.sumOfOtherIndexSizes;
    }

    public InnodbTableStats(
        String    databaseName,
        String    tableName,
        Timestamp lastUpdate,
        ULong     nRows,
        ULong     clusteredIndexSize,
        ULong     sumOfOtherIndexSizes
    ) {
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.lastUpdate = lastUpdate;
        this.nRows = nRows;
        this.clusteredIndexSize = clusteredIndexSize;
        this.sumOfOtherIndexSizes = sumOfOtherIndexSizes;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public ULong getNRows() {
        return this.nRows;
    }

    public ULong getClusteredIndexSize() {
        return this.clusteredIndexSize;
    }

    public ULong getSumOfOtherIndexSizes() {
        return this.sumOfOtherIndexSizes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbTableStats (");

        sb.append(databaseName);
        sb.append(", ").append(tableName);
        sb.append(", ").append(lastUpdate);
        sb.append(", ").append(nRows);
        sb.append(", ").append(clusteredIndexSize);
        sb.append(", ").append(sumOfOtherIndexSizes);

        sb.append(")");
        return sb.toString();
    }
}