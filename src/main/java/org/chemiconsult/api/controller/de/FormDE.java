package org.chemiconsult.api.controller.de;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "FormDE")
public class FormDE {

    @Id
    private int id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "VALUE", precision = 10, scale = 2)
    private BigDecimal value;

}
