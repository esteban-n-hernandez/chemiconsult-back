package org.chemiconsult.api.sample.mapper;

import org.chemiconsult.api.sample.de.SampleDE;
import org.chemiconsult.api.sample.to.SampleTO;

public class SampleMapper {

    public static SampleDE SampleToToSampleDE(SampleTO sampleTO) {

        return SampleDE.builder()
                .build();
    }

}
