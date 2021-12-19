package app.repository.book;

import app.dao.Book;
import app.dao.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {

    void saveBook(Book book);

    List<Book> findAll();

    List findByTitle(String title);

    Book findObjectByTitle(String title);

    Orders findMostPopularByTitle(int range);

    List getInfoByAuthor(String name);


    List findByOrders(String name);
}

