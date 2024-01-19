package org.chemiconsult.api.customer.de;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "CUSTOMER")
public class CustomerDE  {

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
    private Long documentNumber;

    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber;

}
