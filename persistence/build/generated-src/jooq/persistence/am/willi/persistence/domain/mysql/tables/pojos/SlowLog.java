/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables.pojos;


import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Slow log
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlowLog implements Serializable {

    private static final long serialVersionUID = -1036233124;

    private final Timestamp startTime;
    private final String    userHost;
    private final Time      queryTime;
    private final Time      lockTime;
    private final Integer   rowsSent;
    private final Integer   rowsExamined;
    private final String    db;
    private final Integer   lastInsertId;
    private final Integer   insertId;
    private final UInteger  serverId;
    private final String    sqlText;
    private final ULong     threadId;
    private final Integer   rowsAffected;

    public SlowLog(SlowLog value) {
        this.startTime = value.startTime;
        this.userHost = value.userHost;
        this.queryTime = value.queryTime;
        this.lockTime = value.lockTime;
        this.rowsSent = value.rowsSent;
        this.rowsExamined = value.rowsExamined;
        this.db = value.db;
        this.lastInsertId = value.lastInsertId;
        this.insertId = value.insertId;
        this.serverId = value.serverId;
        this.sqlText = value.sqlText;
        this.threadId = value.threadId;
        this.rowsAffected = value.rowsAffected;
    }

    public SlowLog(
        Timestamp startTime,
        String    userHost,
        Time      queryTime,
        Time      lockTime,
        Integer   rowsSent,
        Integer   rowsExamined,
        String    db,
        Integer   lastInsertId,
        Integer   insertId,
        UInteger  serverId,
        String    sqlText,
        ULong     threadId,
        Integer   rowsAffected
    ) {
        this.startTime = startTime;
        this.userHost = userHost;
        this.queryTime = queryTime;
        this.lockTime = lockTime;
        this.rowsSent = rowsSent;
        this.rowsExamined = rowsExamined;
        this.db = db;
        this.lastInsertId = lastInsertId;
        this.insertId = insertId;
        this.serverId = serverId;
        this.sqlText = sqlText;
        this.threadId = threadId;
        this.rowsAffected = rowsAffected;
    }

    public Timestamp getStartTime() {
        return this.startTime;
    }

    public String getUserHost() {
        return this.userHost;
    }

    public Time getQueryTime() {
        return this.queryTime;
    }

    public Time getLockTime() {
        return this.lockTime;
    }

    public Integer getRowsSent() {
        return this.rowsSent;
    }

    public Integer getRowsExamined() {
        return this.rowsExamined;
    }

    public String getDb() {
        return this.db;
    }

    public Integer getLastInsertId() {
        return this.lastInsertId;
    }

    public Integer getInsertId() {
        return this.insertId;
    }

    public UInteger getServerId() {
        return this.serverId;
    }

    public String getSqlText() {
        return this.sqlText;
    }

    public ULong getThreadId() {
        return this.threadId;
    }

    public Integer getRowsAffected() {
        return this.rowsAffected;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SlowLog (");

        sb.append(startTime);
        sb.append(", ").append(userHost);
        sb.append(", ").append(queryTime);
        sb.append(", ").append(lockTime);
        sb.append(", ").append(rowsSent);
        sb.append(", ").append(rowsExamined);
        sb.append(", ").append(db);
        sb.append(", ").append(lastInsertId);
        sb.append(", ").append(insertId);
        sb.append(", ").append(serverId);
        sb.append(", ").append(sqlText);
        sb.append(", ").append(threadId);
        sb.append(", ").append(rowsAffected);

        sb.append(")");
        return sb.toString();
    }
}