package app.dto;

import app.dao.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Long id;
    private String title;
    private Author mainAuthor;
    private String coAuthor;
    private Integer copiesAmount;

}

