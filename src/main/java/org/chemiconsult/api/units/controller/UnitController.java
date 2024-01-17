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


    UnitService unitService;

    @Override
    public ResponseEntity createUnit(UnitTO unit) {
        try {
            unitService.create(unit);
            return ResponseEntity.ok().body("Unidad guardada");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity deleteUnit(Integer id) {
        try {

        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public ResponseEntity updateUnit(UnitTO unit) {
        try {

        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public ResponseEntity getAllUnit() {
        try {

        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public ResponseEntity getUnit(Integer id) {
        try {
            return null;
        } catch (Exception e) {
            return null;
        }

    }

    @Autowired
    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

}
