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

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/resolution")
public class ResolutionController implements IResolutionController {

    ResolutionService resolutionService;

    @Override
    public ResponseEntity<Map<String, String>> createResolution(List<ResolutionTO> resolutionList) {
        Map<String, String> response = new HashMap<>();
        try {
            resolutionService.create(resolutionList);
            response.put("message", "Resolución almacenada.");
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            response.put("error", "Internal Server Error: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @Override
    public ResponseEntity<Map<String, String>> deleteResolution(Integer id) {
        Map<String, String> response = new HashMap<>();
        try {
            resolutionService.delete(id);
            response.put("message", "Resolución almacenada.");
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            response.put("error", "Internal Server Error: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @Override
    public ResponseEntity<Map<String, String>> updateResolution(ResolutionTO resolution) {
        Map<String, String> response = new HashMap<>();
        try {
            resolutionService.update(resolution);
            response.put("message", "Resolución modificada.");
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            response.put("error", "Internal Server Error: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
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
