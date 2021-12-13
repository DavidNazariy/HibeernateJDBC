package app.service.user;

import app.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<User> findAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> rootEntry = cq.from(User.class);
        CriteriaQuery<User> all = cq.select(rootEntry);
        TypedQuery<User> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    public List findWithName(String name) {
        return entityManager.createQuery(
                        "SELECT c FROM User c WHERE c.firstName LIKE :first_name")
                .setParameter("first_name", name)
                .setMaxResults(10)
                .getResultList();
    }

    public User findWithId(Long id) {
        User user = entityManager.find(User.class, id);
        //exception
        if (user == null) {
            throw new EntityNotFoundException("Can't find Artist for ID "
                    + id);
        }
        return user;
    }

    public User findWithIdCustomFields(Long id) {
        User tentityManagerp = entityManager.find(User.class, id);
        User user = User.builder().password(tentityManagerp.getPassword())
                .build();
        return user;
    }

}
