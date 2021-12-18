package app;

import app.dao.Author;
import app.dto.BookDto;
import app.dto.UserDto;
import app.service.book.BookService;
import app.service.user.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Component
@AllArgsConstructor
public class Init {

    private final BookService bookService;
    private final UserService userService;


    public void init() {
        //create Author
        Author author = Author.builder()
                .authorName("Twain1")
                .build();

        //create User
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        UserDto user = UserDto.builder()
                .firstName("Nazar")
                .lastName("Krupka")
                .dob("1997-12-11")
                .password("1")
                .date_of_registration(formatter.format(LocalDateTime.now()))
                .email("nazar@gnail.com")
                .userRole("manager")
                .build();
        userService.save(user);
        log.info("Saving the book {}", user);

        //create book
        BookDto book = BookDto.builder()
                .title("MoBy-Dick12")
                .mainAuthor(author)
                .copiesAmount(10)
                .build();
        bookService.save(book);
        log.info("Saving the book {}", book);

        // Library task
        // 1.1 Get information about all books
        System.out.println(bookService.findAll());

        // 2.Check if needed book is available
       bookService.isAvailable("MoBy-Dick12");

        // 3.Find books by author (main author, co-author)
        System.out.println(bookService.getInfoByAuthor("Twain"));

        //4.Find book by title
        System.out.println(bookService.findByTitle("MoBy-Dick12"));

        //5.Get the most popular and the most unpopular books in selected period

    }

}
