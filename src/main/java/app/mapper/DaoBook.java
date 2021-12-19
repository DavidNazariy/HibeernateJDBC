package app.mapper;

import app.dao.Book;
import app.dto.BookDto;

public class DaoBook {
    public static Book getBook(BookDto bookDto) {
        return Book.builder()
                .title(bookDto.getTitle())
                .copiesAmount(bookDto.getCopiesAmount())
                .mainAuthor(bookDto.getMainAuthor())
                .build();
    }
}
