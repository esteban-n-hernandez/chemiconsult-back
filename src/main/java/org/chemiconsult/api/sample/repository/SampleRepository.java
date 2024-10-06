package org.chemiconsult.api.sample.repository;

import org.chemiconsult.api.sample.de.SampleDE;
import org.chemiconsult.api.sample.de.SampleDetailsDE;
import org.chemiconsult.api.sample.de.SampleResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SampleRepository extends JpaRepository<SampleDE, Integer> {


    @Query("SELECT new org.chemiconsult.api.sample.de.SampleResult (s.id, s.idProtocol, s.idCustomer, s.type, s.sample, s.receptionDate, " +
            "sd.determination, sd.unit, sd.result, sd.allowedLimit, sd.methodology) " +
            "FROM SAMPLE s INNER JOIN s.sampleDetailsList sd WHERE s.idProtocol = :idProtocol")
    List<SampleResult> findSampleDetails(@Param("idProtocol") int idProtocol);


    List<SampleDetailsDE> findSampeDetailsById(@Param("idProtocol") Integer idProtocol);

    @Query(value = "SELECT * FROM  Sample LIMIT 20", nativeQuery = true)
    List<SampleDE> findAll();

    Optional<SampleDE> findByIdProtocol(Integer idProtocol);

    Optional<List<SampleDE>> findAllByIdCustomer(Integer integer);
}
