package Controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@ComponentScan({ "Controller" })

@RequestMapping("/test")
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/tuan")
    String tuan() {
        return "Hello Tuan!";
    }
    public static void main(String[] args) {
        SpringApplication.run(Example.class,args);
    }
}
