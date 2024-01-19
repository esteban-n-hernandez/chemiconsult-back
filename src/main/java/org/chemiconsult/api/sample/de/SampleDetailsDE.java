package org.chemiconsult.api.sample.de;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "SAMPLE_DETAIL")
public class SampleDetailsDE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "ID_PROTOCOL")
    private int idProtocol;

    @Column(name = "DETERMINATION")
    private String determination;

    @Column(name = "UNIT")
    private String unit;

    @Column(name = "RESULT")
    private String result;

    @Column(name = "ALLOWED_LIMIT")
    private String allowedLimit;

    @Column(name = "METHODOLOGY")
    private String methodology;

}
