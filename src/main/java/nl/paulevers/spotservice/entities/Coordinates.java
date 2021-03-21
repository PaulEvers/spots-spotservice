package nl.paulevers.spotservice.entities;

import lombok.Data;

@Data
public class Coordinates {
    Double x;
    Double y;

    public Coordinates(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
}

