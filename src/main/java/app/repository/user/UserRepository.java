package app.repository.user;

import app.dao.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    void saveUser(User user);

    List<User> findAll();

    List findWithName(String name);

    List findByEmail(String email);

    User findUserByEmail(String email);

    List getStatisticAboutUser(String name);

    User findWithId(Long id);

    User findWithIdCustomFields(Long id);


}
