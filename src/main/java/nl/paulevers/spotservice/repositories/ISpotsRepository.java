package nl.paulevers.spotservice.repositories;

import nl.paulevers.spotservice.entities.Spot;

import java.util.List;

public interface ISpotsRepository {

    List<Spot> getAllSpots();
    Spot getSpot(String id) throws Exception;
    void createSpot(Spot spot);
    void deleteSpot(String id);
    void updateSpot(Spot spot);
}
