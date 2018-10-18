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
public class InnodbSysSemaphoreWaits implements Serializable {

    private static final long serialVersionUID = 629982296;

    private final ULong    threadId;
    private final String   objectName;
    private final String   file;
    private final UInteger line;
    private final ULong    waitTime;
    private final ULong    waitObject;
    private final String   waitType;
    private final ULong    holderThreadId;
    private final String   holderFile;
    private final UInteger holderLine;
    private final String   createdFile;
    private final UInteger createdLine;
    private final ULong    writerThread;
    private final String   reservationMode;
    private final UInteger readers;
    private final ULong    waitersFlag;
    private final ULong    lockWord;
    private final String   lastWriterFile;
    private final UInteger lastWriterLine;
    private final UInteger osWaitCount;

    public InnodbSysSemaphoreWaits(InnodbSysSemaphoreWaits value) {
        this.threadId = value.threadId;
        this.objectName = value.objectName;
        this.file = value.file;
        this.line = value.line;
        this.waitTime = value.waitTime;
        this.waitObject = value.waitObject;
        this.waitType = value.waitType;
        this.holderThreadId = value.holderThreadId;
        this.holderFile = value.holderFile;
        this.holderLine = value.holderLine;
        this.createdFile = value.createdFile;
        this.createdLine = value.createdLine;
        this.writerThread = value.writerThread;
        this.reservationMode = value.reservationMode;
        this.readers = value.readers;
        this.waitersFlag = value.waitersFlag;
        this.lockWord = value.lockWord;
        this.lastWriterFile = value.lastWriterFile;
        this.lastWriterLine = value.lastWriterLine;
        this.osWaitCount = value.osWaitCount;
    }

    public InnodbSysSemaphoreWaits(
        ULong    threadId,
        String   objectName,
        String   file,
        UInteger line,
        ULong    waitTime,
        ULong    waitObject,
        String   waitType,
        ULong    holderThreadId,
        String   holderFile,
        UInteger holderLine,
        String   createdFile,
        UInteger createdLine,
        ULong    writerThread,
        String   reservationMode,
        UInteger readers,
        ULong    waitersFlag,
        ULong    lockWord,
        String   lastWriterFile,
        UInteger lastWriterLine,
        UInteger osWaitCount
    ) {
        this.threadId = threadId;
        this.objectName = objectName;
        this.file = file;
        this.line = line;
        this.waitTime = waitTime;
        this.waitObject = waitObject;
        this.waitType = waitType;
        this.holderThreadId = holderThreadId;
        this.holderFile = holderFile;
        this.holderLine = holderLine;
        this.createdFile = createdFile;
        this.createdLine = createdLine;
        this.writerThread = writerThread;
        this.reservationMode = reservationMode;
        this.readers = readers;
        this.waitersFlag = waitersFlag;
        this.lockWord = lockWord;
        this.lastWriterFile = lastWriterFile;
        this.lastWriterLine = lastWriterLine;
        this.osWaitCount = osWaitCount;
    }

    public ULong getThreadId() {
        return this.threadId;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public String getFile() {
        return this.file;
    }

    public UInteger getLine() {
        return this.line;
    }

    public ULong getWaitTime() {
        return this.waitTime;
    }

    public ULong getWaitObject() {
        return this.waitObject;
    }

    public String getWaitType() {
        return this.waitType;
    }

    public ULong getHolderThreadId() {
        return this.holderThreadId;
    }

    public String getHolderFile() {
        return this.holderFile;
    }

    public UInteger getHolderLine() {
        return this.holderLine;
    }

    public String getCreatedFile() {
        return this.createdFile;
    }

    public UInteger getCreatedLine() {
        return this.createdLine;
    }

    public ULong getWriterThread() {
        return this.writerThread;
    }

    public String getReservationMode() {
        return this.reservationMode;
    }

    public UInteger getReaders() {
        return this.readers;
    }

    public ULong getWaitersFlag() {
        return this.waitersFlag;
    }

    public ULong getLockWord() {
        return this.lockWord;
    }

    public String getLastWriterFile() {
        return this.lastWriterFile;
    }

    public UInteger getLastWriterLine() {
        return this.lastWriterLine;
    }

    public UInteger getOsWaitCount() {
        return this.osWaitCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbSysSemaphoreWaits (");

        sb.append(threadId);
        sb.append(", ").append(objectName);
        sb.append(", ").append(file);
        sb.append(", ").append(line);
        sb.append(", ").append(waitTime);
        sb.append(", ").append(waitObject);
        sb.append(", ").append(waitType);
        sb.append(", ").append(holderThreadId);
        sb.append(", ").append(holderFile);
        sb.append(", ").append(holderLine);
        sb.append(", ").append(createdFile);
        sb.append(", ").append(createdLine);
        sb.append(", ").append(writerThread);
        sb.append(", ").append(reservationMode);
        sb.append(", ").append(readers);
        sb.append(", ").append(waitersFlag);
        sb.append(", ").append(lockWord);
        sb.append(", ").append(lastWriterFile);
        sb.append(", ").append(lastWriterLine);
        sb.append(", ").append(osWaitCount);

        sb.append(")");
        return sb.toString();
    }
}