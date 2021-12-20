package app.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           @RequestParam(name = "age", required = false) Integer age,
                           Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "home";
    }



}
