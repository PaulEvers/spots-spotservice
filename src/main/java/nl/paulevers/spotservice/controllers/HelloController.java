package nl.paulevers.spotservice.controllers;

import nl.paulevers.spotservice.SpotserviceApplication;
import nl.paulevers.spotservice.entities.Customer;
import nl.paulevers.spotservice.entities.CustomerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(SpotserviceApplication.class);

    @Autowired
    private CustomerRepository repository;


    @RequestMapping("/")
    public List<Customer> index() {
        return queryAllCustomers();
    }


    private void createCustomer() {
        Customer newCustomer = new Customer();
        newCustomer.setFirstName("John");
        newCustomer.setLastName("Doe");
        logger.info("Saving new customer...");
        this.repository.save(newCustomer);
    }

    private List<Customer> queryAllCustomers() {
        List<Customer> allCustomers = this.repository.findAll();
        logger.info("Number of customers: " + allCustomers.size());
        return allCustomers;
    }

}

