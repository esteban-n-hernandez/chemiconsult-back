package org.chemiconsult.api.controller.de;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class MethodologyDE extends Auditable {

    @Id
    private int id;

    @Column(name = "TYPE", nullable = false)
    private String type;
}
