package nl.paulevers.spotservice.mock;

import nl.paulevers.spotservice.entities.Coordinates;
import nl.paulevers.spotservice.entities.Spot;

import java.util.List;

public class MockSpotsRepository {

    Spot spot1;
    Spot spot2;
    List<Spot> spots;

    MockSpotsRepository() {
        spot1 = new Spot();
        Coordinates coordinates1 = new Coordinates(5.10, 8.90);
        spot1.setCoordinates(coordinates1);
        spot1.setCategory("Historical site");
        spot1.setName("Colosseum");
        spot1.setId("1");

        spot2 = new Spot();
        Coordinates coordinates2 = new Coordinates(15.10, 4.30);
        spot2.setCoordinates(coordinates2);
        spot2.setCategory("Religious site");
        spot2.setName("Meiji Shrine");
        spot2.setId("2");

        spots.add(spot1);
        spots.add(spot2);
    }

    public List<Spot> getAllSpots() {
        return spots;
    }

    public Spot getSpot(String id) throws Exception {
        switch(id) {
            case "1":
                return spot1;
            case "2":
                return spot2;
            default:
                return null;
        }
    }

    public void createSpot(Spot spot) {

    }

    public void deleteSpot(String id) {

    }

    public void updateSpot(Spot spot) {

    }
}
