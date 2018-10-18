/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.information_schema.tables.records;


import am.willi.persistence.domain.information_schema.tables.ApplicableRoles;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class ApplicableRolesRecord extends TableRecordImpl<ApplicableRolesRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 835930298;

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.GRANTEE</code>.
     */
    public ApplicableRolesRecord setGrantee(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.ROLE_NAME</code>.
     */
    public ApplicableRolesRecord setRoleName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.ROLE_NAME</code>.
     */
    public String getRoleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.IS_GRANTABLE</code>.
     */
    public ApplicableRolesRecord setIsGrantable(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.IS_DEFAULT</code>.
     */
    public ApplicableRolesRecord setIsDefault(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.IS_DEFAULT</code>.
     */
    public String getIsDefault() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ApplicableRoles.APPLICABLE_ROLES.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ApplicableRoles.APPLICABLE_ROLES.ROLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ApplicableRoles.APPLICABLE_ROLES.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ApplicableRoles.APPLICABLE_ROLES.IS_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicableRolesRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicableRolesRecord value2(String value) {
        setRoleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicableRolesRecord value3(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicableRolesRecord value4(String value) {
        setIsDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicableRolesRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicableRolesRecord
     */
    public ApplicableRolesRecord() {
        super(ApplicableRoles.APPLICABLE_ROLES);
    }

    /**
     * Create a detached, initialised ApplicableRolesRecord
     */
    public ApplicableRolesRecord(String grantee, String roleName, String isGrantable, String isDefault) {
        super(ApplicableRoles.APPLICABLE_ROLES);

        set(0, grantee);
        set(1, roleName);
        set(2, isGrantable);
        set(3, isDefault);
    }
}
