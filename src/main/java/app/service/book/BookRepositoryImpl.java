package app.service.book;

import app.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
@AllArgsConstructor
public class BookRepositoryImpl implements BookRepository {
    private final EntityManager entityManager;
    @Override
    public void saveBook(Book book) {
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Book> findAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> rootEntry = cq.from(Book.class);
        CriteriaQuery<Book> all = cq.select(rootEntry);
        TypedQuery<Book> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    @Override
    public List findWithName(String name) {
        return entityManager.createQuery(
                        "SELECT c FROM Book c WHERE c.titleName LIKE :titleName")
                .setParameter("titleName", name)
                .setMaxResults(10)
                .getResultList();
    }

    @Override
    public Book findWithId(Long id) {
        return null;
    }

    @Override
    public Book findWithIdCustomFields(Long id) {
        return null;
    }
}
