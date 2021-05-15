package nl.paulevers.spotservice.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "spots")
public class Spot {
    @Id
    String id;
    String name;
    String category;
    Coordinates coordinates;
    String city;
    String country;
    String description;
    List<String> images;
    List<String> facts;
    String audioUrl;
}
