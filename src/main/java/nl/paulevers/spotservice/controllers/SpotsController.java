package nl.paulevers.spotservice.controllers;

import nl.paulevers.spotservice.entities.Spot;
import nl.paulevers.spotservice.repositories.ISpotsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpotsController {

    ISpotsRepository spotsRepository;

    @GetMapping(value="/spots")
    public List<Spot> spots() {
    return new ArrayList<Spot>();
    }
}
