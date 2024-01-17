package org.chemiconsult.api.units.mapper;

import org.chemiconsult.api.units.de.UnitDE;
import org.chemiconsult.api.units.to.UnitTO;

import java.util.List;
import java.util.Optional;

public class UnitMapper {

    public static UnitDE UnitTOToUnitDE(UnitTO unitTO) {
        return UnitDE.builder()
                .unit(unitTO.getUnit())
                .build();
    }

    public static UnitTO UnitDEToUnitTO(UnitDE unitDE) {
        return UnitTO.builder()
                .unit(unitDE.getUnit())
                .build();
    }

}
