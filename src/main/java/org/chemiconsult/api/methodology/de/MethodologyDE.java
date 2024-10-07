package org.chemiconsult.api.methodology.de;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "METHODOLOGY")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MethodologyDE  {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "TYPE", nullable = false)
    private String type;
}
