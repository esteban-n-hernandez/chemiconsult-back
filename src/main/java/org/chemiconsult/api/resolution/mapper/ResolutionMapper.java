package org.chemiconsult.api.resolution.mapper;

import org.chemiconsult.api.resolution.de.ResolutionDE;
import org.chemiconsult.api.resolution.to.ResolutionTO;

public class ResolutionMapper {

    public static ResolutionDE ResolutionTOToResolutionDE(ResolutionTO resolutionTO) {
        return ResolutionDE.builder()
                .unit(resolutionTO.getUnit())
                .build();
    }

    public static ResolutionTO ResolutionDEToResolutionTO(ResolutionDE resolutionDE) {
        return ResolutionTO.builder()
                .unit(resolutionDE.getUnit())
                .build();
    }

}
