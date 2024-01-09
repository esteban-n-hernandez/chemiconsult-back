package org.chemiconsult.api.controller.to;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class FormResponse {

    //Muestra
    public String sample;

    //Numero de Informe
    public Integer formNumber;

    //Fecha de recepcion de muestra
    public LocalDate sampleReceptionDate;

    private List<DeterminationTO> determinationList;

    public FormResponse(String sample, Integer formNumbre, LocalDate sampleReceptionDate, List<DeterminationTO> determinationList) {
        this.sample = sample;
        this.formNumber = formNumbre;
        this.sampleReceptionDate = sampleReceptionDate;
        this.determinationList = determinationList;
    }
}
