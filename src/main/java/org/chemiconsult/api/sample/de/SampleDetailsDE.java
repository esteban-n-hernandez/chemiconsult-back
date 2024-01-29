package org.chemiconsult.api.sample.de;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "SAMPLE_DETAIL")
public class SampleDetailsDE implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_PROTOCOL", referencedColumnName = "ID_PROTOCOL")
    private SampleDE sampleDE;

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
