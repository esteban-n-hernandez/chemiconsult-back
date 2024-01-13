package org.chemiconsult.api.form.controller.de;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class SampleDE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer sampleNumber;

    private Date sampleDate;


}
