package nl.paulevers.spotservice.controllers;

import com.netflix.discovery.EurekaClient;
import nl.paulevers.spotservice.entities.Spot;
import nl.paulevers.spotservice.repositories.ISpotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpotsController {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    ISpotsRepository spotsRepository;

    @GetMapping(value="/spots")
    public List<Spot> spots() {
    return new ArrayList<Spot>();
    }
}
