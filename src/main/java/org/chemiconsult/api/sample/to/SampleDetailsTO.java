package org.chemiconsult.api.sample.to;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SampleDetailsTO {

    private String determination;

    private String result;

    private String allowedLimit;

    private String methodology;

    private String unit;
}
