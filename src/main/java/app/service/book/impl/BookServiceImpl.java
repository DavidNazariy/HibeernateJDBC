package app.service.book.impl;

import app.dao.Book;
import app.dao.Orders;
import app.dto.BookDto;
import app.repository.book.BookRepository;
import app.service.book.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static app.mapper.DaoBook.getBook;

@Slf4j
@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public void save(BookDto bookDto) {
        bookRepository.saveBook(getBook(bookDto));
    }

    @Override
    public List findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public Book findObjectByTitle(String title) {
      return   bookRepository.findObjectByTitle(title);
    }

    @Override
    public Orders findMostPopularByTitle(int range) {
        return bookRepository.findMostPopularByTitle(range);
    }

    @Override
    public List getInfoByAuthor(String author) {
        return bookRepository.getInfoByAuthor(author);
    }

    @Override
    public Book isAvailable(String title) {
        if (bookRepository.findByTitle(title).size() != 0) {
            for (int i = 0; i < bookRepository.findByTitle(title).size(); i++) {
                Book book = (Book) bookRepository.findByTitle(title).get(i);
                if (book.getCopiesAmount() > 0) {
                    System.out.println("Book is available");
                    return book;

                } else if (book.getCopiesAmount() == 0) {
                    System.out.println("Book is not available");
                    return book;

                }
            }
        } else
            System.out.println("Book is not available");
            return null;
    }
}
