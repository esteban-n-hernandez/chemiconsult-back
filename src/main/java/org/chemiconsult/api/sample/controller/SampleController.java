package org.chemiconsult.api.sample.controller;

import lombok.extern.log4j.Log4j2;
import org.chemiconsult.api.sample.impl.ISampleController;
import org.chemiconsult.api.sample.service.SampleService;
import org.chemiconsult.api.sample.to.SampleDetailsTO;
import org.chemiconsult.api.sample.to.SampleTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/sample")
@CrossOrigin(origins = "*")
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
        return ResponseEntity.ok().body(sampleService.getAllSamples());
    }

    @Override
    public ResponseEntity getSampleByID(Integer id) throws Exception {
        try {
            List<SampleTO> list = new ArrayList<>();
            list.add(sampleService.getSampleByID(id));
            return ResponseEntity.ok().body(list);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    public ResponseEntity getSampleDetailsByID(Integer id) throws Exception {
        try {
            List<SampleDetailsTO> details = sampleService.getSampleDetailsByID(id);
            return ResponseEntity.ok().body(details);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    public ResponseEntity getSampleByCustomerID(Integer customerID) throws Exception {
        try {
            List<SampleTO> samples = sampleService.getSampleByIDCustomer(customerID);
            return ResponseEntity.ok().body(samples);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
