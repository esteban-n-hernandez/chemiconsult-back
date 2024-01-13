package org.chemiconsult.api.customer.to;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerTO {

    private String name;

    private String documentType;

    private Integer documentNumber;

    private Integer phoneNumber;

    private String email;
}
