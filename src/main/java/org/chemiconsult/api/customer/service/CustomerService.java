package org.chemiconsult.api.customer.service;

import org.chemiconsult.api.customer.mapper.CustomerMapper;
import org.chemiconsult.api.customer.repository.CustomerRepository;
import org.chemiconsult.api.customer.to.CustomerTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    CustomerRepository customerRepository;

    public void create(CustomerTO customerTO) throws Exception {
        try {
            customerRepository.save(CustomerMapper.CustomerTOToCUstomerDE(customerTO));
        } catch (Exception e) {
            throw new Exception("An exception happened when saving Customer" + e.getMessage());
        }

    }

    public void update(CustomerTO customerTO) {
        customerRepository.save(CustomerMapper.CustomerTOToCUstomerDE(customerTO));
    }

    public void delete(CustomerTO customerTO) {
        customerRepository.delete(CustomerMapper.CustomerTOToCUstomerDE(customerTO));
    }

    public List<CustomerTO> getAllCustomers() throws Exception {
        try {
            return CustomerMapper.CustomerDEListToCustomerToList(customerRepository.findAll());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public CustomerTO getCustomer(Long documentNumber) {
        return CustomerMapper.CustomerDEToCUstomerTO(
                customerRepository.findByDocumentNumber(documentNumber));
    }

    public List<CustomerTO> getCustomerByName(String name) {
        return CustomerMapper.CustomerDEListToCUstomerTOList(
                customerRepository.findByName(name));
    }

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
