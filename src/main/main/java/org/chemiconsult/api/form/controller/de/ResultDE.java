package org.chemiconsult.api.form.controller.de;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class ResultDE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "SAMPLE_TYPE")
    //TODO Averiguar, por ejemplo un tipo puede ser: Efluente
    private String sampleType;


    @Column(name = "ANALISYS_PROTOCOL")
    private Integer analysisProtocol;


    @Column(name = "SAMPLE_ID")
    private Integer sampleId;


    @Column(name = "UNIT")
    private String unidad;

    private String methodology;

}
