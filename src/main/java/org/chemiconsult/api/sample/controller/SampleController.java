package org.chemiconsult.api.sample.controller;

import lombok.extern.log4j.Log4j2;
import org.chemiconsult.api.sample.impl.ISampleController;
import org.chemiconsult.api.sample.service.SampleService;
import org.chemiconsult.api.sample.to.SampleTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/sample")
@Log4j2
public class SampleController implements ISampleController {

    @Autowired
    SampleService sampleService;

    @Override
    public ResponseEntity createSample(SampleTO sample) {
        log.info(sample.toString());
        try {
            sampleService.create(sample);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @Override
    public ResponseEntity deleteSample(SampleTO sample) {
        return null;
    }

    @Override
    public ResponseEntity updateSample(SampleTO unit) {
        return null;
    }

    @Override
    public ResponseEntity getAllSamples() {
        return null;
    }

    @Override
    public ResponseEntity getSampleByID(Integer sampleID) {
        return null;
    }
}
