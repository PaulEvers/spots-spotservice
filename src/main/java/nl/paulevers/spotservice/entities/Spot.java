package nl.paulevers.spotservice.entities;

import lombok.Data;

@Data
public class Spot {
    String id;
    String name;
    Coordinates coordinates;
    String category;
}
