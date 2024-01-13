package org.chemiconsult.api.methodology.repository;

import org.chemiconsult.api.methodology.de.MethodologyDE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MethodologyRepository extends JpaRepository<MethodologyDE, Integer> {
}
