package org.chemiconsult.api.repository;

import org.chemiconsult.api.form.controller.de.ResultDE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<ResultDE, Integer> {

}
