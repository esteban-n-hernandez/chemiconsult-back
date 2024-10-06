package org.chemiconsult.api.customer.repository;

import org.chemiconsult.api.customer.de.CustomerDE;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerDE, Integer> {

    Optional<CustomerDE> findByDocumentNumber(Long documentNumber);

    Optional<List<CustomerDE>> findByName(String name);
}
