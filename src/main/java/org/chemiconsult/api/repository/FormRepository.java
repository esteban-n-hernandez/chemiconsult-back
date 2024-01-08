package org.chemiconsult.api.repository;

import io.swagger.models.auth.In;
import org.chemiconsult.api.controller.de.FormDE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<FormDE, In> {


}
