package am.willi.persistence;

import am.willi.persistence.domain.User;
import am.willi.persistence.repository.UserRepo;
//import csmart.api.model.Address;
import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by sethur on 2/10/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
@Log
//@ActiveProfiles("ci")
public class UserRepoTest {

    @Autowired
    private UserRepo userRepo;

    @Test
    public void shouldInsertUserInDb(){
        User user = createUser();

        userRepo.createUser(user);
        User returnedUsed = userRepo.getUser("atestuser@example.com");

        log.info(returnedUsed.toString());

        Assert.assertEquals(returnedUsed.getPassword(), user.getPassword());
    }

    private User createUser() {
        User user = new User();
        user.setEmailid("atestuser@example.com");
        user.setPassword("password");
        user.setPracticeName("practice");
        user.setPrimaryUser(true);
//        Address address = new Address();
//        address.setLine1("line1");
//        address.setLine2("line2");
//        address.setCity("city");
//        address.setPincode("pincode");
//        address.setState("state");
//        user.setAddress(address);
        return user;
    }
}