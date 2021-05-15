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
    int likes;

    public void incrementLike() {
        likes = likes + 1;
    }

    public void decrementLike() {
        likes = likes - 1;

        if (likes < 0) { likes = 0; }
    }
}
