package app.service.book;

import app.dao.Book;
import app.dto.BookDto;

import java.util.List;

public interface BookService {
    void save(BookDto bookDto);

    List findAll();

    List findByTitle(String title);

    Book findObjectByTitle(String title);

    List findMostPopularBook(int range);

    List getInfoByAuthor(String author);

    Book isAvailable(String title);
}
