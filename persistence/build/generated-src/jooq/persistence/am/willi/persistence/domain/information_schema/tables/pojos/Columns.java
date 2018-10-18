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
public class Columns implements Serializable {

    private static final long serialVersionUID = 93804801;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String columnName;
    private final ULong  ordinalPosition;
    private final String columnDefault;
    private final String isNullable;
    private final String dataType;
    private final ULong  characterMaximumLength;
    private final ULong  characterOctetLength;
    private final ULong  numericPrecision;
    private final ULong  numericScale;
    private final ULong  datetimePrecision;
    private final String characterSetName;
    private final String collationName;
    private final String columnType;
    private final String columnKey;
    private final String extra;
    private final String privileges;
    private final String columnComment;
    private final String isGenerated;
    private final String generationExpression;

    public Columns(Columns value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.ordinalPosition = value.ordinalPosition;
        this.columnDefault = value.columnDefault;
        this.isNullable = value.isNullable;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.numericPrecision = value.numericPrecision;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.characterSetName = value.characterSetName;
        this.collationName = value.collationName;
        this.columnType = value.columnType;
        this.columnKey = value.columnKey;
        this.extra = value.extra;
        this.privileges = value.privileges;
        this.columnComment = value.columnComment;
        this.isGenerated = value.isGenerated;
        this.generationExpression = value.generationExpression;
    }

    public Columns(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName,
        ULong  ordinalPosition,
        String columnDefault,
        String isNullable,
        String dataType,
        ULong  characterMaximumLength,
        ULong  characterOctetLength,
        ULong  numericPrecision,
        ULong  numericScale,
        ULong  datetimePrecision,
        String characterSetName,
        String collationName,
        String columnType,
        String columnKey,
        String extra,
        String privileges,
        String columnComment,
        String isGenerated,
        String generationExpression
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.ordinalPosition = ordinalPosition;
        this.columnDefault = columnDefault;
        this.isNullable = isNullable;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.numericPrecision = numericPrecision;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.characterSetName = characterSetName;
        this.collationName = collationName;
        this.columnType = columnType;
        this.columnKey = columnKey;
        this.extra = extra;
        this.privileges = privileges;
        this.columnComment = columnComment;
        this.isGenerated = isGenerated;
        this.generationExpression = generationExpression;
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

    public String getColumnName() {
        return this.columnName;
    }

    public ULong getOrdinalPosition() {
        return this.ordinalPosition;
    }

    public String getColumnDefault() {
        return this.columnDefault;
    }

    public String getIsNullable() {
        return this.isNullable;
    }

    public String getDataType() {
        return this.dataType;
    }

    public ULong getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    public ULong getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    public ULong getNumericPrecision() {
        return this.numericPrecision;
    }

    public ULong getNumericScale() {
        return this.numericScale;
    }

    public ULong getDatetimePrecision() {
        return this.datetimePrecision;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public String getCollationName() {
        return this.collationName;
    }

    public String getColumnType() {
        return this.columnType;
    }

    public String getColumnKey() {
        return this.columnKey;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getPrivileges() {
        return this.privileges;
    }

    public String getColumnComment() {
        return this.columnComment;
    }

    public String getIsGenerated() {
        return this.isGenerated;
    }

    public String getGenerationExpression() {
        return this.generationExpression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Columns (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(columnDefault);
        sb.append(", ").append(isNullable);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationName);
        sb.append(", ").append(columnType);
        sb.append(", ").append(columnKey);
        sb.append(", ").append(extra);
        sb.append(", ").append(privileges);
        sb.append(", ").append(columnComment);
        sb.append(", ").append(isGenerated);
        sb.append(", ").append(generationExpression);

        sb.append(")");
        return sb.toString();
    }
}
