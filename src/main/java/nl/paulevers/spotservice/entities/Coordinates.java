package nl.paulevers.spotservice.entities;

import lombok.Data;

@Data
public class Coordinates {
    Double latitude;
    Double longitude;

    public Coordinates(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

