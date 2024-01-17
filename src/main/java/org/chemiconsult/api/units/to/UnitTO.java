package org.chemiconsult.api.units.to;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnitTO {

    @JsonIgnore
    private Integer id;

    private String unit;

}
