package org.chemiconsult.api.resolution.mapper;

import org.chemiconsult.api.resolution.de.ResolutionDE;
import org.chemiconsult.api.resolution.to.ResolutionTO;

import java.util.ArrayList;
import java.util.List;

public class ResolutionMapper {

    public static ResolutionDE ResolutionTOToResolutionDE(ResolutionTO resolutionTO) {
        return ResolutionDE.builder()
                .unit(resolutionTO.getUnit())
                .resolutionName(resolutionTO.getResolutionName())
                .limit(resolutionTO.getLimit())
                .parameter(resolutionTO.getParameter())
                .unit(resolutionTO.getUnit())
                .build();
    }

    public static ResolutionTO ResolutionDEToResolutionTO(ResolutionDE resolutionDE) {
        return ResolutionTO.builder()
                .unit(resolutionDE.getUnit())
                .build();
    }

    public static List<ResolutionTO> ResolutionTOToResolutionDE(List<ResolutionDE> resolutionDEList) {
        List<ResolutionTO> resolutionTOList = null;
        if (!resolutionDEList.isEmpty()) {
            resolutionTOList = new ArrayList<>();

            for (ResolutionDE res : resolutionDEList) {
                resolutionTOList.add(ResolutionTO.builder()
                        .id(res.getId())
                        .unit(res.getUnit())
                        .resolutionName(res.getResolutionName())
                        .limit(res.getLimit())
                        .parameter(res.getParameter())
                        .unit(res.getUnit())
                        .build());
            }
        }
        return resolutionTOList;
    }

}
