package org.chemiconsult.api.methodology.mapper;

import org.chemiconsult.api.methodology.de.MethodologyDE;
import org.chemiconsult.api.methodology.to.MethodologyTO;
import org.chemiconsult.api.sample.to.SampleTO;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MethodologyMapper {

    public static MethodologyDE methodologyToToMethodologyDe(MethodologyTO methodologyTO) {
        return MethodologyDE.builder()
                .type(methodologyTO.getType())
                .build();
    }

    public static MethodologyTO methodologyDeToMethodologyTo(List<MethodologyDE> methodolyDEList) {
        return MethodologyTO.builder().build();
    }

    public static List<MethodologyTO> methodologyDeListToMethodologyListTo(List<MethodologyDE> methodolyDEList) {
        return methodolyDEList.stream().map(methodologyDE -> MethodologyTO.builder()
                .id(methodologyDE.getId())
                .type(methodologyDE.getType())
                .build()).collect(Collectors.toList());
    }


}
