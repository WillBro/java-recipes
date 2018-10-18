/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.pojos;


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
public class InnodbLocks implements Serializable {

    private static final long serialVersionUID = 1605586659;

    private final String lockId;
    private final String lockTrxId;
    private final String lockMode;
    private final String lockType;
    private final String lockTable;
    private final String lockIndex;
    private final ULong  lockSpace;
    private final ULong  lockPage;
    private final ULong  lockRec;
    private final String lockData;

    public InnodbLocks(InnodbLocks value) {
        this.lockId = value.lockId;
        this.lockTrxId = value.lockTrxId;
        this.lockMode = value.lockMode;
        this.lockType = value.lockType;
        this.lockTable = value.lockTable;
        this.lockIndex = value.lockIndex;
        this.lockSpace = value.lockSpace;
        this.lockPage = value.lockPage;
        this.lockRec = value.lockRec;
        this.lockData = value.lockData;
    }

    public InnodbLocks(
        String lockId,
        String lockTrxId,
        String lockMode,
        String lockType,
        String lockTable,
        String lockIndex,
        ULong  lockSpace,
        ULong  lockPage,
        ULong  lockRec,
        String lockData
    ) {
        this.lockId = lockId;
        this.lockTrxId = lockTrxId;
        this.lockMode = lockMode;
        this.lockType = lockType;
        this.lockTable = lockTable;
        this.lockIndex = lockIndex;
        this.lockSpace = lockSpace;
        this.lockPage = lockPage;
        this.lockRec = lockRec;
        this.lockData = lockData;
    }

    public String getLockId() {
        return this.lockId;
    }

    public String getLockTrxId() {
        return this.lockTrxId;
    }

    public String getLockMode() {
        return this.lockMode;
    }

    public String getLockType() {
        return this.lockType;
    }

    public String getLockTable() {
        return this.lockTable;
    }

    public String getLockIndex() {
        return this.lockIndex;
    }

    public ULong getLockSpace() {
        return this.lockSpace;
    }

    public ULong getLockPage() {
        return this.lockPage;
    }

    public ULong getLockRec() {
        return this.lockRec;
    }

    public String getLockData() {
        return this.lockData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbLocks (");

        sb.append(lockId);
        sb.append(", ").append(lockTrxId);
        sb.append(", ").append(lockMode);
        sb.append(", ").append(lockType);
        sb.append(", ").append(lockTable);
        sb.append(", ").append(lockIndex);
        sb.append(", ").append(lockSpace);
        sb.append(", ").append(lockPage);
        sb.append(", ").append(lockRec);
        sb.append(", ").append(lockData);

        sb.append(")");
        return sb.toString();
    }
}