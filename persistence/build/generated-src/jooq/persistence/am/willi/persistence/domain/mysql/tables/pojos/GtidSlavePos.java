/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Replication slave GTID position
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GtidSlavePos implements Serializable {

    private static final long serialVersionUID = 35241852;

    private final UInteger domainId;
    private final ULong    subId;
    private final UInteger serverId;
    private final ULong    seqNo;

    public GtidSlavePos(GtidSlavePos value) {
        this.domainId = value.domainId;
        this.subId = value.subId;
        this.serverId = value.serverId;
        this.seqNo = value.seqNo;
    }

    public GtidSlavePos(
        UInteger domainId,
        ULong    subId,
        UInteger serverId,
        ULong    seqNo
    ) {
        this.domainId = domainId;
        this.subId = subId;
        this.serverId = serverId;
        this.seqNo = seqNo;
    }

    public UInteger getDomainId() {
        return this.domainId;
    }

    public ULong getSubId() {
        return this.subId;
    }

    public UInteger getServerId() {
        return this.serverId;
    }

    public ULong getSeqNo() {
        return this.seqNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GtidSlavePos (");

        sb.append(domainId);
        sb.append(", ").append(subId);
        sb.append(", ").append(serverId);
        sb.append(", ").append(seqNo);

        sb.append(")");
        return sb.toString();
    }
}