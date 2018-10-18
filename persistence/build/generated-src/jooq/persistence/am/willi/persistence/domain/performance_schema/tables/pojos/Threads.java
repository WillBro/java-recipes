/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.performance_schema.tables.pojos;


import am.willi.persistence.domain.performance_schema.enums.ThreadsInstrumented;

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
public class Threads implements Serializable {

    private static final long serialVersionUID = 1353309816;

    private final ULong               threadId;
    private final String              name;
    private final String              type;
    private final ULong               processlistId;
    private final String              processlistUser;
    private final String              processlistHost;
    private final String              processlistDb;
    private final String              processlistCommand;
    private final Long                processlistTime;
    private final String              processlistState;
    private final String              processlistInfo;
    private final ULong               parentThreadId;
    private final String              role;
    private final ThreadsInstrumented instrumented;

    public Threads(Threads value) {
        this.threadId = value.threadId;
        this.name = value.name;
        this.type = value.type;
        this.processlistId = value.processlistId;
        this.processlistUser = value.processlistUser;
        this.processlistHost = value.processlistHost;
        this.processlistDb = value.processlistDb;
        this.processlistCommand = value.processlistCommand;
        this.processlistTime = value.processlistTime;
        this.processlistState = value.processlistState;
        this.processlistInfo = value.processlistInfo;
        this.parentThreadId = value.parentThreadId;
        this.role = value.role;
        this.instrumented = value.instrumented;
    }

    public Threads(
        ULong               threadId,
        String              name,
        String              type,
        ULong               processlistId,
        String              processlistUser,
        String              processlistHost,
        String              processlistDb,
        String              processlistCommand,
        Long                processlistTime,
        String              processlistState,
        String              processlistInfo,
        ULong               parentThreadId,
        String              role,
        ThreadsInstrumented instrumented
    ) {
        this.threadId = threadId;
        this.name = name;
        this.type = type;
        this.processlistId = processlistId;
        this.processlistUser = processlistUser;
        this.processlistHost = processlistHost;
        this.processlistDb = processlistDb;
        this.processlistCommand = processlistCommand;
        this.processlistTime = processlistTime;
        this.processlistState = processlistState;
        this.processlistInfo = processlistInfo;
        this.parentThreadId = parentThreadId;
        this.role = role;
        this.instrumented = instrumented;
    }

    public ULong getThreadId() {
        return this.threadId;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public ULong getProcesslistId() {
        return this.processlistId;
    }

    public String getProcesslistUser() {
        return this.processlistUser;
    }

    public String getProcesslistHost() {
        return this.processlistHost;
    }

    public String getProcesslistDb() {
        return this.processlistDb;
    }

    public String getProcesslistCommand() {
        return this.processlistCommand;
    }

    public Long getProcesslistTime() {
        return this.processlistTime;
    }

    public String getProcesslistState() {
        return this.processlistState;
    }

    public String getProcesslistInfo() {
        return this.processlistInfo;
    }

    public ULong getParentThreadId() {
        return this.parentThreadId;
    }

    public String getRole() {
        return this.role;
    }

    public ThreadsInstrumented getInstrumented() {
        return this.instrumented;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Threads (");

        sb.append(threadId);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(processlistId);
        sb.append(", ").append(processlistUser);
        sb.append(", ").append(processlistHost);
        sb.append(", ").append(processlistDb);
        sb.append(", ").append(processlistCommand);
        sb.append(", ").append(processlistTime);
        sb.append(", ").append(processlistState);
        sb.append(", ").append(processlistInfo);
        sb.append(", ").append(parentThreadId);
        sb.append(", ").append(role);
        sb.append(", ").append(instrumented);

        sb.append(")");
        return sb.toString();
    }
}
