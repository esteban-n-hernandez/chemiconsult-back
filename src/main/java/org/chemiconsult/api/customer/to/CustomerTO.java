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

    private Long documentNumber;

    private Long phoneNumber;

    private String email;
}
