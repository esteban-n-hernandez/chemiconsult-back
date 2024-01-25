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

    @Column(name = "RESOLUTION_NAME", nullable = false)
    private String resolutionName;

    @Column(name = "PARAMETER", nullable = false)
    private String parameter;

    @Column(name = "UNIT", nullable = false)
    private String unit;

    @Column(name = "LIMIT_COLUMN", nullable = false)
    private String limit;

}
