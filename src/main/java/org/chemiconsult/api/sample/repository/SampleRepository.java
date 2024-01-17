package org.chemiconsult.api.sample.repository;

import org.chemiconsult.api.sample.de.SampleDE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<SampleDE, Integer> {
}
