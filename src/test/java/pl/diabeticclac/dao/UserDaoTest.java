package pl.diabeticclac.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import pl.diabeticclac.datamodel.User;

import static org.junit.Assert.*;

/**
 * Created by pswiatek on 2017-03-01.
 */
public class UserDaoTest {



    @Test
    public void addUser() throws Exception {

        User user = Mockito.mock(User.class);
        UserDao userDao = Mockito.mock(UserDao.class);
        userDao.addUser(user);
    }

}