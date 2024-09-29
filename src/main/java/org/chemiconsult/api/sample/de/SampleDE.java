package org.chemiconsult.api.sample.de;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "SAMPLE")
public class SampleDE  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "ID_PROTOCOL")
    private int idProtocol;

    @Column(name = "ID_CUSTOMER")
    private int idCustomer;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SAMPLE")
    private String sample;

    @Column(name = "RECEPTION_DATE")
    private LocalDate receptionDate;

    @OneToMany(mappedBy = "sampleDE", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SampleDetailsDE> sampleDetailsList = new ArrayList<>();

}
