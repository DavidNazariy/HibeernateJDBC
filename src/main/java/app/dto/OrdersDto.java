package app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDto {

    private Long id;
    private String user;
    private String book;
    private Date fromDate;
    private Date toDate;
    private Boolean status;
}