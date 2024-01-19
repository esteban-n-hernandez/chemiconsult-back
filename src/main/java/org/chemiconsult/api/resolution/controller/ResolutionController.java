package org.chemiconsult.api.resolution.controller;

import org.chemiconsult.api.resolution.impl.IResolutionController;
import org.chemiconsult.api.resolution.service.ResolutionService;
import org.chemiconsult.api.resolution.to.ResolutionTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/resolution")
public class ResolutionController implements IResolutionController {

    ResolutionService resolutionService;

    @Override
    public ResponseEntity createResolution(ResolutionTO unit) {
        try {
            resolutionService.create(unit);
            return ResponseEntity.ok("Resolucion guardada");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity deleteResolution(Integer id) {
        try {
            resolutionService.delete(id);
            return ResponseEntity.ok("Resolucion eliminada");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity updateResolution(ResolutionTO resolution) {
        try {
            resolutionService.update(resolution);
            return ResponseEntity.ok("Resolucion modificada");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity getAllResolutions() {
        try {
            resolutionService.getAllResolutions();
            return ResponseEntity.ok("");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity getResolution(Integer id) {
        try {
            ResolutionTO resolutionTO = resolutionService.getResolution(id);
            return ResponseEntity.ok(resolutionTO);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Autowired
    public ResolutionController(ResolutionService resolutionService) {
        this.resolutionService = resolutionService;
    }

}
