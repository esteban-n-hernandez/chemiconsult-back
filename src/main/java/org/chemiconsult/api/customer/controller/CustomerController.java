package org.chemiconsult.api.customer.controller;

import org.chemiconsult.api.customer.impl.ICustomerController;
import org.chemiconsult.api.customer.service.CustomerService;
import org.chemiconsult.api.customer.to.CustomerTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/customer")
public class CustomerController implements ICustomerController {

    @Autowired
    CustomerService customerService;


    @Override
    public ResponseEntity createCustomer(CustomerTO customer) {
        try {
            customerService.create(customer);
            return ResponseEntity.ok().body("Customer created");
        } catch (Exception e) {
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
    public ResponseEntity getCustomer(Integer documentNumber) {
        try {
            CustomerTO customer = customerService.getCustomer(documentNumber);
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
