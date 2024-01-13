package org.chemiconsult.api.methodology.de;


import lombok.*;
import org.chemiconsult.api.form.controller.de.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MethodologyDE extends Auditable {

    @Id
    private int id;

    @Column(name = "TYPE", nullable = false)
    private String type;
}
