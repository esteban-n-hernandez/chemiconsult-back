package org.chemiconsult.api.methodology.controller;

import lombok.extern.log4j.Log4j2;
import org.chemiconsult.api.methodology.impl.IMethodologyController;
import org.chemiconsult.api.methodology.service.MethodologyService;
import org.chemiconsult.api.methodology.to.MethodologyTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@Log4j2
@RequestMapping("/api/methodology")
public class MethodologyController implements IMethodologyController {

    MethodologyService methodologyService;

    @Override
    public ResponseEntity createMethodology(@RequestBody MethodologyTO methodology) {
        try {
            methodologyService.create(methodology);
            return ResponseEntity.ok("La muestra metodologia fue cargada correctamente.");
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.internalServerError().body("Error al crear la metodologia. Razon: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity deleteMethodology(Integer id) {
        try {
            methodologyService.delete(id);
            return ResponseEntity.ok("La muestra metodologia fue eliminada correctamente.");
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.internalServerError().body("Error al crear la metodologia. Razon: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity getAllMethodologys() throws Exception {
        try {
            List<MethodologyTO> methodologyTOList = methodologyService.findAll();
            return ResponseEntity.ok(methodologyTOList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public ResponseEntity getMethodology(Integer id) {
        try {
            methodologyService.findById(id);
            return ResponseEntity.ok().body("");
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @Autowired
    public MethodologyController(MethodologyService methodologyService) {
        this.methodologyService = methodologyService;
    }
}
