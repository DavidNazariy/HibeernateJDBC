package app.service.book;

import app.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {

    void saveBook(Book book);

    List<Book> findAll();

    List findWithName(String name);

    Book findWithId(Long id);

    Book findWithIdCustomFields(Long id);


}

