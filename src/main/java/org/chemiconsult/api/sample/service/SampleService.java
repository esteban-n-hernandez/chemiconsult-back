package org.chemiconsult.api.sample.service;

import lombok.extern.log4j.Log4j2;
import org.chemiconsult.api.sample.de.SampleDE;
import org.chemiconsult.api.sample.repository.SampleRepository;
import org.chemiconsult.api.sample.to.SampleTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class SampleService {

    @Autowired
    SampleRepository sampleRepository;

    public void create(SampleTO sampleTO) throws Exception {
        log.info("INSERTANDO MUESTRA");
        try {
            //    sampleRepository.save(new SampleDE());
            log.info("MUESTRA INSERTADA");
        } catch (Exception e) {
            throw new Exception(e.getCause());
        }

    }

    public void update(SampleTO sampleTO) {

    }


    public void delete(SampleTO sampleTO) {
    }

    public List<SampleTO> getAllSamples() {
        return null;
    }

    public SampleTO getSampleByID(Integer sampleID) {
        return null;
    }
}
