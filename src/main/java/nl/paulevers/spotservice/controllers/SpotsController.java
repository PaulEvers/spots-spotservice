package nl.paulevers.spotservice.controllers;

import com.netflix.discovery.EurekaClient;
import nl.paulevers.spotservice.entities.Coordinates;
import nl.paulevers.spotservice.entities.Spot;
import nl.paulevers.spotservice.repositories.ISpotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpotsController {

    @Autowired
    private ISpotsRepository repository;


    @GetMapping(value="/spots")
    public List<Spot> spots() {
//        List<Spot> spots = new ArrayList<>();
//        Spot spot = new Spot();
//        spot.setName("Test");
//        spot.setCategory("TestCategory");
//        spot.setDescription("I am a description.");
//        spot.setCoordinates(new Coordinates(37.4278, -122.0910));
//        repository.save(spot);
//        spots.add(spot);


        
        return repository.findAll();
    }
}
