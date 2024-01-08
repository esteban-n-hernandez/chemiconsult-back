package org.chemiconsult.api.controller.to;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class FormRequest {

    public int id;

    public String name;

    public BigDecimal value;


    public FormRequest(int id, String name, BigDecimal value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}
