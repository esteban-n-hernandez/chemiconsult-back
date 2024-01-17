package org.chemiconsult.api.sample.repository;

import org.chemiconsult.api.sample.de.SampleDE;
import org.chemiconsult.api.sample.de.SampleResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SampleRepository extends JpaRepository<SampleDE, Integer> {


    @Query("SELECT new org.chemiconsult.api.sample.de.SampleResult (s.id, s.idProtocol, s.idCustomer, s.receptionDate, " +
            "d.determination, d.unit, d.result, d.allowedLimit, d.methodology) " +
            "FROM SampleDE s INNER JOIN SampleDetailsDE d ON s.idProtocol = d.idProtocol WHERE s.idProtocol = :idProtocol")
    List<SampleResult> findSampleDetails(@Param("idProtocol") int idProtocol);

}
