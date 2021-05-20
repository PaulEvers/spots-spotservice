package nl.paulevers.spotservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SpotserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotserviceApplication.class, args);
	}

}
