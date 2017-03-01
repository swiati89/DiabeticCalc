package pl.diabeticclac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.diabeticclac.datamodel.User;

/**
 * Created by pswiatek on 2017-03-01.
 */
public interface UserDao {

    void addUser(User user);
    void deleteUser(User user);
    void updateUser(User user);

}
