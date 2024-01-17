package org.chemiconsult.api.sample.de;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SampleResult {

    @Id
    private int id;
    private int idProtocol;
    private int idCustomer;
    private Date receptionDate;
    private String determination;
    private String unit;
    private String result;
    private String allowedLimit;
    private String methodology;

}
