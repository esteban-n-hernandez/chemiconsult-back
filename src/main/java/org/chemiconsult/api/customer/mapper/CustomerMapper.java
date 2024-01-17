package org.chemiconsult.api.customer.mapper;

import org.chemiconsult.api.customer.de.CustomerDE;
import org.chemiconsult.api.customer.to.CustomerTO;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class CustomerMapper {

    public static CustomerDE CustomerTOToCUstomerDE(CustomerTO customerTo) {

        return CustomerDE.builder()
                .documentNumber(customerTo.getDocumentNumber())
                .documentType(customerTo.getDocumentType())
                .email(customerTo.getEmail())
                .name(customerTo.getName())
                .phoneNumber(customerTo.getPhoneNumber())
                .build();
    }

    public static CustomerTO CustomerDEToCUstomerTO(Optional<CustomerDE> customerDE) {
        if (customerDE.isPresent()) {
            CustomerDE customer = customerDE.get();
            return CustomerTO.builder()
                    .documentNumber(customer.getDocumentNumber())
                    .documentType(customer.getDocumentType())
                    .email(customer.getEmail())
                    .name(customer.getName())
                    .phoneNumber(customer.getPhoneNumber())
                    .build();
        } else {
            return null;
            //   throw new NoSuchElementException("Customer not found");
        }
    }


    public static List<CustomerTO> CustomerDEListToCustomerToList(List<CustomerDE> customerDE) {
        if (!customerDE.isEmpty()) {
            List<CustomerTO> customerTO = new ArrayList<>();
            for (CustomerDE de : customerDE) {
                CustomerTO to = new CustomerTO();
                to.setDocumentNumber(de.getDocumentNumber());
                to.setDocumentType(de.getDocumentType());
                to.setEmail(de.getEmail());
                to.setName(de.getName());
                to.setPhoneNumber(de.getPhoneNumber());

                customerTO.add(to);
            }
            return customerTO;
        } else {
            return null;
        }
    }
}
