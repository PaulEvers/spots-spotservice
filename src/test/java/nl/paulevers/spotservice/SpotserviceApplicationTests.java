package nl.paulevers.spotservice;

import nl.paulevers.spotservice.controllers.SpotsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpotserviceApplicationTests {
	@Autowired
	private SpotsController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
