package pl.diabeticclac.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.data.jpa.provider.HibernateUtils;
import pl.diabeticclac.dao.UserDao;
import pl.diabeticclac.datamodel.User;

import javax.annotation.Resource;

/**
 * Created by pswiatek on 2017-03-01.
 */
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {

        Session session = sessionFactory.openSession();
        session.save(user);

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }
}
