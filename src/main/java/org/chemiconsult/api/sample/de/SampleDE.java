package org.chemiconsult.api.sample.de;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "SAMPLE")
public class SampleDE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "ID_PROCOLO")
    private int idProtocol;

    @Column(name = "ID_CUSTOMER")
    private int idCustomer;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SAMPLE")
    private String sample;

    @Column(name = "RECEPTION_DATE")
    private LocalDate receptionDate;
}
