/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables.pojos;


import am.willi.persistence.domain.mysql.enums.ProcAggregate;
import am.willi.persistence.domain.mysql.enums.ProcIsDeterministic;
import am.willi.persistence.domain.mysql.enums.ProcLanguage;
import am.willi.persistence.domain.mysql.enums.ProcSecurityType;
import am.willi.persistence.domain.mysql.enums.ProcSqlDataAccess;
import am.willi.persistence.domain.mysql.enums.ProcType;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * Stored Procedures
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Proc implements Serializable {

    private static final long serialVersionUID = -1855661842;

    private final String              db;
    private final String              name;
    private final ProcType            type;
    private final String              specificName;
    private final ProcLanguage        language;
    private final ProcSqlDataAccess   sqlDataAccess;
    private final ProcIsDeterministic isDeterministic;
    private final ProcSecurityType    securityType;
    private final byte[]              paramList;
    private final byte[]              returns;
    private final byte[]              body;
    private final String              definer;
    private final Timestamp           created;
    private final Timestamp           modified;
    private final String              sqlMode;
    private final String              comment;
    private final String              characterSetClient;
    private final String              collationConnection;
    private final String              dbCollation;
    private final byte[]              bodyUtf8;
    private final ProcAggregate       aggregate;

    public Proc(Proc value) {
        this.db = value.db;
        this.name = value.name;
        this.type = value.type;
        this.specificName = value.specificName;
        this.language = value.language;
        this.sqlDataAccess = value.sqlDataAccess;
        this.isDeterministic = value.isDeterministic;
        this.securityType = value.securityType;
        this.paramList = value.paramList;
        this.returns = value.returns;
        this.body = value.body;
        this.definer = value.definer;
        this.created = value.created;
        this.modified = value.modified;
        this.sqlMode = value.sqlMode;
        this.comment = value.comment;
        this.characterSetClient = value.characterSetClient;
        this.collationConnection = value.collationConnection;
        this.dbCollation = value.dbCollation;
        this.bodyUtf8 = value.bodyUtf8;
        this.aggregate = value.aggregate;
    }

    public Proc(
        String              db,
        String              name,
        ProcType            type,
        String              specificName,
        ProcLanguage        language,
        ProcSqlDataAccess   sqlDataAccess,
        ProcIsDeterministic isDeterministic,
        ProcSecurityType    securityType,
        byte[]              paramList,
        byte[]              returns,
        byte[]              body,
        String              definer,
        Timestamp           created,
        Timestamp           modified,
        String              sqlMode,
        String              comment,
        String              characterSetClient,
        String              collationConnection,
        String              dbCollation,
        byte[]              bodyUtf8,
        ProcAggregate       aggregate
    ) {
        this.db = db;
        this.name = name;
        this.type = type;
        this.specificName = specificName;
        this.language = language;
        this.sqlDataAccess = sqlDataAccess;
        this.isDeterministic = isDeterministic;
        this.securityType = securityType;
        this.paramList = paramList;
        this.returns = returns;
        this.body = body;
        this.definer = definer;
        this.created = created;
        this.modified = modified;
        this.sqlMode = sqlMode;
        this.comment = comment;
        this.characterSetClient = characterSetClient;
        this.collationConnection = collationConnection;
        this.dbCollation = dbCollation;
        this.bodyUtf8 = bodyUtf8;
        this.aggregate = aggregate;
    }

    public String getDb() {
        return this.db;
    }

    public String getName() {
        return this.name;
    }

    public ProcType getType() {
        return this.type;
    }

    public String getSpecificName() {
        return this.specificName;
    }

    public ProcLanguage getLanguage() {
        return this.language;
    }

    public ProcSqlDataAccess getSqlDataAccess() {
        return this.sqlDataAccess;
    }

    public ProcIsDeterministic getIsDeterministic() {
        return this.isDeterministic;
    }

    public ProcSecurityType getSecurityType() {
        return this.securityType;
    }

    public byte[] getParamList() {
        return this.paramList;
    }

    public byte[] getReturns() {
        return this.returns;
    }

    public byte[] getBody() {
        return this.body;
    }

    public String getDefiner() {
        return this.definer;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public Timestamp getModified() {
        return this.modified;
    }

    public String getSqlMode() {
        return this.sqlMode;
    }

    public String getComment() {
        return this.comment;
    }

    public String getCharacterSetClient() {
        return this.characterSetClient;
    }

    public String getCollationConnection() {
        return this.collationConnection;
    }

    public String getDbCollation() {
        return this.dbCollation;
    }

    public byte[] getBodyUtf8() {
        return this.bodyUtf8;
    }

    public ProcAggregate getAggregate() {
        return this.aggregate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Proc (");

        sb.append(db);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(specificName);
        sb.append(", ").append(language);
        sb.append(", ").append(sqlDataAccess);
        sb.append(", ").append(isDeterministic);
        sb.append(", ").append(securityType);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append("[binary...]");
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(definer);
        sb.append(", ").append(created);
        sb.append(", ").append(modified);
        sb.append(", ").append(sqlMode);
        sb.append(", ").append(comment);
        sb.append(", ").append(characterSetClient);
        sb.append(", ").append(collationConnection);
        sb.append(", ").append(dbCollation);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(aggregate);

        sb.append(")");
        return sb.toString();
    }
}