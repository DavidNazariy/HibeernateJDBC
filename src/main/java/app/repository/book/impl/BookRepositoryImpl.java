package app.repository.book.impl;

import app.dao.Book;
import app.repository.book.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class BookRepositoryImpl implements BookRepository {
    private final EntityManager entityManager;

    @Override
    public void saveBook(Book book) {
        if (findByTitle(book.getTitle()).size() == 0) {
            entityManager.getTransaction().begin();
            entityManager.persist(book);
            entityManager.getTransaction().commit();
            log.info("Saved book :", book);
        } else
            log.info("Book already exist:", book);
    }

    @Override
    public List<Book> findAll() {
        /*CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> rootEntry = cq.from(Book.class);
        CriteriaQuery<Book> all = cq.select(rootEntry);
        TypedQuery<Book> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();*/

        return entityManager.createNativeQuery(" SELECT * FROM BOOK ", Book.class)
                .getResultList();
    }

    @Override
    public List findByTitle(String title) {
      /* return entityManager.createQuery(
                        "SELECT c FROM Book c WHERE c.title LIKE :titleName")
                .setParameter("title", name)
                .setMaxResults(10)
                .getResultList();*/

        return entityManager.createNativeQuery(" SELECT * FROM BOOK WHERE title = ?1", Book.class)
                .setParameter(1, title)
                .getResultList();


    }

    @Override
    public Book findObjectByTitle(String title) {
        Book book = (Book) entityManager.createNativeQuery(" SELECT * FROM BOOK WHERE title = ?1", Book.class)
                .setParameter(1, title)
                .getSingleResult();

        return book;
    }

    @Override
    public List findMostPopularBook(int range) {

    /*    return entityManager.createNativeQuery(
                             " SELECT book_id AS" +
                                " FROM  orders " +
                                " GROUP BY book_id " +
                                " ORDER BY COUNT(*) DESC " +
                                " LIMIT 1; ", Orders.class)
                .getResultList();*/
return null;

    }

    @Override
    public List getInfoByAuthor(String name) {
        return entityManager.createNativeQuery(" SELECT book.title,book.mainAuthor_id,author.authorName,author.id\n" +
                        "FROM Author author\n" +
                        "INNER JOIN Book book\n" +
                        "ON author.id = book.mainAuthor_id\n" +
                        "WHERE author.authorName=?1", Book.class)
                .setParameter(1, name)
                .getResultList();
    }
}
