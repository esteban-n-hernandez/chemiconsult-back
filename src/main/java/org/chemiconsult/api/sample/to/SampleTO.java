package org.chemiconsult.api.sample.to;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class SampleTO {

    private Integer idProtocol;

    private Integer idCustomer;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate receptionDate;

    private String type;

    private String sample;

    private List<SampleDetailsTO> sampleDetails;

}
