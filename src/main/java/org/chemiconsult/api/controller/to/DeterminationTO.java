package org.chemiconsult.api.controller.to;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DeterminationTO {

    private String determinationName;

    private BigDecimal determinationValue;

    public DeterminationTO(String determinationName, BigDecimal determinationValue) {
        this.determinationName = determinationName;
        this.determinationValue = determinationValue;
    }

}

