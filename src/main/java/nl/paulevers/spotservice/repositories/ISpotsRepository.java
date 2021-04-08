package nl.paulevers.spotservice.repositories;

import nl.paulevers.spotservice.entities.Spot;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ISpotsRepository extends MongoRepository<Spot, String>  {

//    List<Spot> getAllSpots();
//    Spot getSpot(String id) throws Exception;
//    void createSpot(Spot spot);
//    void deleteSpot(String id);
//    void updateSpot(Spot spot);
}
