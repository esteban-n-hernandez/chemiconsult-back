package org.chemiconsult.api.sample.repository;

import org.chemiconsult.api.sample.de.SampleDE;
import org.chemiconsult.api.sample.de.SampleDetailsDE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleDetailsRepository extends JpaRepository<SampleDetailsDE, Integer> {
}
