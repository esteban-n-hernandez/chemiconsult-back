package org.chemiconsult.api.resolution.to;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionTO {

    @JsonProperty(required = false)
    private Integer id;

    private String unit;

    private String resolutionName;

    private String parameter;

    private String limit;

}
