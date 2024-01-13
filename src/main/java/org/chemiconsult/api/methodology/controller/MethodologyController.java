package org.chemiconsult.api.methodology.controller;

import org.chemiconsult.api.methodology.impl.IMethodologyController;
import org.chemiconsult.api.methodology.service.MethodologyService;
import org.chemiconsult.api.methodology.to.MethodologyTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/methodology")
public class MethodologyController implements IMethodologyController {

    MethodologyService methodologyService;


    @Override
    public ResponseEntity createMethodology(MethodologyTO methodology) {
        try {
            methodologyService.create(methodology);
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public ResponseEntity deleteMethodology(MethodologyTO methodology) {
        try {
            methodologyService.delete();
        } catch (Exception e) {

        }

        return null;
    }

    @Override
    public ResponseEntity updateMethodology(MethodologyTO methodology) {


        try {
            methodologyService.update(null);
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public ResponseEntity getAllMethodologys() {

        try {
            methodologyService.findAll();
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public ResponseEntity getMethodology(Integer id) {

        try {
            methodologyService.findById(id);
        } catch (Exception e) {

        }
        return null;
    }


    @Autowired
    public MethodologyController(MethodologyService methodologyService) {
        this.methodologyService = methodologyService;
    }
}
