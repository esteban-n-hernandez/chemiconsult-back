package org.chemiconsult.api.methodology.de;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MethodologyDE  {

    @Id
    private int id;

    @Column(name = "TYPE", nullable = false)
    private String type;
}
