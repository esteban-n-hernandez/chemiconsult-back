package org.chemiconsult.api.customer.service;

import org.chemiconsult.api.customer.mapper.CustomerMapper;
import org.chemiconsult.api.customer.repository.CustomerRepository;
import org.chemiconsult.api.customer.to.CustomerTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void create(CustomerTO customerTO) {
        customerRepository.save(CustomerMapper.CustomerTOToCUstomerDE(customerTO));
    }

    public void update(CustomerTO customerTO) {
        customerRepository.save(CustomerMapper.CustomerTOToCUstomerDE(customerTO));
    }

    public void delete(CustomerTO customerTO) {
        customerRepository.delete(CustomerMapper.CustomerTOToCUstomerDE(customerTO));
    }

    public List<CustomerTO> getAllCustomers() {
        return CustomerMapper.CustomerDEListToCustomerToList(customerRepository.findAll());
    }

    public CustomerTO getCustomer(Integer documentNumber) {
        return CustomerMapper.CustomerDEToCUstomerTO(
                customerRepository.findById(documentNumber));
    }
}
