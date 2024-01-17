package org.chemiconsult.api.units.repository;

import org.chemiconsult.api.units.de.UnitDE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitRepository extends JpaRepository<UnitDE, Integer> {

    void deleteById(Integer id);
}
