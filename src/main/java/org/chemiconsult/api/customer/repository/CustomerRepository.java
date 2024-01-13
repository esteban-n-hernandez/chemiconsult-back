package org.chemiconsult.api.customer.repository;

import org.chemiconsult.api.customer.de.CustomerDE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDE, Integer> {
}
