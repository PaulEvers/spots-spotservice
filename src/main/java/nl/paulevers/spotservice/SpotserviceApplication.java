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
	private final Logger logger = LoggerFactory.getLogger(SpotserviceApplication.class);

	@Autowired private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpotserviceApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		queryAllCustomers();
		createCustomer();
		queryAllCustomers();
	}

	private void createCustomer() {
		Customer newCustomer = new Customer();
		newCustomer.setFirstName("John");
		newCustomer.setLastName("Doe");
		logger.info("Saving new customer...");
		this.repository.save(newCustomer);
	}

	private void queryAllCustomers() {
		List<Customer> allCustomers = this.repository.findAll();
		logger.info("Number of customers: " + allCustomers.size());
	}

}
