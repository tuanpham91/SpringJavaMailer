package Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {
    private static final String greeting = "Hello , the user you are looking for is :";

    public User() {

    }
    @RequestMapping("/tuan")
    String tuan() {
        return "Hello Tuan!";
    }
    @RequestMapping("/tuans")
    public String getUser() {
        return greeting;
    }
}
