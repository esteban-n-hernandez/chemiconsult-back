package org.chemiconsult.api.resolution.de;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "RESOLUTION")
public class ResolutionDE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "NOMBRE_RESOLUCION", nullable = false)
    private String resolutionName;

    @Column(name = "PARAMETRO", nullable = false)
    private String parameter;

    @Column(name = "UNIT", nullable = false)
    private String unit;

    @Column(name = "LIMITE", nullable = false)
    private String limit;

}
