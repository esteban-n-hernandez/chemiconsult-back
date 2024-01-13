package org.chemiconsult.api.form.controller.to;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FormRequest {

    //MUestra
    public String sample;

    //Numero de Informe
    public Integer formNumber;

    //Fecha de recepcion de muestra
    public LocalDate sampleReceptionDate;

    public FormRequest(String sample, Integer formNumbre, LocalDate sampleReceptionDate) {
        this.sample = sample;
        this.formNumber = formNumbre;
        this.sampleReceptionDate = sampleReceptionDate;
    }
}
