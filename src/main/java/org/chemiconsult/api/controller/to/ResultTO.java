package org.chemiconsult.api.controller.to;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.chemiconsult.api.controller.de.DeterminationDE;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


@Builder
@Getter
@Setter
public class ResultTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //TODO Averiguar, por ejemplo Efluente
    private String sampleType;

    private Integer analysisProtocol;

    private Integer sampleId;

    private List<DeterminationDE> determinacion;

    private String unidad;

    private String methodology;

}
