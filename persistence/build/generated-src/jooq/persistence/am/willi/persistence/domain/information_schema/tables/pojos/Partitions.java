/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.pojos;


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
public class Partitions implements Serializable {

    private static final long serialVersionUID = 298859398;

    private final String    tableCatalog;
    private final String    tableSchema;
    private final String    tableName;
    private final String    partitionName;
    private final String    subpartitionName;
    private final ULong     partitionOrdinalPosition;
    private final ULong     subpartitionOrdinalPosition;
    private final String    partitionMethod;
    private final String    subpartitionMethod;
    private final String    partitionExpression;
    private final String    subpartitionExpression;
    private final String    partitionDescription;
    private final ULong     tableRows;
    private final ULong     avgRowLength;
    private final ULong     dataLength;
    private final ULong     maxDataLength;
    private final ULong     indexLength;
    private final ULong     dataFree;
    private final Timestamp createTime;
    private final Timestamp updateTime;
    private final Timestamp checkTime;
    private final ULong     checksum;
    private final String    partitionComment;
    private final String    nodegroup;
    private final String    tablespaceName;

    public Partitions(Partitions value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.partitionName = value.partitionName;
        this.subpartitionName = value.subpartitionName;
        this.partitionOrdinalPosition = value.partitionOrdinalPosition;
        this.subpartitionOrdinalPosition = value.subpartitionOrdinalPosition;
        this.partitionMethod = value.partitionMethod;
        this.subpartitionMethod = value.subpartitionMethod;
        this.partitionExpression = value.partitionExpression;
        this.subpartitionExpression = value.subpartitionExpression;
        this.partitionDescription = value.partitionDescription;
        this.tableRows = value.tableRows;
        this.avgRowLength = value.avgRowLength;
        this.dataLength = value.dataLength;
        this.maxDataLength = value.maxDataLength;
        this.indexLength = value.indexLength;
        this.dataFree = value.dataFree;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.checkTime = value.checkTime;
        this.checksum = value.checksum;
        this.partitionComment = value.partitionComment;
        this.nodegroup = value.nodegroup;
        this.tablespaceName = value.tablespaceName;
    }

    public Partitions(
        String    tableCatalog,
        String    tableSchema,
        String    tableName,
        String    partitionName,
        String    subpartitionName,
        ULong     partitionOrdinalPosition,
        ULong     subpartitionOrdinalPosition,
        String    partitionMethod,
        String    subpartitionMethod,
        String    partitionExpression,
        String    subpartitionExpression,
        String    partitionDescription,
        ULong     tableRows,
        ULong     avgRowLength,
        ULong     dataLength,
        ULong     maxDataLength,
        ULong     indexLength,
        ULong     dataFree,
        Timestamp createTime,
        Timestamp updateTime,
        Timestamp checkTime,
        ULong     checksum,
        String    partitionComment,
        String    nodegroup,
        String    tablespaceName
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.partitionName = partitionName;
        this.subpartitionName = subpartitionName;
        this.partitionOrdinalPosition = partitionOrdinalPosition;
        this.subpartitionOrdinalPosition = subpartitionOrdinalPosition;
        this.partitionMethod = partitionMethod;
        this.subpartitionMethod = subpartitionMethod;
        this.partitionExpression = partitionExpression;
        this.subpartitionExpression = subpartitionExpression;
        this.partitionDescription = partitionDescription;
        this.tableRows = tableRows;
        this.avgRowLength = avgRowLength;
        this.dataLength = dataLength;
        this.maxDataLength = maxDataLength;
        this.indexLength = indexLength;
        this.dataFree = dataFree;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.checkTime = checkTime;
        this.checksum = checksum;
        this.partitionComment = partitionComment;
        this.nodegroup = nodegroup;
        this.tablespaceName = tablespaceName;
    }

    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public String getTableSchema() {
        return this.tableSchema;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getPartitionName() {
        return this.partitionName;
    }

    public String getSubpartitionName() {
        return this.subpartitionName;
    }

    public ULong getPartitionOrdinalPosition() {
        return this.partitionOrdinalPosition;
    }

    public ULong getSubpartitionOrdinalPosition() {
        return this.subpartitionOrdinalPosition;
    }

    public String getPartitionMethod() {
        return this.partitionMethod;
    }

    public String getSubpartitionMethod() {
        return this.subpartitionMethod;
    }

    public String getPartitionExpression() {
        return this.partitionExpression;
    }

    public String getSubpartitionExpression() {
        return this.subpartitionExpression;
    }

    public String getPartitionDescription() {
        return this.partitionDescription;
    }

    public ULong getTableRows() {
        return this.tableRows;
    }

    public ULong getAvgRowLength() {
        return this.avgRowLength;
    }

    public ULong getDataLength() {
        return this.dataLength;
    }

    public ULong getMaxDataLength() {
        return this.maxDataLength;
    }

    public ULong getIndexLength() {
        return this.indexLength;
    }

    public ULong getDataFree() {
        return this.dataFree;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public Timestamp getCheckTime() {
        return this.checkTime;
    }

    public ULong getChecksum() {
        return this.checksum;
    }

    public String getPartitionComment() {
        return this.partitionComment;
    }

    public String getNodegroup() {
        return this.nodegroup;
    }

    public String getTablespaceName() {
        return this.tablespaceName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Partitions (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(partitionName);
        sb.append(", ").append(subpartitionName);
        sb.append(", ").append(partitionOrdinalPosition);
        sb.append(", ").append(subpartitionOrdinalPosition);
        sb.append(", ").append(partitionMethod);
        sb.append(", ").append(subpartitionMethod);
        sb.append(", ").append(partitionExpression);
        sb.append(", ").append(subpartitionExpression);
        sb.append(", ").append(partitionDescription);
        sb.append(", ").append(tableRows);
        sb.append(", ").append(avgRowLength);
        sb.append(", ").append(dataLength);
        sb.append(", ").append(maxDataLength);
        sb.append(", ").append(indexLength);
        sb.append(", ").append(dataFree);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(checkTime);
        sb.append(", ").append(checksum);
        sb.append(", ").append(partitionComment);
        sb.append(", ").append(nodegroup);
        sb.append(", ").append(tablespaceName);

        sb.append(")");
        return sb.toString();
    }
}
