package app.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/url")
    private ResponseEntity getUser(){
        return ResponseEntity.ok("Ok");
    }
}
