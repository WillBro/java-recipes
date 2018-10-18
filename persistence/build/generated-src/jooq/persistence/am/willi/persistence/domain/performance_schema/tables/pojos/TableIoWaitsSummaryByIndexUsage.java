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
public class TableIoWaitsSummaryByIndexUsage implements Serializable {

    private static final long serialVersionUID = 1545285050;

    private final String objectType;
    private final String objectSchema;
    private final String objectName;
    private final String indexName;
    private final ULong  countStar;
    private final ULong  sumTimerWait;
    private final ULong  minTimerWait;
    private final ULong  avgTimerWait;
    private final ULong  maxTimerWait;
    private final ULong  countRead;
    private final ULong  sumTimerRead;
    private final ULong  minTimerRead;
    private final ULong  avgTimerRead;
    private final ULong  maxTimerRead;
    private final ULong  countWrite;
    private final ULong  sumTimerWrite;
    private final ULong  minTimerWrite;
    private final ULong  avgTimerWrite;
    private final ULong  maxTimerWrite;
    private final ULong  countFetch;
    private final ULong  sumTimerFetch;
    private final ULong  minTimerFetch;
    private final ULong  avgTimerFetch;
    private final ULong  maxTimerFetch;
    private final ULong  countInsert;
    private final ULong  sumTimerInsert;
    private final ULong  minTimerInsert;
    private final ULong  avgTimerInsert;
    private final ULong  maxTimerInsert;
    private final ULong  countUpdate;
    private final ULong  sumTimerUpdate;
    private final ULong  minTimerUpdate;
    private final ULong  avgTimerUpdate;
    private final ULong  maxTimerUpdate;
    private final ULong  countDelete;
    private final ULong  sumTimerDelete;
    private final ULong  minTimerDelete;
    private final ULong  avgTimerDelete;
    private final ULong  maxTimerDelete;

    public TableIoWaitsSummaryByIndexUsage(TableIoWaitsSummaryByIndexUsage value) {
        this.objectType = value.objectType;
        this.objectSchema = value.objectSchema;
        this.objectName = value.objectName;
        this.indexName = value.indexName;
        this.countStar = value.countStar;
        this.sumTimerWait = value.sumTimerWait;
        this.minTimerWait = value.minTimerWait;
        this.avgTimerWait = value.avgTimerWait;
        this.maxTimerWait = value.maxTimerWait;
        this.countRead = value.countRead;
        this.sumTimerRead = value.sumTimerRead;
        this.minTimerRead = value.minTimerRead;
        this.avgTimerRead = value.avgTimerRead;
        this.maxTimerRead = value.maxTimerRead;
        this.countWrite = value.countWrite;
        this.sumTimerWrite = value.sumTimerWrite;
        this.minTimerWrite = value.minTimerWrite;
        this.avgTimerWrite = value.avgTimerWrite;
        this.maxTimerWrite = value.maxTimerWrite;
        this.countFetch = value.countFetch;
        this.sumTimerFetch = value.sumTimerFetch;
        this.minTimerFetch = value.minTimerFetch;
        this.avgTimerFetch = value.avgTimerFetch;
        this.maxTimerFetch = value.maxTimerFetch;
        this.countInsert = value.countInsert;
        this.sumTimerInsert = value.sumTimerInsert;
        this.minTimerInsert = value.minTimerInsert;
        this.avgTimerInsert = value.avgTimerInsert;
        this.maxTimerInsert = value.maxTimerInsert;
        this.countUpdate = value.countUpdate;
        this.sumTimerUpdate = value.sumTimerUpdate;
        this.minTimerUpdate = value.minTimerUpdate;
        this.avgTimerUpdate = value.avgTimerUpdate;
        this.maxTimerUpdate = value.maxTimerUpdate;
        this.countDelete = value.countDelete;
        this.sumTimerDelete = value.sumTimerDelete;
        this.minTimerDelete = value.minTimerDelete;
        this.avgTimerDelete = value.avgTimerDelete;
        this.maxTimerDelete = value.maxTimerDelete;
    }

    public TableIoWaitsSummaryByIndexUsage(
        String objectType,
        String objectSchema,
        String objectName,
        String indexName,
        ULong  countStar,
        ULong  sumTimerWait,
        ULong  minTimerWait,
        ULong  avgTimerWait,
        ULong  maxTimerWait,
        ULong  countRead,
        ULong  sumTimerRead,
        ULong  minTimerRead,
        ULong  avgTimerRead,
        ULong  maxTimerRead,
        ULong  countWrite,
        ULong  sumTimerWrite,
        ULong  minTimerWrite,
        ULong  avgTimerWrite,
        ULong  maxTimerWrite,
        ULong  countFetch,
        ULong  sumTimerFetch,
        ULong  minTimerFetch,
        ULong  avgTimerFetch,
        ULong  maxTimerFetch,
        ULong  countInsert,
        ULong  sumTimerInsert,
        ULong  minTimerInsert,
        ULong  avgTimerInsert,
        ULong  maxTimerInsert,
        ULong  countUpdate,
        ULong  sumTimerUpdate,
        ULong  minTimerUpdate,
        ULong  avgTimerUpdate,
        ULong  maxTimerUpdate,
        ULong  countDelete,
        ULong  sumTimerDelete,
        ULong  minTimerDelete,
        ULong  avgTimerDelete,
        ULong  maxTimerDelete
    ) {
        this.objectType = objectType;
        this.objectSchema = objectSchema;
        this.objectName = objectName;
        this.indexName = indexName;
        this.countStar = countStar;
        this.sumTimerWait = sumTimerWait;
        this.minTimerWait = minTimerWait;
        this.avgTimerWait = avgTimerWait;
        this.maxTimerWait = maxTimerWait;
        this.countRead = countRead;
        this.sumTimerRead = sumTimerRead;
        this.minTimerRead = minTimerRead;
        this.avgTimerRead = avgTimerRead;
        this.maxTimerRead = maxTimerRead;
        this.countWrite = countWrite;
        this.sumTimerWrite = sumTimerWrite;
        this.minTimerWrite = minTimerWrite;
        this.avgTimerWrite = avgTimerWrite;
        this.maxTimerWrite = maxTimerWrite;
        this.countFetch = countFetch;
        this.sumTimerFetch = sumTimerFetch;
        this.minTimerFetch = minTimerFetch;
        this.avgTimerFetch = avgTimerFetch;
        this.maxTimerFetch = maxTimerFetch;
        this.countInsert = countInsert;
        this.sumTimerInsert = sumTimerInsert;
        this.minTimerInsert = minTimerInsert;
        this.avgTimerInsert = avgTimerInsert;
        this.maxTimerInsert = maxTimerInsert;
        this.countUpdate = countUpdate;
        this.sumTimerUpdate = sumTimerUpdate;
        this.minTimerUpdate = minTimerUpdate;
        this.avgTimerUpdate = avgTimerUpdate;
        this.maxTimerUpdate = maxTimerUpdate;
        this.countDelete = countDelete;
        this.sumTimerDelete = sumTimerDelete;
        this.minTimerDelete = minTimerDelete;
        this.avgTimerDelete = avgTimerDelete;
        this.maxTimerDelete = maxTimerDelete;
    }

    public String getObjectType() {
        return this.objectType;
    }

    public String getObjectSchema() {
        return this.objectSchema;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public ULong getCountStar() {
        return this.countStar;
    }

    public ULong getSumTimerWait() {
        return this.sumTimerWait;
    }

    public ULong getMinTimerWait() {
        return this.minTimerWait;
    }

    public ULong getAvgTimerWait() {
        return this.avgTimerWait;
    }

    public ULong getMaxTimerWait() {
        return this.maxTimerWait;
    }

    public ULong getCountRead() {
        return this.countRead;
    }

    public ULong getSumTimerRead() {
        return this.sumTimerRead;
    }

    public ULong getMinTimerRead() {
        return this.minTimerRead;
    }

    public ULong getAvgTimerRead() {
        return this.avgTimerRead;
    }

    public ULong getMaxTimerRead() {
        return this.maxTimerRead;
    }

    public ULong getCountWrite() {
        return this.countWrite;
    }

    public ULong getSumTimerWrite() {
        return this.sumTimerWrite;
    }

    public ULong getMinTimerWrite() {
        return this.minTimerWrite;
    }

    public ULong getAvgTimerWrite() {
        return this.avgTimerWrite;
    }

    public ULong getMaxTimerWrite() {
        return this.maxTimerWrite;
    }

    public ULong getCountFetch() {
        return this.countFetch;
    }

    public ULong getSumTimerFetch() {
        return this.sumTimerFetch;
    }

    public ULong getMinTimerFetch() {
        return this.minTimerFetch;
    }

    public ULong getAvgTimerFetch() {
        return this.avgTimerFetch;
    }

    public ULong getMaxTimerFetch() {
        return this.maxTimerFetch;
    }

    public ULong getCountInsert() {
        return this.countInsert;
    }

    public ULong getSumTimerInsert() {
        return this.sumTimerInsert;
    }

    public ULong getMinTimerInsert() {
        return this.minTimerInsert;
    }

    public ULong getAvgTimerInsert() {
        return this.avgTimerInsert;
    }

    public ULong getMaxTimerInsert() {
        return this.maxTimerInsert;
    }

    public ULong getCountUpdate() {
        return this.countUpdate;
    }

    public ULong getSumTimerUpdate() {
        return this.sumTimerUpdate;
    }

    public ULong getMinTimerUpdate() {
        return this.minTimerUpdate;
    }

    public ULong getAvgTimerUpdate() {
        return this.avgTimerUpdate;
    }

    public ULong getMaxTimerUpdate() {
        return this.maxTimerUpdate;
    }

    public ULong getCountDelete() {
        return this.countDelete;
    }

    public ULong getSumTimerDelete() {
        return this.sumTimerDelete;
    }

    public ULong getMinTimerDelete() {
        return this.minTimerDelete;
    }

    public ULong getAvgTimerDelete() {
        return this.avgTimerDelete;
    }

    public ULong getMaxTimerDelete() {
        return this.maxTimerDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TableIoWaitsSummaryByIndexUsage (");

        sb.append(objectType);
        sb.append(", ").append(objectSchema);
        sb.append(", ").append(objectName);
        sb.append(", ").append(indexName);
        sb.append(", ").append(countStar);
        sb.append(", ").append(sumTimerWait);
        sb.append(", ").append(minTimerWait);
        sb.append(", ").append(avgTimerWait);
        sb.append(", ").append(maxTimerWait);
        sb.append(", ").append(countRead);
        sb.append(", ").append(sumTimerRead);
        sb.append(", ").append(minTimerRead);
        sb.append(", ").append(avgTimerRead);
        sb.append(", ").append(maxTimerRead);
        sb.append(", ").append(countWrite);
        sb.append(", ").append(sumTimerWrite);
        sb.append(", ").append(minTimerWrite);
        sb.append(", ").append(avgTimerWrite);
        sb.append(", ").append(maxTimerWrite);
        sb.append(", ").append(countFetch);
        sb.append(", ").append(sumTimerFetch);
        sb.append(", ").append(minTimerFetch);
        sb.append(", ").append(avgTimerFetch);
        sb.append(", ").append(maxTimerFetch);
        sb.append(", ").append(countInsert);
        sb.append(", ").append(sumTimerInsert);
        sb.append(", ").append(minTimerInsert);
        sb.append(", ").append(avgTimerInsert);
        sb.append(", ").append(maxTimerInsert);
        sb.append(", ").append(countUpdate);
        sb.append(", ").append(sumTimerUpdate);
        sb.append(", ").append(minTimerUpdate);
        sb.append(", ").append(avgTimerUpdate);
        sb.append(", ").append(maxTimerUpdate);
        sb.append(", ").append(countDelete);
        sb.append(", ").append(sumTimerDelete);
        sb.append(", ").append(minTimerDelete);
        sb.append(", ").append(avgTimerDelete);
        sb.append(", ").append(maxTimerDelete);

        sb.append(")");
        return sb.toString();
    }
}
