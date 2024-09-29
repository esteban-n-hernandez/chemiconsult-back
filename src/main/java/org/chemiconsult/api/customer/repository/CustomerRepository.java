package org.chemiconsult.api.customer.repository;

import org.chemiconsult.api.customer.de.CustomerDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerDE, Integer> {

    @Query("SELECT c FROM CUSTOMER c WHERE c.name LIKE CONCAT('%', :name, '%')")
    Optional<List<CustomerDE>> findByName(@Param("name") String name);

}
