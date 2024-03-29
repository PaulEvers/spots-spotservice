package nl.paulevers.spotservice.controllers;

import nl.paulevers.spotservice.entities.Spot;
import nl.paulevers.spotservice.repositories.SpotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class SpotsController {

    @Autowired
    private SpotsRepository repository;


    @GetMapping(value="/spots")
    public @ResponseBody
    ResponseEntity<List<Spot>> spots() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/spots/{id}")
    public @ResponseBody
    ResponseEntity<Spot> getSpot(@PathVariable String id) {
        try {
            return new ResponseEntity<>(repository.findById(id).get(), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value="/spots")
    public @ResponseBody
    ResponseEntity<String> createSpot(@RequestBody Spot spot) {
        try {
            repository.save(spot);
            return new ResponseEntity<>(spot.getId(), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
