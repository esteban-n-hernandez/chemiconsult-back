package org.chemiconsult.api.controller.de;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class DeterminationDE extends Auditable {

    @Id
    private int id;

    @Column(name = "SAMPLE_ID", length = 50)
    private Integer sampleId;

    @Column(name = "DETERMINATION_NAME", length = 50)
    private String determinationName;

    @Column(name = "DETERMINATION_RESULT", precision = 2, scale = 2)
    private BigDecimal determinationValue;


}
