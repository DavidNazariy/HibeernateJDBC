package app.service.user.impl;

import app.dao.User;
import app.dto.UserDto;
import app.repository.user.UserRepository;
import app.service.user.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void save(UserDto userDto) {
        userRepository.saveUser(getUser(userDto));
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    private User getUser(UserDto userDto) {
        return User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .middleName(userDto.getMiddleName())
                .password(userDto.getPassword())
                .date_of_registration(userDto.getDate_of_registration())
                .userRole(userDto.getUserRole())
                .dob(userDto.getDob())
                .email(userDto.getEmail())
                .build();
    }
}
