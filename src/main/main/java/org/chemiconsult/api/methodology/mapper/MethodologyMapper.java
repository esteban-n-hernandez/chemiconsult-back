package org.chemiconsult.api.methodology.mapper;

import org.chemiconsult.api.methodology.de.MethodologyDE;
import org.chemiconsult.api.methodology.to.MethodologyTO;

public class MethodologyMapper {

    public static MethodologyDE methodologyToToMethodologyDe(MethodologyTO methodologyTO) {

        return MethodologyDE.builder().build();
    }


    public static MethodologyTO methodologyDeToMethodologyTo() {

        return MethodologyTO.builder().build();
    }


}
