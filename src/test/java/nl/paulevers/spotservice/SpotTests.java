package nl.paulevers.spotservice;

import nl.paulevers.spotservice.entities.Coordinates;
import nl.paulevers.spotservice.entities.Spot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpotTests {

    Spot spot = new Spot();

    @Test
    void incrementLike() {
        assertThat(spot.getLikes()).isEqualTo(0);
        spot.incrementLike();
        assertThat(spot.getLikes()).isEqualTo(1);
    }

    @Test
    void decrementLike() {
        assertThat(spot.getLikes()).isEqualTo(0);
        spot.incrementLike();
        assertThat(spot.getLikes()).isEqualTo(1);
        spot.decrementLike();
        assertThat(spot.getLikes()).isEqualTo(0);
    }

    @Test
    void coordinates() {
        Coordinates coordinates = new Coordinates(3.0, 5.0);
        assertThat(coordinates.getLatitude()).isEqualTo(3.0);
        assertThat(coordinates.getLongitude()).isEqualTo(5.0);
    }
}
