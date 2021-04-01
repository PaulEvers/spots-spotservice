package nl.paulevers.spotservice.entities;

import lombok.Data;

import java.util.List;

@Data
public class Spot {
    String id;
    String name;
    String category;
    Coordinates coordinates;
    String description;
    List<String> images;
    List<String> facts;
    String audioUrl;
}
