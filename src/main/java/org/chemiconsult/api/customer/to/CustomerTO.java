package org.chemiconsult.api.customer.to;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTO {

    private String name;

    private String documentType;

    private Integer documentNumber;

    private Integer phoneNumber;

    private String email;
}
