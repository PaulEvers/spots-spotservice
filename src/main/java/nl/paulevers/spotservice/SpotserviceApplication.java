package nl.paulevers.spotservice;

import nl.paulevers.spotservice.entities.Customer;
import nl.paulevers.spotservice.entities.CustomerRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class SpotserviceApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpotserviceApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void runAfterStartup() {
//		queryAllCustomers();
//		createCustomer();
//		queryAllCustomers();
//	}



}
