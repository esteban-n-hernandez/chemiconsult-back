package org.chemiconsult.api.controller.to;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormTO {

    public String name;

    public Double value;


    public FormTO(String name, Double value) {
        this.name = name;
        this.value = value;
    }
}
