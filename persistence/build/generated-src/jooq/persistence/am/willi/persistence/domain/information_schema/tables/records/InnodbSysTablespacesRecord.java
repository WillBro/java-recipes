/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.records;


import am.willi.persistence.domain.information_schema.tables.InnodbSysTablespaces;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;
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
public class InnodbSysTablespacesRecord extends TableRecordImpl<InnodbSysTablespacesRecord> implements Record10<UInteger, String, UInteger, String, UInteger, UInteger, String, UInteger, ULong, ULong> {

    private static final long serialVersionUID = -509586091;

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
     */
    public InnodbSysTablespacesRecord setSpace(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
     */
    public UInteger getSpace() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
     */
    public InnodbSysTablespacesRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
     */
    public InnodbSysTablespacesRecord setFlag(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
     */
    public UInteger getFlag() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
     */
    public InnodbSysTablespacesRecord setRowFormat(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
     */
    public String getRowFormat() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
     */
    public InnodbSysTablespacesRecord setPageSize(UInteger value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
     */
    public UInteger getPageSize() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
     */
    public InnodbSysTablespacesRecord setZipPageSize(UInteger value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
     */
    public UInteger getZipPageSize() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE_TYPE</code>.
     */
    public InnodbSysTablespacesRecord setSpaceType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE_TYPE</code>.
     */
    public String getSpaceType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE</code>.
     */
    public InnodbSysTablespacesRecord setFsBlockSize(UInteger value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE</code>.
     */
    public UInteger getFsBlockSize() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_SIZE</code>.
     */
    public InnodbSysTablespacesRecord setFileSize(ULong value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_SIZE</code>.
     */
    public ULong getFileSize() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE</code>.
     */
    public InnodbSysTablespacesRecord setAllocatedSize(ULong value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE</code>.
     */
    public ULong getAllocatedSize() {
        return (ULong) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<UInteger, String, UInteger, String, UInteger, UInteger, String, UInteger, ULong, ULong> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<UInteger, String, UInteger, String, UInteger, UInteger, String, UInteger, ULong, ULong> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.SPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.ROW_FORMAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field5() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.PAGE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.SPACE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field8() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.FILE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component3() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRowFormat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component5() {
        return getPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component6() {
        return getZipPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSpaceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component8() {
        return getFsBlockSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getAllocatedSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRowFormat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value5() {
        return getPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getZipPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSpaceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value8() {
        return getFsBlockSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getAllocatedSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value1(UInteger value) {
        setSpace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value3(UInteger value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value4(String value) {
        setRowFormat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value5(UInteger value) {
        setPageSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value6(UInteger value) {
        setZipPageSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value7(String value) {
        setSpaceType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value8(UInteger value) {
        setFsBlockSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value9(ULong value) {
        setFileSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value10(ULong value) {
        setAllocatedSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord values(UInteger value1, String value2, UInteger value3, String value4, UInteger value5, UInteger value6, String value7, UInteger value8, ULong value9, ULong value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbSysTablespacesRecord
     */
    public InnodbSysTablespacesRecord() {
        super(InnodbSysTablespaces.INNODB_SYS_TABLESPACES);
    }

    /**
     * Create a detached, initialised InnodbSysTablespacesRecord
     */
    public InnodbSysTablespacesRecord(UInteger space, String name, UInteger flag, String rowFormat, UInteger pageSize, UInteger zipPageSize, String spaceType, UInteger fsBlockSize, ULong fileSize, ULong allocatedSize) {
        super(InnodbSysTablespaces.INNODB_SYS_TABLESPACES);

        set(0, space);
        set(1, name);
        set(2, flag);
        set(3, rowFormat);
        set(4, pageSize);
        set(5, zipPageSize);
        set(6, spaceType);
        set(7, fsBlockSize);
        set(8, fileSize);
        set(9, allocatedSize);
    }
}