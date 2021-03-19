package nl.paulevers.spotservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @GetMapping(value="/")
        private String hello() {
            return "Greetings from Spring Boot!";
        }

}
