package app.service.book;

import app.dto.BookDto;

import java.util.List;

public interface BookService {
    void save(BookDto bookDto);

    List findAll();

    List findByTitle(String title);

    List getInfoByAuthor(String author);

    void isAvailable(String title);
}
