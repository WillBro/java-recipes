/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.performance_schema.tables.pojos;


import am.willi.persistence.domain.performance_schema.enums.SocketInstancesState;

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
public class SocketInstances implements Serializable {

    private static final long serialVersionUID = 2034756472;

    private final String               eventName;
    private final ULong                objectInstanceBegin;
    private final ULong                threadId;
    private final Integer              socketId;
    private final String               ip;
    private final Integer              port;
    private final SocketInstancesState state;

    public SocketInstances(SocketInstances value) {
        this.eventName = value.eventName;
        this.objectInstanceBegin = value.objectInstanceBegin;
        this.threadId = value.threadId;
        this.socketId = value.socketId;
        this.ip = value.ip;
        this.port = value.port;
        this.state = value.state;
    }

    public SocketInstances(
        String               eventName,
        ULong                objectInstanceBegin,
        ULong                threadId,
        Integer              socketId,
        String               ip,
        Integer              port,
        SocketInstancesState state
    ) {
        this.eventName = eventName;
        this.objectInstanceBegin = objectInstanceBegin;
        this.threadId = threadId;
        this.socketId = socketId;
        this.ip = ip;
        this.port = port;
        this.state = state;
    }

    public String getEventName() {
        return this.eventName;
    }

    public ULong getObjectInstanceBegin() {
        return this.objectInstanceBegin;
    }

    public ULong getThreadId() {
        return this.threadId;
    }

    public Integer getSocketId() {
        return this.socketId;
    }

    public String getIp() {
        return this.ip;
    }

    public Integer getPort() {
        return this.port;
    }

    public SocketInstancesState getState() {
        return this.state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SocketInstances (");

        sb.append(eventName);
        sb.append(", ").append(objectInstanceBegin);
        sb.append(", ").append(threadId);
        sb.append(", ").append(socketId);
        sb.append(", ").append(ip);
        sb.append(", ").append(port);
        sb.append(", ").append(state);

        sb.append(")");
        return sb.toString();
    }
}
