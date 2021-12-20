package app.controler;

import app.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;

@Controller
public class RegisterController {
    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String homePage(EntityManager entityManager) {
        return "register";
    }

//    @PostMapping("/register")
//    public String register(@RequestBody UserDto user, Model model) {
//        System.out.println(user.toString());
//        UserDto userDto = userService.saveUser(user);
//        model.addAttribute("user", userDto);
//        return "redirect:/home";
//    }
}
