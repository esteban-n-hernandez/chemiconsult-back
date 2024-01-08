package org.chemiconsult.api.controller.de;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class FormDE {

    @Id
    private int id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "VALUE", length = 50)
    private Double value;

}
