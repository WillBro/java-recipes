package am.willi.persistence.repository;

import am.willi.persistence.domain.User;
import am.willi.persistence.domain.public_.tables.records.UsersRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import static am.willi.persistence.domain.public_.tables.Users.USERS;

@Repository
@Transactional
public class UserRepo {

    @Autowired
    private DSLContext dsl;

    public void createUser(User user) {
        dsl.insertInto(USERS)
                .columns(
                        USERS.EMAILID,
                        USERS.USERNAME,
                        USERS.FIRST_NAME,
                        USERS.LAST_NAME,
                        USERS.PASSWORD_HASH
                )
                .values(
                        user.getEmailid(),
                        user.getUsername(),
                        user.getFirstName(),
                        user.getLastName(),
                        user.getPassword()
                )
                .execute();
    }

    public User getUser(String email) {
        UsersRecord user =
                dsl.select()
                        .from(USERS)
                        .where(USERS.EMAILID.eq(email))
                        .fetchOne()
                        .into(UsersRecord.class);

        return new User(user);
    }
}
