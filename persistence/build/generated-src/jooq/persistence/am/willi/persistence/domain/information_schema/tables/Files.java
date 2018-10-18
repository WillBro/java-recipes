/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables;


import am.willi.persistence.domain.information_schema.InformationSchema;
import am.willi.persistence.domain.information_schema.tables.records.FilesRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class Files extends TableImpl<FilesRecord> {

    private static final long serialVersionUID = -371480237;

    /**
     * The reference instance of <code>information_schema.FILES</code>
     */
    public static final Files FILES = new Files();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilesRecord> getRecordType() {
        return FilesRecord.class;
    }

    /**
     * The column <code>information_schema.FILES.FILE_ID</code>.
     */
    public final TableField<FilesRecord, Long> FILE_ID = createField("FILE_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.FILES.FILE_NAME</code>.
     */
    public final TableField<FilesRecord, String> FILE_NAME = createField("FILE_NAME", org.jooq.impl.SQLDataType.VARCHAR(512).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.FILE_TYPE</code>.
     */
    public final TableField<FilesRecord, String> FILE_TYPE = createField("FILE_TYPE", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    public final TableField<FilesRecord, String> TABLESPACE_NAME = createField("TABLESPACE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    public final TableField<FilesRecord, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    public final TableField<FilesRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_NAME</code>.
     */
    public final TableField<FilesRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    public final TableField<FilesRecord, String> LOGFILE_GROUP_NAME = createField("LOGFILE_GROUP_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    public final TableField<FilesRecord, Long> LOGFILE_GROUP_NUMBER = createField("LOGFILE_GROUP_NUMBER", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.FILES.ENGINE</code>.
     */
    public final TableField<FilesRecord, String> ENGINE = createField("ENGINE", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    public final TableField<FilesRecord, String> FULLTEXT_KEYS = createField("FULLTEXT_KEYS", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    public final TableField<FilesRecord, Long> DELETED_ROWS = createField("DELETED_ROWS", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    public final TableField<FilesRecord, Long> UPDATE_COUNT = createField("UPDATE_COUNT", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    public final TableField<FilesRecord, Long> FREE_EXTENTS = createField("FREE_EXTENTS", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    public final TableField<FilesRecord, Long> TOTAL_EXTENTS = createField("TOTAL_EXTENTS", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    public final TableField<FilesRecord, Long> EXTENT_SIZE = createField("EXTENT_SIZE", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    public final TableField<FilesRecord, ULong> INITIAL_SIZE = createField("INITIAL_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    public final TableField<FilesRecord, ULong> MAXIMUM_SIZE = createField("MAXIMUM_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    public final TableField<FilesRecord, ULong> AUTOEXTEND_SIZE = createField("AUTOEXTEND_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.CREATION_TIME</code>.
     */
    public final TableField<FilesRecord, Timestamp> CREATION_TIME = createField("CREATION_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    public final TableField<FilesRecord, Timestamp> LAST_UPDATE_TIME = createField("LAST_UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    public final TableField<FilesRecord, Timestamp> LAST_ACCESS_TIME = createField("LAST_ACCESS_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    public final TableField<FilesRecord, Long> RECOVER_TIME = createField("RECOVER_TIME", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    public final TableField<FilesRecord, Long> TRANSACTION_COUNTER = createField("TRANSACTION_COUNTER", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.FILES.VERSION</code>.
     */
    public final TableField<FilesRecord, ULong> VERSION = createField("VERSION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    public final TableField<FilesRecord, String> ROW_FORMAT = createField("ROW_FORMAT", org.jooq.impl.SQLDataType.VARCHAR(10).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    public final TableField<FilesRecord, ULong> TABLE_ROWS = createField("TABLE_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    public final TableField<FilesRecord, ULong> AVG_ROW_LENGTH = createField("AVG_ROW_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    public final TableField<FilesRecord, ULong> DATA_LENGTH = createField("DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    public final TableField<FilesRecord, ULong> MAX_DATA_LENGTH = createField("MAX_DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    public final TableField<FilesRecord, ULong> INDEX_LENGTH = createField("INDEX_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.DATA_FREE</code>.
     */
    public final TableField<FilesRecord, ULong> DATA_FREE = createField("DATA_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.CREATE_TIME</code>.
     */
    public final TableField<FilesRecord, Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    public final TableField<FilesRecord, Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>information_schema.FILES.CHECK_TIME</code>.
     */
    public final TableField<FilesRecord, Timestamp> CHECK_TIME = createField("CHECK_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>information_schema.FILES.CHECKSUM</code>.
     */
    public final TableField<FilesRecord, ULong> CHECKSUM = createField("CHECKSUM", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.FILES.STATUS</code>.
     */
    public final TableField<FilesRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.EXTRA</code>.
     */
    public final TableField<FilesRecord, String> EXTRA = createField("EXTRA", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.FILES</code> table reference
     */
    public Files() {
        this(DSL.name("FILES"), null);
    }

    /**
     * Create an aliased <code>information_schema.FILES</code> table reference
     */
    public Files(String alias) {
        this(DSL.name(alias), FILES);
    }

    /**
     * Create an aliased <code>information_schema.FILES</code> table reference
     */
    public Files(Name alias) {
        this(alias, FILES);
    }

    private Files(Name alias, Table<FilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Files(Name alias, Table<FilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Files(Table<O> child, ForeignKey<O, FilesRecord> key) {
        super(child, key, FILES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Files as(String alias) {
        return new Files(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Files as(Name alias) {
        return new Files(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(String name) {
        return new Files(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(Name name) {
        return new Files(name, null);
    }
}
