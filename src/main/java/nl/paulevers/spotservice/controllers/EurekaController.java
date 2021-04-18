package nl.paulevers.spotservice.controllers;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping(value = "/eureka")
    public String greeting() {
        return String.format(
                "Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }
}
