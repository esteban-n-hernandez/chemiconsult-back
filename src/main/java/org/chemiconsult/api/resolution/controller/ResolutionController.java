package org.chemiconsult.api.resolution.controller;

import org.chemiconsult.api.resolution.impl.IResolutionController;
import org.chemiconsult.api.resolution.service.ResolutionService;
import org.chemiconsult.api.resolution.to.ResolutionTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/resolution")
public class ResolutionController implements IResolutionController {

    ResolutionService resolutionService;

    @Override
    public ResponseEntity createResolution(List<ResolutionTO> resolutionList) {
        try {
            resolutionService.create(resolutionList);
            return ResponseEntity.ok().body("RESOLUCION ALMACENADA");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error: " + e.getMessage());
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
            List<ResolutionTO> resolutionList = resolutionService.getAllResolutions();
            return ResponseEntity.ok(resolutionList);
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

    public ResponseEntity getResolutionByName(String name) {
        try {
            List<ResolutionTO> resolutionList = resolutionService.getResolutionByName(name);
            return ResponseEntity.ok(resolutionList);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e.getMessage());
        }
    }

    @Autowired
    public ResolutionController(ResolutionService resolutionService) {
        this.resolutionService = resolutionService;
    }

}
