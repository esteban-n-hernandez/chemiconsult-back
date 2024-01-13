package org.chemiconsult.api.units.controller;

import org.chemiconsult.api.units.impl.IUnitController;
import org.chemiconsult.api.units.service.UnitService;
import org.chemiconsult.api.units.to.UnitTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/unit")
public class UnitController implements IUnitController {

    @Autowired
    UnitService unitService;

    @Override
    public ResponseEntity createUnit(UnitTO unit) {
        return null;
    }

    @Override
    public ResponseEntity deleteUnit(UnitTO unit) {
        return null;
    }

    @Override
    public ResponseEntity updateUnit(UnitTO unit) {
        return null;
    }

    @Override
    public ResponseEntity getAllUnit() {
        return null;
    }

    @Override
    public ResponseEntity getUnit(Integer unitId) {
        return null;
    }
}
