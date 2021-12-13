package app;

import app.config.AppConfig;
import app.model.Book;
import app.model.User;
import app.service.book.BookRepository;
import app.service.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
@AllArgsConstructor
public class Application {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        UserRepository userRepository = applicationContext.getBean(UserRepository.class);
        BookRepository bookService = applicationContext.getBean(BookRepository.class);

        //create User
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        User user = User.builder()
                .firstName("Nazar")
                .lastName("Krupka")
                .dob("1997-12-11")
                .password("1")
                .date_of_registration(formatter.format(LocalDateTime.now()))
                .email("21@gnail.com")
                .userRole("manager")
                .build();
        userRepository.saveUser(user);

        //create book
        Book book = Book.builder()
                .titleName("MoBy-Dick1")
                .mainAuthor("Melville")
                .copiesAmount(10)
                .build();
        bookService.saveBook(book);

        // Library task
        // 1.1 Get information about all books
        System.out.println(bookService.findAll());

        // 2.Check if needed book is available
        //System.out.println(userService.findWithId(1l));
        System.out.println(bookService.findWithName("MoBy-Dick1"));



     /*
        //getAllUsers
        System.out.println(userService.findAll());

        //findById
        System.out.println(userService.findWithId(1l));

        System.out.println(userService.findWithIdCustomFields(1l));
        //findByName
        System.out.println(userService.findWithName("BOBO"));*/


    }
}
