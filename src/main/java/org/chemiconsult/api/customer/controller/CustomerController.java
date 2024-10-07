package org.chemiconsult.api.customer.controller;

import lombok.extern.log4j.Log4j2;
import org.chemiconsult.api.customer.impl.ICustomerController;
import org.chemiconsult.api.customer.service.CustomerService;
import org.chemiconsult.api.customer.to.CustomerTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/customer")
@Log4j2
public class CustomerController implements ICustomerController {

    @Autowired
    CustomerService customerService;

    @Override
    public ResponseEntity createCustomer(@RequestBody CustomerTO customer) {
        try {
            customerService.create(customer);
            return ResponseEntity.ok().body("Customer created");
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity deleteCustomer(CustomerTO customer) {
        try {
            customerService.create(customer);
            return ResponseEntity.ok().body("Customer created");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity updateCustomer(CustomerTO customer) {
        try {
            customerService.create(customer);
            return ResponseEntity.ok().body("Customer created");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity getAllCustomers() {
        try {
            List<CustomerTO> customerList = customerService.getAllCustomers();
            if (!customerList.isEmpty()) {
                return ResponseEntity.ok().body(customerList);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity getCustomer(Long documentNumber) {
        log.info("Entering getCustomer method. " + documentNumber);
        try {
            CustomerTO customer = customerService.getCustomer(documentNumber);
            if (customer != null) {
                log.info("Customer found. " + customer);
                return ResponseEntity.ok().body(customer);
            } else {
                log.info("Customer not found. " + documentNumber);
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            log.error("Error getCustomer method. " + e.getMessage());
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity getCustomerByName(String name) {
        try {
            List<CustomerTO> customer = customerService.getCustomerByName(name);
            if (customer != null) {
                return ResponseEntity.ok().body(customer);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }
}
