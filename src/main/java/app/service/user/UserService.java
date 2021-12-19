package app.service.user;

import app.dao.User;
import app.dto.UserDto;

public interface UserService {
    void save(UserDto userDto);
    User findUserByEmail(String email);
}
