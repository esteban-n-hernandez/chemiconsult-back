package org.chemiconsult.api.sample.mapper;

import org.chemiconsult.api.sample.de.SampleDE;
import org.chemiconsult.api.sample.de.SampleDetailsDE;
import org.chemiconsult.api.sample.de.SampleResult;
import org.chemiconsult.api.sample.to.SampleDetailsTO;
import org.chemiconsult.api.sample.to.SampleTO;

import java.util.List;
import java.util.stream.Collectors;

public class SampleMapper {

    public static SampleDE SampleToToSampleDE(SampleTO sampleTO) {
        return SampleDE.builder()
                .build();
    }

    public static SampleTO SampleDEToSampleTO(SampleDE sampleDE, List<SampleResult> sampleResultList) {

        List<SampleDetailsTO> sampleDetailsTOList = sampleResultList.stream()
                .map(result -> SampleDetailsTO.builder()
                        .allowedLimit(result.getAllowedLimit())
                        .methodology(result.getMethodology())
                        .unit(result.getUnit())
                        .determination(result.getDetermination())
                        .result(result.getResult())
                        .build())
                .collect(Collectors.toList());

        return SampleTO.builder()
                .idCustomer(sampleDE.getIdCustomer())
                .idProtocol(sampleDE.getIdProtocol())
                .receptionDate(sampleDE.getReceptionDate())
                .sample(sampleDE.getSample())
                .type(sampleDE.getType())
                .sampleDetails(sampleDetailsTOList)
                .build();
    }

}
