package nl.paulevers.spotservice.repositories;

import nl.paulevers.spotservice.entities.Spot;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SpotsRepository extends MongoRepository<Spot, String>  {
}
