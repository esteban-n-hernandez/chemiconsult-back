package org.chemiconsult.api.controller.de;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
public class CustomerDE extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DOCUMENT_TYPE", nullable = false)
    private String documentType;

    @Column(name = "DOCUMENT_NUMBER", nullable = false)
    private Integer documentNumber;

    @Column(name = "PHONE_NUMBER")
    private Integer phoneNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SAMPLE")
    private Set<SampleDE> muestras;

}
