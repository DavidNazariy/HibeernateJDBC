package app.service.user;

import app.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    void saveUser(User user);

    List<User> findAll();

    List findWithName(String name);

    User findWithId(Long id);

    User findWithIdCustomFields(Long id);


}
