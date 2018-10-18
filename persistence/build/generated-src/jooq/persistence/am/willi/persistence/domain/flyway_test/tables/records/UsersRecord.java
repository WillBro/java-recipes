/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.flyway_test.tables.records;


import am.willi.persistence.domain.flyway_test.tables.Users;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record4<Long, String, String, String> {

    private static final long serialVersionUID = 545862658;

    /**
     * Setter for <code>flyway_test.users.id</code>.
     */
    public UsersRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>flyway_test.users.username</code>.
     */
    public UsersRecord setUsername(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.users.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>flyway_test.users.first_name</code>.
     */
    public UsersRecord setFirstName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.users.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>flyway_test.users.last_name</code>.
     */
    public UsersRecord setLastName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.users.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Users.USERS.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Users.USERS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Users.USERS.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Long value1, String value2, String value3, String value4) {
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
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Long id, String username, String firstName, String lastName) {
        super(Users.USERS);

        set(0, id);
        set(1, username);
        set(2, firstName);
        set(3, lastName);
    }
}