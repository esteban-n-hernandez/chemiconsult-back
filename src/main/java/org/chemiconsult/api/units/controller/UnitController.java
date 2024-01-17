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
            return ResponseEntity.ok("Unidad guardada");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity deleteUnit(Integer id) {
        try {
            unitService.delete(id);
            return ResponseEntity.ok("Unidad eliminada");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity updateUnit(UnitTO unit) {
        try {
            unitService.update(unit);
            return ResponseEntity.ok("Unidad modificada");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity getAllUnit() {
        try {
            unitService.getAllCustomers();
            return ResponseEntity.ok("");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity getUnit(Integer id) {
        try {
            UnitTO unitTO = unitService.getUnitByID(id);
            return ResponseEntity.ok(unitTO);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Autowired
    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

}
