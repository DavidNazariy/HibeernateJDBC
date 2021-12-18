package app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;
    private String password;
    private String date_of_registration;
    private String email;
    private String userRole;

}
