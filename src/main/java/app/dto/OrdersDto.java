package app.dto;

import app.dao.Book;
import app.dao.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDto {

    private Long id;
    private User user;
    private Book book;
    private String fromDate;
    private String toDate;
    private String returnDate;
    private Boolean status;
}