package org.chemiconsult.api.resolution.repository;

import org.chemiconsult.api.resolution.de.ResolutionDE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResolutionRepository extends JpaRepository<ResolutionDE, Integer> {

    void deleteById(Integer id);
}
