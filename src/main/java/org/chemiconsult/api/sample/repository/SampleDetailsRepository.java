package org.chemiconsult.api.sample.repository;

import org.chemiconsult.api.sample.de.SampleDE;
import org.chemiconsult.api.sample.de.SampleDetailsDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SampleDetailsRepository extends JpaRepository<SampleDetailsDE, Integer> {

    @Query("SELECT sd FROM SAMPLE_DETAIL sd WHERE sd.sampleDE.idProtocol = :idProtocol")
    Optional<List<SampleDetailsDE>> findByProtocolId(@Param("idProtocol") int idProtocol);
}
