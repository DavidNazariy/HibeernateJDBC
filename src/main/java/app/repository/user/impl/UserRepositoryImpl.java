package app.repository.user.impl;

import app.dao.User;
import app.repository.user.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        if (findByEmail(user.getEmail()).size() == 0) {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
            log.info("Saved user:", user);
        } else
            log.info("User already exist:", user);
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
        return entityManager.createNativeQuery(" SELECT * FROM USER WHERE lastName = ?1", User.class)
                .setParameter(1, name)
                .getResultList();
    }

    @Override
    public List findByEmail(String email) {
        return entityManager.createNativeQuery(" SELECT * FROM USER WHERE email = ?1", User.class)
                .setParameter(1, email)
                .getResultList();

    }

    @Override
    public User findUserByEmail(String email) {
        User user = (User) entityManager.createNativeQuery(" SELECT * FROM USER WHERE email = ?1", User.class)
                .setParameter(1, email)
                .getSingleResult();
        return user;
    }

    @Override
    public List getStatisticAboutUser(String name) {
        return null;
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
