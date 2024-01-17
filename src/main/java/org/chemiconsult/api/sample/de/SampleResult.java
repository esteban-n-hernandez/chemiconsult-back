package org.chemiconsult.api.sample.de;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class SampleResult {

    private int id;
    private int idProtocol;
    private int idCustomer;
    private Date receptionDate;
    private String determination;
    private String unit;
    private String result;
    private String allowedLimit;
    private String methodology;

    public SampleResult(int id, int idProtocol, int idCustomer, Date receptionDate, String determination, String unit, String result, String allowedLimit, String methodology) {
        this.id = id;
        this.idProtocol = idProtocol;
        this.idCustomer = idCustomer;
        this.receptionDate = receptionDate;
        this.determination = determination;
        this.unit = unit;
        this.result = result;
        this.allowedLimit = allowedLimit;
        this.methodology = methodology;
    }

}
