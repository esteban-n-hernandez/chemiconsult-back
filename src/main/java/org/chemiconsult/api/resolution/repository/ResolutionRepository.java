package org.chemiconsult.api.resolution.repository;

import org.chemiconsult.api.resolution.de.ResolutionDE;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResolutionRepository extends JpaRepository<ResolutionDE, Integer> {

    void deleteById(Integer id);

    List<ResolutionDE> getByResolutionName(String name);
}
