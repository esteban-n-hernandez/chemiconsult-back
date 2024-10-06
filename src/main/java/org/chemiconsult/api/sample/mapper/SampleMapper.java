package org.chemiconsult.api.sample.mapper;

import org.chemiconsult.api.sample.de.SampleDE;
import org.chemiconsult.api.sample.de.SampleDetailsDE;
import org.chemiconsult.api.sample.de.SampleResult;
import org.chemiconsult.api.sample.to.SampleDetailsTO;
import org.chemiconsult.api.sample.to.SampleTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SampleMapper {

    public static SampleDE SampleToToSampleDE(SampleTO sampleTO) {
        return SampleDE.builder()
                .idProtocol(sampleTO.getIdProtocol())
                .idCustomer(sampleTO.getIdCustomer())
                .sample(sampleTO.getSample())
                .type(sampleTO.getType())
                .receptionDate(sampleTO.getReceptionDate())
                .sampleDetailsList(new ArrayList<>())
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

    public static SampleDetailsDE sampleDetailsToToSampleDetailsDE(SampleDetailsTO sampleDetailsTO, SampleDE sampleDE) {
        if (sampleDetailsTO == null) {
            return null;
        }

        return SampleDetailsDE.builder()
                .determination(sampleDetailsTO.getDetermination())
                .unit(sampleDetailsTO.getUnit())
                .result(sampleDetailsTO.getResult())
                .allowedLimit(sampleDetailsTO.getAllowedLimit())
                .methodology(sampleDetailsTO.getMethodology())
                .sampleDE(sampleDE)  // Establece la referencia inversa a SampleDE
                .build();
    }

    public static List<SampleDetailsTO> mapDetailsDEToDetailsTO(Optional<List<SampleDetailsDE>> details) {
        List<SampleDetailsTO> list;

        if (details.isEmpty()) {
            return null;
        } else {
            list = new ArrayList<>();
        }

        for (SampleDetailsDE sample : details.get()) {
            list.add(SampleDetailsTO.builder()
                    .determination(sample.getDetermination())
                    .unit(sample.getUnit())
                    .result(sample.getResult())
                    .allowedLimit(sample.getAllowedLimit())
                    .methodology(sample.getMethodology())
                    .build());
        }

        return list;
    }

    public static SampleTO SampleTO(Optional<SampleDE> sample) {

        return sample.map(sampleDE -> SampleTO.builder()
                .idCustomer(sampleDE.getIdCustomer())
                .idProtocol(sampleDE.getIdProtocol())
                .receptionDate(sampleDE.getReceptionDate())
                .sample(sampleDE.getSample())
                .type(sampleDE.getType())
                .build()).orElse(null);
    }

    public static List<SampleTO> sampleDEListToSampleTOList(Optional<List<SampleDE>> sampleList) {
        return sampleList
                .orElse(Collections.emptyList())
                .stream()
                .map(sample -> SampleTO.builder()
                        .sample(sample.getSample())
                        .receptionDate(sample.getReceptionDate())
                        .idCustomer(sample.getIdCustomer())
                        .idProtocol(sample.getIdProtocol())
                        .type(sample.getType())
                        .build())
                .collect(Collectors.toList());
    }

}