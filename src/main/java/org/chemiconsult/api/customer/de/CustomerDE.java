package org.chemiconsult.api.customer.de;

import lombok.*;
import org.chemiconsult.api.form.controller.de.Auditable;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class CustomerDE extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DOCUMENT_TYPE", nullable = false)
    private String documentType;

    @Column(name = "DOCUMENT_NUMBER", nullable = false)
    private Integer documentNumber;

    @Column(name = "PHONE_NUMBER")
    private Integer phoneNumber;

}
